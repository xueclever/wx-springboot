package com.wmeimob.tools;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Shinez on 2016/11/16.
 */
public class StringUtil {
    public static boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }


    public static String toUnderLine(String str) {
        if (StringUtils.isEmpty(str))
            return "";
        Pattern p = Pattern.compile("[A-Z]");
        Matcher matcher = p.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String g = matcher.group();
            matcher.appendReplacement(sb, "_" + g.toLowerCase());
        }
        matcher.appendTail(sb);
        if (sb.charAt(0) == '_') {
            sb.delete(0, 1);
        }
        return sb.toString();
    }

    public static String toNoneUnderline(String str) {
        if (StringUtils.isEmpty(str))
            return "";
        Pattern p = Pattern.compile("_[a-z]");
        Matcher m = p.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String firstChar =  m.group().substring(1,2);
            m.appendReplacement(sb, firstChar.toUpperCase());
        }
        m.appendTail(sb);
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(toNoneUnderline("car"));
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

}
