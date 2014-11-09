package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsAsset extends HtfParams implements Serializable {

    private String custNo;

    public HtfParamsAsset(String transactionId, String ip) {
        super(transactionId, ip);
    }


    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
}
