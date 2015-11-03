package com.mingdao.api.utils;

import com.mingdao.api.entity.ResponseObject;
import com.squareup.okhttp.*;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhenjiaWang on 15/8/26.
 */
public class OKHttpUtil {
    private static final OkHttpClient okHttpClient = new OkHttpClient();
    static{
        okHttpClient.setConnectTimeout(30, TimeUnit.SECONDS);
    }

    public static String formatParams(List<BasicNameValuePair> params){
        return URLEncodedUtils.format(params, "UTF-8");
    }
    public static ResponseObject get(String url, Map<String ,String> paramsMap) throws IOException {
        ResponseObject responseObject = null;
        String responseStr = null;
        List<BasicNameValuePair> nameValuePairs=null;
        if(paramsMap!=null&&!paramsMap.isEmpty()){
            nameValuePairs=new ArrayList<BasicNameValuePair>();
            Set<String> keys=paramsMap.keySet();
            for(String key:keys){
                BasicNameValuePair basicNameValuePair=new BasicNameValuePair(key,paramsMap.get(key));
                nameValuePairs.add(basicNameValuePair);
            }
        }
        url+="?"+formatParams(nameValuePairs);

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        if (response.isSuccessful()) {

            responseStr=response.body().string();
            responseObject=new ResponseObject();
            responseObject.setUri(url);
            responseObject.setStatusCode(response.code());
            responseObject.setResult(responseStr);
        } else {
            throw new IOException("Unexpected code " + response);
        }
        return  responseObject;
    }
    public static ResponseObject post(String url, Map<String ,String> paramsMap) throws IOException {
        ResponseObject responseObject = null;
        String responseStr = null;
        FormEncodingBuilder formEncodingBuilder=new FormEncodingBuilder();
        if(paramsMap!=null&&!paramsMap.isEmpty()){
            Set<String> keys=paramsMap.keySet();
            for(String key:keys){
                formEncodingBuilder.add(key,paramsMap.get(key));
            }
        }
        RequestBody formBody = formEncodingBuilder.build();

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        if (response.isSuccessful()) {

            responseStr=response.body().string();
            responseObject=new ResponseObject();
            responseObject.setUri(url);
            responseObject.setStatusCode(response.code());
            responseObject.setResult(responseStr);
        } else {
            throw new IOException("Unexpected code " + response);
        }
        return  responseObject;
    }
}
