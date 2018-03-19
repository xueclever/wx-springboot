package com.wmeimob.tools.web;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.URI;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.List;

/**
 * Created by Shinez on 15/12/7.
 */
public class HttpHelper {

    private static CloseableHttpClient chc = HttpClients.createDefault();
    private static CloseableHttpClient sslchc = createSSLClientDefault();

    private static final Logger logger = LoggerFactory.getLogger(HttpHelper.class);


    private static CloseableHttpClient createSSLClientDefault() {
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, (TrustStrategy) (chain, authType) -> true).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
            return HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (KeyManagementException e) {
            logger.error("KeyManagementException:", e);
        } catch (NoSuchAlgorithmException e) {
            logger.error("NoSuchAlgorithmException:", e);
        } catch (KeyStoreException e) {
            logger.error("KeyStoreException:", e);
        }
        return HttpClients.createDefault();
    }

    /*
     * get请求
     * @param url
     * @param params
     * @return
     */
    public static String get(String url, List<NameValuePair> params) {
        try {
            //get请求
            HttpGet get = new HttpGet();
            //设置参数
            if (null == params || params.size() == 0) {
                get.setURI(new URI(url));
            } else {
                get.setURI(new URI(url + "?" + EntityUtils.toString(new UrlEncodedFormEntity(params))));
            }
            //发送请求
            HttpResponse response = chc.execute(get);
            //返回数据
            HttpEntity entity = response.getEntity();

            String result = EntityUtils.toString(entity);

            logger.info("GET请求返回结果：" + result);

            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /*
     * get请求
     * @param url
     * @param params
     * @return
     */
    public static String SSLGet(String url, List<NameValuePair> params) {
        try {
            //get请求
            HttpGet get = new HttpGet();
            //设置参数
            if (null == params || params.size() == 0) {
                get.setURI(new URI(url));
            } else {
                get.setURI(new URI(url + "?" + EntityUtils.toString(new UrlEncodedFormEntity(params))));
            }
            //发送请求
            HttpResponse response = sslchc.execute(get);
            //返回数据
            HttpEntity entity = response.getEntity();

            String result = EntityUtils.toString(entity, "utf-8");

            logger.info("GET请求返回结果：" + result);

            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /*
   * post提交
   * @return
   */
    public static String SSLPost(String url, List<NameValuePair> params) {
        try {
            //post请求
            HttpPost post = new HttpPost(url);
            //设置参数
            post.setEntity(new UrlEncodedFormEntity(params));
            //发送请求
            HttpResponse response = sslchc.execute(post);
            //返回数据
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity, "utf-8");
            logger.info("POST请求返回结果：" + result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /*
     * post提交
     * @return
     */
    public static String post(String url, List<NameValuePair> params) {
        try {
            //post请求
            HttpPost post = new HttpPost(url);

            //设置参数
            post.setEntity(new UrlEncodedFormEntity(params));
            //发送请求
            HttpResponse response = chc.execute(post);
            //返回数据
            HttpEntity entity = response.getEntity();

            String result = EntityUtils.toString(entity, "utf-8");

            logger.info("POST请求返回结果：" + result);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /*
     * post提交
     * @return
     */
    public static String SSLPost(String url, String entityStr) {
        try {
            //post请求
            HttpPost post = new HttpPost(url);
            //设置参数
            post.setEntity(new StringEntity(entityStr, "utf-8"));
            //发送请求
            HttpResponse response = sslchc.execute(post);
            //返回数据
            HttpEntity entity = response.getEntity();

            String result = EntityUtils.toString(entity, "utf-8");

            logger.info("POST请求返回结果：" + result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /*
    * post提交
    * @return
    */
    public static String SSLPost(String url, String entityStr, byte[] p12Path, String p12PathPwd) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, UnrecoverableKeyException, KeyManagementException {
        //指定读取证书格式为PKCS12
        KeyStore keyStore = KeyStore.getInstance("PKCS12");

        InputStream instream = new ByteArrayInputStream(p12Path);

        //读取本机存放的PKCS12证书文件
//        FileInputStream instream = new FileInputStream(new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()+p12Path));
//        instream = Thread.currentThread().getContextClassLoader().getResourceAsStream(p12Path);
        try {
            //指定PKCS12的密码(商户ID)
            keyStore.load(instream, p12PathPwd.toCharArray());
        } finally {
            instream.close();
        }
        SSLContext sslcontext = SSLContexts.custom()
                .loadKeyMaterial(keyStore, p12PathPwd.toCharArray()).build();
        //指定TLS版本
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                sslcontext, new String[]{"TLSv1"}, null,
                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        //设置httpclient的SSLSocketFactory
        CloseableHttpClient httpclient = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .build();

        try {

            HttpPost httppost = new HttpPost(url);

            httppost.setEntity(new StringEntity(entityStr, "utf-8"));

            logger.info("executing request" + httppost.getRequestLine());

            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                StringBuilder sb = new StringBuilder();
                HttpEntity entity = response.getEntity();
                System.out.println("----------------------------------------");
                logger.info(String.valueOf(response.getStatusLine()));
                if (entity != null) {
                    logger.info("Response content length: " + entity.getContentLength());
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent()));

                    String text;
                    while ((text = bufferedReader.readLine()) != null) {
                        text = new String(text.getBytes("gbk"),"utf-8");
                        logger.info(text);
                        sb.append(text);
                    }
                }
                return sb.toString();
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
    }

    public static void main(String[] args) throws Exception {
//        InputStream instream = new File();
    }

}
