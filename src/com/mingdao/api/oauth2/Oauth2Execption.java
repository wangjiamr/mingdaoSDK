package com.mingdao.api.oauth2;

/**
 * Created by zhenjiaWang on 15/3/19.
 */
public class Oauth2Execption extends RuntimeException {
    public Oauth2Execption() {
    }

    public Oauth2Execption(String message) {
        super(message);
    }
}
