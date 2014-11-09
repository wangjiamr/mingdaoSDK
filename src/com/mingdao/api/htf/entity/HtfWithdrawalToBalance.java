package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfWithdrawalToBalance implements Serializable {

    private String retcode;

    private String retmsg;

    private String HtfSerialNo;

    private String ProcStatus;


    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public String getHtfSerialNo() {
        return HtfSerialNo;
    }

    public void setHtfSerialNo(String htfSerialNo) {
        HtfSerialNo = htfSerialNo;
    }

    public String getProcStatus() {
        return ProcStatus;
    }

    public void setProcStatus(String procStatus) {
        ProcStatus = procStatus;
    }
}
