package com.mingdao.api.utils;

import org.apache.http.client.HttpClient;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-9-24
 * Time: 下午6:01
 * To change this template use File | Settings | File Templates.
 */
public class HttpsSessionFactory {
    private static final ThreadLocal<HttpClient> threadLocal = new ThreadLocal<HttpClient>();

    private HttpsSessionFactory() {
    }

    public static void open() throws Exception {
        HttpClient httpClient = threadLocal.get();
        if (httpClient == null) {
            httpClient = HttpsUtil.getNewHttpClient();
            threadLocal.set(httpClient);
        }
    }

    public static HttpClient getCurrentSession() throws Exception {
        HttpClient httpClient = threadLocal.get();
        return httpClient;
    }

    public static void close() throws Exception {
        HttpClient httpClient = threadLocal.get();
        threadLocal.set(null);
        if (httpClient != null) {
            try {
                httpClient.getConnectionManager().shutdown();
            } catch (Exception e) {
            }
        }
    }
}
