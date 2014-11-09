package com.mingdao.api.utils;

import com.mingdao.api.entity.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-16
 * Time: 下午5:12
 * To change this template use File | Settings | File Templates.
 */
public class MingDaoConstantsUtil {

    private static class SingletonHolder {
        /**
         * 单例对象实例
         */
        static final MingDaoConstantsUtil INSTANCE = new MingDaoConstantsUtil();
    }

    public static MingDaoConstantsUtil getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * private的构造函数用于避免外界直接使用new来实例化对象
     */
    private MingDaoConstantsUtil() {
    }

    /**
     * readResolve方法应对单例对象被序列化时候
     */
    private Object readResolve() {
        return getInstance();
    }

    private long index = 1;

    private Map<String, Constants> constantsMap = new HashMap<String, Constants>();

    public void setConstants(String key, Constants constants) {
        constantsMap.put(key, constants);
    }

    public String getName(long parentCode, String key) {
        String mapKey = parentCode + "-" + key;
        if (constantsMap.containsKey(mapKey)) {
            return constantsMap.get(mapKey).getName();
        }
        return null;
    }

    public long getUserGender() {
        return this.USER_GENDER;
    }

    public long getUserFollowedStatus() {
        return this.USER_FOLLOWED_STATUS;
    }

    public long getUserLicense() {
        return this.USER_LICENSE;
    }

    public long getUserStatus() {
        return this.USER_STATUS;
    }

    public long getGroupIsPublic() {
        return this.GROUP_IS_PUBLIC;
    }

    public long getGroupStatus() {
        return this.GROUP_STATUS;
    }

    public long getGroupFollowedStatus() {
        return this.GROUP_FOLLOWED_STATUS;
    }

    public long getNetworkLicense() {
        return this.NETWORK_LICENSE;
    }


    /**
     * *******************************************************
     * 模块名称: 通用
     * 用户性别(0-未选,1-男,2-女)
     * ********************************************************
     */
    public final long USER_GENDER = index++;
    public final Constants USER_GENDER_UN = new Constants(USER_GENDER, "未选", "0");
    public final Constants USER_GENDER_MALE = new Constants(USER_GENDER, "男", "1");
    public final Constants USER_GENDER_FEMALE = new Constants(USER_GENDER, "女", "2");


    /**
     * *******************************************************
     * 模块名称: 通用
     * 关注关系(0-未关注,1-已关注)
     * ********************************************************
     */
    public final long USER_FOLLOWED_STATUS = index++;
    public final Constants USER_FOLLOWED_STATUS_N = new Constants(USER_FOLLOWED_STATUS, "未关注", "0");
    public final Constants USER_FOLLOWED_STATUS_Y = new Constants(USER_FOLLOWED_STATUS, "已关注", "1");

    /**
     * *******************************************************
     * 模块名称: 通用
     * 用户的权限(-1表示普通用户；0表示既是管理员又是广播员；1表示管理员；2表示广播员)
     * ********************************************************
     */
    public final long USER_LICENSE = index++;
    public final Constants USER_LICENSE_PT = new Constants(USER_LICENSE, "普通用户", "-1");
    public final Constants USER_LICENSE_GLGB = new Constants(USER_LICENSE, "管理员 广播员", "0");
    public final Constants USER_LICENSE_GL = new Constants(USER_LICENSE, "管理员", "1");
    public final Constants USER_LICENSE_GB = new Constants(USER_LICENSE, "广播员", "2");

    /**
     * *******************************************************
     * 模块名称: 通用
     * 用户状态(0为删除；1为正常)
     * ********************************************************
     */
    public final long USER_STATUS = index++;
    public final Constants USER_STATUS_DELETE = new Constants(USER_STATUS, "删除", "0");
    public final Constants USER_STATUS_OK = new Constants(USER_STATUS, "正常", "1");

    /**
     * *******************************************************
     * 模块名称: 通用
     * 用户状态(0为私有；1为公开)
     * ********************************************************
     */
    public final long GROUP_IS_PUBLIC = index++;
    public final Constants GROUP_PRIVATE = new Constants(GROUP_IS_PUBLIC, "私有", "0");
    public final Constants GROUP_PUBLIC = new Constants(GROUP_IS_PUBLIC, "公开", "1");

    /**
     * *******************************************************
     * 模块名称: 通用
     * 用户状态(0为已关闭；1为正常状态)
     * ********************************************************
     */
    public final long GROUP_STATUS = index++;
    public final Constants GROUP_STATUS_CLOSE = new Constants(GROUP_STATUS, "已关闭", "0");
    public final Constants GROUP_STATUS_OPEN = new Constants(GROUP_STATUS, "正常状态", "1");


    /**
     * *******************************************************
     * 模块名称: 通用
     * 用户状态(0为未加入；1为已加入)
     * ********************************************************
     */
    public final long GROUP_FOLLOWED_STATUS = index++;
    public final Constants GROUP_FOLLOWED_STATUS_N = new Constants(GROUP_FOLLOWED_STATUS, "未加入", "0");
    public final Constants GROUP_FOLLOWED_STATUS_Y = new Constants(GROUP_FOLLOWED_STATUS, "已加入", "1");


    /**
     * *******************************************************
     * 模块名称: 通用
     * 用户的权限(-1表示普通用户；0表示既是管理员又是广播员；1表示管理员；2表示广播员)
     * ********************************************************
     */
    public final long NETWORK_LICENSE = index++;
    public final Constants NETWORK_LICENSE_FREE = new Constants(NETWORK_LICENSE, "免费", "0");
    public final Constants NETWORK_LICENSE_BUY = new Constants(NETWORK_LICENSE, "高级", "1");
}
