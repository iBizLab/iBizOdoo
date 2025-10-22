# 收件服务器(fetchmail_server) :id=fetchmail_server
## 创建收件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">object_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建新记录|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">attach</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保存附件|
|<el-row justify="space-between"><el-col :span="20">configuration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配置|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后收取日期|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_ssl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SSL/TLS|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">original</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保留原件|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|端口|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|服务器优先级|
|<el-row justify="space-between"><el-col :span="20">script</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|脚本|
|<el-row justify="space-between"><el-col :span="20">server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器名称|
|<el-row justify="space-between"><el-col :span="20">server_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取收件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/{key}" type="info" :closable="false" ></el-alert>
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
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除收件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新收件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">object_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建新记录|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">attach</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保存附件|
|<el-row justify="space-between"><el-col :span="20">configuration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配置|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后收取日期|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_ssl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SSL/TLS|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">original</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保留原件|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|端口|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|服务器优先级|
|<el-row justify="space-between"><el-col :span="20">script</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|脚本|
|<el-row justify="space-between"><el-col :span="20">server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器名称|
|<el-row justify="space-between"><el-col :span="20">server_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查收件服务器主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">object_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建新记录|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">attach</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保存附件|
|<el-row justify="space-between"><el-col :span="20">configuration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配置|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后收取日期|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_ssl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SSL/TLS|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">original</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保留原件|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|端口|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|服务器优先级|
|<el-row justify="space-between"><el-col :span="20">script</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|脚本|
|<el-row justify="space-between"><el-col :span="20">server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器名称|
|<el-row justify="space-between"><el-col :span="20">server_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## fetch_mail

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/fetch_mail" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">object_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建新记录|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">attach</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保存附件|
|<el-row justify="space-between"><el-col :span="20">configuration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配置|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后收取日期|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_ssl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SSL/TLS|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">original</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保留原件|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|端口|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|服务器优先级|
|<el-row justify="space-between"><el-col :span="20">script</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|脚本|
|<el-row justify="space-between"><el-col :span="20">server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器名称|
|<el-row justify="space-between"><el-col :span="20">server_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取收件服务器草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">object_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建新记录|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">attach</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保存附件|
|<el-row justify="space-between"><el-col :span="20">configuration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配置|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后收取日期|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_ssl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SSL/TLS|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">original</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保留原件|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|端口|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|服务器优先级|
|<el-row justify="space-between"><el-col :span="20">script</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|脚本|
|<el-row justify="space-between"><el-col :span="20">server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器名称|
|<el-row justify="space-between"><el-col :span="20">server_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存收件服务器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">object_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建新记录|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">attach</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保存附件|
|<el-row justify="space-between"><el-col :span="20">configuration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配置|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后收取日期|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_ssl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SSL/TLS|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">original</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保留原件|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|端口|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|服务器优先级|
|<el-row justify="space-between"><el-col :span="20">script</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|脚本|
|<el-row justify="space-between"><el-col :span="20">server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器名称|
|<el-row justify="space-between"><el-col :span="20">server_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 重置确认

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/fetchmail_servers/{key}/set_draft" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">object_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|创建新记录|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">attach</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保存附件|
|<el-row justify="space-between"><el-col :span="20">configuration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配置|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后收取日期|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访问令牌|
|<el-row justify="space-between"><el-col :span="20">google_gmail_access_token_expiration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|访问令牌到期时间戳|
|<el-row justify="space-between"><el-col :span="20">google_gmail_authorization_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权码|
|<el-row justify="space-between"><el-col :span="20">google_gmail_refresh_token</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新 Token|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_ssl</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|SSL/TLS|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">original</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保留原件|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">port</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|端口|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|服务器优先级|
|<el-row justify="space-between"><el-col :span="20">script</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|脚本|
|<el-row justify="space-between"><el-col :span="20">server</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器名称|
|<el-row justify="space-between"><el-col :span="20">server_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">user</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户名|



##### 请求示例： {docsify-ignore}
```json
{
  "object_id" : null,
  "active" : null,
  "attach" : null,
  "configuration" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "google_gmail_access_token" : null,
  "google_gmail_access_token_expiration" : null,
  "google_gmail_authorization_code" : null,
  "google_gmail_refresh_token" : null,
  "id" : null,
  "is_ssl" : null,
  "name" : null,
  "original" : null,
  "password" : null,
  "port" : null,
  "priority" : null,
  "script" : null,
  "server" : null,
  "server_type" : null,
  "state" : null,
  "user" : null,
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
<el-alert title="/fetchmail_servers/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_server_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|服务器类型|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_server_type_eq" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "object_id" : null,
    "active" : null,
    "attach" : null,
    "configuration" : null,
    "create_date" : null,
    "create_uid" : null,
    "date" : null,
    "google_gmail_access_token" : null,
    "google_gmail_access_token_expiration" : null,
    "google_gmail_authorization_code" : null,
    "google_gmail_refresh_token" : null,
    "id" : null,
    "is_ssl" : null,
    "name" : null,
    "original" : null,
    "password" : null,
    "port" : null,
    "priority" : null,
    "script" : null,
    "server" : null,
    "server_type" : null,
    "state" : null,
    "user" : null,
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
<el-alert title="/fetchmail_servers/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/fetchmail_servers/exportdata/{param},/fetchmail_servers/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/fetchmail_servers/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/fetchmail_servers/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/fetchmail_servers/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/fetchmail_servers/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/fetchmail_servers/report" type="info" :closable="false" ></el-alert>
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