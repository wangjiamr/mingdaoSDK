package com.mingdao.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-7-31
 * Time: 下午7:36
 * To change this template use File | Settings | File Templates.
 */
public class ReqViewEntity implements Serializable {

    private String result;

    private String applyName;

    private String reqNo;


    private Long reqId;

    private Long taskId;

    private Long manageId;

    private String userId;

    private String companyId;

    private String userName;

    private String jobName;

    private String avstar100;



    private List<ReqRowContentEntity> rowContentList;

    private List<ReqCommentsEntity> commentsList;

    private List<ReqAttEntity> reqAttList;

    public List<ReqRowContentEntity> getRowContentList() {
        return rowContentList;
    }

    public void setRowContentList(List<ReqRowContentEntity> rowContentList) {
        this.rowContentList = rowContentList;
    }

    public List<ReqCommentsEntity> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<ReqCommentsEntity> commentsList) {
        this.commentsList = commentsList;
    }

    public List<ReqAttEntity> getReqAttList() {
        return reqAttList;
    }

    public void setReqAttList(List<ReqAttEntity> reqAttList) {
        this.reqAttList = reqAttList;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getAvstar100() {
        return avstar100;
    }

    public void setAvstar100(String avstar100) {
        this.avstar100 = avstar100;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public Long getReqId() {
        return reqId;
    }

    public void setReqId(Long reqId) {
        this.reqId = reqId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getManageId() {
        return manageId;
    }

    public void setManageId(Long manageId) {
        this.manageId = manageId;
    }
}
