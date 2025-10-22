# 消息通知(mail_notification) :id=mail_notification
## 创建消息通知

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">message_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息内容|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_read</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已读|
|<el-row justify="space-between"><el-col :span="20">mail_mail_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_record_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">notification_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知类型|
|<el-row justify="space-between"><el-col :span="20">read_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|读取日期|
|<el-row justify="space-between"><el-col :span="20">res_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人|
|<el-row justify="space-between"><el-col :span="20">res_partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人名称|
|<el-row justify="space-between"><el-col :span="20">sms_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信 ID|
|<el-row justify="space-between"><el-col :span="20">sms_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信息号码|



##### 请求示例： {docsify-ignore}
```json
{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}

```

## 获取消息通知

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/{key}" type="info" :closable="false" ></el-alert>
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
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}

```

## 删除消息通知

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新消息通知

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">message_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息内容|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_read</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已读|
|<el-row justify="space-between"><el-col :span="20">mail_mail_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_record_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">notification_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知类型|
|<el-row justify="space-between"><el-col :span="20">read_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|读取日期|
|<el-row justify="space-between"><el-col :span="20">res_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人|
|<el-row justify="space-between"><el-col :span="20">res_partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人名称|
|<el-row justify="space-between"><el-col :span="20">sms_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信 ID|
|<el-row justify="space-between"><el-col :span="20">sms_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信息号码|



##### 请求示例： {docsify-ignore}
```json
{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}

```

## 检查消息通知主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">message_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息内容|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_read</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已读|
|<el-row justify="space-between"><el-col :span="20">mail_mail_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_record_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">notification_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知类型|
|<el-row justify="space-between"><el-col :span="20">read_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|读取日期|
|<el-row justify="space-between"><el-col :span="20">res_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人|
|<el-row justify="space-between"><el-col :span="20">res_partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人名称|
|<el-row justify="space-between"><el-col :span="20">sms_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信 ID|
|<el-row justify="space-between"><el-col :span="20">sms_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信息号码|



##### 请求示例： {docsify-ignore}
```json
{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取消息通知草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">message_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息内容|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_read</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已读|
|<el-row justify="space-between"><el-col :span="20">mail_mail_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_record_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">notification_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知类型|
|<el-row justify="space-between"><el-col :span="20">read_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|读取日期|
|<el-row justify="space-between"><el-col :span="20">res_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人|
|<el-row justify="space-between"><el-col :span="20">res_partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人名称|
|<el-row justify="space-between"><el-col :span="20">sms_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信 ID|
|<el-row justify="space-between"><el-col :span="20">sms_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信息号码|



##### 请求示例： {docsify-ignore}
```json
{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}

```

## 保存消息通知

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">message_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息内容|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_read</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已读|
|<el-row justify="space-between"><el-col :span="20">mail_mail_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_record_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">notification_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知类型|
|<el-row justify="space-between"><el-col :span="20">read_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|读取日期|
|<el-row justify="space-between"><el-col :span="20">res_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人|
|<el-row justify="space-between"><el-col :span="20">res_partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人名称|
|<el-row justify="space-between"><el-col :span="20">sms_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信 ID|
|<el-row justify="space-between"><el-col :span="20">sms_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信息号码|



##### 请求示例： {docsify-ignore}
```json
{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "message_content" : null,
  "author_id" : null,
  "display_name" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "id" : null,
  "is_read" : null,
  "mail_mail_id" : null,
  "mail_message_id" : null,
  "mail_message_record_name" : null,
  "notification_status" : null,
  "notification_type" : null,
  "read_date" : null,
  "res_partner_id" : null,
  "res_partner_name" : null,
  "sms_id_int" : null,
  "sms_number" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_failure_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_mail_mail_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件|
|<el-row justify="space-between"><el-col :span="20">n_mail_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">n_mail_message_record_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">n_mail_message_record_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">n_notification_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_notification_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通知类型|
|<el-row justify="space-between"><el-col :span="20">n_res_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人|
|<el-row justify="space-between"><el-col :span="20">n_res_partner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人名称|
|<el-row justify="space-between"><el-col :span="20">n_res_partner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|收件人名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_author_id_eq" : null,
  "n_failure_type_eq" : null,
  "n_id_eq" : null,
  "n_mail_mail_id_eq" : null,
  "n_mail_message_id_eq" : null,
  "n_mail_message_record_name_eq" : null,
  "n_mail_message_record_name_like" : null,
  "n_notification_status_eq" : null,
  "n_notification_type_eq" : null,
  "n_res_partner_id_eq" : null,
  "n_res_partner_name_eq" : null,
  "n_res_partner_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "message_content" : null,
    "author_id" : null,
    "display_name" : null,
    "failure_reason" : null,
    "failure_type" : null,
    "id" : null,
    "is_read" : null,
    "mail_mail_id" : null,
    "mail_message_id" : null,
    "mail_message_record_name" : null,
    "notification_status" : null,
    "notification_type" : null,
    "read_date" : null,
    "res_partner_id" : null,
    "res_partner_name" : null,
    "sms_id_int" : null,
    "sms_number" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_notifications/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_notifications/exportdata/{param},/mail_notifications/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_notifications/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_notifications/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_notifications/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_notifications/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_notifications/report" type="info" :closable="false" ></el-alert>
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