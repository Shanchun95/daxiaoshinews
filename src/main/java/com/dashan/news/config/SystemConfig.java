package com.dashan.news.config;


/**
 * @ClassName: SystemConfig
 * @Description: TODO
 * @author: shanchun
 * @date: 2019/09/28  下午 4:16
 */
public class SystemConfig {
    //令牌的有效期
    public static int TOKENTIMES=30;
    //令牌的秘钥
    public static String TOKENKEY="nrjwtlogin";

    //令牌的消息头的key
    public static final String HEARDTOKEN="nrusertoken";
}
