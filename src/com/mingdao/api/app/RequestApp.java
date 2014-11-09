package com.mingdao.api.app;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.ResponseObject;
import com.mingdao.api.entity.User;
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
public class RequestApp extends CommonSupport {


    public static List<User> getAdminUser(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params, URI.APP_GET_ADMIN, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONArray userArray = rootObject.getJSONArray("users");
                        if (userArray != null && !userArray.isEmpty()) {
                            userList = new ArrayList<User>();
                            for (int i = 0; i < userArray.size(); i++) {
                                JSONObject obj = userArray.getJSONObject(i);
                                if (obj != null) {
                                    User user = new User();
                                    user.setAvstar(obj.getString("avstar"));
                                    user.setAvstar100(obj.getString("avstar100"));
                                    user.setDepartment(obj.getString("department"));
                                    user.setEmail(obj.getString("email"));
                                    user.setId(obj.getString("id"));
                                    user.setJob(obj.getString("job"));
                                    user.setMobilePhone(obj.getString("mobilephone"));
                                    user.setName(obj.getString("name"));
                                    userList.add(user);
                                }
                            }
                        }
                    }
                }
            }
        }
        return userList;
    }

    public static int addAdmin(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.APP_ADD_ADMIN, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        count = rootObject.getInt("count");
                    }
                }
            }
        }
        return count;
    }

    public static int deleteAdmin(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.APP_DELETE_ADMIN, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        count = rootObject.getInt("count");
                    }
                }
            }
        }
        return count;
    }

    public static int isAdmin(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.APP_IS_ADMIN, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        count = rootObject.getInt("count");
                    }
                }
            }
        }
        return count;
    }

    public static int addNotice(String appKey, String appSecret,String uid,String pid) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("app_key", appKey);
        params.put("app_secret", appSecret);
        params.put("u_id", uid);
        params.put("p_id", pid);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.APP_ADD_NOTICE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        count = rootObject.getInt("count");
                    }
                }
            }
        }
        return count;
    }

    public static int readNotice(String appKey, String appSecret,String uid,String pid) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("app_key", appKey);
        params.put("app_secret", appSecret);
        params.put("u_id", uid);
        params.put("p_id", pid);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.APP_READ_NOTICE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        count = rootObject.getInt("count");
                    }
                }
            }
        }
        return count;
    }

}
