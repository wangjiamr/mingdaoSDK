package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsBankDetail extends HtfParams implements Serializable {

    private String province;


    private String bankName;


    private String city;

    private String keyword;

    public HtfParamsBankDetail(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
