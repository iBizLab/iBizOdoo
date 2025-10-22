# 计划的操作(ir_cron)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|截止日期至|ACTIVITY_DATE_DEADLINE_RANGE|外键值附加数据||是||
|到期类型|ACTIVITY_DATE_DEADLINE_RANGE_TYPE|[外键值附加数据](index/dictionary_index#ir_actions_server_activity_date_deadline_range_type "到期类型")|60|是||
|备注|ACTIVITY_NOTE|外键值附加数据|1048576|是||
|标题|ACTIVITY_SUMMARY|外键值附加数据|250|是||
|活动类型|ACTIVITY_TYPE_ID|外键值附加数据|100|是||
|活动类型名称|ACTIVITY_TYPE_NAME|外键值附加数据|200|是||
|用户字段|ACTIVITY_USER_FIELD_NAME|外键值附加数据|250|是||
|负责人|ACTIVITY_USER_ID|外键值附加数据|100|是||
|负责人|ACTIVITY_USER_NAME|外键值附加数据|200|是||
|用户类型|ACTIVITY_USER_TYPE|[外键值附加数据](index/dictionary_index#ir_actions_server_activity_user_type "用户类型")|60|是||
|代码|CODE|外键值附加数据|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|名称|CRON_NAME|文本，可指定长度|250|是||
|创建记录|CRUD_MODEL_ID|外键值附加数据|100|是||
|值类型|EVALUATION_TYPE|[外键值附加数据](index/dictionary_index#ir_actions_server_evaluation_type "值类型")|60|是||
|失败次数|FAILURE_COUNT|整型||是||
|首次失败日期|FIRST_FAILURE_DATE|日期时间型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|间隔数值|INTERVAL_NUMBER|整型||否||
|间隔单位|INTERVAL_TYPE|[单项选择(文本值)](index/dictionary_index#ir_cron_interval_type "间隔单位")|60|否||
|服务器动作标识|IR_ACTIONS_SERVER_ID|外键值|100|是||
|最后执行日期|LASTCALL|日期时间型||是||
|链接字段|LINK_FIELD_ID|外键值附加数据|100|是||
|订阅收件人|MAIL_POST_AUTOFOLLOW|外键值附加数据||是||
|发送电子邮件|MAIL_POST_METHOD|[外键值附加数据](index/dictionary_index#ir_actions_server_mail_post_method "发送电子邮件")|60|是||
|模型|MODEL_ID|文本，可指定长度|100|是||
|动作名称|NAME|外键值文本|200|是||
|下一次执行日期|NEXTCALL|日期时间型||否||
|优先级|PRIORITY|整型||是||
|发送短信为|SMS_METHOD|[外键值附加数据](index/dictionary_index#ir_actions_server_sms_method "发送短信为")|60|是||
|类型|STATE|[外键值附加数据](index/dictionary_index#ir_actions_server_state "类型")|60|是||
|EMail模板|TEMPLATE_ID|外键值附加数据|100|是||
|EMail模板|TEMPLATE_NAME|外键值附加数据|200|是||
|布尔值|UPDATE_BOOLEAN_VALUE|[外键值附加数据](index/dictionary_index#ir_actions_server_update_boolean_value "布尔值")|60|是||
|要更新的字段|UPDATE_FIELD_ID|外键值附加数据|100|是||
|字段更新路径|UPDATE_PATH|外键值附加数据|250|是||
|更新相关模型|UPDATE_RELATED_MODEL_ID|外键值附加数据|100|是||
|用途|USAGE|[外键值附加数据](index/dictionary_index#ir_actions_server_usage "用途")|60|是||
|执行帐户|USER_ID|外键值|100|是||
|执行帐户|USER_NAME|外键值文本|200|是||
|值|VALUE|外键值附加数据|1048576|是||
|Webhook URL|WEBHOOK_URL|外键值附加数据|250|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_IR_CRON_TRIGGER_IR_CRON_CRON_ID](der/DER1N_IR_CRON_TRIGGER_IR_CRON_CRON_ID)|[触发行动(IR_CRON_TRIGGER)](module/base/ir_cron_trigger)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_IR_CRON_IR_ACTIONS_SERVER_IR_ACTIONS_SERVER_ID](der/DER1N_IR_CRON_IR_ACTIONS_SERVER_IR_ACTIONS_SERVER_ID)|[服务器动作(IR_ACTIONS_SERVER)](module/base/ir_actions_server)|1:N关系||
|[DER1N_IR_CRON_RES_USERS_USER_ID](der/DER1N_IR_CRON_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[DEFAULT](module/base/ir_cron/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_cron/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_cron/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_INTERVAL_TYPE_EQ|间隔单位|EQ||
|N_IR_ACTIONS_SERVER_ID_EQ|服务器动作标识|EQ||
|N_NAME_EQ|动作名称|EQ||
|N_NAME_LIKE|动作名称|LIKE||
|N_USER_ID_EQ|执行帐户|EQ||
|N_USER_NAME_EQ|执行帐户|EQ||
|N_USER_NAME_LIKE|执行帐户|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_cron?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_cron?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_cron?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_cron?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_cron?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_cron?id=搜索模式`">
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