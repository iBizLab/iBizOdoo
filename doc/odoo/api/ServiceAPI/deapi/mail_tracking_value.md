# 邮件跟踪值(mail_tracking_value) :id=mail_tracking_value
## 创建邮件跟踪值

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_tracking_values" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性标识|
|<el-row justify="space-between"><el-col :span="20">field_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性信息|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关模型|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">new_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新字符值|
|<el-row justify="space-between"><el-col :span="20">new_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|新日期时间值|
|<el-row justify="space-between"><el-col :span="20">new_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|新浮点值|
|<el-row justify="space-between"><el-col :span="20">new_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新整数值|
|<el-row justify="space-between"><el-col :span="20">new_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新文本值|
|<el-row justify="space-between"><el-col :span="20">old_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧字符值|
|<el-row justify="space-between"><el-col :span="20">old_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|旧日期时间值|
|<el-row justify="space-between"><el-col :span="20">old_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|旧浮点值|
|<el-row justify="space-between"><el-col :span="20">old_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|旧整数值|
|<el-row justify="space-between"><el-col :span="20">old_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧文本值|



##### 请求示例： {docsify-ignore}
```json
{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取邮件跟踪值

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_tracking_values/{key}" type="info" :closable="false" ></el-alert>
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
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除邮件跟踪值

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_tracking_values/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新邮件跟踪值

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_tracking_values/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性标识|
|<el-row justify="space-between"><el-col :span="20">field_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性信息|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关模型|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">new_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新字符值|
|<el-row justify="space-between"><el-col :span="20">new_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|新日期时间值|
|<el-row justify="space-between"><el-col :span="20">new_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|新浮点值|
|<el-row justify="space-between"><el-col :span="20">new_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新整数值|
|<el-row justify="space-between"><el-col :span="20">new_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新文本值|
|<el-row justify="space-between"><el-col :span="20">old_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧字符值|
|<el-row justify="space-between"><el-col :span="20">old_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|旧日期时间值|
|<el-row justify="space-between"><el-col :span="20">old_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|旧浮点值|
|<el-row justify="space-between"><el-col :span="20">old_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|旧整数值|
|<el-row justify="space-between"><el-col :span="20">old_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧文本值|



##### 请求示例： {docsify-ignore}
```json
{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查邮件跟踪值主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_tracking_values/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性标识|
|<el-row justify="space-between"><el-col :span="20">field_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性信息|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关模型|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">new_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新字符值|
|<el-row justify="space-between"><el-col :span="20">new_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|新日期时间值|
|<el-row justify="space-between"><el-col :span="20">new_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|新浮点值|
|<el-row justify="space-between"><el-col :span="20">new_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新整数值|
|<el-row justify="space-between"><el-col :span="20">new_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新文本值|
|<el-row justify="space-between"><el-col :span="20">old_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧字符值|
|<el-row justify="space-between"><el-col :span="20">old_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|旧日期时间值|
|<el-row justify="space-between"><el-col :span="20">old_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|旧浮点值|
|<el-row justify="space-between"><el-col :span="20">old_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|旧整数值|
|<el-row justify="space-between"><el-col :span="20">old_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧文本值|



##### 请求示例： {docsify-ignore}
```json
{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取邮件跟踪值草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_tracking_values/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性标识|
|<el-row justify="space-between"><el-col :span="20">field_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性信息|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关模型|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">new_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新字符值|
|<el-row justify="space-between"><el-col :span="20">new_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|新日期时间值|
|<el-row justify="space-between"><el-col :span="20">new_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|新浮点值|
|<el-row justify="space-between"><el-col :span="20">new_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新整数值|
|<el-row justify="space-between"><el-col :span="20">new_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新文本值|
|<el-row justify="space-between"><el-col :span="20">old_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧字符值|
|<el-row justify="space-between"><el-col :span="20">old_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|旧日期时间值|
|<el-row justify="space-between"><el-col :span="20">old_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|旧浮点值|
|<el-row justify="space-between"><el-col :span="20">old_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|旧整数值|
|<el-row justify="space-between"><el-col :span="20">old_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧文本值|



##### 请求示例： {docsify-ignore}
```json
{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存邮件跟踪值

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_tracking_values/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">field_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性标识|
|<el-row justify="space-between"><el-col :span="20">field_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性信息|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关模型|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">mail_message_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">new_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新字符值|
|<el-row justify="space-between"><el-col :span="20">new_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|新日期时间值|
|<el-row justify="space-between"><el-col :span="20">new_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|新浮点值|
|<el-row justify="space-between"><el-col :span="20">new_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新整数值|
|<el-row justify="space-between"><el-col :span="20">new_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|新文本值|
|<el-row justify="space-between"><el-col :span="20">old_value_char</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧字符值|
|<el-row justify="space-between"><el-col :span="20">old_value_datetime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|旧日期时间值|
|<el-row justify="space-between"><el-col :span="20">old_value_float</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|旧浮点值|
|<el-row justify="space-between"><el-col :span="20">old_value_integer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|旧整数值|
|<el-row justify="space-between"><el-col :span="20">old_value_text</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旧文本值|



##### 请求示例： {docsify-ignore}
```json
{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "field_id" : null,
  "field_info" : null,
  "model" : null,
  "res_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "mail_message_id" : null,
  "new_value_char" : null,
  "new_value_datetime" : null,
  "new_value_float" : null,
  "new_value_integer" : null,
  "new_value_text" : null,
  "old_value_char" : null,
  "old_value_datetime" : null,
  "old_value_float" : null,
  "old_value_integer" : null,
  "old_value_text" : null,
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
<el-alert title="/mail_tracking_values/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_currency_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">n_field_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|属性标识|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_mail_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_currency_id_eq" : null,
  "n_field_id_eq" : null,
  "n_id_eq" : null,
  "n_mail_message_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "field_id" : null,
    "field_info" : null,
    "model" : null,
    "res_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "currency_id" : null,
    "display_name" : null,
    "id" : null,
    "mail_message_id" : null,
    "new_value_char" : null,
    "new_value_datetime" : null,
    "new_value_float" : null,
    "new_value_integer" : null,
    "new_value_text" : null,
    "old_value_char" : null,
    "old_value_datetime" : null,
    "old_value_float" : null,
    "old_value_integer" : null,
    "old_value_text" : null,
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
<el-alert title="/mail_tracking_values/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_tracking_values/exportdata/{param},/mail_tracking_values/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_tracking_values/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_tracking_values/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_tracking_values/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_tracking_values/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_tracking_values/report" type="info" :closable="false" ></el-alert>
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