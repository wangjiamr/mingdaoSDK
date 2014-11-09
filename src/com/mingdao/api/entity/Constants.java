package com.mingdao.api.entity;

import com.mingdao.api.utils.MingDaoConstantsUtil;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-16
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class Constants implements Serializable {

    private String code;

    private String name;

    private long parentCode;

    public Constants(long parentCode, String name, String code) {
        this.parentCode = parentCode;
        this.name = name;
        this.code = code;
        MingDaoConstantsUtil.getInstance().setConstants(parentCode + "-" + code, this);

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParentCode() {
        return parentCode;
    }

    public void setParentCode(long parentCode) {
        this.parentCode = parentCode;
    }
}
