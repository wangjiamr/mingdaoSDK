package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsWithdrawalToBalance extends HtfParams implements Serializable {

    private String custNo;

    private String instituteId;

    private Double amount;

    private String verifyCodeSeq;

    private String verifyCode;

    private String instSerialNo;

    public HtfParamsWithdrawalToBalance(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstSerialNo() {
        return instSerialNo;
    }

    public void setInstSerialNo(String instSerialNo) {
        this.instSerialNo = instSerialNo;
    }
}
