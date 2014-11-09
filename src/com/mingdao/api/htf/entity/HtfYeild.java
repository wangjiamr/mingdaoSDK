package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfYeild implements Serializable {

    private String Yield;

    private String retcode;

    private String Nav;

    private String Navdt;

    private String retmsg;


    public String getYield() {
        return Yield;
    }

    public void setYield(String yield) {
        Yield = yield;
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getNav() {
        return Nav;
    }

    public void setNav(String nav) {
        Nav = nav;
    }

    public String getNavdt() {
        return Navdt;
    }

    public void setNavdt(String navdt) {
        Navdt = navdt;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }
}
