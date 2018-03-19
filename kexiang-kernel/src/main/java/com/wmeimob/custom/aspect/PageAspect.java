package com.wmeimob.custom.aspect;

import com.github.pagehelper.PageHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * Created by Shinez on 2016/8/4.
 */
@Aspect
@Component
public class PageAspect {

    private Logger logger = LoggerFactory.getLogger(PageAspect.class);

    @Pointcut("@annotation(com.wmeimob.custom.annotation.Page)")
    public void pageAspect() {
    }

    private final static int PAGE_SIZE = 20;
    private final  static int PAGE_SIZE_MAX=50;

    @Before("pageAspect()")
    public void before(JoinPoint joinPoint) throws Exception {
        int startPageNum = 1;
        int pageSize = PAGE_SIZE;
        HttpServletRequest req = null;
        for (int i = 0; i < joinPoint.getArgs().length; ++i) {
            if (joinPoint.getArgs()[i] instanceof HttpServletRequest) {
                req = (HttpServletRequest) joinPoint.getArgs()[i];
                break;
            }
        }
        if (req != null) {
            Object pageIndexObj = req.getParameter("pageIndex");
            Object pageSizeObj = req.getParameter("pageSize");
            startPageNum = StringUtils.isEmpty(pageIndexObj) ? 1 : Integer.parseInt(req.getParameter("pageIndex"));
            if (StringUtils.isEmpty(pageSizeObj)) {
                pageSize = PAGE_SIZE;
            } else {
                Integer parseInt = Integer.parseInt(req.getParameter("pageSize"));
                if (parseInt > PAGE_SIZE_MAX) {
                    pageSize = PAGE_SIZE_MAX;
                } else {
                    pageSize = parseInt;
                }
            }
            PageHelper.startPage(startPageNum, pageSize);
        }
    }
}
