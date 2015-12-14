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
public class RequestOASearch extends CommonSupport {

    public static JSONObject searchFull(String signature, String timestamp, String nonce, String appkey, String appSecret, Long companyId, String userId, String keyword,String requestPlatform) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("timestamp", timestamp);
        params.put("nonce", nonce);
        params.put("appkey", appkey);
        params.put("appSecret", appSecret);
        params.put("companyId", companyId + "");
        params.put("userId", userId);
        params.put("keyword", keyword);
        params.put("requestPlatform", requestPlatform);
        JSONObject searchObj = null;
        ResponseObject responseObject = requestAPI(params, getOaSearchUrl() + URI.OA_SEARCH, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            searchObj = rootObject;

                        }
                    }
                }
            }
        }
        return searchObj;
    }


}
