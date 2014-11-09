package com.mingdao.api.entity;

import com.mingdao.api.utils.MingDaoConstantsUtil;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-16
 * Time: 下午4:40
 * To change this template use File | Settings | File Templates.
 */
public class Group implements Serializable {

    private String id;
    
    private String name;
    
    private String avstar;
    
    private String isPublic;

    private String isPublicDesc;
    
    private String status;
    
    private String statusDesc;


    private String followedStatus;

    private String followedStatusDesc;

    private long userCount;
    
    private long post_count;
    
    private User user;
    
    private List<String> memberList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvstar() {
        return avstar;
    }

    public void setAvstar(String avstar) {
        this.avstar = avstar;
    }

    public String getPublic() {
        return isPublic;
    }

    public void setPublic(String aPublic) {
        isPublic = aPublic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPublicDesc() {
        if (StringUtils.isNotBlank(getPublic())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getGroupIsPublic(), this.isPublic);
        }
        return isPublicDesc;
    }

    public void setPublicDesc(String publicDesc) {
        isPublicDesc = publicDesc;
    }

    public String getStatusDesc() {
        if (StringUtils.isNotBlank(getPublic())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getGroupStatus(), this.status);
        }
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getFollowedStatus() {
        return followedStatus;
    }

    public void setFollowedStatus(String followedStatus) {
        this.followedStatus = followedStatus;
    }

    public String getFollowedStatusDesc() {
        if (StringUtils.isNotBlank(getPublic())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getGroupFollowedStatus(), this.followedStatus);
        }
        return followedStatusDesc;
    }

    public void setFollowedStatusDesc(String followedStatusDesc) {
        this.followedStatusDesc = followedStatusDesc;
    }

    public long getUserCount() {
        return userCount;
    }

    public void setUserCount(long userCount) {
        this.userCount = userCount;
    }

    public long getPost_count() {
        return post_count;
    }

    public void setPost_count(long post_count) {
        this.post_count = post_count;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<String> memberList) {
        this.memberList = memberList;
    }
}
