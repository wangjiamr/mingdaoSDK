package com.mingdao.api.htf.core;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.htf.RequestHTF;
import com.mingdao.api.htf.entity.HtfBank;
import com.mingdao.api.htf.params.HtfParamsBank;
import com.mingdao.api.htf.params.HtfParamsMobileCode;
import net.sf.json.JSONObject;

import java.util.List;

public final class SignManager extends CommonSupport {

	public static String getDecryptData(String sign, String msg) {
		if (sign == null || "".equals(sign)) {
			return "";
		} else {
			String djson = "";

			djson = NeteaseEncrypt.DecryptData(sign, msg);
			
			if (djson == "" || djson == null) {
				return "";
			}
			return djson;
		}
	}
	
	public static <T> T getRelevantBean(String sign, String msg,
			T sampleObject) throws Exception {
		String json = getDecryptData(sign, msg);

		if ("".equals(json)) {
			return null;
		}
		JSONObject jb = JSONObject.fromObject(json);
		return (T) JSONObject.toBean(jb, sampleObject.getClass());
	}

//	public static String[] getRetParam(Object obj) throws Exception {
//		return getRetParam(Constant.PARTNER_NETEASE, obj);
//	}

	public static String[] getRetParam(Object obj)
			throws Exception {
		JSONObject jsonObject = JSONObject.fromObject(obj);
		String content = jsonObject.toString();

		content = NeteaseEncrypt.base64Encoder(content);
		String econ = NeteaseEncrypt.envolopData(content);


		String param[] = new String[2];
		param[0] = econ;
		param[1] = content;
		return param;
	}

    public static void main (String[] args) throws Exception{



        HtfParamsMobileCode htfParamsMobileCode=new HtfParamsMobileCode("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        htfParamsMobileCode.setMobileNo("13488725292");
       // HtfMobileCode htfMobileCode= RequestHTF.mobileCode(htfParamsMobileCode);
        //System.out.println(htfMobileCode.getMobileDynamicCode());


      //  RequestHTF.customerInfo(object);

//        object.put("custNo","13488725292");
//        object.put("sppartner","1000000013");
//        object.put("transactionId","fe288386-3d26-4eab-b5d2-51eeab82a7f9-"+System.currentTimeMillis());
//        object.put("spbillcreateIP","10.10.10.1");
        HtfParamsBank htfParamsBank=new HtfParamsBank("f62246e7-cfe1-4860-9d08-4d11342eea70","10.0.0.1");
        List<HtfBank> bankList= RequestHTF.bankList(htfParamsBank);
        if(bankList!=null&&!bankList.isEmpty()){
            for(HtfBank htfBank:bankList){
                System.out.println(htfBank.getBankName());
            }
        }
//
//        List<HtfProvince> provinceList= RequestHTF.provinceList(object);
//        if(provinceList!=null&&!provinceList.isEmpty()){
//            for(HtfProvince htfProvince:provinceList){
//                System.out.println(htfProvince.getProvince());
//            }
//        }
//
//        object=new JSONObject();
//        object.put("province","北京市");
//         provinceList= RequestHTF.provinceList(object);
//        if(provinceList!=null&&!provinceList.isEmpty()){
//            for(HtfProvince htfProvince:provinceList){
//                System.out.println(htfProvince.getCity());
//            }
//        }
//        object=new JSONObject();
//        object.put("bankName","中国工商银行");
//        object.put("province","北京市");
//        object.put("city","北京市");
//        List<HtfBankDetail> htfBankDetailList=RequestHTF.bankDetailList(object);
//        if(htfBankDetailList!=null&&!htfBankDetailList.isEmpty()){
//            for(HtfBankDetail htfBankDetail:htfBankDetailList){
//                System.out.println(htfBankDetail.getBranchnm());
//            }
//        }


//
//        String param[] = getRetParam(info); //加密
//        Map<String, String> reqM = new HashMap<String, String>();
//        reqM.put("sign", param[0]);
//        reqM.put("msg", param[1]);
//
//        ResponseObject responseObject = requestAPI(reqM, "http://101.231.197.36:7985/hop/mingdao/inst/customerInfo.htm", RequestType.POST);
//        String resText=responseObject.getResult();
//        String sign = resText.substring("sign=".length(), resText.indexOf("&msg="));
//        String msg = resText.substring(resText.indexOf("&msg=") + "&msg=".length());
//        System.out.println("msg=" + msg);
//        System.out.println(NeteaseEncrypt.base64Decoder(msg));


    }


}
