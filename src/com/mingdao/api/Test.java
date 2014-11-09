package com.mingdao.api;

import com.mingdao.api.entity.*;
import com.mingdao.api.message.RequestMessage;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-11-26
 * Time: 下午4:39
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] as) throws Exception {
        System.out.println(new Random().nextInt(4));//指定种子数100);
        String msgContent = "{\"applyName\":\"控件显示测试\",\"avstar100\":\"https://img.mingdao.com/UserAvatar/100X100/default.gif\",\"commentsList\":[{\"action\":0,\"actionDesc\":\"发起申请\",\"approve\":0,\"content\":\"\",\"created\":\"2014-07-03 12:27:46\",\"userId\":\"31f1baba-dce1-4c5b-8579-115dc0c65b57\",\"userName\":\"王佳\"},{\"action\":1,\"actionDesc\":\"启动流程\",\"approve\":0,\"content\":\"\",\"created\":\"2014-07-03 12:27:46\",\"userId\":\"31f1baba-dce1-4c5b-8579-115dc0c65b57\",\"userName\":\"王佳\"},{\"action\":2,\"actionDesc\":\"接收申请\",\"approve\":0,\"content\":\"\",\"created\":\"2014-07-03 12:27:46\",\"userId\":\"d5e38abd-7772-4df6-b30a-97872c5d1e6e\",\"userName\":\"王振佳\"}],\"companyId\":\"f62246e7-cfe1-4860-9d08-4d11342eea70\",\"jobName\":\"开发\",\"manageId\":0,\"reqAttList\":[],\"reqId\":14669,\"reqNo\":\"CP-2014-0001\",\"result\":\"0\",\"rowContentList\":[{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"文本输入\",\"type\":\"varchar\",\"value\":\"text\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"数字输入\",\"type\":\"number\",\"value\":\"11222\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"日期选择\",\"type\":\"date\",\"value\":\"2014-08-01\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"性别\",\"type\":\"select\",\"value\":\"male\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"复选框\",\"type\":\"checkbox\",\"value\":\"2\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"单选框\",\"type\":\"radio\",\"value\":\"男\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"文本域\",\"type\":\"text\",\"value\":\"111111111\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"金额输入\",\"type\":\"amount\",\"value\":\"11111111\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"选择时间\",\"type\":\"time\",\"value\":\"00:00\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"选择部门\",\"type\":\"selectDept\",\"value\":\"开发部\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"搜索员工\",\"type\":\"searchUser\",\"value\":\"&nbsp;\"},{\"colList\":null,\"details\":[],\"eval\":{\"dataList\":[{\"detailList\":[{\"detail\":\"llll\",\"seq\":\"A\"}],\"evalKey\":\"业务能力\",\"evalScore\":10,\"evalValue\":\"A\"},{\"detailList\":[{\"detail\":\"11\",\"seq\":\"A\"}],\"evalKey\":\"自身水平\",\"evalScore\":10,\"evalValue\":\"A\"},{\"detailList\":[{\"detail\":\"11\",\"seq\":\"A\"}],\"evalKey\":\"综合评定\",\"evalScore\":2,\"evalValue\":\"A\"}],\"detailLabel\":\"指标描述\",\"keyLabel\":\"评分指标\",\"label\":\"评分指标\",\"valueLabel\":\"得分\"},\"label\":\"评分指标\",\"type\":\"eval\",\"value\":\"102303965BC9FF09ECA3247X54K95K32TX10230\"},{\"colList\":{\"label\":\"四列明细表\",\"names\":[\"列1\",\"列2\",\"列3\",\"列4\"],\"values\":[[\"1\",\"1\",\"1\",\"1\"],[\"&nbsp;\",\"&nbsp;\",\"&nbsp;\",\"&nbsp;\"],[\"&nbsp;\",\"&nbsp;\",\"&nbsp;\",\"&nbsp;\"]]},\"details\":[],\"eval\":null,\"label\":\"四列明细表\",\"type\":\"list4\",\"value\":\"102303965BC9FF09ECA3510R04J91J3596R10230\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"省份与城市\",\"type\":\"provinceCity\",\"value\":\"河北省&nbsp;&nbsp;承德市\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"省份\",\"type\":\"province\",\"value\":\"32\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"日期区间\",\"type\":\"dateInterval\",\"value\":\"2014-07-01&nbsp;至&nbsp;2014-07-03\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"大写金额\",\"type\":\"words\",\"value\":\"壹仟壹佰壹拾壹万壹仟壹佰壹拾壹圆整\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"申请人\",\"type\":\"userName\",\"value\":\"王佳\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"所属部门\",\"type\":\"department\",\"value\":\"开发部\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"职位\",\"type\":\"job\",\"value\":\"开发\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"工作地点\",\"type\":\"workSite\",\"value\":\"北京\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"公司\",\"type\":\"companyName\",\"value\":\"Mingdao Plus\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"工作电话\",\"type\":\"workPhone\",\"value\":\"66666666\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"移动电话\",\"type\":\"mobilePhone\",\"value\":\"18600061224\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"工号\",\"type\":\"jobNumber\",\"value\":\"111\"},{\"colList\":null,\"details\":[],\"eval\":null,\"label\":\"申请日期\",\"type\":\"requisitionDate\",\"value\":\"2014-07-03 12:27:29\"}],\"taskId\":0,\"userId\":\"31f1baba-dce1-4c5b-8579-115dc0c65b57\",\"userName\":\"王佳\"}";
        JSONObject rootObject = JSONObject.fromObject(msgContent);
        ReqViewEntity reqViewEntity=null;
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
