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
public class ReqEvalDataEntity implements Serializable {

    private String evalKey;

    private String evalValue;

    private Integer evalScore;

    private List<ReqEvalDetailEntity> detailList;

    public String getEvalKey() {
        return evalKey;
    }

    public void setEvalKey(String evalKey) {
        this.evalKey = evalKey;
    }

    public String getEvalValue() {
        return evalValue;
    }

    public void setEvalValue(String evalValue) {
        this.evalValue = evalValue;
    }

    public Integer getEvalScore() {
        return evalScore;
    }

    public void setEvalScore(Integer evalScore) {
        this.evalScore = evalScore;
    }

    public List<ReqEvalDetailEntity> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<ReqEvalDetailEntity> detailList) {
        this.detailList = detailList;
    }
}
