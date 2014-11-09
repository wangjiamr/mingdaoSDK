package com.mingdao.api.entity;

import java.util.List;

/**
 * Created by zhenjiaWang on 14-7-3.
 */
public class ReqDetailEntity {

    private Integer seq;

    private List<ReqDetailListEntity> detailList;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public List<ReqDetailListEntity> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<ReqDetailListEntity> detailList) {
        this.detailList = detailList;
    }
}
