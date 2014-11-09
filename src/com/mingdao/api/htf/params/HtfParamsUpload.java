package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsUpload extends HtfParams implements Serializable {

    private String type;

    private String instIdNo;

    private String filename;

    private String file;

    public HtfParamsUpload(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstIdNo() {
        return instIdNo;
    }

    public void setInstIdNo(String instIdNo) {
        this.instIdNo = instIdNo;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }


}
