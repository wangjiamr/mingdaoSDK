package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsTradeDate extends HtfParams implements Serializable {

    private String apKind;

    public HtfParamsTradeDate(String transactionId, String ip) {
        super(transactionId, ip);
    }


    public String getApKind() {
        return apKind;
    }

    public void setApKind(String apKind) {
        this.apKind = apKind;
    }
}
