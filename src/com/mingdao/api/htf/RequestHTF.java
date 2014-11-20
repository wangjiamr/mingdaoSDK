package com.mingdao.api.htf;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.*;
import com.mingdao.api.htf.core.SignManager;
import com.mingdao.api.htf.entity.*;
import com.mingdao.api.htf.params.*;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.RequestType;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class RequestHTF extends CommonSupport {

    public static HtfMobileCode mobileCode(HtfParamsMobileCode htfParamsMobileCode) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsMobileCode); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfMobileCode htfMobileCode =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_DVCODE_MOBILE, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                 htfMobileCode=(HtfMobileCode) JSONObject.toBean(rootObject, HtfMobileCode.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfMobileCode=new HtfMobileCode();
                htfMobileCode.setRetcode(rootObject.getString("retcode"));
                htfMobileCode.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfMobileCode;
    }

    public static HtfCustomerCode customerCode(HtfParamsCustomerCode htfParamsCustomerCode) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsCustomerCode); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfCustomerCode htfCustomerCode =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_DVCODE_CUSTOMER, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomerCode=(HtfCustomerCode) JSONObject.toBean(rootObject, HtfCustomerCode.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomerCode=new HtfCustomerCode();
                htfCustomerCode.setRetcode(rootObject.getString("retcode"));
                htfCustomerCode.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfCustomerCode;
    }

    public static HtfResult verification(HtfParamsVerification htfParamsVerification) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsVerification); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfResult htfResult =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_DVCODE_VERIFICATION, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfResult=(HtfResult) JSONObject.toBean(rootObject, HtfResult.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfResult=new HtfResult();
                htfResult.setRetcode(rootObject.getString("retcode"));
                htfResult.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfResult;
    }
    public static HtfCustomer customerCreate(HtfParamsCustomer htfParamsCustomer) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsCustomer); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfCustomer htfCustomer =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_CUSTOMER, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomer=(HtfCustomer) JSONObject.toBean(rootObject, HtfCustomer.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomer=new HtfCustomer();
                htfCustomer.setRetcode(rootObject.getString("retcode"));
                htfCustomer.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfCustomer;
    }



    public static HtfCustomerInfo customerInfo(HtfParamsCustomerInfo htfParamsCustomerInfo) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsCustomerInfo); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfCustomerInfo htfCustomerInfo =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_CUSTOMER_INFO, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomerInfo=(HtfCustomerInfo) JSONObject.toBean(rootObject, HtfCustomerInfo.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomerInfo=new HtfCustomerInfo();
                htfCustomerInfo.setRetcode(rootObject.getString("retcode"));
                htfCustomerInfo.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfCustomerInfo;
    }

    public static HtfCustomerStatus customerStatus(HtfParamsCustomerStatus htfParamsCustomerStatus) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsCustomerStatus); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfCustomerStatus htfCustomerStatus =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_CUSTOMER_STATUS, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomerStatus=(HtfCustomerStatus) JSONObject.toBean(rootObject, HtfCustomerStatus.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfCustomerStatus=new HtfCustomerStatus();
                htfCustomerStatus.setRetcode(rootObject.getString("retcode"));
                htfCustomerStatus.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfCustomerStatus;
    }
    public static HtfAsset customerAsset(HtfParamsAsset htfParamsAsset) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsAsset); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfAsset htfAsset =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_ASSET, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfAsset=(HtfAsset) JSONObject.toBean(rootObject, HtfAsset.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfAsset=new HtfAsset();
                htfAsset.setRetcode(rootObject.getString("retcode"));
                htfAsset.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfAsset;
    }

    public static HtfYeild yeild(HtfParamsYeild htfParamsYeild) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsYeild); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfYeild htfYeild =null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_YEILD_QUERY, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfYeild=(HtfYeild) JSONObject.toBean(rootObject, HtfYeild.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfYeild=new HtfYeild();
                htfYeild.setRetcode(rootObject.getString("retcode"));
                htfYeild.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfYeild;
    }



    public static void customerInfo(JSONObject object) throws Exception {
        String param[] = SignManager.getRetParam(object); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);

        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_CUSTOMER_INFO, RequestType.POST);
        String resText = responseObject.getResult();
    }


    public static List<HtfBank> bankList(HtfParamsBank htfParamsBank) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsBank); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        List<HtfBank> htfBankList = null;

        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_BANK, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                if (rootObject.has("item")) {
                    JSONArray items = rootObject.getJSONArray("item");
                    if (items != null && !items.isEmpty()) {
                        htfBankList = new ArrayList<HtfBank>();
                        for (int i = 0; i < items.size(); i++) {
                            JSONObject obj = items.getJSONObject(i);
                            if (obj != null) {
                                HtfBank htfBank = (HtfBank) JSONObject.toBean(obj, HtfBank.class);
                                if (htfBank != null) {
                                    htfBankList.add(htfBank);
                                }
                            }
                        }
                    }
                }
            }
        }
        return htfBankList;
    }

    public static List<HtfProvince> provinceList(HtfParamsProvince htfParamsProvince) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsProvince); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        List<HtfProvince> htfProvinceList = null;

        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_BANK_PROVINCE, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                if (rootObject.has("item")) {
                    JSONArray items = rootObject.getJSONArray("item");
                    if (items != null && !items.isEmpty()) {
                        htfProvinceList = new ArrayList<HtfProvince>();
                        for (int i = 0; i < items.size(); i++) {
                            JSONObject obj = items.getJSONObject(i);
                            if (obj != null) {
                                HtfProvince htfProvince = (HtfProvince) JSONObject.toBean(obj, HtfProvince.class);
                                if (htfProvince != null) {
                                    htfProvinceList.add(htfProvince);
                                }
                            }
                        }
                    }
                }
            }
        }
        return htfProvinceList;
    }

    public static List<HtfCity> cityList(HtfParamsCity htfParamsCity) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsCity); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        List<HtfCity> htfCityList = null;

        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_BANK_PROVINCE, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                if (rootObject.has("item")) {
                    JSONArray items = rootObject.getJSONArray("item");
                    if (items != null && !items.isEmpty()) {
                        htfCityList = new ArrayList<HtfCity>();
                        for (int i = 0; i < items.size(); i++) {
                            JSONObject obj = items.getJSONObject(i);
                            if (obj != null) {
                                HtfCity htfCity = (HtfCity) JSONObject.toBean(obj, HtfCity.class);
                                if (htfCity != null) {
                                    htfCityList.add(htfCity);
                                }
                            }
                        }
                    }
                }
            }
        }
        return htfCityList;
    }

    public static List<HtfBankDetail> bankDetailList(HtfParamsBankDetail htfParamsBankDetail) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsBankDetail); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        List<HtfBankDetail> bankDetailList = null;

        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_BANK_DETAIL, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                System.out.println(responseObject.getResult());
                if (rootObject.has("item")) {
                    JSONArray items = rootObject.getJSONArray("item");
                    if (items != null && !items.isEmpty()) {
                        bankDetailList = new ArrayList<HtfBankDetail>();
                        for (int i = 0; i < items.size(); i++) {
                            JSONObject obj = items.getJSONObject(i);
                            if (obj != null) {
                                HtfBankDetail htfBankDetail = (HtfBankDetail) JSONObject.toBean(obj, HtfBankDetail.class);
                                if (htfBankDetail != null) {
                                    bankDetailList.add(htfBankDetail);
                                }
                            }
                        }
                    }
                }
            }
        }
        return bankDetailList;
    }


    public static HtfUpload upload(HtfParamsUpload htfParamsUpload) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsUpload); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfUpload htfUpload=null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_MEDIA_UPLOAD, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfUpload=(HtfUpload) JSONObject.toBean(rootObject, HtfUpload.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfUpload=new HtfUpload();
                htfUpload.setRetcode(rootObject.getString("retcode"));
                htfUpload.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfUpload;
    }

    public static HtfPurchase purchaseList(HtfParamsPurchase htfParamsPurchase) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsPurchase); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfPurchase htfPurchase= null;

        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_PURCHASE, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfPurchase = (HtfPurchase) JSONObject.toBean(rootObject, HtfPurchase.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfPurchase=new HtfPurchase();
                htfPurchase.setRetcode(rootObject.getString("retcode"));
                htfPurchase.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfPurchase;
    }

    public static HtfToday todayList(HtfParamsToday htfParamsToday) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsToday); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfToday htfToday = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_TODAY, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfToday= (HtfToday) JSONObject.toBean(rootObject, HtfToday.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfToday=new HtfToday();
                htfToday.setRetcode(rootObject.getString("retcode"));
                htfToday.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfToday;
    }

    public static HtfHistory historyList(HtfParamsHistory htfParamsHistory) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsHistory); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfHistory htfHistory = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_HISTORY, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfHistory= (HtfHistory) JSONObject.toBean(rootObject, HtfHistory.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfHistory=new HtfHistory();
                htfHistory.setRetcode(rootObject.getString("retcode"));
                htfHistory.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfHistory;
    }

    public static HtfProfit profitList(HtfParamsProfit htfParamsProfit) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsProfit); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfProfit htfProfit = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_PROFIT, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfProfit= (HtfProfit) JSONObject.toBean(rootObject, HtfProfit.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfProfit=new HtfProfit();
                htfProfit.setRetcode(rootObject.getString("retcode"));
                htfProfit.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfProfit;
    }

    public static HtfWithdrawal withdrawal(HtfParamsWithdrawal htfParamsWithdrawal) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsWithdrawal); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfWithdrawal htfWithdrawal = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_WITHDRAWAL, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfWithdrawal = (HtfWithdrawal) JSONObject.toBean(rootObject, HtfWithdrawal.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfWithdrawal=new HtfWithdrawal();
                htfWithdrawal.setRetcode(rootObject.getString("retcode"));
                htfWithdrawal.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfWithdrawal;
    }

    public static HtfQuickWithdrawal quickWithdrawal(HtfParamsQuickWithdrawal htfParamsQuickWithdrawal) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsQuickWithdrawal); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfQuickWithdrawal htfQuickWithdrawal = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_QUICK_WITHDRAWAL, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfQuickWithdrawal = (HtfQuickWithdrawal) JSONObject.toBean(rootObject, HtfQuickWithdrawal.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfQuickWithdrawal=new HtfQuickWithdrawal();
                htfQuickWithdrawal.setRetcode(rootObject.getString("retcode"));
                htfQuickWithdrawal.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfQuickWithdrawal;
    }



    public static HtfWithdrawalToBalance withdrawalToBalance(HtfParamsWithdrawalToBalance htfParamsWithdrawalToBalance) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsWithdrawalToBalance); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfWithdrawalToBalance htfWithdrawalToBalance = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_WITHDRAWAL_TO_BALANCE, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfWithdrawalToBalance = (HtfWithdrawalToBalance) JSONObject.toBean(rootObject, HtfWithdrawalToBalance.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfWithdrawalToBalance=new HtfWithdrawalToBalance();
                htfWithdrawalToBalance.setRetcode(rootObject.getString("retcode"));
                htfWithdrawalToBalance.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfWithdrawalToBalance;
    }


    public static HtfTradeDetail tradeDetail(HtfParamsTradeDetail htfParamsTradeDetail) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsTradeDetail); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfTradeDetail htfTradeDetail = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_DETAIL, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfTradeDetail = (HtfTradeDetail) JSONObject.toBean(rootObject, HtfTradeDetail.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfTradeDetail=new HtfTradeDetail();
                htfTradeDetail.setRetcode(rootObject.getString("retcode"));
                htfTradeDetail.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfTradeDetail;
    }

    public static HtfTradeDate tradeDate(HtfParamsTradeDate htfParamsTradeDate) throws Exception {
        String param[] = SignManager.getRetParam(htfParamsTradeDate); //加密
        Map<String, String> reqM = new HashMap<String, String>();
        reqM.put("sign", param[0]);
        reqM.put("msg", param[1]);
        HtfTradeDate htfTradeDate = null;
        ResponseObject responseObject = requestAPI(reqM, URI.HTF_HOST + URI.HTF_INST_TRADE_QUERY_TRADE_DATE, RequestType.POST);
        if (!responseObject.isError()) {
            JSONObject rootObject = responseObject.getJsonObject();
            if (rootObject != null) {
                htfTradeDate = (HtfTradeDate) JSONObject.toBean(rootObject, HtfTradeDate.class);
            }
        }else{
            JSONObject rootObject = responseObject.getJsonObject();
            if(rootObject!=null){
                htfTradeDate=new HtfTradeDate();
                htfTradeDate.setRetcode(rootObject.getString("retcode"));
                htfTradeDate.setRetmsg(rootObject.getString("retmsg"));
            }
        }
        return htfTradeDate;
    }





    public static void main(String args[]) throws Exception{

        HtfParamsTradeDetail htfParamsTradeDetail=new HtfParamsTradeDetail("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsTradeDetail.setSerialNo("54605E3C0002E118");
        tradeDetail(htfParamsTradeDetail);
//        HtfParamsCustomerCode htfParamsCustomerCode=new HtfParamsCustomerCode();
//        htfParamsCustomerCode.setCustomerNo("1005701810");
//        customerCode(htfParamsCustomerCode);
//
        HtfParamsCustomerInfo htfParamsCustomerInfo=new HtfParamsCustomerInfo("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsCustomerInfo.setCustNo("1005703841");
        //customerInfo(htfParamsCustomerInfo);

//        File file = new File("/project/123.jpg");
//        FileInputStream inputFile = new FileInputStream(file);
//        byte[] buffer = new byte[(int)file.length()];
//        inputFile.read(buffer);
//        inputFile.close();
//        String fileBase64= new BASE64Encoder().encode(buffer);
//
//        HtfParamsUpload htfParamsUpload=new HtfParamsUpload();
//        htfParamsUpload.setInstIdNo("1005701810");
//        htfParamsUpload.setFile(fileBase64);
//        htfParamsUpload.setType("0");
//        htfParamsUpload.setFilename("123.jpg");
//        HtfUpload htfUpload= upload(htfParamsUpload);
//        System.out.println(htfUpload.getMediaId());
//        HtfParamsDownload htfParamsDownload=new HtfParamsDownload();
//        htfParamsDownload.setTargetPath("2014091016111552022a7938b01430dc");
        //download(htfParamsDownload);


//        HtfParamsCustomerInfo htfParamsCustomerInfo=new HtfParamsCustomerInfo();
//        htfParamsCustomerInfo.setCustNo("1005703072");
//        customerInfo(htfParamsCustomerInfo);
//
        HtfParamsAsset htfParamsAsset=new HtfParamsAsset("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsAsset.setCustNo("1005703375");
       // HtfAsset htfAsset=customerAsset(htfParamsAsset);
       // System.out.println(htfAsset.getCashBalance());
//
        HtfParamsCustomerStatus htfParamsCustomerStatus=new HtfParamsCustomerStatus("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsCustomerStatus.setInstIdNo("10151332");
        htfParamsCustomerStatus.setInstName("明道test1015");
        //customerStatus(htfParamsCustomerStatus);

        HtfParamsPurchase htfParamsPurchase=new HtfParamsPurchase("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsPurchase.setCustNo("1005703072");
        htfParamsPurchase.setTradeTy("939");
        //HtfPurchase htfPurchase=purchaseList(htfParamsPurchase);
        //System.out.println(htfPurchase);
        //System.out.println(htfPurchase.getItem().size());


        HtfParamsHistory htfParamsHistory=new HtfParamsHistory("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsHistory.setCustNo("1005703928");
        htfParamsHistory.setTradeStatus("N");
        htfParamsHistory.setPayStatus("N");
        htfParamsHistory.setStartDate("20141106");
        htfParamsHistory.setEndDate("20141106");
        htfParamsHistory.setPageSize(10);
        htfParamsHistory.setCurrentPageNo(1);
        HtfHistory htfHistory=historyList(htfParamsHistory);
        System.out.println(htfHistory);
        System.out.println(htfHistory.getItem().size());
//
        HtfParamsToday htfParamsToday=new HtfParamsToday("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsToday.setCustNo("1005703375");
        htfParamsToday.setTradeStatus("Y");
        htfParamsToday.setPayStatus("Y");
        htfParamsToday.setPageSize(10);
        htfParamsToday.setCurrentPageNo(1);
       // HtfToday htfToday=todayList(htfParamsToday);
        //System.out.println(htfToday);
        //System.out.println(htfToday.getItem().size());
        //HtfParamsYeild htfParamsYeild=new HtfParamsYeild("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");



        HtfParamsProfit htfParamsProfit=new HtfParamsProfit("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsProfit.setCustNo("1005703072");
        htfParamsProfit.setPageSize(10);
        htfParamsProfit.setCurrentPageNo(1);
        htfParamsProfit.setStartDate("20140920");
        htfParamsProfit.setEndDate("20141020");
//        HtfProfit htfProfit=profitList(htfParamsProfit);
//        System.out.println(htfProfit);
//        System.out.println(htfProfit.getItem().size());
//        List<HtfProfitItem> htfProfitItems=htfProfit.getItemList();
//        if(htfProfitItems!=null&&!htfProfitItems.isEmpty()){
//            for(HtfProfitItem htfProfitItem:htfProfitItems){
//                System.out.println(htfProfitItem.getDate()+":"+htfProfitItem.getProfit());
//            }
//        }

        //HtfParamsYeild htfParamsYeild=new HtfParamsYeild("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        //HtfYeild htfYeild=yeild(htfParamsYeild);


        // yeild(htfParamsYeild);


        HtfParamsMobileCode htfParamsMobileCode=new HtfParamsMobileCode("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsMobileCode.setMobileNo("13488725292");
        HtfMobileCode htfMobileCode=RequestHTF.mobileCode(htfParamsMobileCode);
        if(htfMobileCode!=null){
            HtfParamsWithdrawal htfParamsWithdrawal=new HtfParamsWithdrawal("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
            htfParamsWithdrawal.setCustNo("1005703375");
            htfParamsWithdrawal.setAmount(100.99d);
            htfParamsWithdrawal.setAppId("1000000013");
            htfParamsWithdrawal.setVerifyCodeSeq(htfMobileCode.getVerifyCodeSeq());
            htfParamsWithdrawal.setVerifyCode(htfMobileCode.getMobileDynamicCode());
            //withdrawal(htfParamsWithdrawal);
        }

        htfParamsMobileCode=new HtfParamsMobileCode("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsMobileCode.setMobileNo("13488725292");
        htfMobileCode=RequestHTF.mobileCode(htfParamsMobileCode);
        if(htfMobileCode!=null){
            HtfParamsWithdrawalToBalance htfParamsWithdrawalToBalance=new HtfParamsWithdrawalToBalance("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
            htfParamsWithdrawalToBalance.setCustNo("1005703376");
            htfParamsWithdrawalToBalance.setAmount(99.99d);
            htfParamsWithdrawalToBalance.setInstituteId("1005703375");
            htfParamsWithdrawalToBalance.setVerifyCodeSeq(htfMobileCode.getVerifyCodeSeq());
            htfParamsWithdrawalToBalance.setVerifyCode(htfMobileCode.getMobileDynamicCode());
            htfParamsWithdrawalToBalance.setInstSerialNo(htfParamsWithdrawalToBalance.getTransactionId());
            //withdrawalToBalance(htfParamsWithdrawalToBalance);
        }

         htfParamsMobileCode=new HtfParamsMobileCode("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsMobileCode.setMobileNo("13488725292");
         htfMobileCode=RequestHTF.mobileCode(htfParamsMobileCode);
        if(htfMobileCode!=null){
            HtfParamsQuickWithdrawal HtfParamsQuickWithdrawal=new HtfParamsQuickWithdrawal("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
            HtfParamsQuickWithdrawal.setCustNo("1005703375");
            HtfParamsQuickWithdrawal.setAmount(100.99d);
            HtfParamsQuickWithdrawal.setAppId("1000000013");
            HtfParamsQuickWithdrawal.setVerifyCodeSeq(htfMobileCode.getVerifyCodeSeq());
            HtfParamsQuickWithdrawal.setVerifyCode(htfMobileCode.getMobileDynamicCode());
            //quickWithdrawal(HtfParamsQuickWithdrawal);
        }





        HtfParamsTradeDate htfParamsTradeDate=new HtfParamsTradeDate("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsTradeDate.setApKind("939");
        //HtfTradeDate htfTradeDate= tradeDate(htfParamsTradeDate);
        //System.out.println(htfTradeDate.getTradable());


    }
}
