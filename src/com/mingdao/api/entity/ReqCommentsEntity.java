package com.mingdao.api.entity;



/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-8-15
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public class ReqCommentsEntity {

    private String userId;

    private Integer action;

    private Integer approve;

    private String content;

    private String created;

    private String userName;

    private String actionDesc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getApprove() {
        return approve;
    }

    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getActionDesc() {
        if (getAction() == null) {
            return "&nbsp;";
        }
        String actionDesc = null;
        if (getAction().intValue() == 0) {
            actionDesc = "发起申请";
        } else if (getAction().intValue() == 1) {
            actionDesc = "启动流程";
        } else if (getAction().intValue() == 2) {
            actionDesc = "接收申请";
        } else if (getAction().intValue() == 3) {
            actionDesc = "查看申请";
        } else if (getAction().intValue() == 4) {
            actionDesc = "批准申请";
        } else if (getAction().intValue() == 5) {
            actionDesc = "否决申请";
        } else if (getAction().intValue() == 6) {
            actionDesc = "确认申请";
        } else if (getAction().intValue() == 7) {
            actionDesc = "流程结束";
        } else if (getAction().intValue() == 8) {
            actionDesc = "委托待审";
        } else if (getAction().intValue() == 9) {
            actionDesc = "回退流程";
        } else if (getAction().intValue() == 10) {
            actionDesc = "经办人接收";
        } else if (getAction().intValue() == 11) {
            actionDesc = "经办人查看";
        } else if (getAction().intValue() == 12) {
            actionDesc = "经办人处理";
        }
        return actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }
}
