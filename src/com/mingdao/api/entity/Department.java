package com.mingdao.api.entity;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-27
 * Time: 下午3:34
 * To change this template use File | Settings | File Templates.
 */
public class Department implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
