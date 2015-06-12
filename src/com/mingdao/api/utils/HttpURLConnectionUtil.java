package com.mingdao.api.utils;

import com.mingdao.api.entity.ResponseObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-13
 * Time: 下午4:15
 * To change this template use File | Settings | File Templates.
 */
public class HttpURLConnectionUtil {
    private  static ResponseObject submitPostData(String uri,Map<String, String> params, String encode) throws Exception{
        ResponseObject responseObject=null;
        HttpURLConnection httpURLConnection=null;
        OutputStream outputStream=null;
        InputStream inptStream=null;
        byte[] data = getRequestData(params, encode).toString().getBytes();//获得请求体
        try {
            SSLContext sslContext = null;
            try {
                sslContext = SSLContext.getInstance("SSL"); //或SSL
                X509TrustManager[] xtmArray = new X509TrustManager[] {new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                    }

                    @Override
                    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                    }

                    @Override
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                }};
                sslContext.init(null, xtmArray, new java.security.SecureRandom());
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
            }
            if (sslContext != null) {
                HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            }
            URL url = new URL(uri);
            httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setConnectTimeout(30000);        //设置连接超时时间
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoInput(true);                  //打开输入流，以便从服务器获取数据
            httpURLConnection.setDoOutput(true);                 //打开输出流，以便向服务器提交数据
            httpURLConnection.setRequestMethod("POST");     //设置以Post方式提交数据
            httpURLConnection.setUseCaches(false);               //使用Post方式不能使用缓存
            //设置请求体的类型是文本类型
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            //设置请求体的长度
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(data.length));

            httpURLConnection.setRequestProperty("Connection", "close");
            //获得输出流，向服务器写入数据
            httpURLConnection.connect();
            outputStream = httpURLConnection.getOutputStream();
            outputStream.write(data);
            outputStream.flush();
            outputStream.close();
            int response = httpURLConnection.getResponseCode();            //获得服务器的响应码
            if(response == HttpURLConnection.HTTP_OK) {
                responseObject=new ResponseObject();
                inptStream = httpURLConnection.getInputStream();
                String httpResult= dealResponseResult(inptStream);
                responseObject.setUri(httpURLConnection.getURL().toString());
                responseObject.setStatusCode(httpURLConnection.getResponseCode());
                responseObject.setResult(httpResult);
            }else{
                System.out.println("request:" + uri + "  responseCode:" + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStream!=null){
                outputStream.close();
            }
            if(inptStream!=null){
                inptStream.close();
            }
            if(httpURLConnection!=null){
                httpURLConnection.disconnect();
            }
        }
        return responseObject;
    }

    private static String dealResponseResult(InputStream inputStream) throws Exception{
        String resultData = null;      //存储处理结果
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int len = 0;
        try {
            while((len = inputStream.read(data)) != -1) {
                byteArrayOutputStream.write(data, 0, len);
            }
            resultData = new String(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(byteArrayOutputStream!=null){
                byteArrayOutputStream.close();
            }
        }
        return resultData;
    }

    private   static StringBuffer getRequestData(Map<String, String> params, String encode) {
        StringBuffer stringBuffer = new StringBuffer();        //存储封装好的请求体信息
        try {
            for(Map.Entry<String, String> entry : params.entrySet()) {
                stringBuffer.append(entry.getKey())
                        .append("=")
                        .append(URLEncoder.encode(entry.getValue(), encode))
                        .append("&");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);    //删除最后的一个"&"
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer;
    }

    /**
     * 向HTTPS地址发送POST请求
     *
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
     * @see
     */
    public static ResponseObject sendSSLPostRequest(String reqURL, Map<String, String> params) throws Exception{
        return submitPostData(reqURL, params, "UTF-8");
    }
}
