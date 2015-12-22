package com.mingdao.api.user;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Department;
import com.mingdao.api.entity.NetWork;
import com.mingdao.api.entity.ResponseObject;
import com.mingdao.api.entity.User;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.RequestType;
import com.mingdao.api.utils.SignatureUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class RequestUser extends CommonSupport {
    public static List<User> getUserAllForInstall(String timeStamp, String nonce, String appkey, String appSecret,String companyId) throws Exception {
        List<User> userList = null;
        String signature=null;
        if(StringUtils.isNotBlank(timeStamp)&&StringUtils.isNotBlank(nonce)&&StringUtils.isNotBlank(appkey)&&StringUtils.isNotBlank(appSecret)){
            if(StringUtils.isNotBlank(companyId)){
                signature= SignatureUtil.getSignature(timeStamp,nonce,"",appkey,appSecret);
                if(StringUtils.isNotBlank(signature)){
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("format", "json");
                    params.put("signature", signature);
                    params.put("timestamp", timeStamp);
                    params.put("nonce", nonce);
                    params.put("app_key", appkey);
                    params.put("pid", companyId);
                    ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_ALL_FOR_INSTALL, RequestType.POST);
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
                                                user.setWork_site(obj.getString("work_site"));
                                                user.setJob_number(obj.getString("job_number"));
                                                user.setName(obj.getString("name"));
                                                user.setStatus(obj.getInt("status"));
                                                userList.add(user);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return userList;
    }
    public static List<User> getUserAll(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_ALL, RequestType.GET);
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
                                    user.setWork_site(obj.getString("work_site"));
                                    user.setJob_number(obj.getString("job_number"));
                                    user.setName(obj.getString("name"));
                                    user.setStatus(obj.getInt("status"));
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

    public static List<User> getUserMetoned(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_GET_USER_METIONED, RequestType.GET);
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
                                    user.setWork_site(obj.getString("work_site"));
                                    user.setJob_number(obj.getString("job_number"));
                                    user.setName(obj.getString("name"));
                                    user.setStatus(obj.getInt("status"));
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

    public static List<User> getUserSearch(String accessToken, String keywords, String g_id, String dep) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        if (StringUtils.isNotBlank(keywords)) {
            params.put("keywords", keywords.trim());
        }
        if (StringUtils.isNotBlank(g_id)) {
            params.put("g_id", g_id);
        }
        if (StringUtils.isNotBlank(dep)) {
            params.put("dep", dep);
        }
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_SEARCH, RequestType.GET);
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
                                    user.setWork_site(obj.getString("work_site"));
                                    user.setJob_number(obj.getString("job_number"));
                                    user.setName(obj.getString("name"));
                                    user.setStatus(obj.getInt("status"));
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


    public static List<User> getUserList(String accessToken, String ids) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        if (StringUtils.isNotBlank(ids)) {
            params.put("u_ids", ids);
        }
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_LIST, RequestType.GET);
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
                                    user.setWork_site(obj.getString("work_site"));
                                    user.setJob_number(obj.getString("job_number"));
                                    user.setName(obj.getString("name"));
                                    user.setStatus(obj.getInt("status"));
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

    public static Map<String, User> getMapUserList(String accessToken, Set<String> userIdSet) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        StringBuilder sb = new StringBuilder();
        Map<String, User> userMapList = null;
        if (userIdSet != null && !userIdSet.isEmpty()) {
            for (String uid : userIdSet) {
                sb.append(uid + ",");
            }
            params.put("u_ids", sb.toString());
            ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_LIST, RequestType.POST);
            if (responseObject != null) {
                if (!responseObject.isError()) {
                    String result = responseObject.getResult();
                    if (StringUtils.isNotBlank(result)) {
                        JSONObject rootObject = JSONObject.fromObject(result);
                        if (rootObject != null) {
                            JSONArray userArray = rootObject.getJSONArray("users");
                            if (userArray != null && !userArray.isEmpty()) {
                                userMapList = new HashMap<String, User>();
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
                                        user.setWork_site(obj.getString("work_site"));
                                        user.setJob_number(obj.getString("job_number"));
                                        user.setStatus(obj.getInt("status"));
                                        userMapList.put(user.getId(), user);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return userMapList;
    }

    public static User getUserDetail(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        User user = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_DETAIL, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {

                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONObject userObject = rootObject.getJSONObject("user");
                        if (userObject != null) {
                            user = new User();
                            user.setId(userObject.getString("id"));
                            user.setName(userObject.getString("name"));
                            user.setAvstar(userObject.getString("avstar"));
                            user.setAvstar100(userObject.getString("avstar100"));
                            user.setEmail(userObject.getString("email"));
                            user.setGrade(userObject.getString("grade"));
                            user.setMark(userObject.getString("mark"));
                            user.setBirth(userObject.getString("birth"));
                            user.setGender(userObject.getString("gender"));
                            user.setCompany(userObject.getString("company"));
                            user.setDepartment(userObject.getString("department"));
                            user.setJob(userObject.getString("job"));
                            user.setMobilePhone(userObject.getString("mobile_phone"));
                            user.setWork_phone(userObject.getString("work_phone"));
                            user.setWork_site(userObject.getString("work_site"));
                            user.setJob_number(userObject.getString("job_number"));
                            user.setFollowedStatus(userObject.getString("followed_status"));
                            user.setLicense(userObject.getString("license"));
                            user.setStatus(userObject.getInt("status"));
                            user.setUnitName(userObject.getString("unit_name"));
                            JSONObject project=userObject.getJSONObject("project");
                            if(project!=null){
                                NetWork netWork=new NetWork();
                                netWork.setId(project.getString("id"));
                                netWork.setName(project.getString("name"));
                                user.setNetWork(netWork);
                            }
                        }

                    }
                }
            }
        }
        return user;
    }


    public static List<User> getUserFollowed(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_FOLLOWED, RequestType.GET);
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


    public static List<Department> getUserDepartment(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<Department> departmentList = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_DEPARTMENT, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONArray deptArray = rootObject.getJSONArray("departments");
                        if (deptArray != null && !deptArray.isEmpty()) {
                            departmentList = new ArrayList<Department>();
                            for (int i = 0; i < deptArray.size(); i++) {
                                JSONObject obj = deptArray.getJSONObject(i);
                                if (obj != null) {
                                    Department department = new Department();
                                    department.setName(obj.getString("name"));
                                    departmentList.add(department);
                                }
                            }
                        }
                    }

                }
            }
        }
        return departmentList;
    }

    public static int addFollowed(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_ADD_FOLLOWED, RequestType.GET);
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

    public static int deleteFollowed(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_DELETE_FOLLOWED, RequestType.GET);
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

    public static int invite(String accessToken, int type, String email, String fullName, String msg) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("type", type + "");
        params.put("email", email);
        params.put("fullname", fullName);
        params.put("msg", msg);
        int count = -1;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_INVITE, RequestType.GET);
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


    public static List<User> getUserFrequent(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_FREQUENT, RequestType.GET);
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


    public static int addFrequent(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_ADD_FREQUENT, RequestType.GET);
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

    public static int deleteFrequent(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_DELETE_FREQUENT, RequestType.GET);
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

    public static User getManagerUser(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        User managerUser = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_GET_MANAGER_USER, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONObject obj = rootObject.getJSONObject("user");
                        if (obj != null) {
                            try {
                                String userId = obj.getString("id");
                                if (StringUtils.isNotBlank(userId)) {
                                    managerUser = new User();
                                    managerUser.setAvstar(obj.getString("avstar"));
                                    managerUser.setAvstar100(obj.getString("avstar100"));
                                    managerUser.setDepartment(obj.getString("department"));
                                    managerUser.setEmail(obj.getString("email"));
                                    managerUser.setId(obj.getString("id"));
                                    managerUser.setJob(obj.getString("job"));
                                    managerUser.setMobilePhone(obj.getString("mobilephone"));
                                    managerUser.setWork_phone(obj.getString("work_phone"));
                                    managerUser.setWork_site(obj.getString("work_site"));
                                    managerUser.setJob_number(obj.getString("job_number"));
                                    managerUser.setName(obj.getString("name"));
                                }
                            } catch (Exception e) {
                                managerUser = new User();
                                managerUser.setErrorCode("00000");
                            }

                        }
                    }
                }
            } else {
                managerUser = new User();
                managerUser.setErrorCode(responseObject.getErrorCode());
            }
        }
        return managerUser;
    }

    public static List<User> getManagerUserTree(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("u_id", id);
        List<User> userList = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.USER_GET_MANAGER_USER_TREE, RequestType.GET);
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
                                    user.setWork_phone(obj.getString("work_phone"));
                                    user.setWork_site(obj.getString("work_site"));
                                    user.setJob_number(obj.getString("job_number"));
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


    public static int edit(String timeStamp, String nonce, String appkey, String appSecret,String companyId,User user) throws Exception {
        String signature=null;
        int status = -1;
        if(StringUtils.isNotBlank(timeStamp)&&StringUtils.isNotBlank(nonce)&&StringUtils.isNotBlank(appkey)&&StringUtils.isNotBlank(appSecret)) {
            if (StringUtils.isNotBlank(companyId)&&user!=null) {
                signature = SignatureUtil.getSignature(timeStamp, nonce, "", appkey, appSecret);
                if (StringUtils.isNotBlank(signature)) {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("format", "json");
                    params.put("signature", signature);
                    params.put("timestamp", timeStamp);
                    params.put("nonce", nonce);
                    params.put("app_key", appkey);
                    params.put("pID", companyId);
                    params.put("uID", user.getId());
                    if(StringUtils.isNotBlank(user.getName())){
                        params.put("name", user.getName());
                    }
                    if(StringUtils.isNotBlank(user.getDepartment())){
                        params.put("dep", user.getDepartment());
                    }
                    if(StringUtils.isNotBlank(user.getJob())){
                        params.put("job", user.getJob());
                    }else{
                        params.put("job", "");
                    }
                    if(StringUtils.isNotBlank(user.getName())){
                        params.put("name", user.getName());
                    }
                    if(StringUtils.isNotBlank(user.getMobilePhone())){
                        params.put("mobile_phone", user.getMobilePhone());
                    }
                    if(StringUtils.isNotBlank(user.getWork_phone())){
                        params.put("work_phone", user.getWork_phone());
                    }
                    if(StringUtils.isNotBlank(user.getBirth())){
                        params.put("birth", user.getBirth());
                    }
                    if(StringUtils.isNotBlank(user.getGender())){
                        params.put("gender", user.getGender());
                    }
                    ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.USER_EDIT, RequestType.POST);
                    if (responseObject != null) {
                        if (!responseObject.isError()) {
                            String result = responseObject.getResult();
                            if (StringUtils.isNotBlank(result)) {
                                JSONObject rootObject = JSONObject.fromObject(result);
                                if (rootObject != null) {
                                    status = rootObject.getInt("status");
                                }
                            }
                        }
                    }

                }
            }
        }
        return status;
    }
}
