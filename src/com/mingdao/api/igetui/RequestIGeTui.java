package com.mingdao.api.igetui;

import com.mingdao.api.common.CommonSupport;
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
public class RequestIGeTui extends CommonSupport {

    public static void pushIOS(IGeTui environment,IGeTui type,String content,String payloadContent,Integer badge,String clientId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("platform", "IOS");
        params.put("environment", environment.toString());
        params.put("type", type.toString());
        params.put("content", content);
        params.put("payloadContent", payloadContent);
        params.put("badge", badge.toString());
        params.put("clientId", clientId);
        requestAPI(params, URI.IGeTui_PUSH, RequestType.POST);
    }
    public static void pushANDROID(IGeTui environment,IGeTui type,String content,String payloadContent,String clientId) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("platform", "ANDROID");
        params.put("environment", environment.toString());
        params.put("type", type.toString());
        params.put("content", content);
        params.put("payloadContent", payloadContent);
        params.put("clientId", clientId);
        requestAPI(params, URI.IGeTui_PUSH, RequestType.POST);
    }
}
