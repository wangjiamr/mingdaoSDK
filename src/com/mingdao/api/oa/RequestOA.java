package com.mingdao.api.oa;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Apply;
import com.mingdao.api.entity.ApplyWidget;
import com.mingdao.api.entity.ApplyWidgetSource;
import com.mingdao.api.entity.ResponseObject;
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


    public static List<Apply> getApplyList(String signature,  String timestamp, String nonce,  String appkey, String appSecret,String companyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("companyId", companyId);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("appkey", appkey);
        params.put("appSecret", appSecret);
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

    public static List<ApplyWidget> getApplyWidgetGroup(String signature,  String timestamp, String nonce,  String appkey, String appSecret,Long applyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("appkey", appkey);
        params.put("appSecret", appSecret);
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

    public static List<ApplyWidget> getApplyWidgetValue(String signature,  String timestamp, String nonce,  String appkey, String appSecret,Long applyId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("appkey", appkey);
        params.put("appSecret", appSecret);
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

    public static List<ApplyWidgetSource> getApplyWidgetGroupSource(String signature,  String timestamp, String nonce,  String appkey, String appSecret,Long applyId,String widgetUID) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("applyId", applyId+"");
        params.put("widgetUID", widgetUID);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("appkey", appkey);
        params.put("appSecret", appSecret);
        List<ApplyWidgetSource> applyWidgetSourceList=null;
        ResponseObject responseObject = requestAPI(params, getOaUrl()+URI.OA_APPLY_WIDGET_GROUP_SOURCE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONArray widgetArray=rootObject.getJSONArray("widgetList");
                            if(widgetArray!=null&&!widgetArray.isEmpty()){
                                applyWidgetSourceList=new ArrayList<ApplyWidgetSource>();
                                for(Object obj:widgetArray){
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

}
