package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsCustomerStatus extends HtfParams implements Serializable {

    private String instName;


    private String instIdNo;

    public HtfParamsCustomerStatus(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public String getInstIdNo() {
        return instIdNo;
    }

    public void setInstIdNo(String instIdNo) {
        this.instIdNo = instIdNo;
    }
}
