package com.mingdao.api.wx;

import com.mingdao.api.common.CommonSupport;
import com.mingdao.api.entity.*;
import com.mingdao.api.resources.URI;
import com.mingdao.api.utils.RequestType;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class RequestWx extends CommonSupport {

    public static String getToken(String corpid, String corpsecret) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("corpid", corpid);
        params.put("corpsecret", corpsecret);
        String token = null;
        ResponseObject responseObject = requestAPI(params, URI.WX_GET_TOKEN, RequestType.GET);
        if (responseObject != null) {
            if (!responseObject.isError()) {
                String result = responseObject.getResult();
                if (StringUtils.isNotBlank(result)) {
                    JSONObject rootObject = JSONObject.fromObject(result);
                    if (rootObject != null) {
                        token = rootObject.getString("access_token");
                    }
                }
            }
        }
        return token;
    }


    public static boolean pushText(String corpid, String corpsecret, PushWxTextMessage pushWxTextMessage) throws Exception {
        String jsonStr = null;
        boolean flag = false;
        if (pushWxTextMessage != null) {
            jsonStr = JSONObject.fromObject(pushWxTextMessage).toString();
            Map<String, String> params = new HashMap<String, String>();
            params.put("content", jsonStr);
            String token = getToken(corpid, corpsecret);
            if (StringUtils.isNotBlank(token)) {
                ResponseObject responseObject = requestAPI(params, URI.WX_PUSH + token, RequestType.POST_JSON);
                if (responseObject != null) {
                    if (!responseObject.isError()) {
                        String result = responseObject.getResult();
                        System.out.println(result);
                        if (StringUtils.isNotBlank(result)) {
                            JSONObject rootObject = JSONObject.fromObject(result);
                            if (rootObject != null) {
                                int errcode = rootObject.getInt("errcode");
                                String errmsg = rootObject.getString("errmsg");
                                if (errcode == 0 && StringUtils.isNotBlank(errmsg)) {
                                    if (errmsg.equals("ok")) {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static boolean pushNews(String corpid, String corpsecret, PushWxNewsMessage pushWxNewsMessage) throws Exception {
        String jsonStr = null;
        boolean flag = false;
        if (pushWxNewsMessage != null) {
            jsonStr = JSONObject.fromObject(pushWxNewsMessage).toString();
            Map<String, String> params = new HashMap<String, String>();
            params.put("content", jsonStr);
            String token = getToken(corpid, corpsecret);
            if (StringUtils.isNotBlank(token)) {
                ResponseObject responseObject = requestAPI(params, URI.WX_PUSH + token, RequestType.POST_JSON);
                if (responseObject != null) {
                    if (!responseObject.isError()) {
                        String result = responseObject.getResult();
                        System.out.println(result);
                        if (StringUtils.isNotBlank(result)) {
                            JSONObject rootObject = JSONObject.fromObject(result);
                            if (rootObject != null) {
                                int errcode = rootObject.getInt("errcode");
                                String errmsg = rootObject.getString("errmsg");
                                if (errcode == 0 && StringUtils.isNotBlank(errmsg)) {
                                    if (errmsg.equals("ok")) {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) throws Exception {
        String userId = "8ae7e67e-63de-469a-8cee-627a519525c0|d5e38abd-7772-4df6-b30a-97872c5d1e6e|31f1baba-dce1-4c5b-8579-115dc0c65b57|eb879138-ee49-4c7d-8c63-da12d91cdcc2|bc66f11a-f222-44d1-89cb-4e3ce11ddf3c";
//        WxNewsArticle wxNewsArticle=new WxNewsArticle();
//        wxNewsArticle.setTitle("提问");
//        wxNewsArticle.setUrl("http://www.baidu.com");
//        wxNewsArticle.setPicurl("http://comment.b0.upaiyun.com/system/attachments/3427507/original/1372084249-580x435.jpg");
//        wxNewsArticle.setDescription("回话，不回我死循环把你们手机弄没电了");
//        PushWxNewsMessage pushWxNewsMessage=new PushWxNewsMessage(wxNewsArticle);
//        pushWxNewsMessage.setTouser(userId);
//        pushWxNewsMessage.setAgentid("4");
//        String jsonStr=JSONObject.fromObject(pushWxNewsMessage).toString();
//        System.out.println(jsonStr);

        List<WxNewsArticle> articleList = new ArrayList<WxNewsArticle>();

        WxNewsArticle wxNewsArticle = new WxNewsArticle();
        wxNewsArticle.setTitle("您的未审批申请 (10)");
        wxNewsArticle.setPicurl("https://img.mingdao.com/Apps/RecommendImages/ffed4012f3b24974a88416b50bbaee67.jpg");
        wxNewsArticle.setUrl("http://www.baidu.com");
        articleList.add(wxNewsArticle);

        WxNewsArticle wxNewsArticle1 = new WxNewsArticle();
        wxNewsArticle1.setTitle("2014/06/30\n张睿 发起的请假申请");
        wxNewsArticle1.setPicurl("https://thumb-254.kuaipandata.com/tn/get_thumbnail/i=U5kftCmMW3M64g5CVLUHcPgjnMe(mlM&w=250&h=250.jpg?e=1404360000&s=62EFxBzd&auto_rotate=1");
        wxNewsArticle1.setUrl("http://laapi.mingdao.com/wf/req/list?laToken=d5e38abd-7772-08589555BHB08A95");
        articleList.add(wxNewsArticle1);

        WxNewsArticle wxNewsArticle2 = new WxNewsArticle();
        wxNewsArticle2.setTitle("2014/07/01\n何一赫 发起的费用报销");
        wxNewsArticle2.setPicurl("https://thumb-254.kuaipandata.com/tn/get_thumbnail/i=U5tOPbDxdP2urkeXxxExkkhP2Am21DI&w=250&h=250.jpg?e=1404360000&s=4flRA4sN&auto_rotate=1");
        wxNewsArticle2.setUrl("http://www.baidu.com");
        articleList.add(wxNewsArticle2);

        WxNewsArticle wxNewsArticle3 = new WxNewsArticle();
        wxNewsArticle3.setTitle("2014/06/28\n赵阳 发起的加班申请");
        wxNewsArticle3.setPicurl("https://thumb-254.kuaipandata.com/tn/get_thumbnail/i=U57BavMYgglBT2SktOsDoHRKfmlpNS0&w=250&h=250.jpg?e=1404360000&s=ctVfXbYT&auto_rotate=1");
        wxNewsArticle3.setUrl("http://www.baidu.com");
        articleList.add(wxNewsArticle3);

        PushWxNewsMessage pushWxNewsMessage = new PushWxNewsMessage(articleList);
        pushWxNewsMessage.setTouser(userId);
        pushWxNewsMessage.setAgentid("4");
        String jsonStr = JSONObject.fromObject(pushWxNewsMessage).toString();
        System.out.println(jsonStr);
        pushNews("wx853769e334ead822", "17ab4955fe78a806a1a778c7adbd93d8", pushWxNewsMessage);


//        StringBuffer buffer = new StringBuffer();
//        buffer.append("您当前有").append("10").append("未处理\n\n");
//        String blank = "\t";
//        for (int x = 1; x <=5; x++) {
//            buffer.append("我发起的");
//            buffer.append("各种申请" + "\n");
//            buffer.append("2014/06/0"+x);
//            buffer.append(blank);
//            buffer.append(" <a href=\"http://www.baidu.com?x=" + x + "\">查看</a>\n");
//            buffer.append("\n");
//
//        }
//        buffer.append("<a href=\"www.baidu.com?more\">这个有点丑，怎么排版都丑</a>");
//        PushWxTextMessage pushWxTextMessage=new PushWxTextMessage(buffer.toString());
//        pushWxTextMessage.setTouser(userId);
//        pushWxTextMessage.setAgentid("4");
//        String jsonStr = JSONObject.fromObject(pushWxTextMessage).toString();
//        System.out.println(jsonStr);
//        pushText("wx853769e334ead822", "17ab4955fe78a806a1a778c7adbd93d8", jsonStr);
    }
}
