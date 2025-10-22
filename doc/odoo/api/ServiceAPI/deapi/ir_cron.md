# 计划的操作(ir_cron) :id=ir_cron
## 创建计划的操作

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作名称|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">cron_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">failure_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败次数|
|<el-row justify="space-between"><el-col :span="20">first_failure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次失败日期|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interval_number</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|间隔数值|
|<el-row justify="space-between"><el-col :span="20">interval_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|间隔单位|
|<el-row justify="space-between"><el-col :span="20">ir_actions_server_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器动作标识|
|<el-row justify="space-between"><el-col :span="20">lastcall</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后执行日期|
|<el-row justify="space-between"><el-col :span="20">nextcall</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|下一次执行日期|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取计划的操作

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|




##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除计划的操作

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新计划的操作

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作名称|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">cron_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">failure_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败次数|
|<el-row justify="space-between"><el-col :span="20">first_failure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次失败日期|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interval_number</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|间隔数值|
|<el-row justify="space-between"><el-col :span="20">interval_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|间隔单位|
|<el-row justify="space-between"><el-col :span="20">ir_actions_server_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器动作标识|
|<el-row justify="space-between"><el-col :span="20">lastcall</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后执行日期|
|<el-row justify="space-between"><el-col :span="20">nextcall</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|下一次执行日期|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查计划的操作主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作名称|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">cron_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">failure_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败次数|
|<el-row justify="space-between"><el-col :span="20">first_failure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次失败日期|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interval_number</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|间隔数值|
|<el-row justify="space-between"><el-col :span="20">interval_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|间隔单位|
|<el-row justify="space-between"><el-col :span="20">ir_actions_server_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器动作标识|
|<el-row justify="space-between"><el-col :span="20">lastcall</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后执行日期|
|<el-row justify="space-between"><el-col :span="20">nextcall</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|下一次执行日期|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取计划的操作草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作名称|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">cron_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">failure_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败次数|
|<el-row justify="space-between"><el-col :span="20">first_failure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次失败日期|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interval_number</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|间隔数值|
|<el-row justify="space-between"><el-col :span="20">interval_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|间隔单位|
|<el-row justify="space-between"><el-col :span="20">ir_actions_server_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器动作标识|
|<el-row justify="space-between"><el-col :span="20">lastcall</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后执行日期|
|<el-row justify="space-between"><el-col :span="20">nextcall</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|下一次执行日期|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存计划的操作

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作名称|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">cron_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">failure_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|失败次数|
|<el-row justify="space-between"><el-col :span="20">first_failure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次失败日期|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interval_number</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|间隔数值|
|<el-row justify="space-between"><el-col :span="20">interval_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|间隔单位|
|<el-row justify="space-between"><el-col :span="20">ir_actions_server_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器动作标识|
|<el-row justify="space-between"><el-col :span="20">lastcall</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后执行日期|
|<el-row justify="space-between"><el-col :span="20">nextcall</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|下一次执行日期|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "code" : null,
  "evaluation_type" : null,
  "update_path" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "value" : null,
  "update_boolean_value" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "sms_method" : null,
  "template_id" : null,
  "mail_post_autofollow" : null,
  "activity_type_id" : null,
  "activity_user_type" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_note" : null,
  "usage" : null,
  "state" : null,
  "activity_type_name" : null,
  "activity_user_name" : null,
  "activity_summary" : null,
  "activity_date_deadline_range_type" : null,
  "activity_date_deadline_range" : null,
  "mail_post_method" : null,
  "webhook_url" : null,
  "template_name" : null,
  "name" : null,
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "cron_name" : null,
  "failure_count" : null,
  "first_failure_date" : null,
  "id" : null,
  "interval_number" : null,
  "interval_type" : null,
  "ir_actions_server_id" : null,
  "lastcall" : null,
  "nextcall" : null,
  "priority" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interval_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|间隔单位|
|<el-row justify="space-between"><el-col :span="20">n_ir_actions_server_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器动作标识|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作名称|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作名称|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|
|<el-row justify="space-between"><el-col :span="20">n_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|
|<el-row justify="space-between"><el-col :span="20">n_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行帐户|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_interval_type_eq" : null,
  "n_ir_actions_server_id_eq" : null,
  "n_name_eq" : null,
  "n_name_like" : null,
  "n_user_id_eq" : null,
  "n_user_name_eq" : null,
  "n_user_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "model_id" : null,
    "code" : null,
    "evaluation_type" : null,
    "update_path" : null,
    "update_field_id" : null,
    "update_related_model_id" : null,
    "value" : null,
    "update_boolean_value" : null,
    "crud_model_id" : null,
    "link_field_id" : null,
    "sms_method" : null,
    "template_id" : null,
    "mail_post_autofollow" : null,
    "activity_type_id" : null,
    "activity_user_type" : null,
    "activity_user_field_name" : null,
    "activity_user_id" : null,
    "activity_note" : null,
    "usage" : null,
    "state" : null,
    "activity_type_name" : null,
    "activity_user_name" : null,
    "activity_summary" : null,
    "activity_date_deadline_range_type" : null,
    "activity_date_deadline_range" : null,
    "mail_post_method" : null,
    "webhook_url" : null,
    "template_name" : null,
    "name" : null,
    "active" : null,
    "create_date" : null,
    "create_uid" : null,
    "cron_name" : null,
    "failure_count" : null,
    "first_failure_date" : null,
    "id" : null,
    "interval_number" : null,
    "interval_type" : null,
    "ir_actions_server_id" : null,
    "lastcall" : null,
    "nextcall" : null,
    "priority" : null,
    "user_id" : null,
    "user_name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/exportdata/{param},/ir_crons/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_crons/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {

    }
  }).use(ElementPlus).mount('#app')
</script>