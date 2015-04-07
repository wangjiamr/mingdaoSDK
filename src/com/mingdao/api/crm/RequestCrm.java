package com.mingdao.api.crm;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Message;
import com.mingdao.api.entity.ResponseObject;
import com.mingdao.api.entity.User;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.RequestType;
import com.mingdao.api.utils.SignatureUtil;
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
public class RequestCrm extends CommonSupport {

    public static JSONObject getOwner(String clientId,String authToken,String projectId) throws Exception {
        JSONObject result=null;
        if(StringUtils.isNotBlank(clientId)&&StringUtils.isNotBlank(authToken)){
            String timestamp = System.currentTimeMillis() + "";
            Double nonce = Math.random() * (999999 - 100000) + 1215;
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("projectid",projectId);
            String content=jsonObject.toString();

            String signature=SignatureUtil.getSignature(authToken, timestamp, nonce+"", content);
            Map<String, String> params = new HashMap<String, String>();
            params.put("clientId", clientId);
            params.put("signature", signature);
            params.put("timestamp", timestamp);
            params.put("nonce", nonce + "");
            params.put("content", content);
            ResponseObject responseObject = requestAPI(params, URI.CRM_OWNER, RequestType.POST);
            if(responseObject!=null){
                result=responseObject.getJsonObject();
                System.out.println(result.toString());
            }
        }
        return result;
    }
}
