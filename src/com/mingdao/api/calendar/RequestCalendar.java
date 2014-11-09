package com.mingdao.api.calendar;

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
public class RequestCalendar extends CommonSupport {



    public static String create(String accessToken,String uid, String name,
                              String sTime,String eTime,String address,
                              String c_des,Integer allday) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        if(StringUtils.isNotBlank(uid)){
            params.put("c_chargeid", uid);
        }
        params.put("c_name", name);
        params.put("c_stime", sTime);
        params.put("c_etime", eTime);
        if(StringUtils.isNotBlank(address)){
            params.put("c_address", address);
        }
        if(StringUtils.isNotBlank(c_des)){
            params.put("c_des", c_des);
        }
        if(allday==null){
            allday=0;
        }
        params.put("c_allday", allday+"");
        String calendarID = null;
        ResponseObject responseObject = requestAPI(params, URI.CALENDAR_CREATE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        calendarID = rootObject.getString("calendar");
                    }
                }
            }
        }
        return calendarID;
    }

    public static int exit(String accessToken, String id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("c_id", id);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.CALENDAR_EXIT, RequestType.GET);
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
