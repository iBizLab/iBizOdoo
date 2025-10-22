# 邮件服务器(ir_mail_server) :id=ir_mail_server
## 创建邮件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">from_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|FROM 过滤|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">max_email_size</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最大电子邮件大小|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">smtp_authentication</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|验证|
|<el-row justify="space-between"><el-col :span="20">smtp_debug</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调试|
|<el-row justify="space-between"><el-col :span="20">smtp_encryption</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接加密|
|<el-row justify="space-between"><el-col :span="20">smtp_host</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SMTP服务器|
|<el-row justify="space-between"><el-col :span="20">smtp_pass</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">smtp_port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SMTP端口|
|<el-row justify="space-between"><el-col :span="20">smtp_user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取邮件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers/{key}" type="info" :closable="false" ></el-alert>
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
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除邮件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新邮件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">from_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|FROM 过滤|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">max_email_size</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最大电子邮件大小|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">smtp_authentication</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|验证|
|<el-row justify="space-between"><el-col :span="20">smtp_debug</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调试|
|<el-row justify="space-between"><el-col :span="20">smtp_encryption</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接加密|
|<el-row justify="space-between"><el-col :span="20">smtp_host</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SMTP服务器|
|<el-row justify="space-between"><el-col :span="20">smtp_pass</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">smtp_port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SMTP端口|
|<el-row justify="space-between"><el-col :span="20">smtp_user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查邮件服务器主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">from_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|FROM 过滤|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">max_email_size</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最大电子邮件大小|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">smtp_authentication</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|验证|
|<el-row justify="space-between"><el-col :span="20">smtp_debug</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调试|
|<el-row justify="space-between"><el-col :span="20">smtp_encryption</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接加密|
|<el-row justify="space-between"><el-col :span="20">smtp_host</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SMTP服务器|
|<el-row justify="space-between"><el-col :span="20">smtp_pass</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">smtp_port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SMTP端口|
|<el-row justify="space-between"><el-col :span="20">smtp_user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取邮件服务器草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">from_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|FROM 过滤|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">max_email_size</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最大电子邮件大小|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">smtp_authentication</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|验证|
|<el-row justify="space-between"><el-col :span="20">smtp_debug</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调试|
|<el-row justify="space-between"><el-col :span="20">smtp_encryption</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接加密|
|<el-row justify="space-between"><el-col :span="20">smtp_host</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SMTP服务器|
|<el-row justify="space-between"><el-col :span="20">smtp_pass</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">smtp_port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SMTP端口|
|<el-row justify="space-between"><el-col :span="20">smtp_user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 移动位置

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers/{key}/move_order" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">from_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|FROM 过滤|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">max_email_size</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最大电子邮件大小|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">smtp_authentication</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|验证|
|<el-row justify="space-between"><el-col :span="20">smtp_debug</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调试|
|<el-row justify="space-between"><el-col :span="20">smtp_encryption</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接加密|
|<el-row justify="space-between"><el-col :span="20">smtp_host</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SMTP服务器|
|<el-row justify="space-between"><el-col :span="20">smtp_pass</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">smtp_port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SMTP端口|
|<el-row justify="space-between"><el-col :span="20">smtp_user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存邮件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/ir_mail_servers/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">from_filter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|FROM 过滤|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">max_email_size</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最大电子邮件大小|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|优先级|
|<el-row justify="space-between"><el-col :span="20">smtp_authentication</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|验证|
|<el-row justify="space-between"><el-col :span="20">smtp_debug</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调试|
|<el-row justify="space-between"><el-col :span="20">smtp_encryption</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接加密|
|<el-row justify="space-between"><el-col :span="20">smtp_host</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|SMTP服务器|
|<el-row justify="space-between"><el-col :span="20">smtp_pass</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">smtp_port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SMTP端口|
|<el-row justify="space-between"><el-col :span="20">smtp_user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "from_filter" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "max_email_size" : null,
  "name" : null,
  "sequence" : null,
  "smtp_authentication" : null,
  "smtp_debug" : null,
  "smtp_encryption" : null,
  "smtp_host" : null,
  "smtp_pass" : null,
  "smtp_port" : null,
  "smtp_user" : null,
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
<el-alert title="/ir_mail_servers/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_smtp_authentication_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|验证|
|<el-row justify="space-between"><el-col :span="20">n_smtp_encryption_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|连接加密|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_smtp_authentication_eq" : null,
  "n_smtp_encryption_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "active" : null,
    "create_date" : null,
    "create_uid" : null,
    "from_filter" : null,
    "google_gmail_access_token" : null,
    "google_gmail_access_token_expiration" : null,
    "google_gmail_authorization_code" : null,
    "google_gmail_refresh_token" : null,
    "id" : null,
    "max_email_size" : null,
    "name" : null,
    "sequence" : null,
    "smtp_authentication" : null,
    "smtp_debug" : null,
    "smtp_encryption" : null,
    "smtp_host" : null,
    "smtp_pass" : null,
    "smtp_port" : null,
    "smtp_user" : null,
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
<el-alert title="/ir_mail_servers/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_mail_servers/exportdata/{param},/ir_mail_servers/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_mail_servers/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_mail_servers/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_mail_servers/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_mail_servers/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/ir_mail_servers/report" type="info" :closable="false" ></el-alert>
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