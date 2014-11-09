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

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
public class HttpClientUtil {
    public static void main(String[] args) throws Exception {
        String str="https://api.mingdao.com/auth2/authorize?app_key=43BFFB491351619090BAE825291F1CDC&redirect_uri=http://211.160.178.45:8080/common/authorize.dhtml";
        System.out.println(URLEncoder.encode(str,"UTF-8"));
        Long currentTime=System.currentTimeMillis();
        String accToken="5cb53e2469624d3d949015dc703cb681";
        String result=HttpsUtil.httpByGet2StringSSL("https://api.mingdao.com/user/detail?format=json&u_id=d5e38abd-7772-4df6-b30a-97872c5d1e6e&access_token=5cb53e2469624d3d949015dc703cb681", null, null);
        Long endTime=System.currentTimeMillis();
        System.out.println(TimeUtils.getTimeDiff(currentTime,endTime));

    }


    /**
     * 向HTTPS地址发送POST请求
     *
     * @param reqURL 请求地址
     * @param params 请求参数
     * @return 响应内容
     * @see
     */
    public static ResponseObject sendSSLPostRequest(String reqURL, Map<String, String> params) {
        long responseLength = 0;                         //响应长度
        String responseContent = "";                     //响应内容
        ResponseObject responseObject = null;
        HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例
        X509TrustManager xtm = new X509TrustManager() {   //创建TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        try {
            //TLS1.0与SSL3.0基本上没有太大的差别，可粗略理解为TLS是SSL的继承者，但它们使用的是相同的SSLContext
            SSLContext ctx = SSLContext.getInstance("TLS");

            //使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用
            ctx.init(null, new TrustManager[]{xtm}, null);

            //创建SSLSocketFactory
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx);

            //通过SchemeRegistry将SSLSocketFactory注册到我们的HttpClient上
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory));

            HttpPost httpPost = new HttpPost(reqURL);                        //创建HttpPost
            List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //构建POST请求的表单参数
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            httpPost.setEntity(new UrlEncodedFormEntity(formParams, "UTF-8"));

            HttpResponse response = httpClient.execute(httpPost); //执行POST请求
            HttpEntity entity = response.getEntity();             //获取响应实体

            if (null != entity) {
                responseLength = entity.getContentLength();
                responseContent = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity); //Consume response content
                responseObject = new ResponseObject();
                responseObject.setUri(httpPost.getURI().toString());
                //System.out.println(responseContent);
                responseObject.setResult(responseContent);
                responseObject.setStatusCode(response.getStatusLine().getStatusCode());
            }
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown(); //关闭连接,释放资源
        }
        return responseObject;
    }

    /**
     * 向HTTPS地址发送GET请求
     *
     * @param reqURL 请求地址
     * @return 响应内容
     * @see
     */
    public static ResponseObject sendSSLGetRequest(String reqURL) {
        long responseLength = 0;                         //响应长度
        String responseContent = "";                     //响应内容
        ResponseObject responseObject = null;
        HttpClient httpClient = new DefaultHttpClient(); //创建默认的httpClient实例
        X509TrustManager xtm = new X509TrustManager() {   //创建TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        try {
            //TLS1.0与SSL3.0基本上没有太大的差别，可粗略理解为TLS是SSL的继承者，但它们使用的是相同的SSLContext
            SSLContext ctx = SSLContext.getInstance("TLS");

            //使用TrustManager来初始化该上下文，TrustManager只是被SSL的Socket所使用
            ctx.init(null, new TrustManager[]{xtm}, null);

            //创建SSLSocketFactory
            SSLSocketFactory socketFactory = new SSLSocketFactory(ctx);

            //通过SchemeRegistry将SSLSocketFactory注册到我们的HttpClient上
            httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory));

            HttpGet httpGet = new HttpGet(reqURL);
            HttpResponse response = httpClient.execute(httpGet); //执行POST请求
            HttpEntity entity = response.getEntity();             //获取响应实体

            if (null != entity) {
                responseLength = entity.getContentLength();
                responseContent = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity); //Consume response content
                responseObject = new ResponseObject();
                responseObject.setUri(httpGet.getURI().toString());
                //System.out.println(responseContent);
                responseObject.setResult(responseContent);
                responseObject.setStatusCode(response.getStatusLine().getStatusCode());
            }
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown(); //关闭连接,释放资源
        }
        return responseObject;
    }


}
