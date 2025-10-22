# 服务器动作(ir_actions_server) :id=ir_actions_server
## 创建服务器动作

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_actions_servers" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">binding_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绑定类型|
|<el-row justify="space-between"><el-col :span="20">binding_view_types</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|绑定视图类型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Python 代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">help</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站中显示的路径|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|动作类型|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">update_m2m_operation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Many2many 业务|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取服务器动作

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_actions_servers/{key}" type="info" :closable="false" ></el-alert>
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
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除服务器动作

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_actions_servers/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新服务器动作

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_actions_servers/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">binding_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绑定类型|
|<el-row justify="space-between"><el-col :span="20">binding_view_types</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|绑定视图类型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Python 代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">help</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站中显示的路径|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|动作类型|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">update_m2m_operation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Many2many 业务|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查服务器动作主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_actions_servers/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">binding_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绑定类型|
|<el-row justify="space-between"><el-col :span="20">binding_view_types</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|绑定视图类型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Python 代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">help</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站中显示的路径|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|动作类型|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">update_m2m_operation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Many2many 业务|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取服务器动作草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_actions_servers/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">binding_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绑定类型|
|<el-row justify="space-between"><el-col :span="20">binding_view_types</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|绑定视图类型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Python 代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">help</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站中显示的路径|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|动作类型|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">update_m2m_operation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Many2many 业务|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存服务器动作

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_actions_servers/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">update_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要更新的字段|
|<el-row justify="space-between"><el-col :span="20">update_related_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新相关模型|
|<el-row justify="space-between"><el-col :span="20">crud_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建记录|
|<el-row justify="space-between"><el-col :span="20">link_field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接字段|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|截止日期至|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline_range_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">activity_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">activity_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_field_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户字段|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">activity_user_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">binding_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绑定类型|
|<el-row justify="space-between"><el-col :span="20">binding_view_types</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|绑定视图类型|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Python 代码|
|<el-row justify="space-between"><el-col :span="20">evaluation_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">help</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|动作描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_post_autofollow</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|订阅收件人|
|<el-row justify="space-between"><el-col :span="20">mail_post_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站中显示的路径|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">sms_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">template_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|动作类型|
|<el-row justify="space-between"><el-col :span="20">update_boolean_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">update_m2m_operation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Many2many 业务|
|<el-row justify="space-between"><el-col :span="20">update_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字段更新路径|
|<el-row justify="space-between"><el-col :span="20">usage</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|用途|
|<el-row justify="space-between"><el-col :span="20">value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值|
|<el-row justify="space-between"><el-col :span="20">webhook_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Webhook URL|



##### 请求示例： {docsify-ignore}
```json
{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "model_id" : null,
  "update_field_id" : null,
  "update_related_model_id" : null,
  "crud_model_id" : null,
  "link_field_id" : null,
  "activity_date_deadline_range" : null,
  "activity_date_deadline_range_type" : null,
  "activity_note" : null,
  "activity_summary" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_field_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "activity_user_type" : null,
  "binding_type" : null,
  "binding_view_types" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "evaluation_type" : null,
  "help" : null,
  "id" : null,
  "mail_post_autofollow" : null,
  "mail_post_method" : null,
  "name" : null,
  "path" : null,
  "sequence" : null,
  "sms_method" : null,
  "state" : null,
  "template_id" : null,
  "template_name" : null,
  "type" : null,
  "update_boolean_value" : null,
  "update_m2m_operation" : null,
  "update_path" : null,
  "usage" : null,
  "value" : null,
  "webhook_url" : null,
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
<el-alert title="/ir_actions_servers/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_date_deadline_range_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|到期类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">n_activity_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">n_activity_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">n_activity_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">n_activity_user_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户类型|
|<el-row justify="space-between"><el-col :span="20">n_binding_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|绑定类型|
|<el-row justify="space-between"><el-col :span="20">n_evaluation_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|值类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_mail_post_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送电子邮件|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_sms_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发送短信为|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_template_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">n_template_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">n_template_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|EMail模板|
|<el-row justify="space-between"><el-col :span="20">n_update_boolean_value_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布尔值|
|<el-row justify="space-between"><el-col :span="20">n_update_m2m_operation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Many2many 业务|
|<el-row justify="space-between"><el-col :span="20">n_usage_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用途|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_date_deadline_range_type_eq" : null,
  "n_activity_type_id_eq" : null,
  "n_activity_type_name_eq" : null,
  "n_activity_type_name_like" : null,
  "n_activity_user_id_eq" : null,
  "n_activity_user_name_eq" : null,
  "n_activity_user_name_like" : null,
  "n_activity_user_type_eq" : null,
  "n_binding_type_eq" : null,
  "n_evaluation_type_eq" : null,
  "n_id_eq" : null,
  "n_mail_post_method_eq" : null,
  "n_name_like" : null,
  "n_sms_method_eq" : null,
  "n_state_eq" : null,
  "n_template_id_eq" : null,
  "n_template_name_eq" : null,
  "n_template_name_like" : null,
  "n_update_boolean_value_eq" : null,
  "n_update_m2m_operation_eq" : null,
  "n_usage_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "model_id" : null,
    "update_field_id" : null,
    "update_related_model_id" : null,
    "crud_model_id" : null,
    "link_field_id" : null,
    "activity_date_deadline_range" : null,
    "activity_date_deadline_range_type" : null,
    "activity_note" : null,
    "activity_summary" : null,
    "activity_type_id" : null,
    "activity_type_name" : null,
    "activity_user_field_name" : null,
    "activity_user_id" : null,
    "activity_user_name" : null,
    "activity_user_type" : null,
    "binding_type" : null,
    "binding_view_types" : null,
    "code" : null,
    "create_date" : null,
    "create_uid" : null,
    "evaluation_type" : null,
    "help" : null,
    "id" : null,
    "mail_post_autofollow" : null,
    "mail_post_method" : null,
    "name" : null,
    "path" : null,
    "sequence" : null,
    "sms_method" : null,
    "state" : null,
    "template_id" : null,
    "template_name" : null,
    "type" : null,
    "update_boolean_value" : null,
    "update_m2m_operation" : null,
    "update_path" : null,
    "usage" : null,
    "value" : null,
    "webhook_url" : null,
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
<el-alert title="/ir_actions_servers/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_actions_servers/exportdata/{param},/ir_actions_servers/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_actions_servers/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_actions_servers/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_actions_servers/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_actions_servers/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_actions_servers/report" type="info" :closable="false" ></el-alert>
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