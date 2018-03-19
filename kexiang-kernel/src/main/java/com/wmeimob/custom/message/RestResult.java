package com.wmeimob.custom.message;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RestResult {



    private static Map<String, Object> dataMap;

    public static Map<String, Object> getDataMap() {
        if (dataMap == null)
            dataMap = new HashMap<>();
        else
            dataMap.clear();
        return dataMap;
    }

    /**
     * 构建返回json
     *
     * @param msgCode 响应代码
     * @param msgInfo 响应说明
     * @return json对象
     */
    public static JSONObject msg(int msgCode, String msgInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", msgCode);
        if (MessageConst.showInfo)
            jsonObject.put("msg", msgInfo);
        return jsonObject;
    }

    /**
     * 构建返回json
     *
     * @param msgCode 响应代码
     * @param msgInfo 响应说明
     * @param dataMap 数据（Map集合）
     * @return
     */
    private static JSONObject msg(int msgCode, String msgInfo, Map dataMap) {
        JSONObject jsonObject = msg(msgCode, msgInfo);
        jsonObject.put("data", dataMap);
        return jsonObject;
    }


    /**
     * 构建返回json
     *
     * @param map
     * @return
     */
    public static JSONObject success(Map map) {
        return msg(MessageConst.Msg.SUCCESS, map);
    }
    /**
     * 构建返回json
     *
     * @param obj
     * @return
     */
    public static JSONObject success(Object obj) {
        Map<String,Object> map = getDataMap();
        String className = obj.getClass().getSimpleName();
        className = Character.toLowerCase(className.charAt(0)) + className.substring(1);
        map.put(className,obj);
        return success(map);
    }

    /**
     * 构建返回json
     *
     * @param pageInfo
     * @return
     */
    public static <T> JSONObject success(PageInfo<T> pageInfo) {
        Map<String,Object> map = getDataMap();
        map.put("page",pageInfo);
        return success(map);
    }

    /**
     * 构建返回json
     *
     * @return
     */
    public static JSONObject success() {
        return msg(MessageConst.Msg.SUCCESS);
    }


    /**
     * 返回失败 不说明具体原因
     * @return
     */
    public static JSONObject fail() {
        return msg(MessageConst.Msg.HANDLE_FAIL);
    }

    /**
     * 返回失败，自定义原因
     * @param reason
     * @return
     */
    public static JSONObject fail(String reason) {
        return msg(-1,reason);
    }



    /**
     * 构建返回json
     *
     * @param msg
     * @return
     */
    public static JSONObject msg(MessageConst.Msg msg) {
        return msg(msg.id, msg.info);
    }

    /**
     * 构建返回json
     *
     * @param msg
     * @return
     */
    public static JSONObject msg(MessageConst.Msg msg, Map dataMap) {
        return msg(msg.id, msg.info, dataMap);
    }


    /**
     * 构建返回json（不一定是出错了 返回状态码为当前时间戳 原因自定）
     *
     * @param info
     * @return
     */
    public static JSONObject msg(String info) {
        return msg((int) System.currentTimeMillis(), info);
    }

    public static JSONObject msg(HttpStatus httpStatus) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", httpStatus.value());
        if (MessageConst.showInfo)
            jsonObject.put("msg", httpStatus.getReasonPhrase());
        return jsonObject;
    }


    public static int getTimeDifft(Date minDate,Date maxDate){
        long diff = maxDate.getTime()-minDate.getTime();
        return (int) (diff/1000);
    }

    /**
     * 获取今天剩余秒
     * @return
     */
    public static long getTodayResidualTime(){

        Calendar min = Calendar.getInstance();

        Calendar max = Calendar.getInstance();
        max.set(Calendar.HOUR_OF_DAY, 23);
        max.set(Calendar.MINUTE, 59);
        max.set(Calendar.SECOND, 59);

        min.get(Calendar.HOUR_OF_DAY);
        min.get(Calendar.MINUTE);
        min.get(Calendar.SECOND);

        return max.getTimeInMillis()-min.getTimeInMillis()+1000;
    }

    public static void main(String[] args) {
        System.out.println(getTodayResidualTime());
    }

    public static void renderJsonResultFail(HttpServletResponse response, String message) {
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("utf-8");
            out = response.getWriter();
            out.print(fail(message));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null)
                out.close();
        }
    }


    public static void renderJsonResultSuccess(HttpServletResponse response,Map<String,Object> map) {
        OutputStream out = null;
        try {
            out = response.getOutputStream();
            out.write(success(map).toJSONString().getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null)
                try {
                    out.close();
                } catch (IOException ignored) {

                }
        }
    }
}
