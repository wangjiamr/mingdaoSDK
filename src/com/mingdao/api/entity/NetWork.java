package com.mingdao.api.entity;

import com.mingdao.api.utils.MingDaoConstantsUtil;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:53
 * To change this template use File | Settings | File Templates.
 */
public class NetWork implements Serializable{
    private String id;

    private String name;

    private String logo;
    
    private String nameEn;

    private List<String> authenticationDomainList;

    private String baseAuthenticationDomain;

    private String license;

    private String licenseDesc;

    
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getBaseAuthenticationDomain() {
        return baseAuthenticationDomain;
    }

    public void setBaseAuthenticationDomain(String baseAuthenticationDomain) {
        this.baseAuthenticationDomain = baseAuthenticationDomain;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


    public String getLicenseDesc() {
        if (StringUtils.isNotBlank(getLicense())) {
            return MingDaoConstantsUtil.getInstance().getName(MingDaoConstantsUtil.getInstance().getNetworkLicense(), this.licenseDesc);
        }
        return licenseDesc;
    }

    public void setLicenseDesc(String licenseDesc) {
        this.licenseDesc = licenseDesc;
    }

    public List<String> getAuthenticationDomainList() {
        return authenticationDomainList;
    }

    public void setAuthenticationDomainList(List<String> authenticationDomainList) {
        this.authenticationDomainList = authenticationDomainList;
    }
}
