# 邮件会话(mail_thread)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|附件集合|ATTACHMENTS|一对多关系数据集合|1048576|是||
|关注者|FOLLOWERS|一对多关系数据集合|1048576|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|待处理|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|名称|NAME|文本，可指定长度|200|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_IR_ATTACHMENT_MAIL_THREAD](der/DERCUSTOM_IR_ATTACHMENT_MAIL_THREAD)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|自定义关系||
|[DERCUSTOM_MAIL_FOLLOWERS_MAIL_THREAD](der/DERCUSTOM_MAIL_FOLLOWERS_MAIL_THREAD)|[单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers)|自定义关系||
|[DERCUSTOM_MAIL_MESSAGE_MAIL_THREAD](der/DERCUSTOM_MAIL_MESSAGE_MAIL_THREAD)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|自定义关系||
|[DERMULINH_CRM_LEAD_MAIL_THREAD](der/DERMULINH_CRM_LEAD_MAIL_THREAD)|[线索/商机(CRM_LEAD)](module/crm/crm_lead)|多继承关系（虚拟实体）||
|[DERMULINH_DISCUSS_CHANNEL_MAIL_THREAD](der/DERMULINH_DISCUSS_CHANNEL_MAIL_THREAD)|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|多继承关系（虚拟实体）||
|[DERMULINH_HR_ATTENDANCE_MAIL_THREAD](der/DERMULINH_HR_ATTENDANCE_MAIL_THREAD)|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance)|多继承关系（虚拟实体）||
|[DERMULINH_HR_DEPARTMENT_MAIL_THREAD](der/DERMULINH_HR_DEPARTMENT_MAIL_THREAD)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|多继承关系（虚拟实体）||
|[DERMULINH_HR_EMPLOYEE_MAIL_THREAD](der/DERMULINH_HR_EMPLOYEE_MAIL_THREAD)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|多继承关系（虚拟实体）||
|[DERMULINH_RES_COMPANY_MAIL_THREAD](der/DERMULINH_RES_COMPANY_MAIL_THREAD)|[公司(RES_COMPANY)](module/base/res_company)|多继承关系（虚拟实体）||
|[DERMULINH_RES_PARTNER_MAIL_THREAD](der/DERMULINH_RES_PARTNER_MAIL_THREAD)|[联系人(RES_PARTNER)](module/base/res_partner)|多继承关系（虚拟实体）||


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
|消息发送代理|mail_message_post|脚本代码|默认|不支持||||
|构造跟踪数据|mail_track|用户自定义|默认|不支持||||
|通知消息|message_notify|用户自定义|默认|不支持|||用于内置通知|
|消息发送|message_post|[实体处理逻辑](module/mail/mail_thread/logic/message_post "message_post")|默认|不支持||||
|从模板资源构造消息并发送|message_post_with_source|[实体处理逻辑](module/mail/mail_thread/logic/message_post_with_source "message_post_with_source")|默认|不支持||||
|跟踪消息|message_track|用户自定义|默认|不支持||||
|发送消息将附件归属转换至主对象中|process_attachments_for_post|用户自定义|默认|不支持||||
|新建时属性跟踪|track_discard|用户自定义|默认|不支持|||新建数据时使用，空方法提供后续集成使用|
|跟踪数据建立|track_finalize|用户自定义|默认|不支持||||
|属性跟踪准备|track_prepare|用户自定义|默认|不支持|||更新时使用，空方法提供后续集成使用|

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[message_post](module/mail/mail_thread/logic/message_post)|message_post|无||//TODO<br>待完善消息发送逻辑，目前简单构造消息并新建<br>注意忽略传入的<br>res_id、model等，由继承实体提取写入|
|[message_post_with_source](module/mail/mail_thread/logic/message_post_with_source)|message_post_with_source|无||//TODO<br>待完善带模板转换消息发送逻辑，目前简单构造消息并新建|
|[计算附件数](module/mail/mail_thread/logic/compute_attach_count)|compute_attach_count|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_thread/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_thread/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_thread/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_thread?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_thread?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_thread?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_thread?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_thread?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_thread?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_thread?id=搜索模式`">
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