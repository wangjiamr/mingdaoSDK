package com.mingdao.api.la;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.*;
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
public class RequestLA extends CommonSupport {


    public static LAToken getToken(String signature, String userId, String timeStamp, String nonce, String content, String appkey, String appSecret) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("signature", signature);
        params.put("userId", userId);
        params.put("timeStamp", timeStamp);
        params.put("nonce", nonce);
        params.put("content", content);
        params.put("appkey", appkey);
        params.put("appSecret", appSecret);
        LAToken laTokenObj = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_REQ_TOKEN, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            laTokenObj = new LAToken();
                            laTokenObj.setLaToken(rootObject.getString("laToken"));
                            laTokenObj.setAccessToken(rootObject.getString("accessToken"));
                            laTokenObj.setUserId(rootObject.getString("userId"));
                            laTokenObj.setCompanyId(rootObject.getString("companyId"));
                            laTokenObj.setTimeStamp(rootObject.getLong("timeStamp"));
                        }
                    }
                }
            }
        }
        return laTokenObj;
    }


    public static boolean validateToken(String laToken) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        boolean validate = false;
        ResponseObject responseObject = requestAPI(params, URI.LA_REQ_VALIDATE_TOKEN, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        String r = rootObject.getString("result");
                        if (StringUtils.isNotBlank(r) && r.equals("0")) {
                            validate = true;
                        }
                    }
                }
            }
        }
        return validate;
    }

    public static Page<Req> reqIngList(String laToken, int rows) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("rows", rows + "");
        Page<Req> reqPage = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_REQ_ING_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONObject pageObj = rootObject.getJSONObject("page");
                            if (pageObj != null) {
                                reqPage = new Page<Req>();
                                reqPage.setCurrentPage(pageObj.getInt("currentPage"));
                                reqPage.setHasNextPage(pageObj.getBoolean("hasNextPage"));
                                reqPage.setNextIndex(pageObj.getInt("nextIndex"));
                                reqPage.setTotalRecord(pageObj.getInt("totalRecord"));
                                JSONArray reqJsonArray = rootObject.getJSONArray("reqList");
                                if (reqJsonArray != null && !reqJsonArray.isEmpty()) {
                                    List<Req> reqList = new ArrayList<Req>();
                                    for (int i = 0; i < reqJsonArray.size(); i++) {
                                        JSONObject obj = reqJsonArray.getJSONObject(i);
                                        if (obj != null) {
                                            Req req = new Req();
                                            req.setReqNo(obj.getString("reqNo"));
                                            req.setApplyName(obj.getString("applyName"));
                                            req.setTip(obj.getInt("tip"));
                                            req.setResult(obj.getInt("result"));
                                            req.setUserName(obj.getString("userName"));
                                            req.setId(obj.getLong("id"));
                                            req.setSendDate(obj.getString("sendDate"));
                                            reqList.add(req);
                                        }
                                    }
                                    reqPage.setResultList(reqList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return reqPage;
    }

    public static Page<Req> reqHistoryList(String laToken, int rows) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("rows", rows + "");
        Page<Req> reqPage = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_REQ_HISTORY_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONObject pageObj = rootObject.getJSONObject("page");
                            if (pageObj != null) {
                                reqPage = new Page<Req>();
                                reqPage.setCurrentPage(pageObj.getInt("currentPage"));
                                reqPage.setHasNextPage(pageObj.getBoolean("hasNextPage"));
                                reqPage.setNextIndex(pageObj.getInt("nextIndex"));
                                reqPage.setTotalRecord(pageObj.getInt("totalRecord"));
                                JSONArray reqJsonArray = rootObject.getJSONArray("reqList");
                                if (reqJsonArray != null && !reqJsonArray.isEmpty()) {
                                    List<Req> reqList = new ArrayList<Req>();
                                    for (int i = 0; i < reqJsonArray.size(); i++) {
                                        JSONObject obj = reqJsonArray.getJSONObject(i);
                                        if (obj != null) {
                                            Req req = new Req();
                                            req.setReqNo(obj.getString("reqNo"));
                                            req.setApplyName(obj.getString("applyName"));
                                            req.setTip(obj.getInt("tip"));
                                            req.setResult(obj.getInt("result"));
                                            req.setUserName(obj.getString("userName"));
                                            req.setId(obj.getLong("id"));
                                            req.setSendDate(obj.getString("sendDate"));
                                            reqList.add(req);
                                        }
                                    }
                                    reqPage.setResultList(reqList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return reqPage;
    }

    public static Page<Req> reqConfirmList(String laToken, int rows) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("rows", rows + "");
        Page<Req> reqPage = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_REQ_CONFIRM_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONObject pageObj = rootObject.getJSONObject("page");
                            if (pageObj != null) {
                                reqPage = new Page<Req>();
                                reqPage.setCurrentPage(pageObj.getInt("currentPage"));
                                reqPage.setHasNextPage(pageObj.getBoolean("hasNextPage"));
                                reqPage.setNextIndex(pageObj.getInt("nextIndex"));
                                reqPage.setTotalRecord(pageObj.getInt("totalRecord"));
                                JSONArray reqJsonArray = rootObject.getJSONArray("reqList");
                                if (reqJsonArray != null && !reqJsonArray.isEmpty()) {
                                    List<Req> reqList = new ArrayList<Req>();
                                    for (int i = 0; i < reqJsonArray.size(); i++) {
                                        JSONObject obj = reqJsonArray.getJSONObject(i);
                                        if (obj != null) {
                                            Req req = new Req();
                                            req.setReqNo(obj.getString("reqNo"));
                                            req.setApplyName(obj.getString("applyName"));
                                            req.setTip(obj.getInt("tip"));
                                            req.setResult(obj.getInt("result"));
                                            req.setUserName(obj.getString("userName"));
                                            req.setId(obj.getLong("id"));
                                            req.setSendDate(obj.getString("sendDate"));
                                            reqList.add(req);
                                        }
                                    }
                                    reqPage.setResultList(reqList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return reqPage;
    }

    public static Page<Req> taskIngList(String laToken, int rows) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("rows", rows + "");
        Page<Req> reqPage = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_TASK_ING_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONObject pageObj = rootObject.getJSONObject("page");
                            if (pageObj != null) {
                                reqPage = new Page<Req>();
                                reqPage.setCurrentPage(pageObj.getInt("currentPage"));
                                reqPage.setHasNextPage(pageObj.getBoolean("hasNextPage"));
                                reqPage.setNextIndex(pageObj.getInt("nextIndex"));
                                reqPage.setTotalRecord(pageObj.getInt("totalRecord"));
                                JSONArray reqJsonArray = rootObject.getJSONArray("reqList");
                                if (reqJsonArray != null && !reqJsonArray.isEmpty()) {
                                    List<Req> reqList = new ArrayList<Req>();
                                    for (int i = 0; i < reqJsonArray.size(); i++) {
                                        JSONObject obj = reqJsonArray.getJSONObject(i);
                                        if (obj != null) {
                                            Req req = new Req();
                                            req.setReqNo(obj.getString("reqNo"));
                                            req.setApplyName(obj.getString("applyName"));
                                            req.setTip(obj.getInt("tip"));
                                            req.setResult(obj.getInt("result"));
                                            req.setUserName(obj.getString("userName"));
                                            req.setTaskId(obj.getLong("id"));
                                            req.setId(obj.getLong("reqId"));
                                            req.setReceiveDate(obj.getString("receiveDate"));
                                            reqList.add(req);
                                        }
                                    }
                                    reqPage.setResultList(reqList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return reqPage;
    }

    public static Page<Req> taskHistoryList(String laToken, int rows) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("rows", rows + "");
        Page<Req> reqPage = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_TASK_HISTORY_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONObject pageObj = rootObject.getJSONObject("page");
                            if (pageObj != null) {
                                reqPage = new Page<Req>();
                                reqPage.setCurrentPage(pageObj.getInt("currentPage"));
                                reqPage.setHasNextPage(pageObj.getBoolean("hasNextPage"));
                                reqPage.setNextIndex(pageObj.getInt("nextIndex"));
                                reqPage.setTotalRecord(pageObj.getInt("totalRecord"));
                                JSONArray reqJsonArray = rootObject.getJSONArray("reqList");
                                if (reqJsonArray != null && !reqJsonArray.isEmpty()) {
                                    List<Req> reqList = new ArrayList<Req>();
                                    for (int i = 0; i < reqJsonArray.size(); i++) {
                                        JSONObject obj = reqJsonArray.getJSONObject(i);
                                        if (obj != null) {
                                            Req req = new Req();
                                            req.setReqNo(obj.getString("reqNo"));
                                            req.setApplyName(obj.getString("applyName"));
                                            req.setTip(obj.getInt("tip"));
                                            req.setResult(obj.getInt("result"));
                                            req.setUserName(obj.getString("userName"));
                                            req.setTaskId(obj.getLong("id"));
                                            req.setId(obj.getLong("reqId"));
                                            req.setReceiveDate(obj.getString("receiveDate"));
                                            reqList.add(req);
                                        }
                                    }
                                    reqPage.setResultList(reqList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return reqPage;
    }


    public static Page<Req> manageIngList(String laToken, int rows) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("rows", rows + "");
        Page<Req> reqPage = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_MANAGE_ING_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONObject pageObj = rootObject.getJSONObject("page");
                            if (pageObj != null) {
                                reqPage = new Page<Req>();
                                reqPage.setCurrentPage(pageObj.getInt("currentPage"));
                                reqPage.setHasNextPage(pageObj.getBoolean("hasNextPage"));
                                reqPage.setNextIndex(pageObj.getInt("nextIndex"));
                                reqPage.setTotalRecord(pageObj.getInt("totalRecord"));
                                JSONArray reqJsonArray = rootObject.getJSONArray("reqList");
                                if (reqJsonArray != null && !reqJsonArray.isEmpty()) {
                                    List<Req> reqList = new ArrayList<Req>();
                                    for (int i = 0; i < reqJsonArray.size(); i++) {
                                        JSONObject obj = reqJsonArray.getJSONObject(i);
                                        if (obj != null) {
                                            Req req = new Req();
                                            req.setReqNo(obj.getString("reqNo"));
                                            req.setApplyName(obj.getString("applyName"));
                                            req.setTip(obj.getInt("tip"));
                                            req.setResult(obj.getInt("result"));
                                            req.setUserName(obj.getString("userName"));
                                            req.setManageId(obj.getLong("id"));
                                            req.setId(obj.getLong("reqId"));
                                            req.setReceiveDate(obj.getString("receiveDate"));
                                            reqList.add(req);
                                        }
                                    }
                                    reqPage.setResultList(reqList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return reqPage;
    }

    public static Page<Req> manageHistoryList(String laToken, int rows) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("rows", rows + "");
        Page<Req> reqPage = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_MANAGE_HISTORY_LIST, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            JSONObject pageObj = rootObject.getJSONObject("page");
                            if (pageObj != null) {
                                reqPage = new Page<Req>();
                                reqPage.setCurrentPage(pageObj.getInt("currentPage"));
                                reqPage.setHasNextPage(pageObj.getBoolean("hasNextPage"));
                                reqPage.setNextIndex(pageObj.getInt("nextIndex"));
                                reqPage.setTotalRecord(pageObj.getInt("totalRecord"));
                                JSONArray reqJsonArray = rootObject.getJSONArray("reqList");
                                if (reqJsonArray != null && !reqJsonArray.isEmpty()) {
                                    List<Req> reqList = new ArrayList<Req>();
                                    for (int i = 0; i < reqJsonArray.size(); i++) {
                                        JSONObject obj = reqJsonArray.getJSONObject(i);
                                        if (obj != null) {
                                            Req req = new Req();
                                            req.setReqNo(obj.getString("reqNo"));
                                            req.setApplyName(obj.getString("applyName"));
                                            req.setTip(obj.getInt("tip"));
                                            req.setResult(obj.getInt("result"));
                                            req.setUserName(obj.getString("userName"));
                                            req.setManageId(obj.getLong("id"));
                                            req.setId(obj.getLong("reqId"));
                                            req.setReceiveDate(obj.getString("receiveDate"));
                                            reqList.add(req);
                                        }
                                    }
                                    reqPage.setResultList(reqList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return reqPage;
    }

    public static ReqViewEntity view(String laToken, Long id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("id", id + "");
        ReqViewEntity reqViewEntity = null;
        ResponseObject responseObject = requestAPI(params, URI.LA_REQ_VIEW, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        if (rootObject.getString("result").equals("0")) {
                            reqViewEntity = new ReqViewEntity();
                            reqViewEntity.setApplyName(rootObject.getString("applyName"));
                            reqViewEntity.setReqId(rootObject.getLong("reqId"));
                            reqViewEntity.setAvstar100(rootObject.getString("avstar100"));
                            reqViewEntity.setUserId(rootObject.getString("userId"));
                            reqViewEntity.setUserName(rootObject.getString("userName"));
                            reqViewEntity.setJobName(rootObject.getString("jobName"));
                            reqViewEntity.setReqNo(rootObject.getString("reqNo"));
                            reqViewEntity.setCompanyId(rootObject.getString("companyId"));
                            JSONArray commentsArray = rootObject.getJSONArray("commentsList");
                            List<ReqCommentsEntity> commentsEntityList = null;
                            if (commentsArray != null && !commentsArray.isEmpty()) {
                                commentsEntityList = new ArrayList<ReqCommentsEntity>();
                                for (int i = 0; i < commentsArray.size(); i++) {
                                    JSONObject obj = commentsArray.getJSONObject(i);
                                    ReqCommentsEntity commentsEntity = (ReqCommentsEntity) JSONObject.toBean(obj, ReqCommentsEntity.class);
                                    commentsEntityList.add(commentsEntity);
                                }
                                reqViewEntity.setCommentsList(commentsEntityList);
                            }
                            JSONArray attArray = rootObject.getJSONArray("reqAttList");
                            List<ReqAttEntity> attEntityList = null;
                            if (attArray != null && !attArray.isEmpty()) {
                                attEntityList = new ArrayList<ReqAttEntity>();
                                for (int i = 0; i < attArray.size(); i++) {
                                    JSONObject obj = attArray.getJSONObject(i);
                                    ReqAttEntity attEntity = (ReqAttEntity) JSONObject.toBean(obj, ReqAttEntity.class);
                                    attEntityList.add(attEntity);
                                }
                                reqViewEntity.setReqAttList(attEntityList);
                            }

                            JSONArray contentArray = rootObject.getJSONArray("rowContentList");
                            List<ReqRowContentEntity> rowContentEntityList = null;
                            if (contentArray != null && !contentArray.isEmpty()) {
                                rowContentEntityList = new ArrayList<ReqRowContentEntity>();
                                for (int i = 0; i < contentArray.size(); i++) {
                                    JSONObject obj = contentArray.getJSONObject(i);
                                    if(obj!=null){
                                        ReqRowContentEntity reqRowContentEntity=new ReqRowContentEntity();
                                        reqRowContentEntity.setLabel(obj.getString("label"));
                                        reqRowContentEntity.setType(obj.getString("type"));
                                        reqRowContentEntity.setValue(obj.getString("value"));
                                        JSONObject colListObj= obj.getJSONObject("colList");
                                        if(colListObj!=null&&colListObj.size()>0){
                                            ReqColListEntity reqColListEntity=(ReqColListEntity)JSONObject.toBean(colListObj, ReqColListEntity.class);
                                            reqRowContentEntity.setColList(reqColListEntity);
                                        }

                                        JSONObject evalObj= obj.getJSONObject("eval");
                                        if(evalObj!=null&&evalObj.size()>0){
                                            ReqEvalContentEntity reqEvalContentEntity=new ReqEvalContentEntity();
                                            reqEvalContentEntity.setLabel(evalObj.getString("label"));
                                            reqEvalContentEntity.setValueLabel(evalObj.getString("valueLabel"));
                                            reqEvalContentEntity.setKeyLabel(evalObj.getString("keyLabel"));
                                            reqEvalContentEntity.setDetailLabel("detailLabel");
                                            JSONArray dataArray = evalObj.getJSONArray("dataList");
                                            if (dataArray != null && !dataArray.isEmpty()) {
                                                List<ReqEvalDataEntity> evalDataEntityList=new ArrayList<ReqEvalDataEntity>();
                                                for (int j = 0; j < dataArray.size(); j++) {
                                                    JSONObject evalData = dataArray.getJSONObject(j);
                                                    if(evalData!=null&&evalData.size()>0){
                                                        ReqEvalDataEntity reqEvalDataEntity=new ReqEvalDataEntity();
                                                        reqEvalDataEntity.setEvalKey(evalData.getString("evalKey"));
                                                        reqEvalDataEntity.setEvalScore(evalData.getInt("evalScore"));
                                                        reqEvalDataEntity.setEvalValue(evalData.getString("evalValue"));
                                                        JSONArray detailArray = evalData.getJSONArray("detailList");
                                                        if (detailArray != null && !detailArray.isEmpty()) {
                                                            List<ReqEvalDetailEntity> evalDetailEntityList=new ArrayList<ReqEvalDetailEntity>();
                                                            for (int x = 0; x < detailArray.size(); x++) {
                                                                JSONObject evalDetail = detailArray.getJSONObject(x);
                                                                if(evalDetail!=null&&evalDetail.size()>0){
                                                                    ReqEvalDetailEntity reqEvalDetailEntity=(ReqEvalDetailEntity)JSONObject.toBean(evalDetail, ReqEvalDetailEntity.class);
                                                                    if(reqEvalDetailEntity!=null){
                                                                        evalDetailEntityList.add(reqEvalDetailEntity);
                                                                    }
                                                                }
                                                            }
                                                            reqEvalDataEntity.setDetailList(evalDetailEntityList);
                                                        }
                                                        evalDataEntityList.add(reqEvalDataEntity);
                                                    }
                                                }
                                                reqEvalContentEntity.setDataList(evalDataEntityList);
                                            }
                                            reqRowContentEntity.setEval(reqEvalContentEntity);
                                        }
                                        JSONArray detailsArray= obj.getJSONArray("details");
                                        List<ReqDetailEntity> details=null;
                                        if(detailsArray!=null&&!detailsArray.isEmpty()){
                                            details=new ArrayList<ReqDetailEntity>();
                                            for (int y = 0; y < detailsArray.size(); y++) {
                                                JSONObject detailObj = detailsArray.getJSONObject(y);
                                                if(detailObj!=null){
                                                    ReqDetailEntity reqDetailEntity=new ReqDetailEntity();
                                                    reqDetailEntity.setSeq(detailObj.getInt("seq"));
                                                    JSONArray detailListArray= detailObj.getJSONArray("detailList");
                                                    if(detailListArray!=null&&!detailListArray.isEmpty()){
                                                        List<ReqDetailListEntity> detailList=new ArrayList<ReqDetailListEntity>();
                                                        for (int z = 0; z < detailListArray.size(); z++) {
                                                            JSONObject detailListObj = detailListArray.getJSONObject(z);
                                                            if(detailListObj!=null){
                                                                ReqDetailListEntity reqDetailListEntity=new ReqDetailListEntity();
                                                                reqDetailListEntity.setValue(detailListObj.getString("value"));
                                                                reqDetailListEntity.setLabel(detailListObj.getString("label"));
                                                                detailList.add(reqDetailListEntity);
                                                            }
                                                        }
                                                        reqDetailEntity.setDetailList(detailList);
                                                    }
                                                    details.add(reqDetailEntity);
                                                }
                                            }
                                            reqRowContentEntity.setDetails(details);
                                        }
                                        rowContentEntityList.add(reqRowContentEntity);
                                    }
                                }
                                reqViewEntity.setRowContentList(rowContentEntityList);
                            }
                        }
                    }
                }
            }
        }
        return reqViewEntity;
    }

    public static boolean taskView(String laToken,Long id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("id", id+"");
        boolean view = false;
        ResponseObject responseObject = requestAPI(params, URI.LA_TASK_VIEW, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        String r = rootObject.getString("result");
                        if (StringUtils.isNotBlank(r) && r.equals("0")) {
                            view = true;
                        }
                    }
                }
            }
        }
        return view;
    }

    public static boolean taskApprove(String laToken,Long id,Integer approveIdea,String reason) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("id", id+"");
        params.put("approveIdea", approveIdea+"");
        params.put("reason", reason);
        boolean approve = false;
        ResponseObject responseObject = requestAPI(params, URI.LA_TASK_APPROVE, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        String r = rootObject.getString("result");
                        if (StringUtils.isNotBlank(r) && r.equals("0")) {
                            approve = true;
                        }
                    }
                }
            }
        }
        return approve;
    }

    public static boolean manageWorking(String laToken,Long id,String reason) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("id", id+"");
        params.put("reason", reason);
        boolean working = false;
        ResponseObject responseObject = requestAPI(params, URI.LA_MANAGE_WORKING, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        String r = rootObject.getString("result");
                        if (StringUtils.isNotBlank(r) && r.equals("0")) {
                            working = true;
                        }
                    }
                }
            }
        }
        return working;
    }


    public static boolean manageView(String laToken,Long id) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("laToken", laToken);
        params.put("id", id+"");
        boolean view = false;
        ResponseObject responseObject = requestAPI(params, URI.LA_MANAGE_VIEW, RequestType.POST);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        String r = rootObject.getString("result");
                        if (StringUtils.isNotBlank(r) && r.equals("0")) {
                            view = true;
                        }
                    }
                }
            }
        }
        return view;
    }
}
