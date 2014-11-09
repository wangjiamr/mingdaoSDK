package com.mingdao.api.entity;

/**
 * Created by wangjia on 14-7-1.
 */
public class PushWxMessage {

    private String touser;

    private String toparty;

    private String agentid;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getToparty() {
        return toparty;
    }

    public void setToparty(String toparty) {
        this.toparty = toparty;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }
}
