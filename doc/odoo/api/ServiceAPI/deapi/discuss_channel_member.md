# 频道成员(discuss_channel_member) :id=discuss_channel_member
## 创建频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channel_members" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



##### 请求示例： {docsify-ignore}
```json
{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channel_members/{key}" type="info" :closable="false" ></el-alert>
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
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channel_members/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channel_members/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



##### 请求示例： {docsify-ignore}
```json
{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查频道成员主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channel_members/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



##### 请求示例： {docsify-ignore}
```json
{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取频道成员草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channel_members/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



##### 请求示例： {docsify-ignore}
```json
{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channel_members/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



##### 请求示例： {docsify-ignore}
```json
{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "channel_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "custom_channel_name" : null,
  "custom_notifications" : null,
  "display_name" : null,
  "fetched_message_id" : null,
  "fold_state" : null,
  "guest_id" : null,
  "guest_name" : null,
  "id" : null,
  "is_pinned" : null,
  "is_self" : null,
  "last_interest_dt" : null,
  "last_seen_dt" : null,
  "message_unread_counter" : null,
  "mute_until_dt" : null,
  "new_message_separator" : null,
  "partner_id" : null,
  "partner_name" : null,
  "rtc_inviting_session_id" : null,
  "seen_message_id" : null,
  "unpin_dt" : null,
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
<el-alert title="/discuss_channel_members/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_channel_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">n_custom_notifications_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">n_fetched_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">n_fold_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">n_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_guest_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_guest_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_rtc_inviting_session_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">n_seen_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_channel_id_eq" : null,
  "n_custom_notifications_eq" : null,
  "n_fetched_message_id_eq" : null,
  "n_fold_state_eq" : null,
  "n_guest_id_eq" : null,
  "n_guest_name_eq" : null,
  "n_guest_name_like" : null,
  "n_id_eq" : null,
  "n_partner_id_eq" : null,
  "n_partner_name_eq" : null,
  "n_partner_name_like" : null,
  "n_rtc_inviting_session_id_eq" : null,
  "n_seen_message_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "channel_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "custom_channel_name" : null,
    "custom_notifications" : null,
    "display_name" : null,
    "fetched_message_id" : null,
    "fold_state" : null,
    "guest_id" : null,
    "guest_name" : null,
    "id" : null,
    "is_pinned" : null,
    "is_self" : null,
    "last_interest_dt" : null,
    "last_seen_dt" : null,
    "message_unread_counter" : null,
    "mute_until_dt" : null,
    "new_message_separator" : null,
    "partner_id" : null,
    "partner_name" : null,
    "rtc_inviting_session_id" : null,
    "seen_message_id" : null,
    "unpin_dt" : null,
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
<el-alert title="/discuss_channel_members/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channel_members/exportdata/{param},/discuss_channel_members/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channel_members/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channel_members/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channel_members/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channel_members/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/discuss_channel_members/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




## 根据讨论频道创建频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



## 根据讨论频道获取频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|
|key|String|标识|




## 根据讨论频道删除频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|
|key|String|标识|




## 根据讨论频道更新频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



## 根据讨论频道检查频道成员主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



## 根据讨论频道获取频道成员草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



## 根据讨论频道保存频道成员

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">channel_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">custom_channel_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自定义频道名称|
|<el-row justify="space-between"><el-col :span="20">custom_notifications</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fetched_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">fold_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">guest_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_pinned</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否置顶|
|<el-row justify="space-between"><el-col :span="20">is_self</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自我|
|<el-row justify="space-between"><el-col :span="20">last_interest_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|持续的兴趣|
|<el-row justify="space-between"><el-col :span="20">last_seen_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上次查看日期|
|<el-row justify="space-between"><el-col :span="20">message_unread_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未读消息数|
|<el-row justify="space-between"><el-col :span="20">mute_until_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|静音通知，直到|
|<el-row justify="space-between"><el-col :span="20">new_message_separator</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|新信息分割符|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">rtc_inviting_session_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">seen_message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|
|<el-row justify="space-between"><el-col :span="20">unpin_dt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|取消置顶日期|



## 根据讨论频道DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|讨论频道主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_channel_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|频道|
|<el-row justify="space-between"><el-col :span="20">n_custom_notifications_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定制通知|
|<el-row justify="space-between"><el-col :span="20">n_fetched_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最后一次提取|
|<el-row justify="space-between"><el-col :span="20">n_fold_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|对话收拢状态|
|<el-row justify="space-between"><el-col :span="20">n_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_guest_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_guest_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_rtc_inviting_session_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|振铃会话|
|<el-row justify="space-between"><el-col :span="20">n_seen_message_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近一次查阅|




## 根据讨论频道下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 根据讨论频道数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/exportdata/{param},/discuss_channels/{pkey}/discuss_channel_members/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 根据讨论频道数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据讨论频道数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据讨论频道自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 根据讨论频道数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 根据讨论频道报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/discuss_channels/{pkey}/discuss_channel_members/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

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