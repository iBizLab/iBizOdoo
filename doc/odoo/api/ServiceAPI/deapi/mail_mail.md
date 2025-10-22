# 发出邮件(mail_mail) :id=mail_mail
## 创建发出邮件

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_mails" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|富文本内容|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文本内容|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">headers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求头|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_notification</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通知电子邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件消息 ID 整型|
|<el-row justify="space-between"><el-col :span="20">references</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">restricted_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受限制的附件|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|安排的发送日期|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取发出邮件

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_mails/{key}" type="info" :closable="false" ></el-alert>
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
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除发出邮件

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_mails/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新发出邮件

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_mails/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|富文本内容|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文本内容|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">headers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求头|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_notification</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通知电子邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件消息 ID 整型|
|<el-row justify="space-between"><el-col :span="20">references</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">restricted_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受限制的附件|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|安排的发送日期|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查发出邮件主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_mails/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|富文本内容|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文本内容|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">headers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求头|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_notification</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通知电子邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件消息 ID 整型|
|<el-row justify="space-between"><el-col :span="20">references</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">restricted_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受限制的附件|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|安排的发送日期|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取发出邮件草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_mails/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|富文本内容|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文本内容|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">headers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求头|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_notification</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通知电子邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件消息 ID 整型|
|<el-row justify="space-between"><el-col :span="20">references</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">restricted_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受限制的附件|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|安排的发送日期|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存发出邮件

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_mails/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|富文本内容|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文本内容|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至|
|<el-row justify="space-between"><el-col :span="20">failure_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败原因|
|<el-row justify="space-between"><el-col :span="20">failure_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">headers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求头|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_notification</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通知电子邮件|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">mail_message_id_int</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件消息 ID 整型|
|<el-row justify="space-between"><el-col :span="20">references</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">restricted_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受限制的附件|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|安排的发送日期|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "auto_delete" : null,
  "body_content" : null,
  "body_html" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_to" : null,
  "failure_reason" : null,
  "failure_type" : null,
  "headers" : null,
  "id" : null,
  "is_notification" : null,
  "mail_message_id" : null,
  "mail_message_id_int" : null,
  "references" : null,
  "restricted_attachment_count" : null,
  "scheduled_date" : null,
  "state" : null,
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
<el-alert title="/mail_mails/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_failure_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|失败类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_mail_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_failure_type_eq" : null,
  "n_id_eq" : null,
  "n_mail_message_id_eq" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "auto_delete" : null,
    "body_content" : null,
    "body_html" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "email_cc" : null,
    "email_to" : null,
    "failure_reason" : null,
    "failure_type" : null,
    "headers" : null,
    "id" : null,
    "is_notification" : null,
    "mail_message_id" : null,
    "mail_message_id_int" : null,
    "references" : null,
    "restricted_attachment_count" : null,
    "scheduled_date" : null,
    "state" : null,
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
<el-alert title="/mail_mails/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_mails/exportdata/{param},/mail_mails/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_mails/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_mails/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_mails/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_mails/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_mails/report" type="info" :closable="false" ></el-alert>
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