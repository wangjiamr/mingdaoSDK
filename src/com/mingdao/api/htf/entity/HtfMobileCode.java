package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfMobileCode implements Serializable {

    private String mobileDynamicCode;

    private String verifyCodeSeq;

    private String retcode;

    private String retmsg;

    public String getMobileDynamicCode() {
        return mobileDynamicCode;
    }

    public void setMobileDynamicCode(String mobileDynamicCode) {
        this.mobileDynamicCode = mobileDynamicCode;
    }

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
}
