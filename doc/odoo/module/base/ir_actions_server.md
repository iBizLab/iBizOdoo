# 服务器动作(ir_actions_server)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|截止日期至|ACTIVITY_DATE_DEADLINE_RANGE|整型||是||
|到期类型|ACTIVITY_DATE_DEADLINE_RANGE_TYPE|[单项选择(文本值)](index/dictionary_index#ir_actions_server_activity_date_deadline_range_type "到期类型")|60|是||
|备注|ACTIVITY_NOTE|HTML文本，没有长度限制|1048576|是||
|标题|ACTIVITY_SUMMARY|文本，可指定长度|250|是||
|活动类型|ACTIVITY_TYPE_ID|外键值|100|是||
|活动类型名称|ACTIVITY_TYPE_NAME|外键值文本|200|是||
|用户字段|ACTIVITY_USER_FIELD_NAME|文本，可指定长度|250|是||
|负责人|ACTIVITY_USER_ID|外键值|100|是||
|负责人|ACTIVITY_USER_NAME|外键值文本|200|是||
|用户类型|ACTIVITY_USER_TYPE|[单项选择(文本值)](index/dictionary_index#ir_actions_server_activity_user_type "用户类型")|60|是||
|绑定类型|BINDING_TYPE|[单项选择(文本值)](index/dictionary_index#ir_actions_server_binding_type "绑定类型")|60|否||
|绑定视图类型|BINDING_VIEW_TYPES|文本，可指定长度|250|是||
|Python 代码|CODE|长文本，没有长度限制|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|创建记录|CRUD_MODEL_ID|文本，可指定长度|100|是||
|值类型|EVALUATION_TYPE|[单项选择(文本值)](index/dictionary_index#ir_actions_server_evaluation_type "值类型")|60|是||
|动作描述|HELP|HTML文本，没有长度限制|1048576|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|链接字段|LINK_FIELD_ID|文本，可指定长度|100|是||
|订阅收件人|MAIL_POST_AUTOFOLLOW|是否逻辑||是||
|发送电子邮件|MAIL_POST_METHOD|[单项选择(文本值)](index/dictionary_index#ir_actions_server_mail_post_method "发送电子邮件")|60|是||
|模型|MODEL_ID|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|网站中显示的路径|PATH|文本，可指定长度|250|是||
|序列|SEQUENCE|整型||是||
|发送短信为|SMS_METHOD|[单项选择(文本值)](index/dictionary_index#ir_actions_server_sms_method "发送短信为")|60|是||
|类型|STATE|[单项选择(文本值)](index/dictionary_index#ir_actions_server_state "类型")|60|否||
|EMail模板|TEMPLATE_ID|外键值|100|是||
|EMail模板|TEMPLATE_NAME|外键值文本|200|是||
|动作类型|TYPE|文本，可指定长度|250|否||
|布尔值|UPDATE_BOOLEAN_VALUE|[单项选择(文本值)](index/dictionary_index#ir_actions_server_update_boolean_value "布尔值")|60|是||
|要更新的字段|UPDATE_FIELD_ID|文本，可指定长度|100|是||
|Many2many 业务|UPDATE_M2M_OPERATION|[单项选择(文本值)](index/dictionary_index#ir_actions_server_update_m2m_operation "Many2many 业务")|60|是||
|字段更新路径|UPDATE_PATH|文本，可指定长度|250|是||
|更新相关模型|UPDATE_RELATED_MODEL_ID|文本，可指定长度|100|是||
|用途|USAGE|[单项选择(文本值)](index/dictionary_index#ir_actions_server_usage "用途")|60|否||
|值|VALUE|长文本，没有长度限制|1048576|是||
|Webhook URL|WEBHOOK_URL|文本，可指定长度|250|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_IR_CRON_IR_ACTIONS_SERVER_IR_ACTIONS_SERVER_ID](der/DER1N_IR_CRON_IR_ACTIONS_SERVER_IR_ACTIONS_SERVER_ID)|[计划的操作(IR_CRON)](module/base/ir_cron)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_IR_ACTIONS_SERVER_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID](der/DER1N_IR_ACTIONS_SERVER_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_IR_ACTIONS_SERVER_MAIL_TEMPLATE_TEMPLATE_ID](der/DER1N_IR_ACTIONS_SERVER_MAIL_TEMPLATE_TEMPLATE_ID)|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|1:N关系||
|[DER1N_IR_ACTIONS_SERVER_RES_USERS_ACTIVITY_USER_ID](der/DER1N_IR_ACTIONS_SERVER_RES_USERS_ACTIVITY_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[DEFAULT](module/base/ir_actions_server/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_actions_server/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_actions_server/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_DATE_DEADLINE_RANGE_TYPE_EQ|到期类型|EQ||
|N_ACTIVITY_TYPE_ID_EQ|活动类型|EQ||
|N_ACTIVITY_TYPE_NAME_EQ|活动类型名称|EQ||
|N_ACTIVITY_TYPE_NAME_LIKE|活动类型名称|LIKE||
|N_ACTIVITY_USER_ID_EQ|负责人|EQ||
|N_ACTIVITY_USER_NAME_EQ|负责人|EQ||
|N_ACTIVITY_USER_NAME_LIKE|负责人|LIKE||
|N_ACTIVITY_USER_TYPE_EQ|用户类型|EQ||
|N_BINDING_TYPE_EQ|绑定类型|EQ||
|N_EVALUATION_TYPE_EQ|值类型|EQ||
|N_ID_EQ|标识|EQ||
|N_MAIL_POST_METHOD_EQ|发送电子邮件|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_SMS_METHOD_EQ|发送短信为|EQ||
|N_STATE_EQ|类型|EQ||
|N_TEMPLATE_ID_EQ|EMail模板|EQ||
|N_TEMPLATE_NAME_EQ|EMail模板|EQ||
|N_TEMPLATE_NAME_LIKE|EMail模板|LIKE||
|N_UPDATE_BOOLEAN_VALUE_EQ|布尔值|EQ||
|N_UPDATE_M2M_OPERATION_EQ|Many2many 业务|EQ||
|N_USAGE_EQ|用途|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_actions_server?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_actions_server?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_actions_server?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_actions_server?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_actions_server?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_actions_server?id=搜索模式`">
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