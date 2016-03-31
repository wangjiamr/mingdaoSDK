package com.mingdao.api.resources;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:37
 * To change this template use File | Settings | File Templates.
 */
public class URI {

    /**
     * ********************Oauth2********************
     */



    public static final String OAUTH2_AUTHORIZE = "/oauth2/authorize";

    public static final String OAUTH2_ACCESS_TOKEN = "/oauth2/access_token";

    public static final String OAUTH2_EMAIL = "/oauth2/verify_email";

    public static final String OAUTH2_GET_WX_TOKEN = "/auth2/get_wx_token.aspx";

    public static final String OAUTH2_BIND_WX_TOKEN = "/auth2/bind_wx_token.aspx";

    public static final String OAUTH2_GET_PASSWORD = "/auth2/get_password.aspx";





    /**
     * ********************USER********************
     */
    public static final String USER_ALL_FOR_INSTALL = "/mdprivate/user/getall.aspx";

    public static final String USER_EDIT = "/mdprivate/user/edit.aspx";



    public static final String USER_ALL = "/user/all";

    public static final String USER_SEARCH = "/user/search";

    public static final String USER_LIST = "/user/list";

    public static final String USER_DETAIL = "/user/detail";

    public static final String USER_FOLLOWED = "/user/followed";

    public static final String USER_DEPARTMENT = "/user/department";

    public static final String USER_ADD_FOLLOWED = "/user/add_followed";

    public static final String USER_DELETE_FOLLOWED = "/user/delete_followed";

    public static final String USER_INVITE = "/user/invite";

    public static final String USER_FREQUENT = "/user/frequent";

    public static final String USER_ADD_FREQUENT = "/user/add_frequent";

    public static final String USER_DELETE_FREQUENT = "/user/delete_frequent";

    public static final String USER_GET_MANAGER_USER = "/user/get_managerUser";

    public static final String USER_GET_MANAGER_USER_TREE = "/user/get_managerUserTree";

    public static final String USER_GET_USER_METIONED = "/user/get_userMetioned";

    public static final String USER_GET_SUBORDINATE_USERS = "/user/get_subordinateUsers";






    /**
     * ********************MESSAGE********************
     */
    public static final String MESSAGE_ALL = "/message/all";

    public static final String MESSAGE_LIST = "/message/list";

    public static final String MESSAGE_UN_READ_COUNT = "/message/unreadcount";

    public static final String MESSAGE_CREATE = "/message/create";

    public static final String MESSAGE_CREATE_SYS = "/message/create_sys";

    public static final String MESSAGE_CREATE_SYS2 = "https://api2.mingdao.com/message/create_sys";

    public static final String MESSAGE_DELETE = "/message/delete";

    public static final String MESSAGE_RED = "/message/read";

    /**
     * ********************CALENDAR********************
     */

    public static final String CALENDAR_CREATE = "/calendar/create";

    public static final String CALENDAR_EXIT = "/calendar/exit";


    /**
     * ********************PASSPORT********************
     */
    public static final String PASSPORT_DETAIL = "/passport/detail";

    public static final String PASSPORT_UN_READ_COUNT = "/passport/unreadcount";

    public static final String PASSPORT_EDIT = "/passport/edit";

    public static final String PASSPORT_EDIT_AVSTAR = "/passport/edit_avstar";

    public static final String PASSPORT_LOGOUT = "/passport/logout";

    public static final String PASSPORT_GET_SETTING = "/passport/get_setting";


    /**
     * ********************COMPANY********************
     */
    public static final String COMPANY_DETAIL = "/company/detail";

    public static final String COMPANY_GET_ADMIN = "/company/get_admin";

    public static final String COMPANY_ADD_ADMIN = "/company/add_admin";

    public static final String COMPANY_DELETE_ADMIN = "/company/delete_admin";

    public static final String COMPANY_IS_ADMIN = "/company/is_admin";

    public static final String COMPANY_PAIDUSERSCOUNT = "/company/get_paiduserscount";

