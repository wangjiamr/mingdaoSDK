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
public class User implements Serializable {
    private String avstar;

    private String avstar100;

    private String department;

    private String email;

    private String id;

    private String job;

    private String mobilePhone;

    private String name;

    private String grade;

    private String mark;

    private String birth;

    private String gender;

    private String genderDesc;

    private String company;

    private String work_phone;
    
    private String work_site;
    
    private String job_number;

    private String followedStatus;

    private String followedStatusDesc;

    private String license;

    private String licenseDesc;

    private Integer status;

    private String statusDesc;
    
    private String errorCode;

    private List<Job> jobList;

    private List<Education> educationList;

    private NetWork netWork;

    public String getAvstar() {
        return avstar;
    }

    public void setAvstar(String avstar) {
        this.avstar = avstar;
    }

    public String getAvstar100() {
        return avstar100;
    }

    public void setAvstar100(String avstar100) {
        this.avstar100 = avstar100;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGenderDesc() {
        if (StringUtils.isNotBlank(getGender())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getUserGender(), this.gender);
        }
        return genderDesc;
    }

    public void setGenderDesc(String genderDesc) {
        this.genderDesc = genderDesc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWork_phone() {
        return work_phone;
    }

    public void setWork_phone(String work_phone) {
        this.work_phone = work_phone;
    }

    public String getFollowedStatus() {
        return followedStatus;
    }

    public void setFollowedStatus(String followedStatus) {
        this.followedStatus = followedStatus;
    }

    public String getFollowedStatusDesc() {
        if (StringUtils.isNotBlank(getFollowedStatus())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getUserFollowedStatus(), this.followedStatusDesc);
        }
        return followedStatusDesc;
    }

    public void setFollowedStatusDesc(String followedStatusDesc) {
        this.followedStatusDesc = followedStatusDesc;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseDesc() {
        if (StringUtils.isNotBlank(getLicense())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getUserLicense(), this.licenseDesc);
        }
        return licenseDesc;
    }

    public void setLicenseDesc(String licenseDesc) {
        this.licenseDesc = licenseDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        if (StringUtils.isNotBlank(getGender())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getUserStatus(), this.statusDesc);
        }
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public String getWork_site() {
        return work_site;
    }

    public void setWork_site(String work_site) {
        this.work_site = work_site;
    }

    public String getJob_number() {
        return job_number;
    }

    public void setJob_number(String job_number) {
        this.job_number = job_number;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public NetWork getNetWork() {
        return netWork;
    }

    public void setNetWork(NetWork netWork) {
        this.netWork = netWork;
    }
}
