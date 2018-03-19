package com.wmeimob.custom.system.tools.io;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Shinez on 2017/11/16.
 */
public class DataTypeConverter {

    /**
     * @param expectType 期望类型
     * @param value      源值
     * @return
     */
    public static Object parse(Class expectType, String value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String typeName = expectType.getSimpleName();
        Method method = DataTypeConverter.class.getDeclaredMethod("parse" + typeName, String.class);
        Object object = method.invoke(null, value);
        return object;
    }


    private static BigDecimal parseBigDecimal(String val) {
        BigDecimal bigDecimal = new BigDecimal(val);
        return bigDecimal;
    }

    private static SimpleDateFormat fullDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat minutesDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private static SimpleDateFormat hoursDateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
    private static SimpleDateFormat dayDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat monthDateFormat = new SimpleDateFormat("yyyy-MM");

    private static Date parseDate(String val) throws ParseException {
        if ("".equals(val) || null == val) return null;

        String[] dateTimeSpaceArr = val.split(" ");
        if (dateTimeSpaceArr.length == 0) return null;

        if (dateTimeSpaceArr.length == 1) {
            //年月日
            String[] dateSpace = dateTimeSpaceArr[0].split("-");

            if (dateSpace.length == 1) {
                dateSpace = dateTimeSpaceArr[0].split("/");

            }
            assert dateSpace.length > 1;
            return dateSpace.length == 2 ? monthDateFormat.parse(val) : dayDateFormat.parse(val);
        }

        if (dateTimeSpaceArr.length == 2) {
            //年月日时分秒
            String[] timeSpace = dateTimeSpaceArr[1].split(":");

            if (timeSpace.length == 1) {
                return hoursDateFormat.parse(val);
            }
            if (timeSpace.length == 2) {
                return minutesDateFormat.parse(val);
            }
            if (timeSpace.length == 3) {
                return fullDateFormat.parse(val);
            }

        }
        return null;
    }

    private static Integer parseInteger(String val) {
        return Integer.valueOf(val);
    }

    private static String parseString(String val) {
        return val;
    }

    private static Boolean parseBoolean(String val) {
        if ("".equals(val) || null == val) {
            return null;
        }

        if ("1".equals(val) || "是".equals(val) || "男".equals(val)) {
            return true;
        }
        Boolean boolVal = Boolean.valueOf(val);
        return boolVal;
    }

    private static Byte parseByte(String val) {
        return Byte.parseByte(val);
    }

}
