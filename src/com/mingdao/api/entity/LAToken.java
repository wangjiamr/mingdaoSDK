package com.mingdao.api.entity;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-16
 * Time: 下午5:02
 * To change this template use File | Settings | File Templates.
 */
public class LAToken implements Serializable {

    private String userId;

    private String companyId;

    private Long timeStamp;

    private String accessToken;

    private String laToken;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getLaToken() {
        return laToken;
    }

    public void setLaToken(String laToken) {
        this.laToken = laToken;
    }
}
