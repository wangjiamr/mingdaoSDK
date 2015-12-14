package com.mingdao.api.oa;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.*;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.RequestType;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class RequestOA extends CommonSupport {

    public static Apply getApply(String signature,  String timestamp, String nonce,  Long applyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        Apply apply=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                             apply=new Apply();
                            apply.setId(rootObject.getLong("id"));
                            apply.setName(rootObject.getString("name"));

                        }
                    }
                }
            }
        }
        return apply;
    }



    public static List<Apply> getApplyList(String signature,  String timestamp, String nonce, String companyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("companyId", companyId);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        List<Apply> applyList=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONArray applyArray=rootObject.getJSONArray("applyList");
                            if(applyArray!=null&&!applyArray.isEmpty()){
                                applyList=new ArrayList<Apply>();
                                for(Object obj:applyArray){
                                    JSONObject applyObj=(JSONObject)obj;
                                    Apply apply=new Apply();
                                    apply.setId(applyObj.getLong("id"));
                                    apply.setName(applyObj.getString("name"));
                                    applyList.add(apply);
                                }
                            }
                        }
                    }
                }
            }
        }
        return applyList;
    }

    public static List<ApplyWidget> getApplyWidgetGroup(String signature,  String timestamp, String nonce,  Long applyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        List<ApplyWidget> applyWidgetList=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY_WIDGET_GROUP, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONArray widgetArray=rootObject.getJSONArray("widgetList");
                            if(widgetArray!=null&&!widgetArray.isEmpty()){
                                applyWidgetList=new ArrayList<ApplyWidget>();
                                for(Object obj:widgetArray){
                                    JSONObject applyObj=(JSONObject)obj;
                                    ApplyWidget applyWidget=new ApplyWidget();
                                    applyWidget.setUid(applyObj.getString("uid"));
                                    applyWidget.setName(applyObj.getString("name"));
                                    applyWidgetList.add(applyWidget);
                                }
                            }
                        }
                    }
                }
            }
        }
        return applyWidgetList;
    }

    public static List<ApplyWidget> getApplyWidgetValue(String signature,  String timestamp, String nonce,  Long applyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        List<ApplyWidget> applyWidgetList=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY_WIDGET_VALUE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONArray widgetArray=rootObject.getJSONArray("widgetList");
                            if(widgetArray!=null&&!widgetArray.isEmpty()){
                                applyWidgetList=new ArrayList<ApplyWidget>();
                                for(Object obj:widgetArray){
                                    JSONObject applyObj=(JSONObject)obj;
                                    ApplyWidget applyWidget=new ApplyWidget();
                                    applyWidget.setUid(applyObj.getString("uid"));
                                    applyWidget.setName(applyObj.getString("name"));
                                    applyWidgetList.add(applyWidget);
                                }
                            }
                        }
                    }
                }
            }
        }
        return applyWidgetList;
    }


    public static List<ApplyWidget> getApplyWidgetDate(String signature,  String timestamp, String nonce,  Long applyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        List<ApplyWidget> applyWidgetList=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY_WIDGET_DATE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONArray widgetArray=rootObject.getJSONArray("widgetList");
                            if(widgetArray!=null&&!widgetArray.isEmpty()){
                                applyWidgetList=new ArrayList<ApplyWidget>();
                                for(Object obj:widgetArray){
                                    JSONObject applyObj=(JSONObject)obj;
                                    ApplyWidget applyWidget=new ApplyWidget();
                                    applyWidget.setUid(applyObj.getString("uid"));
                                    applyWidget.setName(applyObj.getString("name"));
                                    applyWidgetList.add(applyWidget);
                                }
                            }
                        }
                    }
                }
            }
        }
        return applyWidgetList;
    }

    public static List<ApplyWidgetSource> getApplyWidgetGroupSource(String signature,  String timestamp, String nonce,  Long applyId,String widgetUID) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("widgetUID", widgetUID);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        List<ApplyWidgetSource> applyWidgetSourceList=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY_WIDGET_GROUP_SOURCE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONArray sourceArray=rootObject.getJSONArray("sourceList");
                            if(sourceArray!=null&&!sourceArray.isEmpty()){
                                applyWidgetSourceList=new ArrayList<ApplyWidgetSource>();
                                for(Object obj:sourceArray){
                                    JSONObject applyObj=(JSONObject)obj;
                                    ApplyWidgetSource applyWidgetSource=new ApplyWidgetSource();
                                    applyWidgetSource.setKey(applyObj.getString("key"));
                                    applyWidgetSourceList.add(applyWidgetSource);
                                }
                            }
                        }
                    }
                }
            }
        }
        return applyWidgetSourceList;
    }

    public static List<ApplyData> getApplyData(String signature,  String timestamp, String nonce,
                                               String companyId,Long applyId,String userId,String widgetUIDs,
                                               String startDate,String endDate) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("companyId", companyId);
        params.put("applyId", applyId+"");
        params.put("userId", userId);
        params.put("widgetUIDs", widgetUIDs);
        params.put("startDate", startDate);
        params.put("endDate", endDate);
        List<ApplyData> applyDataList=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY_DATA, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONArray reqArray=rootObject.getJSONArray("reqArray");
                            if(reqArray!=null&&!reqArray.isEmpty()){
                                applyDataList=new ArrayList<ApplyData>();
                                for(Object obj:reqArray){
                                    JSONObject applyObj=(JSONObject)obj;
                                    ApplyData applyData=new ApplyData();
                                    applyData.setId(applyObj.getLong("reqId"));
                                    applyData.setReqNo(applyObj.getString("reqNo"));
                                    applyData.setSendDate(applyObj.getString("sendDate"));
                                    if(applyObj.containsKey("dataArray")){
                                        JSONArray dataArray=applyObj.getJSONArray("dataArray");
                                        if(dataArray!=null&&!dataArray.isEmpty()){
                                            Map<String,String> valueMap=new HashMap<String, String>();
                                            Map<String,String> labelMap=new HashMap<String, String>();
                                            for(Object data:dataArray){
                                                JSONObject widgetDateObj=(JSONObject)data;
                                                if(widgetDateObj!=null){
                                                    valueMap.put(widgetDateObj.getString("uid"),widgetDateObj.getString("value"));
                                                    labelMap.put(widgetDateObj.getString("uid"),widgetDateObj.getString("label"));
                                                }
                                            }
                                            applyData.setValueMap(valueMap);
                                            applyData.setLabelMap(labelMap);
                                        }
                                    }
                                    applyDataList.add(applyData);
                                }
                            }
                        }
                    }
                }
            }
        }
        return applyDataList;
    }
}
