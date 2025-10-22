# EMail别名(mail_alias) :id=mail_alias
## 创建EMail别名

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_aliases" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">alias_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级模型|
|<el-row justify="space-between"><el-col :span="20">alias_bounced_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义退回消息|
|<el-row justify="space-between"><el-col :span="20">alias_contact</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|别名授权于|
|<el-row justify="space-between"><el-col :span="20">alias_defaults</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|默认值|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">alias_domain_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域名称|
|<el-row justify="space-between"><el-col :span="20">alias_force_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|记录线索ID|
|<el-row justify="space-between"><el-col :span="20">alias_full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名电子邮件|
|<el-row justify="space-between"><el-col :span="20">alias_incoming_local</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收件时检测本地的别名域|
|<el-row justify="space-between"><el-col :span="20">alias_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上级记录ID|
|<el-row justify="space-between"><el-col :span="20">alias_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名状态|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取EMail别名

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_aliases/{key}" type="info" :closable="false" ></el-alert>
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
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除EMail别名

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_aliases/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新EMail别名

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_aliases/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">alias_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级模型|
|<el-row justify="space-between"><el-col :span="20">alias_bounced_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义退回消息|
|<el-row justify="space-between"><el-col :span="20">alias_contact</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|别名授权于|
|<el-row justify="space-between"><el-col :span="20">alias_defaults</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|默认值|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">alias_domain_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域名称|
|<el-row justify="space-between"><el-col :span="20">alias_force_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|记录线索ID|
|<el-row justify="space-between"><el-col :span="20">alias_full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名电子邮件|
|<el-row justify="space-between"><el-col :span="20">alias_incoming_local</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收件时检测本地的别名域|
|<el-row justify="space-between"><el-col :span="20">alias_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上级记录ID|
|<el-row justify="space-between"><el-col :span="20">alias_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名状态|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查EMail别名主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_aliases/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">alias_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级模型|
|<el-row justify="space-between"><el-col :span="20">alias_bounced_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义退回消息|
|<el-row justify="space-between"><el-col :span="20">alias_contact</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|别名授权于|
|<el-row justify="space-between"><el-col :span="20">alias_defaults</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|默认值|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">alias_domain_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域名称|
|<el-row justify="space-between"><el-col :span="20">alias_force_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|记录线索ID|
|<el-row justify="space-between"><el-col :span="20">alias_full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名电子邮件|
|<el-row justify="space-between"><el-col :span="20">alias_incoming_local</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收件时检测本地的别名域|
|<el-row justify="space-between"><el-col :span="20">alias_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上级记录ID|
|<el-row justify="space-between"><el-col :span="20">alias_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名状态|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取EMail别名草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_aliases/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">alias_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级模型|
|<el-row justify="space-between"><el-col :span="20">alias_bounced_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义退回消息|
|<el-row justify="space-between"><el-col :span="20">alias_contact</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|别名授权于|
|<el-row justify="space-between"><el-col :span="20">alias_defaults</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|默认值|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">alias_domain_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域名称|
|<el-row justify="space-between"><el-col :span="20">alias_force_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|记录线索ID|
|<el-row justify="space-between"><el-col :span="20">alias_full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名电子邮件|
|<el-row justify="space-between"><el-col :span="20">alias_incoming_local</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收件时检测本地的别名域|
|<el-row justify="space-between"><el-col :span="20">alias_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上级记录ID|
|<el-row justify="space-between"><el-col :span="20">alias_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名状态|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存EMail别名

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_aliases/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">alias_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模型别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_model_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级模型|
|<el-row justify="space-between"><el-col :span="20">alias_bounced_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义退回消息|
|<el-row justify="space-between"><el-col :span="20">alias_contact</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|别名授权于|
|<el-row justify="space-between"><el-col :span="20">alias_defaults</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|默认值|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">alias_domain_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域名称|
|<el-row justify="space-between"><el-col :span="20">alias_force_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|记录线索ID|
|<el-row justify="space-between"><el-col :span="20">alias_full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名电子邮件|
|<el-row justify="space-between"><el-col :span="20">alias_incoming_local</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收件时检测本地的别名域|
|<el-row justify="space-between"><el-col :span="20">alias_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名|
|<el-row justify="space-between"><el-col :span="20">alias_parent_thread_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上级记录ID|
|<el-row justify="space-between"><el-col :span="20">alias_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名状态|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "alias_model_id" : null,
  "alias_parent_model_id" : null,
  "alias_bounced_content" : null,
  "alias_contact" : null,
  "alias_defaults" : null,
  "alias_domain_id" : null,
  "alias_domain_name" : null,
  "alias_force_thread_id" : null,
  "alias_full_name" : null,
  "alias_incoming_local" : null,
  "alias_name" : null,
  "alias_parent_thread_id" : null,
  "alias_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "id" : null,
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
<el-alert title="/mail_aliases/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_alias_contact_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名授权于|
|<el-row justify="space-between"><el-col :span="20">n_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_alias_domain_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域名称|
|<el-row justify="space-between"><el-col :span="20">n_alias_domain_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域名称|
|<el-row justify="space-between"><el-col :span="20">n_alias_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名状态|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_alias_contact_eq" : null,
  "n_alias_domain_id_eq" : null,
  "n_alias_domain_name_eq" : null,
  "n_alias_domain_name_like" : null,
  "n_alias_status_eq" : null,
  "n_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "alias_model_id" : null,
    "alias_parent_model_id" : null,
    "alias_bounced_content" : null,
    "alias_contact" : null,
    "alias_defaults" : null,
    "alias_domain_id" : null,
    "alias_domain_name" : null,
    "alias_force_thread_id" : null,
    "alias_full_name" : null,
    "alias_incoming_local" : null,
    "alias_name" : null,
    "alias_parent_thread_id" : null,
    "alias_status" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "id" : null,
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
<el-alert title="/mail_aliases/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_aliases/exportdata/{param},/mail_aliases/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_aliases/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_aliases/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_aliases/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_aliases/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_aliases/report" type="info" :closable="false" ></el-alert>
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