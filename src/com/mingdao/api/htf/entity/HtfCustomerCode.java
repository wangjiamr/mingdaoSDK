package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfCustomerCode implements Serializable {

    private String verifyCodeSeq;

    private String mobileDynamicCode;

    private String retcode;

    private String retmsg;

    public String getVerifyCodeSeq() {
        return verifyCodeSeq;
    }

    public void setVerifyCodeSeq(String verifyCodeSeq) {
        this.verifyCodeSeq = verifyCodeSeq;
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public String getMobileDynamicCode() {
        return mobileDynamicCode;
    }

    public void setMobileDynamicCode(String mobileDynamicCode) {
        this.mobileDynamicCode = mobileDynamicCode;
    }
}