    /**
     * ********************CRM********************
     */
    public static final String CRM_OWNER = "http://devcrm.mingdao.com/api/user/getprojectowner";

    /**
     * ********************GROUP********************
     */
    public static final String GROUP_ALL = "/group/all";

    public static final String GROUP_DETAIL = "/group/detail";

    public static final String GROUP_MY_CREATED = "/group/my_created";

    public static final String GROUP_MY_JOINED = "/group/my_joined";

    public static final String GROUP_USER = "/group/user";

    public static final String GROUP_CREATE = "/group/create";

    public static final String GROUP_EXIT = "/group/exit";

    public static final String GROUP_JOIN = "/group/join";

    public static final String GROUP_CLOSE = "/group/close";

    public static final String GROUP_OPEN = "/group/open";

    public static final String GROUP_DELETE = "/group/delete";

    public static final String GROUP_INVITE = "/group/invite";

    /**
     * ********************DEPT********************
     */



    public static final String DEPT_ALL = "/mdprivate/group/getDepartments";

    public static final String DEPT_ALL_FOR_INSTALL = "/mdprivate/group/getALLDep.aspx";

    public static final String DEPT_ADD = "/mdprivate/group/addDepartment";

    public static final String DEPT_EDIT="/mdprivate/group/editDepartment";

    public static final String DEPT_DEL="/mdprivate/group/delDepartments";




    /**
     * ********************TASK********************
     */
    public static final String TASK_MY_JOINED = "/task/my_joined";

    public static final String TASK_MY_JOINED_FINISHED = "/task/my_joined_finished";

    public static final String TASK_MY_ASSIGN = "/task/my_assign";

    public static final String TASK_MY_ASSIGN_FINISHED = "/task/my_assign_finished";

    public static final String TASK_MY_CHARGE = "/task/my_charge";

    public static final String TASK_MY_CHARGE_FINISHED = "/task/my_charge_finished";

    public static final String TASK_PROJECT = "/task/project";

    public static final String TASK_UN_READ_COUNT = "/task/unreadcount";

    public static final String TASK_DETAIL = "/task/detail";

    public static final String TASK_REPLY = "/task/reply";

    public static final String TASK_CREATE = "/task/create";

    public static final String TASK_ADD_PROJECT = "/task/add_project";

    public static final String TASK_EDIT_TITLE = "/task/edit_title";

    public static final String TASK_EDIT_DES = "/task/edit_des";

    public static final String TASK_EDIT_CHARGE = "/task/edit_charge";

    public static final String TASK_EDIT_EXPIRE_DATE = "/task/edit_expiredate";

    public static final String TASK_EDIT_PROJECT = "/task/edit_project";

    public static final String TASK_ADD_MEMBER = "/task/add_member";

    public static final String TASK_DELETE_MEMBER = "/task/delete_member";

    public static final String TASK_FINISH = "/task/finish";

    public static final String TASK_ADD_REPLY = "/task/addreply";

    public static final String TASK_DELETE = "/task/delete";


    /**
     * ********************VOTE********************
     */
    public static final String VOTE_MY_JOINED = "/vote/my_joined";

    public static final String VOTE_MY_CREATE = "/vote/my_create";

    public static final String VOTE_ALL = "/vote/all";

    public static final String VOTE_DETAIL = "/vote/detail";

    public static final String VOTE_CAST_OPTIONS = "/vote/cast_options";

    /**
     * ********************POST********************
     */
    public static final String POST_FOLLOWED = "/post/followed";

    public static final String POST_ALL = "/post/all";

    public static final String POST_MY = "/post/my";

    public static final String POST_AT_ME = "/post/atme";

    public static final String POST_REPLY_ME = "/post/replyme";

    public static final String POST_FAVORITE = "/post/favorite";

    public static final String POST_GROUP = "/post/group";

    public static final String POST_USER = "/post/user";

    public static final String POST_DOC = "/post/doc";

