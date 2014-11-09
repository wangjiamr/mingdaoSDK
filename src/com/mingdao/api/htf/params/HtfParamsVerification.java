package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsVerification extends HtfParams implements Serializable {

    private String verifyCodeSeq;

    private String verifyCode;

    public HtfParamsVerification(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getVerifyCodeSeq() {
        return verifyCodeSeq;
    }

    public void setVerifyCodeSeq(String verifyCodeSeq) {
        this.verifyCodeSeq = verifyCodeSeq;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
