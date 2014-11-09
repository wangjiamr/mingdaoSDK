package com.mingdao.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-7-31
 * Time: 下午7:36
 * To change this template use File | Settings | File Templates.
 */
public class ReqColListEntity implements Serializable {

    private String label;

    private List<String> names;

    private List<List<String>> values;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<List<String>> getValues() {
        return values;
    }

    public void setValues(List<List<String>> values) {
        this.values = values;
    }
}
