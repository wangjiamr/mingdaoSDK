package com.mingdao.api.htf.entity;

import net.sf.json.JSONArray;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfPurchase implements Serializable {

    private String retcode;

    private String retmsg;

    private JSONArray item;

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

    public JSONArray getItem() {
        return item;
    }

    public void setItem(JSONArray item) {
        this.item = item;
    }
}
