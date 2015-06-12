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


    public static final String OAUTH2_AUTHORIZE = "https://api.mingdao.com/oauth2/authorize";

    public static final String OAUTH2_ACCESS_TOKEN = "https://api.mingdao.com/oauth2/access_token";

    public static final String OAUTH2_EMAIL = "https://api.mingdao.com/oauth2/verify_email";


    /**
     * ********************USER********************
     */
    public static final String USER_ALL_FOR_INSTALL = "https://api.mingdao.com/mdprivate/user/getall.aspx";



    public static final String USER_ALL = "https://api.mingdao.com/user/all";

    public static final String USER_SEARCH = "https://api.mingdao.com/user/search";

    public static final String USER_LIST = "https://api.mingdao.com/user/list";

    public static final String USER_DETAIL = "https://api.mingdao.com/user/detail";

    public static final String USER_FOLLOWED = "https://api.mingdao.com/user/followed";

    public static final String USER_DEPARTMENT = "https://api.mingdao.com/user/department";

    public static final String USER_ADD_FOLLOWED = "https://api.mingdao.com/user/add_followed";

    public static final String USER_DELETE_FOLLOWED = "https://api.mingdao.com/user/delete_followed";

    public static final String USER_INVITE = "https://api.mingdao.com/user/invite";

    public static final String USER_FREQUENT = "https://api.mingdao.com/user/frequent";

    public static final String USER_ADD_FREQUENT = "https://api.mingdao.com/user/add_frequent";

    public static final String USER_DELETE_FREQUENT = "https://api.mingdao.com/user/delete_frequent";

    public static final String USER_GET_MANAGER_USER = "https://api.mingdao.com/user/get_managerUser";

    public static final String USER_GET_MANAGER_USER_TREE = "https://api.mingdao.com/user/get_managerUserTree";

    public static final String USER_GET_USER_METIONED = "https://api.mingdao.com/user/get_userMetioned";





    /**
     * ********************MESSAGE********************
     */
    public static final String MESSAGE_ALL = "https://api.mingdao.com/message/all";

    public static final String MESSAGE_LIST = "https://api.mingdao.com/message/list";

    public static final String MESSAGE_UN_READ_COUNT = "https://api.mingdao.com/message/unreadcount";

    public static final String MESSAGE_CREATE = "https://api.mingdao.com/message/create";

    public static final String MESSAGE_CREATE_SYS = "https://api.mingdao.com/message/create_sys";

    public static final String MESSAGE_CREATE_SYS2 = "https://api2.mingdao.com/message/create_sys";

    public static final String MESSAGE_DELETE = "https://api.mingdao.com/message/delete";

    public static final String MESSAGE_RED = "https://api.mingdao.com/message/read";

    /**
     * ********************CALENDAR********************
     */

    public static final String CALENDAR_CREATE = "https://api.mingdao.com/calendar/create";

    public static final String CALENDAR_EXIT = "https://api.mingdao.com/calendar/exit";


    /**
     * ********************PASSPORT********************
     */
    public static final String PASSPORT_DETAIL = "https://api.mingdao.com/passport/detail";

    public static final String PASSPORT_UN_READ_COUNT = "https://api.mingdao.com/passport/unreadcount";

    public static final String PASSPORT_EDIT = "https://api.mingdao.com/passport/edit";

    public static final String PASSPORT_EDIT_AVSTAR = "https://api.mingdao.com/passport/edit_avstar";

    public static final String PASSPORT_LOGOUT = "https://api.mingdao.com/passport/logout";

    public static final String PASSPORT_GET_SETTING = "https://api.mingdao.com/passport/get_setting";


    /**
     * ********************COMPANY********************
     */
    public static final String COMPANY_DETAIL = "https://api.mingdao.com/company/detail";

    public static final String COMPANY_GET_ADMIN = "https://api.mingdao.com/company/get_admin";

    public static final String COMPANY_ADD_ADMIN = "https://api.mingdao.com/company/add_admin";

    public static final String COMPANY_DELETE_ADMIN = "https://api.mingdao.com/company/delete_admin";

    public static final String COMPANY_IS_ADMIN = "https://api.mingdao.com/company/is_admin";

    public static final String COMPANY_PAIDUSERSCOUNT = "https://api.mingdao.com/company/get_paiduserscount";

    /**
     * ********************CRM********************
     */
    public static final String CRM_OWNER = "http://devcrm.mingdao.com/api/user/getprojectowner";

    /**
     * ********************GROUP********************
     */
    public static final String GROUP_ALL = "https://api.mingdao.com/group/all";

    public static final String GROUP_DETAIL = "https://api.mingdao.com/group/detail";

    public static final String GROUP_MY_CREATED = "https://api.mingdao.com/group/my_created";

    public static final String GROUP_MY_JOINED = "https://api.mingdao.com/group/my_joined";

    public static final String GROUP_USER = "https://api.mingdao.com/group/user";

    public static final String GROUP_CREATE = "https://api.mingdao.com/group/create";

    public static final String GROUP_EXIT = "https://api.mingdao.com/group/exit";

    public static final String GROUP_JOIN = "https://api.mingdao.com/group/join";

    public static final String GROUP_CLOSE = "https://api.mingdao.com/group/close";

    public static final String GROUP_OPEN = "https://api.mingdao.com/group/open";

    public static final String GROUP_DELETE = "https://api.mingdao.com/group/delete";

    public static final String GROUP_INVITE = "https://api.mingdao.com/group/invite";

    /**
     * ********************DEPT********************
     */



    public static final String DEPT_ALL = "https://api2.mingdao.com/mdprivate/group/getDepartments.aspx";

    public static final String DEPT_ALL_FOR_INSTALL = "https://api2.mingdao.com/mdprivate/group/getALLDep.aspx";

    public static final String DEPT_ADD = "https://api2.mingdao.com/mdprivate/group/addDepartment.aspx";

    public static final String DEPT_EDIT="https://api2.mingdao.com/mdprivate/group/editDepartment.aspx";

    /**
     * ********************TASK********************
     */
    public static final String TASK_MY_JOINED = "https://api.mingdao.com/task/my_joined";

    public static final String TASK_MY_JOINED_FINISHED = "https://api.mingdao.com/task/my_joined_finished";

    public static final String TASK_MY_ASSIGN = "https://api.mingdao.com/task/my_assign";

    public static final String TASK_MY_ASSIGN_FINISHED = "https://api.mingdao.com/task/my_assign_finished";

    public static final String TASK_MY_CHARGE = "https://api.mingdao.com/task/my_charge";

    public static final String TASK_MY_CHARGE_FINISHED = "https://api.mingdao.com/task/my_charge_finished";

    public static final String TASK_PROJECT = "https://api.mingdao.com/task/project";

    public static final String TASK_UN_READ_COUNT = "https://api.mingdao.com/task/unreadcount";

    public static final String TASK_DETAIL = "https://api.mingdao.com/task/detail";

    public static final String TASK_REPLY = "https://api.mingdao.com/task/reply";

    public static final String TASK_CREATE = "https://api.mingdao.com/task/create";

    public static final String TASK_ADD_PROJECT = "https://api.mingdao.com/task/add_project";

    public static final String TASK_EDIT_TITLE = "https://api.mingdao.com/task/edit_title";

    public static final String TASK_EDIT_DES = "https://api.mingdao.com/task/edit_des";

    public static final String TASK_EDIT_CHARGE = "https://api.mingdao.com/task/edit_charge";

    public static final String TASK_EDIT_EXPIRE_DATE = "https://api.mingdao.com/task/edit_expiredate";

    public static final String TASK_EDIT_PROJECT = "https://api.mingdao.com/task/edit_project";

    public static final String TASK_ADD_MEMBER = "https://api.mingdao.com/task/add_member";

    public static final String TASK_DELETE_MEMBER = "https://api.mingdao.com/task/delete_member";

    public static final String TASK_FINISH = "https://api.mingdao.com/task/finish";

    public static final String TASK_ADD_REPLY = "https://api.mingdao.com/task/addreply";

    public static final String TASK_DELETE = "https://api.mingdao.com/task/delete";


    /**
     * ********************VOTE********************
     */
    public static final String VOTE_MY_JOINED = "https://api.mingdao.com/vote/my_joined";

    public static final String VOTE_MY_CREATE = "https://api.mingdao.com/vote/my_create";

    public static final String VOTE_ALL = "https://api.mingdao.com/vote/all";

    public static final String VOTE_DETAIL = "https://api.mingdao.com/vote/detail";

    public static final String VOTE_CAST_OPTIONS = "https://api.mingdao.com/vote/cast_options";

    /**
     * ********************POST********************
     */
    public static final String POST_FOLLOWED = "https://api.mingdao.com/post/followed";

    public static final String POST_ALL = "https://api.mingdao.com/post/all";

    public static final String POST_MY = "https://api.mingdao.com/post/my";

    public static final String POST_AT_ME = "https://api.mingdao.com/post/atme";

    public static final String POST_REPLY_ME = "https://api.mingdao.com/post/replyme";

    public static final String POST_FAVORITE = "https://api.mingdao.com/post/favorite";

    public static final String POST_GROUP = "https://api.mingdao.com/post/group";

    public static final String POST_USER = "https://api.mingdao.com/post/user";

    public static final String POST_DOC = "https://api.mingdao.com/post/doc";

    public static final String POST_IMG = "https://api.mingdao.com/post/img";

    public static final String POST_FAQ = "https://api.mingdao.com/post/faq";

    public static final String POST_UN_READ_COUNT = "https://api.mingdao.com/post/unreadcount";

    public static final String POST_UN_READ_AT_ME_COUNT = "https://api.mingdao.com/post/unreadatmecount";

    public static final String POST_UN_READ_REPLY_ME_COUNT = "https://api.mingdao.com/post/unreadreplymecount";

    public static final String POST_DETAIL = "https://api.mingdao.com/post/detail";

    public static final String POST_REPLY = "https://api.mingdao.com/post/reply";

    public static final String POST_UPDATE = "https://api.mingdao.com/post/update";

    public static final String POST_UPLOAD = "https://api.mingdao.com/post/upload";

    public static final String POST_DELETE = "https://api.mingdao.com/post/delete";

    public static final String POST_RE_POST = "https://api.mingdao.com/post/repost";

    public static final String POST_ADD_REPLY = "https://api.mingdao.com/post/add_reply";

    public static final String POST_DELETE_REPLY = "https://api.mingdao.com/post/delete_reply";

    public static final String POST_ADD_FAVORITE = "https://api.mingdao.com/post/add_favorite";

    public static final String POST_DELETE_FAVORITE = "https://api.mingdao.com/post/delete_favorite";

    public static final String POST_ADD_LIKE = "https://api.mingdao.com/post/add_like";

    public static final String POST_DELETE_LIKE = "https://api.mingdao.com/post/delete_like";

    public static final String POST_LIST_TAG = "https://api.mingdao.com/post/list_tag";

    public static final String POST_TAG = "https://api.mingdao.com/post/tag";

    public static final String POST_ADD_TAG = "https://api.mingdao.com/post/add_tag";

    public static final String POST_DELETE_TAG = "https://api.mingdao.com/post/delete_tag";

    /**
     * ********************APP********************
     */
    public static final String APP_VERSION = "https://api.mingdao.com/app/version";

    public static final String APP_GET_ADMIN = "https://api.mingdao.com/app/get_admin";

    public static final String APP_ADD_ADMIN = "https://api.mingdao.com/app/add_admin";

    public static final String APP_DELETE_ADMIN = "https://api.mingdao.com/app/delete_admin";

    public static final String APP_IS_ADMIN = "https://api.mingdao.com/app/is_admin";

    public static final String APP_ADD_NOTICE = "https://api.mingdao.com/app/addAppNotice";

    public static final String APP_READ_NOTICE = "https://api.mingdao.com/app/readAppNotice";


    /**
     * ********************BILLING********************
     */
    public static final String BILLING_CREATE = "https://api.mingdao.com/billing/create";

    public static final String BILLING_CREATE_AUTO = "https://api.mingdao.com/billing/create_auto";

    public static final String BILLING_DETAIL = "https://api.mingdao.com/billing/detail";

    public static final String BILLING_CLOSE = "https://api.mingdao.com/billing/close";


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