    public static final String POST_IMG = "/post/img";

    public static final String POST_FAQ = "/post/faq";

    public static final String POST_UN_READ_COUNT = "/post/unreadcount";

    public static final String POST_UN_READ_AT_ME_COUNT = "/post/unreadatmecount";

    public static final String POST_UN_READ_REPLY_ME_COUNT = "/post/unreadreplymecount";

    public static final String POST_DETAIL = "/post/detail";

    public static final String POST_REPLY = "/post/reply";

    public static final String POST_UPDATE = "/post/update";

    public static final String POST_UPLOAD = "/post/upload";

    public static final String POST_DELETE = "/post/delete";

    public static final String POST_RE_POST = "/post/repost";

    public static final String POST_ADD_REPLY = "/post/add_reply";

    public static final String POST_DELETE_REPLY = "/post/delete_reply";

    public static final String POST_ADD_FAVORITE = "/post/add_favorite";

    public static final String POST_DELETE_FAVORITE = "/post/delete_favorite";

    public static final String POST_ADD_LIKE = "/post/add_like";

    public static final String POST_DELETE_LIKE = "/post/delete_like";

    public static final String POST_LIST_TAG = "/post/list_tag";

    public static final String POST_TAG = "/post/tag";

    public static final String POST_ADD_TAG = "/post/add_tag";

    public static final String POST_DELETE_TAG = "/post/delete_tag";

    /**
     * ********************APP********************
     */
    public static final String APP_VERSION = "/app/version";

    public static final String APP_GET_ADMIN = "/app/get_admin";

    public static final String APP_ADD_ADMIN = "/app/add_admin";

    public static final String APP_DELETE_ADMIN = "/app/delete_admin";

    public static final String APP_IS_ADMIN = "/app/is_admin";

    public static final String APP_ADD_NOTICE = "/app/addAppNotice";

    public static final String APP_READ_NOTICE = "/app/readAppNotice";


    /**
     * ********************BILLING********************
     */
    public static final String BILLING_CREATE = "/billing/create";

    public static final String BILLING_CREATE_AUTO = "/billing/create_auto";

    public static final String BILLING_DETAIL = "/billing/detail";

    public static final String BILLING_CLOSE = "/billing/close";


    /**
     * *******************OA********************
     */
    public static final String OA_APPLY_LIST = "/common/hrService/applyList";

    public static final String OA_APPLY = "/common/hrService/apply";

    public static final String OA_APPLY_WIDGET_DATE = "/common/hrService/applyWidgetDate";

    public static final String OA_APPLY_WIDGET_VALUE = "/common/hrService/applyWidgetValue";

    public static final String OA_APPLY_WIDGET_GROUP = "/common/hrService/applyWidgetGroup";

    public static final String OA_APPLY_WIDGET_GROUP_SOURCE = "/common/hrService/applyWidgetGroupSource";

    public static final String OA_APPLY_DATA = "/common/hrService/applyData";

    /**
     * *******************OA_SEARCH********************
     */
    public static final String OA_SEARCH = "/search/full";

    /**
     * ********************REQ********************
     */
    public static final String LA_REQ_ING_LIST = "http://laapi.mingdao.com/wf/req/ingList";

    public static final String LA_REQ_HISTORY_LIST = "http://laapi.mingdao.com/wf/req/historyList";

    public static final String LA_REQ_CONFIRM_LIST = "http://laapi.mingdao.com/wf/req/confirmList";

    public static final String LA_TASK_ING_LIST = "http://laapi.mingdao.com/wf/reqTask/ingList";

    public static final String LA_TASK_HISTORY_LIST = "http://laapi.mingdao.com/wf/reqTask/historyList";

    public static final String LA_MANAGE_ING_LIST = "http://laapi.mingdao.com/wf/reqManage/ingList";

    public static final String LA_MANAGE_HISTORY_LIST = "http://laapi.mingdao.com/wf/reqManage/historyList";

