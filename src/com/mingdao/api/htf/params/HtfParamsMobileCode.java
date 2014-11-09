package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsMobileCode extends HtfParams implements Serializable {

    private String mobileNo;

    public HtfParamsMobileCode(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
