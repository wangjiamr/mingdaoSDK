package com.mingdao.api.message;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Message;
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
public class RequestMessage extends CommonSupport {

    public static List<Message> getAll(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<Message> messageList = null;
        ResponseObject responseObject = requestAPI(params, URI.MESSAGE_ALL, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONArray messageArray = rootObject.getJSONArray("messages");
                        if (messageArray != null && !messageArray.isEmpty()) {
                            messageList = new ArrayList<Message>();
                            for (int i = 0; i < messageArray.size(); i++) {
                                JSONObject object = messageArray.getJSONObject(i);
                                if (object != null) {
                                    Message message = new Message();
                                    message.setText(object.getString("text"));
                                    message.setCreateTime(object.getString("create_time"));
                                    JSONObject userObject = object.getJSONObject("user");
                                    if (userObject != null) {
                                        User user = new User();
                                        user.setId(userObject.getString("id"));
                                        user.setName(userObject.getString("name"));
                                        user.setAvstar(userObject.getString("avstar"));
                                        user.setDepartment(userObject.getString("department"));
                                        message.setUnReadMessageCount(userObject.getInt("unreadmessage_count"));
                                        message.setMessageCount(userObject.getInt("message_count"));
                                        message.setUser(user);
                                    }
                                    messageList.add(message);
                                }
                            }
                        }
                    }
                }
            }
        }
        return messageList;
    }

    public static List<Message> getList(String accessToken, String id, int pageSize, int pageIndex) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        if (pageSize > -1) {
            params.put("pagesize", pageSize + "");
        }
        if (pageIndex > -1) {
            params.put("pageindex", pageIndex + "");
        }
        List<Message> messageList = null;
        ResponseObject responseObject = requestAPI(params, URI.MESSAGE_LIST, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONArray messageArray = rootObject.getJSONArray("messages");
                        if (messageArray != null && !messageArray.isEmpty()) {
                            messageList = new ArrayList<Message>();
                            for (int i = 0; i < messageArray.size(); i++) {
                                JSONObject object = messageArray.getJSONObject(i);
                                if (object != null) {
                                    Message message = new Message();
                                    message.setText(object.getString("text"));
                                    message.setCreateTime(object.getString("create_time"));
                                    message.setCreateUserId(object.getString("create_user"));
                                    message.setId(object.getString("id"));
                                    message.setStatus(object.getString("status"));
                                    message.setStatus2(object.getString("status2"));
                                    messageList.add(message);
                                }
                            }
                        }
                    }
                }
            }
        }
        return messageList;
    }

    public static int getUnReadCount(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.MESSAGE_UN_READ_COUNT, RequestType.GET);
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

    public static int setRead(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("m_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.MESSAGE_RED, RequestType.GET);
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

    public static int delete(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("m_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.MESSAGE_DELETE, RequestType.GET);
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

    public static String create(String accessToken, String id, String msg) throws Exception {
        return create(accessToken, id, msg, 0);
    }

    public static String create(String accessToken, String id, String msg, int type) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        if (StringUtils.isNotBlank(msg)) {
            params.put("msg", msg);
        }
        if (type != -1) {
            params.put("type", type + "");
        }
        String messageID = null;
        ResponseObject responseObject = requestAPI(params, URI.MESSAGE_CREATE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        messageID = rootObject.getString("message");
                    }
                }
            }
        }
        return messageID;
    }

    public static String createSys(String id, String pid, String msg,
                                   String app_key, String app_secret) throws Exception {
        String messageID = null;
        if (StringUtils.isNotBlank(msg)) {
            Map<String, String> params = new HashMap<String, String>();
            params.put("format", "json");
            params.put("u_id", id);
            params.put("p_id", pid);
            params.put("app_key", app_key);
            params.put("app_secret", app_secret);
            params.put("msg", msg);
            String url=null;
            if(StringUtils.isNotBlank(pid)){
                if(pid.equals("fe288386-3d26-4eab-b5d2-51eeab82a7f9")){
                    url=URI.MESSAGE_CREATE_SYS2;
                }else{
                    url=URI.MESSAGE_CREATE_SYS;
                }
            }
            ResponseObject responseObject = requestAPI(params, url, RequestType.POST);
            if (responseObject != null) {
                if (!responseObject.isError()) {
                    String result = responseObject.getResult();
                    if (StringUtils.isNotBlank(result)) {
                        JSONObject rootObject = JSONObject.fromObject(result);
                        if (rootObject != null) {
                            messageID = rootObject.getString("message");
                        }
                    }
                }
            }
        }
        return messageID;
    }
}
