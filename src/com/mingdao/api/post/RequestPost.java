package com.mingdao.api.post;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Group;
import com.mingdao.api.entity.ResponseObject;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.RequestType;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

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
public class RequestPost extends CommonSupport {

    public static List<Group> getAll(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<Group> groupList = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.POST_ALL, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONObject resultObject = rootObject.getJSONObject("result");
                    }
                }
            }
        }
        return groupList;
    }

    public static String uploadMsg(String accessToken, String msg) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        if (StringUtils.isNotBlank(msg)) {
            params.put("p_msg", msg);
        }
        String postID = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.POST_UPLOAD, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        postID = rootObject.getString("post");
                    }
                }
            }
        }
        return postID;
    }


}
