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
public class ReqRowContentEntity implements Serializable {

    private String label;

    private String type;

    private String value;

    private ReqColListEntity colList;

    private ReqEvalContentEntity eval;

    private List<ReqDetailEntity> details;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ReqColListEntity getColList() {
        return colList;
    }

    public void setColList(ReqColListEntity colList) {
        this.colList = colList;
    }

    public ReqEvalContentEntity getEval() {
        return eval;
    }

    public void setEval(ReqEvalContentEntity eval) {
        this.eval = eval;
    }

    public List<ReqDetailEntity> getDetails() {
        return details;
    }

    public void setDetails(List<ReqDetailEntity> details) {
        this.details = details;
    }
}
