package com.mingdao.api.entity;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-16
 * Time: 下午4:40
 * To change this template use File | Settings | File Templates.
 */
public class Billing implements Serializable {

    private String id;
    
    private String status;
    
    private String redirect;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }
}
