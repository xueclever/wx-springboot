package com.wmeimob.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Shinez on 2017/2/6.
 */
public class InputValidator {

    /**
     * 正则表达式：验证用户名
     */
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{3,17}$";

    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";

    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(17[0-9])|(18[0-9]))\\d{8}$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";

    /**
     * 正则表达式：验证身份证
     */
    public static final String REGEX_ID_CARD = "(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}$)";

    /**
     * 正则表达式：验证URL
     */
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+.+(/[\\w- ./?%&=]*)?";

    /**
     * 正则表达式：验证IP地址
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    public static final String REGEX_NUMERIC = "[0-9]*";
    public static final String REGEX_DECIMAL = "([0-9]*)|([0-9]*\\.[0-9]*)";


    /**
     * 校验用户名
     *
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    /**
     * 校验密码
     *
     * @param password
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    public static boolean isNumeric(String str) {
        return !(str == null || "".equals(str.trim())) && Pattern.matches(REGEX_NUMERIC, str);
    }


    public static boolean isDecimal(String str) {
        return !(str == null || "".equals(str.trim())) && Pattern.matches(REGEX_DECIMAL, str);
    }


    /**
     * 校验手机号
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return !(mobile == null || "".equals(mobile.trim())) && Pattern.matches(REGEX_MOBILE, mobile);
    }

    /**
     * 校验邮箱
     *
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return !(email == null || "".equals(email.trim())) && Pattern.matches(REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     *
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return !(chinese == null || "".equals(chinese.trim())) && Pattern.matches(REGEX_CHINESE, chinese);
    }

    /**
     * 校验身份证
     *
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard) {
        return !(idCard == null || "".equals(idCard.trim())) && Pattern.matches(REGEX_ID_CARD, idCard);
    }


    /**
     * 校验URL
     *
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return !(url == null || url.trim().equals("")) && Pattern.matches(REGEX_URL, url);
    }

    /**
     * 校验IP地址
     *
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr) {
        return !(ipAddr == null || "".equals(ipAddr.trim())) && Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }

    public static int countChinese(String content) {
        if (content == null || "".equals(content.trim())) return 0;
        int count = 0;
        Pattern p = Pattern.compile("[\\u4e00-\\u9fa5]");
        Matcher m = p.matcher(content);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static boolean isBool(String str) {
        return !(str == null || "".equals(str.trim())) && (str.equals("true") || str.equals("false"));
    }


    /**
     * 替换字符串卷
     *
     * @param str     被替换的字符串
     * @param charset 字符集
     * @return 替换好的
     * @throws UnsupportedEncodingException 不支持的字符集
     */
    public static String encodeChinese(String str, String charset) throws UnsupportedEncodingException {
        Pattern p = Pattern.compile("[\\u4e00-\\u9fa5]+");
        Matcher m = p.matcher(str);
        StringBuffer b = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(b, URLEncoder.encode(m.group(0), charset));
        }
        m.appendTail(b);
        return b.toString();
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
    }
}
