package com.mingdao.api.utils;

import com.mingdao.api.entity.AppConfig;
import com.mingdao.api.support.PropertiesConfig;
import org.apache.commons.lang.StringUtils;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-15
 * Time: 下午5:08
 * To change this template use File | Settings | File Templates.
 */
public class AppConfigUtil {

    private static PropertiesConfig propertiesConfig;

    private static AppConfig appConfig;

    private static String propertiesName = "appConfig.properties";


    private AppConfigUtil() {

    }

    public static AppConfig create() {
        initProperties();
        return appConfig;
    }

    public static AppConfig create(String pName) {
        if (StringUtils.isNotBlank(pName)) {
            propertiesName = pName;
        }
        initProperties();
        return appConfig;
    }



    static synchronized void initProperties() {
        if (null != propertiesConfig) {
            return;
        }
        propertiesConfig = new PropertiesConfig(propertiesName);
        if (propertiesConfig != null) {
            appConfig = new AppConfig();
            appConfig.setAppKey(propertiesConfig.getString("app_key"));
            appConfig.setAppSecret(propertiesConfig.getString("app_secret"));
            appConfig.setRedirectUri(propertiesConfig.getString("redirect_uri"));
            appConfig.setHtfUri(propertiesConfig.getString("htf_uri"));
            appConfig.setMingdaoUri(propertiesConfig.getString("mingdao_uri"));
            appConfig.setOaUri(propertiesConfig.getString("oa_uri"));
            appConfig.setHrUri(propertiesConfig.getString("hr_uri"));
            appConfig.setOaSearchUri(propertiesConfig.getString("oa_search_uri"));
        }
    }
}
