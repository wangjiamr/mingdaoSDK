package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParams implements Serializable {

    private String sppartner ;

    private String transactionId;

    private String spbillcreateIp;

    private HtfParams(){

    }

    public HtfParams(String transactionId,String ip){
        String sNo[]=transactionId.split("-");
        transactionId=sNo[0]+sNo[2]+"-"+System.currentTimeMillis();
        setTransactionId(transactionId);
        setSppartner("1000000013");
        setSpbillcreateIp(ip);
    }

    public String getSppartner() {
        return sppartner;
    }

    public void setSppartner(String sppartner) {
        this.sppartner = sppartner;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSpbillcreateIp() {
        return spbillcreateIp;
    }

    public void setSpbillcreateIp(String spbillcreateIp) {
        this.spbillcreateIp = spbillcreateIp;
    }
}
