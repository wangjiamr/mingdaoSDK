package com.mingdao.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:41
 * To change this template use File | Settings | File Templates.
 */
public class WxObject implements Serializable{

    private String state;

    private boolean success;

    private String regUrl;

    private List<NetWork> netWorkList;

    private String userName;

    private String password;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getRegUrl() {
        return regUrl;
    }

    public void setRegUrl(String regUrl) {
        this.regUrl = regUrl;
    }

    public List<NetWork> getNetWorkList() {
        return netWorkList;
    }

    public void setNetWorkList(List<NetWork> netWorkList) {
        this.netWorkList = netWorkList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
