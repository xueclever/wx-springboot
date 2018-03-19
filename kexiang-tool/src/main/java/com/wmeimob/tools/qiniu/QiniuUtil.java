package com.wmeimob.tools.qiniu;

import com.qiniu.util.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PropertyResourceBundle;

/**
 * Created by Shinez on 2016/11/25.
 */
public class QiniuUtil {

    private static final Logger logger = LoggerFactory.getLogger(QiniuUtil.class);
    private static PropertyResourceBundle property = (PropertyResourceBundle) PropertyResourceBundle.getBundle("config");


    private static Auth auth;

    private static Auth getAuth() {
        if (auth == null) {
            auth = Auth.create(property.getString("QINIU_ACCESS_KEY"), property.getString("QINIU_SECRET_KEY"));
        }
        return auth;
    }


    public static String getToken() {
        return getAuth().uploadToken((property.getString("QINIU_BUCKETNAME")));
    }

    public static String getDomain() {
        return property.getString("QINIU_DOMAIN");
    }
}
