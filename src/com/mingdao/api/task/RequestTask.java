package com.mingdao.api.task;

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
public class RequestTask extends CommonSupport {

    public static String create(String accessToken,String title,String desc,String endDate,
                             String taskUID,String taskMUID) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("t_title", title);
        if(StringUtils.isNotBlank(desc)){
            params.put("t_des", title);
        }
        if(StringUtils.isNotBlank(endDate)){
            params.put("t_ed", endDate);
        }
        if(StringUtils.isNotBlank(taskUID)){
            params.put("u_id", taskUID);
        }
        if(StringUtils.isNotBlank(taskMUID)){
            params.put("t_mids", taskMUID);
        }
        ResponseObject responseObject = requestAPI(params, URI.TASK_CREATE, RequestType.POST);
        String taskID = "";
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        taskID = rootObject.getString("task");
                    }
                }
            }
        }
        return taskID;
    }
}
