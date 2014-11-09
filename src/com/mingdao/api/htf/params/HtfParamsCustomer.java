package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsCustomer extends HtfParams implements Serializable {
    private String instName;

    private String instIdType;

    private String instIdNo;

    private String instIdExpireDate;

    private String instAdd;

    private String instPostCode;

    private String legalName;

    private String legalPhone;

    private String legalIdType;

    private String legalIdNo;

    private String legalIdExpireDate;

    private String adminName;

    private String adminPhone;

    private String adminIdType;

    private String adminIdNo;

    private String adminIdExpireDate;

    private String taxRegisterCode;

    private String orgCode;

    private String recommendorPhone;

    private String bankNo;

    private String bankAccountNo;

    private String bankCategory;

    private String bankAreaProvince;

    private String bankAreaCity;

    private String bankBranchName;

    private String bankInnerNo;

    private String instLicenseCopyMediaId;

    private String instBankCertMediaId;

    private String instAdminCertMediaId;

    private String instLegalCertMediaId;

    private String instTrCodeMediaId;

    private String instOrgCodeMediaId;

    private String recommendorName;

    private String instOutOrgId;

    private String instOutOrgName;

    private String sppartner;

    private String transactionId;

    private String spbillcreateIP;

    private String verifyCodeSeq;

    private String verifyCode;

    private String appId;

    private String service_version;

    private String sign_type;

    private String input_charset;

    public HtfParamsCustomer(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public String getInstIdType() {
        return instIdType;
    }

    public void setInstIdType(String instIdType) {
        this.instIdType = instIdType;
    }

    public String getInstIdNo() {
        return instIdNo;
    }

    public void setInstIdNo(String instIdNo) {
        this.instIdNo = instIdNo;
    }

    public String getInstIdExpireDate() {
        return instIdExpireDate;
    }

    public void setInstIdExpireDate(String instIdExpireDate) {
        this.instIdExpireDate = instIdExpireDate;
    }

    public String getInstAdd() {
        return instAdd;
    }

    public void setInstAdd(String instAdd) {
        this.instAdd = instAdd;
    }

    public String getInstPostCode() {
        return instPostCode;
    }

    public void setInstPostCode(String instPostCode) {
        this.instPostCode = instPostCode;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone;
    }

    public String getLegalIdType() {
        return legalIdType;
    }

    public void setLegalIdType(String legalIdType) {
        this.legalIdType = legalIdType;
    }

    public String getLegalIdNo() {
        return legalIdNo;
    }

    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo;
    }

    public String getLegalIdExpireDate() {
        return legalIdExpireDate;
    }

    public void setLegalIdExpireDate(String legalIdExpireDate) {
        this.legalIdExpireDate = legalIdExpireDate;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminIdType() {
        return adminIdType;
    }

    public void setAdminIdType(String adminIdType) {
        this.adminIdType = adminIdType;
    }

    public String getAdminIdNo() {
        return adminIdNo;
    }

    public void setAdminIdNo(String adminIdNo) {
        this.adminIdNo = adminIdNo;
    }

    public String getAdminIdExpireDate() {
        return adminIdExpireDate;
    }

    public void setAdminIdExpireDate(String adminIdExpireDate) {
        this.adminIdExpireDate = adminIdExpireDate;
    }

    public String getTaxRegisterCode() {
        return taxRegisterCode;
    }

    public void setTaxRegisterCode(String taxRegisterCode) {
        this.taxRegisterCode = taxRegisterCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getRecommendorPhone() {
        return recommendorPhone;
    }

    public void setRecommendorPhone(String recommendorPhone) {
        this.recommendorPhone = recommendorPhone;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankCategory() {
        return bankCategory;
    }

    public void setBankCategory(String bankCategory) {
        this.bankCategory = bankCategory;
    }

    public String getBankAreaProvince() {
        return bankAreaProvince;
    }

    public void setBankAreaProvince(String bankAreaProvince) {
        this.bankAreaProvince = bankAreaProvince;
    }

    public String getBankAreaCity() {
        return bankAreaCity;
    }

    public void setBankAreaCity(String bankAreaCity) {
        this.bankAreaCity = bankAreaCity;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankInnerNo() {
        return bankInnerNo;
    }

    public void setBankInnerNo(String bankInnerNo) {
        this.bankInnerNo = bankInnerNo;
    }

    public String getInstLicenseCopyMediaId() {
        return instLicenseCopyMediaId;
    }

    public void setInstLicenseCopyMediaId(String instLicenseCopyMediaId) {
        this.instLicenseCopyMediaId = instLicenseCopyMediaId;
    }

    public String getInstBankCertMediaId() {
        return instBankCertMediaId;
    }

    public void setInstBankCertMediaId(String instBankCertMediaId) {
        this.instBankCertMediaId = instBankCertMediaId;
    }

    public String getInstAdminCertMediaId() {
        return instAdminCertMediaId;
    }

    public void setInstAdminCertMediaId(String instAdminCertMediaId) {
        this.instAdminCertMediaId = instAdminCertMediaId;
    }

    public String getInstLegalCertMediaId() {
        return instLegalCertMediaId;
    }

    public void setInstLegalCertMediaId(String instLegalCertMediaId) {
        this.instLegalCertMediaId = instLegalCertMediaId;
    }

    public String getInstTrCodeMediaId() {
        return instTrCodeMediaId;
    }

    public void setInstTrCodeMediaId(String instTrCodeMediaId) {
        this.instTrCodeMediaId = instTrCodeMediaId;
    }

    public String getInstOrgCodeMediaId() {
        return instOrgCodeMediaId;
    }

    public void setInstOrgCodeMediaId(String instOrgCodeMediaId) {
        this.instOrgCodeMediaId = instOrgCodeMediaId;
    }

    public String getRecommendorName() {
        return recommendorName;
    }

    public void setRecommendorName(String recommendorName) {
        this.recommendorName = recommendorName;
    }

    public String getInstOutOrgId() {
        return instOutOrgId;
    }

    public void setInstOutOrgId(String instOutOrgId) {
        this.instOutOrgId = instOutOrgId;
    }

    public String getInstOutOrgName() {
        return instOutOrgName;
    }

    public void setInstOutOrgName(String instOutOrgName) {
        this.instOutOrgName = instOutOrgName;
    }

    public String getSppartner() {
        return sppartner;
    }

    public void setSppartner(String sppartner) {
        this.sppartner = sppartner;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSpbillcreateIP() {
        return spbillcreateIP;
    }

    public void setSpbillcreateIP(String spbillcreateIP) {
        this.spbillcreateIP = spbillcreateIP;
    }

    public String getVerifyCodeSeq() {
        return verifyCodeSeq;
    }

    public void setVerifyCodeSeq(String verifyCodeSeq) {
        this.verifyCodeSeq = verifyCodeSeq;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getService_version() {
        return service_version;
    }

    public void setService_version(String service_version) {
        this.service_version = service_version;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }


    public String getInput_charset() {
        return input_charset;
    }

    public void setInput_charset(String input_charset) {
        this.input_charset = input_charset;
    }
}
