package com.wmeimob.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Shinez on 2017/11/3.
 */
public class ResourcesFileReader {

    public static  <T>  String read(Class<T> tClass, String fileName){
        InputStream is = tClass.getClassLoader().getResourceAsStream(fileName);
        BufferedReader reader;
        StringBuffer sb = new StringBuffer("");
        try {
            reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String str;
            while ((str = reader.readLine()) != null) {
                sb.append(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
