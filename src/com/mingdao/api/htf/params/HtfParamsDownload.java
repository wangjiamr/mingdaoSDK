package com.mingdao.api.htf.params;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfParamsDownload extends HtfParams implements Serializable {

    private String targetPath;

    public HtfParamsDownload(String transactionId, String ip) {
        super(transactionId, ip);
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }
}
