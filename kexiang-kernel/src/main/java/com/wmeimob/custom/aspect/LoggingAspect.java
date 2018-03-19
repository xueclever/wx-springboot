package com.wmeimob.custom.aspect;

import com.alibaba.fastjson.JSONObject;
import com.wmeimob.tools.web.IpAddressHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by xiangzhao on 2016/5/25.
 */
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("@within(com.wmeimob.custom.annotation.Logging)")
    public void loggingAspect() {
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 前置
     *
     * @param joinPoint
     * @throws Exception
     */
    @Before("loggingAspect()")
    public void before(JoinPoint joinPoint) throws Exception {
        if (logger.isDebugEnabled()) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            //获取用户请求方法的参数并序列化为JSON格式字符串
            String params = "";
            if (joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
                for (int i = 0; i < joinPoint.getArgs().length; i++) {
                    params += joinPoint.getArgs()[i] + ";";
                }
            }
            StringBuffer sb = new StringBuffer();
            sb.append("\n请求IP：" + IpAddressHelper.getRemoteHost(request) + "\n");
            sb.append("请求方法: " + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()\n"));
            sb.append("请求参数: " + ("".equals(params) ? "无" : params) + "\n");

//            String describe = getClassLoggerInfo(joinPoint);
//            if(StringUtils.isEmpty(describe))
//                describe = "无";
//            sb.append("方法描述: " + describe);
            logger.info(sb.toString());
            logger.info("execute method ==>>" + joinPoint.getSignature().getName() + "()");
        }
    }

    /**
     * 环绕
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("loggingAspect()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        logger.debug("*******************函数START*********************");
        long start = new Date().getTime();
        Object obj = pjp.proceed(pjp.getArgs());
        long end = new Date().getTime();
        BigDecimal second = new BigDecimal(end).subtract(new BigDecimal(start)).divide(new BigDecimal("1000")).setScale(2, BigDecimal.ROUND_HALF_UP);
        String time = second + "秒";
        logger.debug("-------------------执行时间:" + time + "----------------------");
        if (second.doubleValue() > 1.0) {
            logger.warn("execute method timeout!!!");
        }
        logger.debug("*******************函数END***********************\n");
        return obj;
    }


    /**
     * 异常通知 用于拦截service层记录异常日志
     *
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(pointcut = "loggingAspect()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        //获取请求ip
        String ip = IpAddressHelper.getRemoteHost(request);

        //获取用户请求方法的参数并序列化为JSON格式字符串
        String params = "\n";
        if (joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
            for (int i = 0; i < joinPoint.getArgs().length; i++) {
//                params += joinPoint.getArgs()[i] + ";";
                if (joinPoint.getArgs()[i] instanceof HttpServletRequest || joinPoint.getArgs()[i] instanceof HttpServletResponse)
                    continue;
                params += JSONObject.toJSONString(joinPoint.getArgs()[i]) + "\n";
            }
        }
        /*========控制台输出=========*/
        StringBuffer sb = new StringBuffer();
        sb.append("\n===================异常通知START==================\n");
        sb.append("异常方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()\n"));
        sb.append("请求IP:" + ip + "\n");
        sb.append("请求参数:" + params + "\n");
        sb.append("异常类名:" + e.getClass().getName() + "\n");
        sb.append("异常信息:" + e.getMessage() + "\n");
        sb.append("===================异常通知END====================\n");
        logger.error(sb.toString());
    }

//    /**
//     * 获取注解日志内容
//     *
//     * @param joinPoint
//     * @return
//     * @throws Exception
//     */
//    private static String getMethodLoggerInfo(JoinPoint joinPoint) throws Exception {
//        String targetName = joinPoint.getTarget().getClass().getName();
//        String methodName = joinPoint.getSignature().getName();
//        Object[] arguments = joinPoint.getArgs();
//        Class targetClass = Class.forName(targetName);
//        Method[] methods = targetClass.getMethods();
//        String description = "";
//        for (Method method : methods) {
//            if (method.getName().equals(methodName)) {
//
//                Class[] clazz = method.getParameterTypes();
//                if (clazz.length == arguments.length) {
//                    description = method.getAnnotation(Logging.class).value();
//                    break;
//                }
//            }
//        }
//        return description;
//    }
//
//    /**
//     * 获取注解日志内容
//     *
//     * @param joinPoint
//     * @return
//     * @throws Exception
//     */
//    private static String getClassLoggerInfo(JoinPoint joinPoint) throws Exception {
//        String targetName = joinPoint.getTarget().getClass().getName();
//        Class targetClass = Class.forName(targetName);
//        Logging logging=targetClass.getClass().getAnnotation(Logging.class);
//        return targetClass.getClass().getAnnotation(Logging.class).value();
//    }
}
