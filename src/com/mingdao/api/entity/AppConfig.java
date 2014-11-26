package com.mingdao.api.entity;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:15
 * To change this template use File | Settings | File Templates.
 */
public class AppConfig implements Serializable {

    private String appKey;

    private String appSecret;

    private String redirectUri;

    private String htfUri;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getHtfUri() {
        return htfUri;
    }

    public void setHtfUri(String htfUri) {
        this.htfUri = htfUri;
    }
}
