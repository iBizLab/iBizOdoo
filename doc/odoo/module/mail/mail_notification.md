# 消息通知(mail_notification)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|作者|AUTHOR_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|失败原因|FAILURE_REASON|长文本，没有长度限制|1048576|是||
|失败类型|FAILURE_TYPE|[单项选择(文本值)](index/dictionary_index#mail_notification_failure_type "失败类型")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|已读|IS_READ|是否逻辑||是||
|邮件|MAIL_MAIL_ID|外键值|100|是||
|消息|MAIL_MESSAGE_ID|外键值|100|否||
|消息记录名称|MAIL_MESSAGE_RECORD_NAME|外键值文本|500|否||
|消息内容|MESSAGE_CONTENT|外键值附加数据|1048576|是||
|状态|NOTIFICATION_STATUS|[单项选择(文本值)](index/dictionary_index#mail_notification_notification_status "状态")|60|是||
|通知类型|NOTIFICATION_TYPE|[单项选择(文本值)](index/dictionary_index#mail_notification_notification_type "通知类型")|60|否||
|读取日期|READ_DATE|日期时间型||是||
|收件人|RES_PARTNER_ID|外键值|100|是||
|收件人名称|RES_PARTNER_NAME|外键值文本|200|是||
|短信 ID|SMS_ID_INT|整型||是||
|短信息号码|SMS_NUMBER|文本，可指定长度|500|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_MAIL_RESEND_PARTNER_MAIL_NOTIFICATION_NOTIFICATION_ID](der/DER1N_MAIL_RESEND_PARTNER_MAIL_NOTIFICATION_NOTIFICATION_ID)|[为邮件重新发送提供附加信息的合作伙伴(MAIL_RESEND_PARTNER)](module/mail/mail_resend_partner)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_NOTIFICATION_MAIL_MAIL_MAIL_MAIL_ID](der/DER1N_MAIL_NOTIFICATION_MAIL_MAIL_MAIL_MAIL_ID)|[发出邮件(MAIL_MAIL)](module/mail/mail_mail)|1:N关系||
|[DER1N_MAIL_NOTIFICATION_MAIL_MESSAGE_MAIL_MESSAGE_ID](der/DER1N_MAIL_NOTIFICATION_MAIL_MESSAGE_MAIL_MESSAGE_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_MAIL_NOTIFICATION_RES_PARTNER_AUTHOR_ID](der/DER1N_MAIL_NOTIFICATION_RES_PARTNER_AUTHOR_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_MAIL_NOTIFICATION_RES_PARTNER_RES_PARTNER_ID](der/DER1N_MAIL_NOTIFICATION_RES_PARTNER_RES_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_notification/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_notification/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_notification/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_AUTHOR_ID_EQ|作者|EQ||
|N_FAILURE_TYPE_EQ|失败类型|EQ||
|N_ID_EQ|标识|EQ||
|N_MAIL_MAIL_ID_EQ|邮件|EQ||
|N_MAIL_MESSAGE_ID_EQ|消息|EQ||
|N_MAIL_MESSAGE_RECORD_NAME_EQ|消息记录名称|EQ||
|N_MAIL_MESSAGE_RECORD_NAME_LIKE|消息记录名称|LIKE||
|N_NOTIFICATION_STATUS_EQ|状态|EQ||
|N_NOTIFICATION_TYPE_EQ|通知类型|EQ||
|N_RES_PARTNER_ID_EQ|收件人|EQ||
|N_RES_PARTNER_NAME_EQ|收件人名称|EQ||
|N_RES_PARTNER_NAME_LIKE|收件人名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_notification?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_notification?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_notification?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_notification?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_notification?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_notification?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>