package com.mingdao.api.utils;

import com.mingdao.api.user.RequestUser;

/**
 * Created with IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-11-14
 * Time: 下午4:58
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        jiami 6b9babe92cc95941c7fac5154f7dc348b27ea381
//        app 43BFFB491351619090BAE825291F1CDC
//        timestamp 1384419666896
//        nonce approvalByZhenJia
//        createBilling 6b9babe92cc95941c7fac5154f7dc348b27ea381
        String a="{\"app\":\"289F758D5422B63944A331A5025CC5\",\"aid\":\"15\",\"title\":\"test1384421634442\",\"p_id\":\"f62246e7-cfe1-4860-9d08-4d11342eea70\",\"amount\":550,\"c_date\":\"2013-11-14 17:33\",\"p_date\":\"2013-11-14\"}";
        String b=SignatureUtil.getSignature("1384421634442","approvalByZhenJia",a,"289F758D5422B63944A331A5025CC5","65A48A87C1D9F2B8860A036DCD71B14");
        System.out.println(b);
        RequestUser.getUserSearch("f23855adfc604365b2463f4b5aab0ea3","王",null,null);
       // Billing billing= RequestBilling.create(b, "1384421634442", "approvalByZhenJia", a);
       // System.out.println(billing);
    }
}
