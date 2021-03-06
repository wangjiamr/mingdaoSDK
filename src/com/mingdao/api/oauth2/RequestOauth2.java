package com.mingdao.api.oauth2;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.*;
import com.mingdao.api.passport.RequestPassport;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.AppConfigUtil;
import com.mingdao.api.utils.RequestType;
import net.sf.json.JSON;
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
public class RequestOauth2 extends CommonSupport {

    public static List<NetWork> getNetWork(String userName, String password) throws Exception {
        AppConfig appConfig = AppConfigUtil.create();
        Map<String, String> params = new HashMap<String, String>();
        params.put("app_key", appConfig.getAppKey());
        params.put("app_secret", appConfig.getAppSecret());
        params.put("grant_type", "password");
        params.put("p_signature", "");
        params.put("format", "json");
        params.put("username", userName);
        params.put("password", password);
        List<NetWork> netWorkList = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.OAUTH2_ACCESS_TOKEN, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.containsKey("projects")) {
                            JSONArray projectArray = rootObject.getJSONArray("projects");
                            if (projectArray != null && !projectArray.isEmpty()) {
                                netWorkList = new ArrayList<NetWork>();
                                for (int i = 0; i < projectArray.size(); i++) {
                                    JSONObject obj = projectArray.getJSONObject(i);
                                    if (obj != null) {
                                        NetWork netWork = new NetWork();
                                        netWork.setId(obj.getString("id"));
                                        netWork.setName(obj.getString("name"));
                                        netWorkList.add(netWork);
                                    }
                                }
                            }
                        } else if (rootObject.containsKey("access_token")) {
                            String accessToken = rootObject.getString("access_token");
                            if (StringUtils.isNotBlank(accessToken)) {
                                User user = RequestPassport.detail(accessToken);
                                if (user != null) {
                                    NetWork netWork = user.getNetWork();
                                    if (netWork != null) {
                                        netWorkList = new ArrayList<NetWork>();
                                        netWorkList.add(netWork);
                                    }
                                }
                            }
                        }
                    }
                }
            }else{
                throw new Oauth2Execption(responseObject.getErrorCode());
            }
        }
        return netWorkList;
    }

    public static OAuth2Object getAccessToken(String p_signature, String userName, String password) throws Exception {
        AppConfig appConfig = AppConfigUtil.create();
        Map<String, String> params = new HashMap<String, String>();
        params.put("app_key", appConfig.getAppKey());
        params.put("app_secret", appConfig.getAppSecret());
        params.put("grant_type", "password");
        params.put("p_signature", p_signature);
        params.put("format", "json");
        params.put("username", userName);
        params.put("password", password);
        OAuth2Object oAuth2Object = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.OAUTH2_ACCESS_TOKEN, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        oAuth2Object = new OAuth2Object();
                        oAuth2Object.setAccessToken(rootObject.getString("access_token"));
                        oAuth2Object.setExpiresIn(rootObject.getInt("expires_in"));
                        oAuth2Object.setRefreshToken(rootObject.getString("refresh_token"));
                        oAuth2Object.setUserName(userName);
                        oAuth2Object.setPassword(password);
                        oAuth2Object.setP_signature(p_signature);

                    }
                }
            }else{
                throw new Oauth2Execption(responseObject.getErrorCode());
            }
        }
        return oAuth2Object;
    }

    public static OAuth2Object getAccessToken(String code) throws Exception {
        AppConfig appConfig = AppConfigUtil.create();
        Map<String, String> params = new HashMap<String, String>();
        params.put("app_key", appConfig.getAppKey());
        params.put("app_secret", appConfig.getAppSecret());
        params.put("grant_type", "authorization_code");
        params.put("format", "json");
        params.put("code", code);
        params.put("redirect_uri", appConfig.getRedirectUri());
        OAuth2Object oAuth2Object = null;
        ResponseObject responseObject = requestAPI(params, getMingdaoUrl()+URI.OAUTH2_ACCESS_TOKEN, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        oAuth2Object = new OAuth2Object();
                        oAuth2Object.setAccessToken(rootObject.getString("access_token"));
                        oAuth2Object.setExpiresIn(rootObject.getInt("expires_in"));
                        oAuth2Object.setRefreshToken(rootObject.getString("refresh_token"));
                    }
                }
            }
        }
        return oAuth2Object;
    }

    public static OAuth2Object refreshToken(String accessToken) throws Exception {
        AppConfig appConfig = AppConfigUtil.create();
        Map<String, String> params = new HashMap<String, String>();
        params.put("app_key", appConfig.getAppKey());
        params.put("app_secret", appConfig.getAppSecret());
        params.put("grant_type", "refresh_token");
        params.put("format", "json");
        params.put("refresh_token", accessToken);
        params.put("redirect_uri", appConfig.getRedirectUri());
        OAuth2Object oAuth2Object = null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.OAUTH2_ACCESS_TOKEN, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        oAuth2Object = new OAuth2Object();
                        oAuth2Object.setAccessToken(rootObject.getString("access_token"));
                        oAuth2Object.setExpiresIn(rootObject.getInt("expires_in"));
                        oAuth2Object.setRefreshToken(rootObject.getString("refresh_token"));
                    }
                }
            }
        }
        return oAuth2Object;
    }

    public static WxObject getWxToken(String unionId,String openId,
                                          String nickName,String sex,String headImgUrl,boolean reqPassword) throws Exception {
        boolean success=false;
        AppConfig appConfig = AppConfigUtil.create();
        Map<String, String> params = new HashMap<String, String>();
        params.put("app_key", appConfig.getAppKey());
        params.put("app_secret", appConfig.getAppSecret());
        params.put("unionId", unionId);
        params.put("openId", openId);
        params.put("nickName", nickName);
        params.put("sex", sex);
        params.put("headImgUrl", headImgUrl);
        if(reqPassword){
            params.put("req_type", "password");
        }
        WxObject wxObject=null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.OAUTH2_GET_WX_TOKEN, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if(rootObject!=null){
                        wxObject = new WxObject();
                        wxObject.setSuccess(rootObject.getBoolean("success"));
                        if(wxObject.isSuccess()){
                            if(rootObject.containsKey("regUrl")){
                                wxObject.setState(rootObject.getString("state"));
                                wxObject.setRegUrl(rootObject.getString("regUrl"));
                            }else if(rootObject.containsKey("projects")){
                                JSONArray projects=rootObject.getJSONArray("projects");
                                if(projects!=null){
                                    List<NetWork> netWorkList = new ArrayList<NetWork>();
                                    for(Object network:projects){
                                        JSONObject networkObj=(JSONObject)network;
                                        if(networkObj!=null){
                                            NetWork netWork=new NetWork();
                                            netWork.setId(networkObj.getString("projectid"));
                                            netWork.setName(networkObj.getString("company_name"));
                                        }
                                    }
                                    wxObject.setNetWorkList(netWorkList);
                                }
                            }else if(rootObject.containsKey("username")&&rootObject.containsKey("password")){
                                wxObject.setUserName(rootObject.getString("username"));
                                wxObject.setPassword(rootObject.getString("password"));
                            }
                        }

                    }
                }
            }
        }
        return wxObject;
    }

    public static boolean bindWxToken(String username,String password,
                                          String unionId,String state) throws Exception {
        boolean success=false;
        AppConfig appConfig = AppConfigUtil.create();
        Map<String, String> params = new HashMap<String, String>();
        params.put("app_key", appConfig.getAppKey());
        params.put("app_secret", appConfig.getAppSecret());
        params.put("username", username);
        params.put("password", password);
        params.put("unionId", unionId);
        params.put("state", state);
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.OAUTH2_BIND_WX_TOKEN, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if(rootObject!=null){
                        success=rootObject.getBoolean("success");
                    }
                }
            }
        }
        return success;
    }

    public static WxObject getPassword(String username,String password) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("username", username);
        params.put("password", password);
        WxObject wxObject=null;
        ResponseObject responseObject = requestAPI(params,getMingdaoUrl()+ URI.OAUTH2_GET_PASSWORD, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if(rootObject!=null){
                        wxObject = new WxObject();
                        wxObject.setSuccess(rootObject.getBoolean("success"));
                        if(wxObject.isSuccess()){
                            if(rootObject.containsKey("username")&&rootObject.containsKey("password")){
                                wxObject.setUserName(rootObject.getString("username"));
                                wxObject.setPassword(rootObject.getString("password"));
                            }
                        }

                    }
                }
            }
        }
        return wxObject;
    }
}
