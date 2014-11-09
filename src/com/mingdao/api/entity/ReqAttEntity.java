package com.mingdao.api.entity;


import org.apache.commons.lang.StringUtils;

/**
 * @author zhenjiaWang
 * @version 1.0 2012-05
 * @since JDK1.5
 */
public class ReqAttEntity{

    /**
     *
     */

    private String fileKey;

    private String attKey;

    private String oldName;

    private String newName;

    private String postfix;

    private Long size;

    private Integer year;

    private Integer month;

    private Integer day;

    private String downloadUrl;

    private String created;

    private String userName;

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public String getAttKey() {
        return attKey;
    }

    public void setAttKey(String attKey) {
        this.attKey = attKey;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
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

    public String getAttSize() {
        String attSize="unkown";
        double size= this.getSize();
        int i=1;
        String[] unit= new String[]{"Bytes","KB","MB","GB","TB"};
        while(size>=1024){
            //size= NumberUtils.divide(size,1024,2);
            i++;
            if(i==4)break;
        }
        attSize= size+" "+unit[i-1];
        unit=null;
        return attSize;
    }

    public String getViewPostfix() {
        String fix="doc,docx,ppt,pptx,xls,xlsx,jpg,gif,png,zip,rar,txt,pdf,swf,flv,html,htm";
        String viewPostfix=this.getPostfix();
        if(StringUtils.isNotBlank(viewPostfix)){
            if(fix.indexOf(viewPostfix)==-1){
                viewPostfix=null;
            }
        }
        if(StringUtils.isBlank(viewPostfix)){
            viewPostfix="qita";
        }
        return viewPostfix;
    }
}