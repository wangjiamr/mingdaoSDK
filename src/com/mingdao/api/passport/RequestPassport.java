package com.mingdao.api.passport;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.NetWork;
import com.mingdao.api.entity.ResponseObject;
import com.mingdao.api.entity.User;
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
public class RequestPassport extends CommonSupport {

    public static int logout(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.PASSPORT_LOGOUT, RequestType.POST);
        int count = -1;
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

    public static User detail(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        User user = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.PASSPORT_DETAIL, RequestType.GET);
        int count = -1;
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
                            user.setAccountid(userObject.getString("accountid"));
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
                            user.setJob_number(userObject.getString("job_number"));
                            user.setWork_site(userObject.getString("work_site"));
                            user.setFollowedStatus(userObject.getString("followed_status"));
                            user.setLicense(userObject.getString("license"));
                            user.setStatus(userObject.getInt("status"));
                            JSONObject projectObj= userObject.getJSONObject("project");
                            if(projectObj!=null){
                                NetWork netWork=new NetWork();
                                netWork.setId(projectObj.getString("id"));
                                netWork.setName(projectObj.getString("name"));
                                netWork.setNameEn(projectObj.getString("nameEn"));
                                netWork.setLogo(projectObj.getString("logo"));
                                netWork.setLicense(projectObj.getString("license_type"));
                                user.setNetWork(netWork);
                            }
                        }
                    }
                }
            }
        }
        return user;
    }

    public static String getLocaleAndTheme(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        String locale = null;
        String theme_type=null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.PASSPORT_GET_SETTING, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        JSONObject userObject = rootObject.getJSONObject("user");
                        if (userObject != null) {
                            String langType = userObject.getString("lang_type");
                            if(StringUtils.isNotBlank(langType)){
                                if(langType.equals("0")){
                                    locale = "zh_CN";
                                }else if(langType.equals("1")){
                                    locale = "en_US";
                                }else {
                                    locale = "zh_CN";
                                }
                            }else {
                                locale = "zh_CN";
                            }
                             theme_type = userObject.getString("theme_type");
                            if(StringUtils.isBlank(theme_type)){
                                theme_type="1";
                            }
                        }
                    }
                }
            }
        }
        return locale+","+theme_type;
    }
}
