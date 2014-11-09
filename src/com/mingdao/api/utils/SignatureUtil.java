package com.mingdao.api.utils;

import com.mingdao.api.entity.AppConfig;
import org.apache.commons.lang.StringUtils;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-11-15
 * Time: 上午11:43
 * To change this template use File | Settings | File Templates.
 */
public class SignatureUtil {

    public static String getSignature(String timeStamp, String nonce, String content, String appkey, String appSecret) {
        String signature = null;
        if (StringUtils.isNotBlank(timeStamp) && StringUtils.isNotBlank(nonce) && StringUtils.isNotBlank(content)) {
            appkey = appkey.toLowerCase();
            appSecret = appSecret.toLowerCase();
            List<String> list = new ArrayList<String>();
            list.add(appkey);
            list.add(appSecret);
            Collections.sort(list, Collator.getInstance(java.util.Locale.CHINA));

            String appInfo = "";
            for (String s : list) {
                appInfo += s;
            }
            try {
                appInfo = EncryptUtil.encrypt(appInfo, EncryptUtil.MD5);
            } catch (Exception e) {

            }
            appInfo = appInfo.toLowerCase();

            list.clear();
            list.add(appInfo);
            list.add(timeStamp.toLowerCase());
            list.add(nonce.toLowerCase());
            list.add(content.toLowerCase());
            Collections.sort(list, Collator.getInstance(java.util.Locale.CHINA));

            signature = "";
            for (String s : list) {
                signature += s;
            }
            try{
                signature = EncryptUtil.encrypt(signature,EncryptUtil.SHA1);
            }catch (Exception e){

            }
            signature = signature.toLowerCase();
        }
        return signature;
    }

    public static String getSignature(AppConfig appConfig,String timeStamp, String nonce, String content) {
        String signature = null;
        if (StringUtils.isNotBlank(timeStamp) && StringUtils.isNotBlank(nonce) && StringUtils.isNotBlank(content)) {
            String appkey = appConfig.getAppKey();
            String appSecret = appConfig.getAppSecret();
            appkey = appkey.toLowerCase();
            appSecret = appSecret.toLowerCase();
            List<String> list = new ArrayList<String>();
            list.add(appkey);
            list.add(appSecret);
            Collections.sort(list, Collator.getInstance(java.util.Locale.CHINA));

            String appInfo = "";
            for (String s : list) {
                appInfo += s;
            }

            try {
                appInfo = EncryptUtil.encrypt(appInfo, EncryptUtil.MD5);
            } catch (Exception e) {

            }
            appInfo = appInfo.toLowerCase();

            list.clear();
            list.add(appInfo);
            list.add(timeStamp.toLowerCase());
            list.add(nonce.toLowerCase());
            list.add(content.toLowerCase());
            Collections.sort(list, Collator.getInstance(java.util.Locale.CHINA));

            signature = "";
            for (String s : list) {
                signature += s;
            }
            try {
                signature = EncryptUtil.encrypt(signature, EncryptUtil.SHA1);
            } catch (Exception e) {

            }
            signature = signature.toLowerCase();
        }
        return signature;
    }
}
