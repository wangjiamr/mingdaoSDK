package com.mingdao.api.utils;


import com.mingdao.api.entity.ResponseObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;

public class HttpUtils {

    public static ResponseObject sendRequest(String urlStr, Map<String, String> params, String charset) throws Exception {
        ResponseObject responseObject = null;
        URLConnection URLconnection = null;
        HttpURLConnection httpConnection = null;
        InputStream httpStream = null;
        BufferedReader bufferReader = null;
        StringBuffer resultSB = new StringBuffer("");
        try {
            if (urlStr != null) {
                urlStr = urlStr.trim();
            }
            URL url = new URL(urlStr);
            URLconnection = url.openConnection();
            httpConnection = (HttpURLConnection) URLconnection;
            httpConnection.setDoOutput(true);
            httpConnection.setDoInput(true);
            httpConnection.setUseCaches(false);
            httpConnection.setRequestMethod("POST");
            httpConnection.connect();
            if (params != null && !params.isEmpty()) {
                OutputStream cos = httpConnection.getOutputStream();
                PrintWriter cosOut = new PrintWriter(cos);
                StringBuffer buf = new StringBuffer();
                for (String key : params.keySet()) {
                    if (buf != null && buf.length() > 0)
                        buf.append("&");
                    buf.append(key + "=" + params.get(key));
                }
                cosOut.print(buf.toString());
                cosOut.close();
            }

            int responseCode = httpConnection.getResponseCode();


            if (responseCode == HttpURLConnection.HTTP_OK) {
                httpStream = httpConnection.getInputStream();
                if (charset != null && charset.length() > 0) {
                    bufferReader = new BufferedReader(new InputStreamReader(httpStream, Charset.forName(charset)));
                } else {
                    bufferReader = new BufferedReader(new InputStreamReader(httpStream));
                }
                String currLine = "";
                while ((currLine = bufferReader.readLine()) != null) {
                    resultSB.append(currLine);
                }
                responseObject = new ResponseObject();
                responseObject.setUri(urlStr);
                responseObject.setResult(resultSB.toString());
                responseObject.setStatusCode(responseCode);
            }
        } catch (Exception e) {

        } finally {
            if (bufferReader != null) {
                bufferReader.close();
            }
            if (httpStream != null) {
                httpStream.close();
            }
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }
        return responseObject;
    }

    public static ResponseObject sendRequest(String urlStr, String charset) throws Exception {
        ResponseObject responseObject = null;
        URLConnection URLconnection = null;
        HttpURLConnection httpConnection = null;
        InputStream httpStream = null;
        BufferedReader bufferReader = null;
        StringBuffer resultSB = new StringBuffer("");
        try {
            if (urlStr != null) {
                urlStr = urlStr.trim();
            }
            URL url = new URL(urlStr);
            URLconnection = url.openConnection();
            httpConnection = (HttpURLConnection) URLconnection;
            httpConnection.setDoOutput(true);
            httpConnection.setDoInput(true);
            httpConnection.setUseCaches(false);
            httpConnection.setRequestMethod("GET");
            httpConnection.connect();


            int responseCode = httpConnection.getResponseCode();


            if (responseCode == HttpURLConnection.HTTP_OK) {
                httpStream = httpConnection.getInputStream();
                if (charset != null && charset.length() > 0) {
                    bufferReader = new BufferedReader(new InputStreamReader(httpStream, Charset.forName(charset)));
                } else {
                    bufferReader = new BufferedReader(new InputStreamReader(httpStream));
                }
                String currLine = "";
                while ((currLine = bufferReader.readLine()) != null) {
                    resultSB.append(currLine);
                }
                responseObject = new ResponseObject();
                responseObject.setUri(urlStr);
                responseObject.setResult(resultSB.toString());
                responseObject.setStatusCode(responseCode);
            }
        } catch (Exception e) {

        } finally {
            if (bufferReader != null) {
                bufferReader.close();
            }
            if (httpStream != null) {
                httpStream.close();
            }
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }
        return responseObject;
    }

    public static byte[] getOutputStream(String urlStr, Map<String, String> params) throws Exception {
        URLConnection URLconnection = null;
        HttpURLConnection httpConnection = null;
        InputStream httpStream = null;
        ByteArrayOutputStream streamOut = null;
        try {
            if (urlStr != null) {
                urlStr = urlStr.trim();
            }
            URL url = new URL(urlStr);
            URLconnection = url.openConnection();
            httpConnection = (HttpURLConnection) URLconnection;
            httpConnection.setDoOutput(true);
            httpConnection.setDoInput(true);
            httpConnection.setUseCaches(false);
            httpConnection.setRequestMethod("POST");
            httpConnection.connect();
            if (params != null && !params.isEmpty()) {
                OutputStream cos = httpConnection.getOutputStream();
                PrintWriter cosOut = new PrintWriter(cos);
                StringBuffer buf = new StringBuffer();
                for (String key : params.keySet()) {
                    if (buf != null && buf.length() > 0)
                        buf.append("&");
                    buf.append(key + "=" + params.get(key));
                }
                cosOut.print(buf.toString());
                cosOut.close();
            }

            int responseCode = httpConnection.getResponseCode();


            if (responseCode == HttpURLConnection.HTTP_OK) {

                httpStream = httpConnection.getInputStream();
                streamOut = new ByteArrayOutputStream();
                int blockSize = 4096;
                byte buf[] = new byte[blockSize];
                int bytesRead = 0;
                while ((bytesRead = httpStream.read(buf)) != -1) {
                    streamOut.write(buf, 0, bytesRead);
                }
                byte[] downloadBytes = streamOut.toByteArray();

                return downloadBytes;
            }
        } catch (Exception e) {

        } finally {
            if (streamOut != null) {
                streamOut.close();
            }
            if (httpStream != null) {
                httpStream.close();
            }
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }
        return null;
    }
}