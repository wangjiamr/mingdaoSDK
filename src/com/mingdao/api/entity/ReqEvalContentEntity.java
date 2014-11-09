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
public class ReqEvalContentEntity implements Serializable {

    private String label;

    private String keyLabel;

    private String detailLabel;

    private String valueLabel;

    private List<ReqEvalDataEntity> dataList;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getKeyLabel() {
        return keyLabel;
    }

    public void setKeyLabel(String keyLabel) {
        this.keyLabel = keyLabel;
    }

    public String getDetailLabel() {
        return detailLabel;
    }

    public void setDetailLabel(String detailLabel) {
        this.detailLabel = detailLabel;
    }

    public String getValueLabel() {
        return valueLabel;
    }

    public void setValueLabel(String valueLabel) {
        this.valueLabel = valueLabel;
    }

    public List<ReqEvalDataEntity> getDataList() {
        return dataList;
    }

    public void setDataList(List<ReqEvalDataEntity> dataList) {
        this.dataList = dataList;
    }
}
