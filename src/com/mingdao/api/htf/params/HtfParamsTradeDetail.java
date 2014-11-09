package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsTradeDetail extends HtfParams implements Serializable {

    private String serialNo;

    public HtfParamsTradeDetail(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
}
