package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfBankDetail implements Serializable {


    private String innerNo;

    private String inBankNo;

    private String branchnm;


    public String getBranchnm() {
        return branchnm;
    }

    public void setBranchnm(String branchnm) {
        this.branchnm = branchnm;
    }

    public String getInnerNo() {
        return innerNo;
    }

    public void setInnerNo(String innerNo) {
        this.innerNo = innerNo;
    }

    public String getInBankNo() {
        return inBankNo;
    }

    public void setInBankNo(String inBankNo) {
        this.inBankNo = inBankNo;
    }
}
