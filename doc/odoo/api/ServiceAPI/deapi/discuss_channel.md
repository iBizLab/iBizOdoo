# 讨论频道(discuss_channel) :id=discuss_channel
## 创建讨论频道

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取讨论频道

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}" type="info" :closable="false" ></el-alert>
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
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除讨论频道

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新讨论频道

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 退出频道

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}/action_unfollow" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 邀请成员

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}/add_members" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 加入频道

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}/channel_join" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 检查讨论频道主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取讨论频道草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 加入频道

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}/join_channel" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 保存讨论频道

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 设置置顶消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{key}/set_message_pin" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员|
|<el-row justify="space-between"><el-col :span="20">channel_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|频道成员|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">allow_public_upload</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许公开上传|
|<el-row justify="space-between"><el-col :span="20">avatar_cache_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像缓存键|
|<el-row justify="space-between"><el-col :span="20">channel_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">default_display_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">from_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">group_public_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">group_public_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invitation_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邀请URL|
|<el-row justify="space-between"><el-col :span="20">is_editable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">is_member</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是会员|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">member_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|成员计数|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">parent_channel_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">parent_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">sfu_channel_uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 频道 Uuid|
|<el-row justify="space-between"><el-col :span="20">sfu_server_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Sfu 服务器网址|
|<el-row justify="space-between"><el-col :span="20">uuid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|UUID|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "followers" : null,
  "members" : null,
  "channel_members" : null,
  "active" : null,
  "allow_public_upload" : null,
  "avatar_cache_key" : null,
  "channel_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "default_display_mode" : null,
  "description" : null,
  "display_name" : null,
  "from_message_id" : null,
  "group_public_id" : null,
  "group_public_name" : null,
  "has_message" : null,
  "id" : null,
  "invitation_url" : null,
  "is_editable" : null,
  "is_member" : null,
  "last_interest_dt" : null,
  "member_count" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "parent_channel_id" : null,
  "parent_channel_name" : null,
  "sfu_channel_uuid" : null,
  "sfu_server_url" : null,
  "uuid" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 当前用户加入公共频道

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/fetch_cur_user_public" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_channel_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">n_default_display_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">n_from_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">n_group_public_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_channel_type_eq" : null,
  "n_default_display_mode_eq" : null,
  "n_from_message_id_eq" : null,
  "n_group_public_id_eq" : null,
  "n_group_public_name_eq" : null,
  "n_group_public_name_like" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_parent_channel_id_eq" : null,
  "n_parent_channel_name_eq" : null,
  "n_parent_channel_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "followers" : null,
    "members" : null,
    "channel_members" : null,
    "active" : null,
    "allow_public_upload" : null,
    "avatar_cache_key" : null,
    "channel_type" : null,
    "create_date" : null,
    "create_uid" : null,
    "default_display_mode" : null,
    "description" : null,
    "display_name" : null,
    "from_message_id" : null,
    "group_public_id" : null,
    "group_public_name" : null,
    "has_message" : null,
    "id" : null,
    "invitation_url" : null,
    "is_editable" : null,
    "is_member" : null,
    "last_interest_dt" : null,
    "member_count" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "name" : null,
    "parent_channel_id" : null,
    "parent_channel_name" : null,
    "sfu_channel_uuid" : null,
    "sfu_server_url" : null,
    "uuid" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_channel_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">n_default_display_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">n_from_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">n_group_public_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_channel_type_eq" : null,
  "n_default_display_mode_eq" : null,
  "n_from_message_id_eq" : null,
  "n_group_public_id_eq" : null,
  "n_group_public_name_eq" : null,
  "n_group_public_name_like" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_parent_channel_id_eq" : null,
  "n_parent_channel_name_eq" : null,
  "n_parent_channel_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "followers" : null,
    "members" : null,
    "channel_members" : null,
    "active" : null,
    "allow_public_upload" : null,
    "avatar_cache_key" : null,
    "channel_type" : null,
    "create_date" : null,
    "create_uid" : null,
    "default_display_mode" : null,
    "description" : null,
    "display_name" : null,
    "from_message_id" : null,
    "group_public_id" : null,
    "group_public_name" : null,
    "has_message" : null,
    "id" : null,
    "invitation_url" : null,
    "is_editable" : null,
    "is_member" : null,
    "last_interest_dt" : null,
    "member_count" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "name" : null,
    "parent_channel_id" : null,
    "parent_channel_name" : null,
    "sfu_channel_uuid" : null,
    "sfu_server_url" : null,
    "uuid" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 群聊和私人频道查询

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/fetch_group_private" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_channel_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">n_default_display_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">n_from_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">n_group_public_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_channel_type_eq" : null,
  "n_default_display_mode_eq" : null,
  "n_from_message_id_eq" : null,
  "n_group_public_id_eq" : null,
  "n_group_public_name_eq" : null,
  "n_group_public_name_like" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_parent_channel_id_eq" : null,
  "n_parent_channel_name_eq" : null,
  "n_parent_channel_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "followers" : null,
    "members" : null,
    "channel_members" : null,
    "active" : null,
    "allow_public_upload" : null,
    "avatar_cache_key" : null,
    "channel_type" : null,
    "create_date" : null,
    "create_uid" : null,
    "default_display_mode" : null,
    "description" : null,
    "display_name" : null,
    "from_message_id" : null,
    "group_public_id" : null,
    "group_public_name" : null,
    "has_message" : null,
    "id" : null,
    "invitation_url" : null,
    "is_editable" : null,
    "is_member" : null,
    "last_interest_dt" : null,
    "member_count" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "name" : null,
    "parent_channel_id" : null,
    "parent_channel_name" : null,
    "sfu_channel_uuid" : null,
    "sfu_server_url" : null,
    "uuid" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 公共频道查询

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/fetch_public" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_channel_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|频道类型|
|<el-row justify="space-between"><el-col :span="20">n_default_display_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认显示模式|
|<el-row justify="space-between"><el-col :span="20">n_from_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自消息|
|<el-row justify="space-between"><el-col :span="20">n_group_public_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_group_public_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|授权群组|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_channel_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父频道名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_channel_type_eq" : null,
  "n_default_display_mode_eq" : null,
  "n_from_message_id_eq" : null,
  "n_group_public_id_eq" : null,
  "n_group_public_name_eq" : null,
  "n_group_public_name_like" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_parent_channel_id_eq" : null,
  "n_parent_channel_name_eq" : null,
  "n_parent_channel_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "followers" : null,
    "members" : null,
    "channel_members" : null,
    "active" : null,
    "allow_public_upload" : null,
    "avatar_cache_key" : null,
    "channel_type" : null,
    "create_date" : null,
    "create_uid" : null,
    "default_display_mode" : null,
    "description" : null,
    "display_name" : null,
    "from_message_id" : null,
    "group_public_id" : null,
    "group_public_name" : null,
    "has_message" : null,
    "id" : null,
    "invitation_url" : null,
    "is_editable" : null,
    "is_member" : null,
    "last_interest_dt" : null,
    "member_count" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "name" : null,
    "parent_channel_id" : null,
    "parent_channel_name" : null,
    "sfu_channel_uuid" : null,
    "sfu_server_url" : null,
    "uuid" : null,
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
<el-alert title="/discuss_channels/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channels/exportdata/{param},/discuss_channels/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channels/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channels/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channels/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channels/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channels/report" type="info" :closable="false" ></el-alert>
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