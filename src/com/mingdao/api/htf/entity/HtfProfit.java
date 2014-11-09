package com.mingdao.api.htf.entity;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfProfit implements Serializable {
    private Integer currentPageNo;

    private Integer pageSize;

    private String retcode;

    private String retmsg;

    private Integer total;

    private JSONArray item;

    public Integer getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(Integer currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public JSONArray getItem() {
        return item;
    }

    public void setItem(JSONArray item) {
        this.item = item;
    }

    public List<HtfProfitItem> getItemList(){
        JSONArray  profitItems=getItem();
        List<HtfProfitItem> itemList=null;
        if(profitItems!=null&&!profitItems.isEmpty()){
            itemList=new ArrayList<HtfProfitItem>();
            for(Object item:profitItems){
                HtfProfitItem htfProfitItem= (HtfProfitItem) JSONObject.toBean((JSONObject) item, HtfProfitItem.class);
                itemList.add(htfProfitItem);
            }
        }
        return itemList;
    }
}
