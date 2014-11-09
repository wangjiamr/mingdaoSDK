package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsCustomerCode extends HtfParams implements Serializable {

    private String customerNo;

    public HtfParamsCustomerCode(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
}
