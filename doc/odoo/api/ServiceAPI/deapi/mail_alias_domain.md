# 电子邮件域名(mail_alias_domain) :id=mail_alias_domain
## 创建电子邮件域名

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_alias_domains" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">bounce_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|弹跳别名|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全部别名|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">default_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认发件人别名|
|<el-row justify="space-between"><el-col :span="20">default_from_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认从|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取电子邮件域名

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_alias_domains/{key}" type="info" :closable="false" ></el-alert>
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
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除电子邮件域名

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_alias_domains/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新电子邮件域名

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_alias_domains/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">bounce_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|弹跳别名|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全部别名|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">default_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认发件人别名|
|<el-row justify="space-between"><el-col :span="20">default_from_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认从|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查电子邮件域名主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_alias_domains/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">bounce_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|弹跳别名|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全部别名|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">default_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认发件人别名|
|<el-row justify="space-between"><el-col :span="20">default_from_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认从|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取电子邮件域名草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_alias_domains/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">bounce_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|弹跳别名|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全部别名|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">default_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认发件人别名|
|<el-row justify="space-between"><el-col :span="20">default_from_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认从|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
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
<el-alert title="/mail_alias_domains/{key}/move_order" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">bounce_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|弹跳别名|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全部别名|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">default_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认发件人别名|
|<el-row justify="space-between"><el-col :span="20">default_from_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认从|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存电子邮件域名

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_alias_domains/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">bounce_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|弹跳别名|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_alias</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全部别名|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">default_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认发件人别名|
|<el-row justify="space-between"><el-col :span="20">default_from_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认从|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "bounce_alias" : null,
  "bounce_email" : null,
  "catchall_alias" : null,
  "catchall_email" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_from" : null,
  "default_from_email" : null,
  "display_name" : null,
  "id" : null,
  "name" : null,
  "sequence" : null,
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
<el-alert title="/mail_alias_domains/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "bounce_alias" : null,
    "bounce_email" : null,
    "catchall_alias" : null,
    "catchall_email" : null,
    "create_date" : null,
    "create_uid" : null,
    "default_from" : null,
    "default_from_email" : null,
    "display_name" : null,
    "id" : null,
    "name" : null,
    "sequence" : null,
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
<el-alert title="/mail_alias_domains/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_alias_domains/exportdata/{param},/mail_alias_domains/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_alias_domains/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_alias_domains/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_alias_domains/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_alias_domains/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_alias_domains/report" type="info" :closable="false" ></el-alert>
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