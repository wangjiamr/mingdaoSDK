package com.mingdao.api.dept;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.Department;
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
public class RequestDept extends CommonSupport {

    public static List<Department> getDepartment(String accessToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("pageSize", "10000");
        List<Department> departmentList = null;
        ResponseObject responseObject = requestAPI(params, URI.DEPT_ALL, RequestType.GET);
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
                                    department.setName(obj.getString("departmentName"));
                                    department.setId(obj.getLong("departmentID"));
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

    public static int addDepartment(String accessToken, String departmentName) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("departmentName", departmentName);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.DEPT_ADD, RequestType.GET);
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

    public static int editDepartment(String accessToken, Long departmentID,String departmentName) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("access_token", accessToken);
        params.put("departmentID", departmentID+"");
        params.put("departmentName", departmentName);
        int count = -1;
        ResponseObject responseObject = requestAPI(params, URI.DEPT_EDIT, RequestType.GET);
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
