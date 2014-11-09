package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfTradeDate implements Serializable {

   private String retcode;

    private String retmsg;

    private String tradable;

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

    public String getTradable() {
        return tradable;
    }

    public void setTradable(String tradable) {
        this.tradable = tradable;
    }
}