    public static final String LA_REQ_TOKEN = "http://laapi.mingdao.com/common/authorize/token";

    public static final String LA_REQ_VALIDATE_TOKEN = "http://laapi.mingdao.com/common/authorize/validateToken";

    public static final String LA_REQ_VIEW = "http://laapi.mingdao.com/wf/req/view";

    public static final String LA_TASK_APPROVE = "http://laapi.mingdao.com/wf/reqTask/approve";

    public static final String LA_TASK_VIEW = "http://laapi.mingdao.com/wf/reqTask/view";

    public static final String LA_MANAGE_WORKING = "http://laapi.mingdao.com/wf/reqManage/working";

    public static final String LA_MANAGE_VIEW = "http://laapi.mingdao.com/wf/reqManage/view";

    /***
     * *******************WX*******************
     */
    public static final String WX_GET_TOKEN = "https://qyapi.weixin.qq.com/cgi-bin/gettoken";


    public static final String WX_PUSH = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=";

    /***
     * *******************IGeTui*******************
     */
    public static final String IGeTui_PUSH = "http://oa.mingdao.com/common/igetui";


    /***
     * *******************HTF*******************
     */

    public static final String HTF_HOST = "https://99fund.com/hop/";

    public static final String HTF_DVCODE_MOBILE= "mingdao/base/dvcode/mobile.htm";

    public static final String HTF_DVCODE_CUSTOMER= "mingdao/base/dvcode/customer.htm";

    public static final String HTF_DVCODE_VERIFICATION = "mingdao/base/dvcode/verification.htm";

    public static final String HTF_MEDIA_UPLOAD = "mingdao/base/media/upload.htm?type=image";

    public static final String HTF_MEDIA_FILE_DOWNLOAD = "mingdao/base/media/fileDownload.htm";

    public static final String HTF_INST_CUSTOMER = "mingdao/inst/customer.htm";

    public static final String HTF_INST_CUSTOMER_STATUS = "mingdao/inst/customerStatus.htm";


    public static final String HTF_INST_CUSTOMER_INFO = "mingdao/inst/customerInfo.htm";

    public static final String HTF_INST_CUSTOMER_EDIT = "mingdao/inst/customer.htm";

    public static final String HTF_INST_TRADE_WITHDRAWAL = "mingdao/inst/trade/withdrawal.htm";

    public static final String HTF_INST_TRADE_QUICK_WITHDRAWAL = "mingdao/inst/trade/quickwithdrawal.htm";

    public static final String HTF_INST_TRADE_WITHDRAWAL_TO_BALANCE = "mingdao/inst/trade/withdrawaltobalance.htm";

    public static final String HTF_INST_TRADE_CANCEL = "mingdao/inst/trade/cancle.htm";


    public static final String HTF_INST_TRADE_PURCHASE = "mingdao/inst/trade/purchase.htm";


    public static final String HTF_INST_TRADE_TODAY = "mingdao/inst/trade/today.htm";


    public static final String HTF_INST_TRADE_HISTORY = "mingdao/inst/trade/history.htm";

    public static final String HTF_INST_TRADE_QUERY_TRADE_DATE = "mingdao/inst/trade/queryTradeDate.htm";


    public static final String HTF_INST_TRADE_DETAIL= "mingdao/inst/trade/tradeDetail.htm";



    public static final String HTF_INST_TRADE_ASSET= "mingdao/inst/trade/asset.htm";


    public static final String HTF_INST_TRADE_PROFIT= "mingdao/inst/trade/profit.htm";


    public static final String HTF_INST_BANK= "mingdao/inst/bank.htm";


    public static final String HTF_INST_BANK_PROVINCE= "mingdao/inst/bank/province.htm";


    public static final String HTF_INST_BANK_DETAIL= "mingdao/inst/bank/detail.htm";


    public static final String HTF_INST_TRADE_YEILD_QUERY= "mingdao/inst/trade/yeildQuery.htm";

}

