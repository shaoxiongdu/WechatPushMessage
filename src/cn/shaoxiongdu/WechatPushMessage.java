package cn.shaoxiongdu;

import cn.shaoxiongdu.util.HttpClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName : Push
 * (c)CopyRight 2021/4/30 All rights reserved to ShaoxiongDu<shaoxiongdu.dev@gmail.com>
 */
public class WechatPushMessage {

    /**
     * 推送TOKEN
     */
    private static String TOKEN = null;

    /**
     * 请求原始地址
     */
    private static String REQUEST_URL = "http://pushplus.hxtrip.com/send";

    static {

        /**
         * 加载TOKEN配置文件
         */
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("Push.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * 获取TOKEN
         */
        String pushToken = properties.getProperty("PushToken");

        TOKEN = pushToken;

        /**
         * 拼接TOKEN
         */
        REQUEST_URL = REQUEST_URL + "?token=" + TOKEN;

    }

    /**
     *   推送消息到微信
     * @param title 消息标题
     * @param content 消息内容
     * @return 返回推送状态 true表示推送成功
     * @throws Exception 如果配置的TOKEN或者参数不合法，抛出此异常.
     */
    public static boolean push (String title,String content) throws Exception {

        String param = "token=" +TOKEN + "&title=" + title + "&content=" + content;

        String result = HttpClient.doPost(REQUEST_URL, param);

        if(result.indexOf("请求成功") != -1){
            return true;
        }else {
            String errorMessage = result.substring(result.indexOf("msg")+6,result.indexOf("data")-3);
            throw new Exception(errorMessage);
        }
    }

}
