# WechatPushMessage

![image-20210430221930768](https://gitee.com/ShaoxiongDu/imageBed/raw/master/image-20210430221930768.png)

> 你只需要调用简单的API，即可帮助你迅速完成消息的推送，使用简单方便；项目说明

## 项目说明

该项目使用了pushplus，感谢push.hxtrip.com提供服务。

## 使用步骤

1. 打开[PushPlus官网] (https://pushplus.hxtrip.com/)

2. 点击导航栏上方的一对一推送，微信扫码登录即可。

3. 将生成的TOKEN复制下来，粘贴到项目下Push.properties文件的Token属性后方。

4. 调用WechatPushMessage类中的Push方法即可推送。

### Push方法说明
```java
    /**
     *   推送消息到微信
     * @param title 消息标题
     * @param content 消息内容
     * @return 返回推送状态 true表示推送成功
     * @throws Exception 如果配置的TOKEN或者参数不合法，抛出此异常.
     */
    public static boolean push (String title,String content);
```


## 项目反馈及改进

如果您在学习或者部署本项目的时候遇到了任何问题，或者项目有任何可以改进的地方，欢迎提出issues,看到就会回馈.并且将您添加到项目贡献者列表中.

## 参与贡献

1. Fork 本仓库

2. 新建 Feat_xxx 分支

3. 提交代码

4. 新建 Pull Request

## 支持我

> #### 目前为止，我还没毕业，大三。正在为早餐发愁
> #### 项目开发，云服务器，域名注册等支出都需要花自己的生活费
> #### 如果此项目对您的学习有帮助的话
> #### 欢迎扫码请我吃一顿早餐，我将万分感谢！

![wxPraiseQR](https://gitee.com/ShaoxiongDu/imageBed/raw/master/wxPraiseQR.png)





