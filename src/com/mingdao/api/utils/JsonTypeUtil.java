package com.mingdao.api.utils;

import org.apache.commons.lang.StringUtils;

/**
 * Created by IntelliJ IDEA.
 * User: zhenjiaWang
 * Date: 13-5-16
 * Time: 下午6:50
 * To change this template use File | Settings | File Templates.
 */
public class JsonTypeUtil {
    /***
     *
     * 获取JSON类型
     *         判断规则
     *             判断第一个字母是否为{或[ 如果都不是则不是一个JSON格式的文本
     *
     * @param str
     * @return
     */
    public static JsonType getJSONType(String str){
        if(StringUtils.isEmpty(str)){
            return JsonType.JSON_TYPE_ERROR;
        }
        final char[] strChar = str.substring(0, 1).toCharArray();
        final char firstChar = strChar[0];
        if(firstChar == '{'){
            return JsonType.JSON_TYPE_OBJECT;
        }else if(firstChar == '['){
            return JsonType.JSON_TYPE_ARRAY;
        }else{
            return JsonType.JSON_TYPE_ERROR;
        }
    }
}
