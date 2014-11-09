package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsCity extends HtfParams implements Serializable {

    private String province;

    public HtfParamsCity(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
