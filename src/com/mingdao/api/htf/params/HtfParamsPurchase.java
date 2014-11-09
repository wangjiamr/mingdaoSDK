package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsPurchase extends HtfParams implements Serializable {

    private String custNo;

    private String tradeTy;

    public HtfParamsPurchase(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getTradeTy() {
        return tradeTy;
    }

    public void setTradeTy(String tradeTy) {
        this.tradeTy = tradeTy;
    }
}
