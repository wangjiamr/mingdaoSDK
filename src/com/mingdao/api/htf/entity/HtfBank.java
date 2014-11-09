package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfBank implements Serializable {

    private String bankName;

    private String outBankNo;

    private String inBankNo;


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getOutBankNo() {
        return outBankNo;
    }

    public void setOutBankNo(String outBankNo) {
        this.outBankNo = outBankNo;
    }

    public String getInBankNo() {
        return inBankNo;
    }

    public void setInBankNo(String inBankNo) {
        this.inBankNo = inBankNo;
    }
}
