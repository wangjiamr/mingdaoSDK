package com.mingdao.api.billing;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Billing;
import com.mingdao.api.entity.ResponseObject;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.RequestType;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class RequestBilling extends CommonSupport {


    public static Billing create(String signature, String timestamp,String nonce,String content) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("signature", signature);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("content", content);
        Billing billing=null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.BILLING_CREATE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        billing=new Billing();
                        if(rootObject.containsKey("id")){
                            billing.setId(rootObject.getString("id"));
                        }
                        billing.setStatus(rootObject.getString("status"));
                        if(rootObject.containsKey("redirect")){
                            billing.setRedirect(rootObject.getString("redirect"));
                        }
                    }
                }
            }
        }
        return billing;
    }

    public static Billing createAuto(String signature, String timestamp,String nonce,String content) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("signature", signature);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("content", content);
        Billing billing=null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.BILLING_CREATE_AUTO, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        billing=new Billing();
                        billing.setId(rootObject.getString("id"));
                        billing.setStatus(rootObject.getString("status"));
                    }
                }
            }
        }
        return billing;
    }

    public static Billing close(String signature, String timestamp,String nonce,String content) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("signature", signature);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("content", content);
        Billing billing=null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.BILLING_CLOSE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        billing=new Billing();
                        billing.setStatus(rootObject.getString("status"));
                    }
                }
            }
        }
        return billing;
    }


    public static Billing detail(String signature, String timestamp,String nonce,String content) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("signature", signature);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("content", content);
        Billing billing=null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.BILLING_CLOSE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        billing=new Billing();
                        billing.setStatus(rootObject.getString("status"));
                    }
                }
            }
        }
        return billing;
    }

}
