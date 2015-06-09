package com.mingdao.api.group;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Group;
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
public class RequestGroup extends CommonSupport {

    public static List<Group> getGroupAll(String accessToken, String keywords) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        if (StringUtils.isNotBlank(keywords)) {
            params.put("keywords", keywords);
        }
        List<Group> groupList = null;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_ALL, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONArray groupArray = rootObject.getJSONArray("groups");
                        if (groupArray != null && !groupArray.isEmpty()) {
                            groupList = new ArrayList<Group>();
                            for (int i = 0; i < groupArray.size(); i++) {
                                JSONObject obj = groupArray.getJSONObject(i);
                                if (obj != null) {
                                    Group group = new Group();
                                    group.setId(obj.getString("id"));
                                    group.setName(obj.getString("name"));
                                    group.setAvstar(obj.getString("avstar"));
                                    group.setPublic(obj.getString("is_public"));
                                    group.setStatus(obj.getString("status"));
                                    group.setFollowedStatus(obj.getString("followed_status"));
                                    group.setUserCount(obj.getLong("user_count"));
                                    group.setPost_count(obj.getLong("post_count"));
                                    JSONArray memberArray = obj.getJSONArray("admins");
                                    if (memberArray != null && !memberArray.isEmpty()) {
                                        List<String> memberList = new ArrayList<String>();
                                        for (int m = 0; m < memberArray.size(); m++) {
                                            String member = memberArray.getString(m);
                                            if (StringUtils.isNotBlank(member)) {
                                                memberList.add(member);
                                            }
                                        }
                                        group.setMemberList(memberList);
                                    }
                                    JSONObject userObject = obj.getJSONObject("user");
                                    if (userObject != null) {
                                        User groupUserAdmin = new User();
                                        groupUserAdmin.setId(userObject.getString("id"));
                                        groupUserAdmin.setName(userObject.getString("name"));
                                        groupUserAdmin.setAvstar(userObject.getString("avstar"));
                                        group.setUser(groupUserAdmin);
                                    }
                                    groupList.add(group);
                                }
                            }
                        }
                    }
                }
            }
        }
        return groupList;
    }


    public static Group getGroupDetail(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("g_id", id);
        Group group = null;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_DETAIL, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONObject obj = rootObject.getJSONObject("group");
                        if (obj != null) {
                            group = new Group();
                            group.setId(obj.getString("id"));
                            group.setName(obj.getString("name"));
                            group.setAvstar(obj.getString("avstar"));
                            group.setPublic(obj.getString("is_public"));
                            group.setStatus(obj.getString("status"));
                            group.setFollowedStatus(obj.getString("followed_status"));
                            group.setUserCount(obj.getLong("user_count"));
                            group.setPost_count(obj.getLong("post_count"));
                            JSONArray memberArray = obj.getJSONArray("admins");
                            if (memberArray != null && !memberArray.isEmpty()) {
                                List<String> memberList = new ArrayList<String>();
                                for (int m = 0; m < memberArray.size(); m++) {
                                    String member = memberArray.getString(m);
                                    if (StringUtils.isNotBlank(member)) {
                                        memberList.add(member);
                                    }
                                }
                                group.setMemberList(memberList);
                            }
                            JSONObject userObject = obj.getJSONObject("user");
                            if (userObject != null) {
                                User groupUserAdmin = new User();
                                groupUserAdmin.setId(userObject.getString("id"));
                                groupUserAdmin.setName(userObject.getString("name"));
                                groupUserAdmin.setAvstar(userObject.getString("avstar"));
                                group.setUser(groupUserAdmin);
                            }
                        }
                    }
                }
            }
        }
        return group;
    }

    public static List<Group> getGroupByMyCreate(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<Group> groupList = null;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_MY_CREATED, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONArray groupArray = rootObject.getJSONArray("groups");
                        if (groupArray != null && !groupArray.isEmpty()) {
                            groupList = new ArrayList<Group>();
                            for (int i = 0; i < groupArray.size(); i++) {
                                JSONObject obj = groupArray.getJSONObject(i);
                                if (obj != null) {
                                    Group group = new Group();
                                    group.setId(obj.getString("id"));
                                    group.setName(obj.getString("name"));
                                    group.setAvstar(obj.getString("avstar"));
                                    group.setPublic(obj.getString("is_public"));
                                    group.setStatus(obj.getString("status"));
                                    group.setFollowedStatus(obj.getString("followed_status"));
                                    group.setUserCount(obj.getLong("user_count"));
                                    group.setPost_count(obj.getLong("post_count"));
                                    JSONArray memberArray = obj.getJSONArray("admins");
                                    if (memberArray != null && !memberArray.isEmpty()) {
                                        List<String> memberList = new ArrayList<String>();
                                        for (int m = 0; m < memberArray.size(); m++) {
                                            String member = memberArray.getString(m);
                                            if (StringUtils.isNotBlank(member)) {
                                                memberList.add(member);
                                            }
                                        }
                                        group.setMemberList(memberList);
                                    }
                                    JSONObject userObject = obj.getJSONObject("user");
                                    if (userObject != null) {
                                        User groupUserAdmin = new User();
                                        groupUserAdmin.setId(userObject.getString("id"));
                                        groupUserAdmin.setName(userObject.getString("name"));
                                        groupUserAdmin.setAvstar(userObject.getString("avstar"));
                                        group.setUser(groupUserAdmin);
                                    }
                                    groupList.add(group);
                                }
                            }
                        }
                    }
                }
            }
        }
        return groupList;
    }

    public static List<Group> getGroupByMyJoined(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<Group> groupList = null;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_MY_JOINED, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONArray groupArray = rootObject.getJSONArray("groups");
                        if (groupArray != null && !groupArray.isEmpty()) {
                            groupList = new ArrayList<Group>();
                            for (int i = 0; i < groupArray.size(); i++) {
                                JSONObject obj = groupArray.getJSONObject(i);
                                if (obj != null) {
                                    Group group = new Group();
                                    group.setId(obj.getString("id"));
                                    group.setName(obj.getString("name"));
                                    group.setAvstar(obj.getString("avstar"));
                                    group.setPublic(obj.getString("is_public"));
                                    group.setStatus(obj.getString("status"));
                                    group.setFollowedStatus(obj.getString("followed_status"));
                                    group.setUserCount(obj.getLong("user_count"));
                                    group.setPost_count(obj.getLong("post_count"));
                                    JSONArray memberArray = obj.getJSONArray("admins");
                                    if (memberArray != null && !memberArray.isEmpty()) {
                                        List<String> memberList = new ArrayList<String>();
                                        for (int m = 0; m < memberArray.size(); m++) {
                                            String member = memberArray.getString(m);
                                            if (StringUtils.isNotBlank(member)) {
                                                memberList.add(member);
                                            }
                                        }
                                        group.setMemberList(memberList);
                                    }
                                    JSONObject userObject = obj.getJSONObject("user");
                                    if (userObject != null) {
                                        User groupUserAdmin = new User();
                                        groupUserAdmin.setId(userObject.getString("id"));
                                        groupUserAdmin.setName(userObject.getString("name"));
                                        groupUserAdmin.setAvstar(userObject.getString("avstar"));
                                        group.setUser(groupUserAdmin);
                                    }
                                    groupList.add(group);
                                }
                            }
                        }
                    }
                }
            }
        }
        return groupList;
    }

    public static List<User> getUserByGroup(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("g_id", id);
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_USER, RequestType.GET);
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


    public static int invite(String accessToken, String id, String email) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("g_id", id);
        params.put("email", email);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_INVITE, RequestType.GET);
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

    public static int close(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("g_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_CLOSE, RequestType.GET);
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

    public static int open(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("g_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_OPEN, RequestType.GET);
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

    public static int exit(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("g_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_EXIT, RequestType.GET);
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
        params.put("g_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_DELETE, RequestType.GET);
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

    public static int join(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("g_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.GROUP_JOIN, RequestType.GET);
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
