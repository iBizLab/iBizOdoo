# 休假(hr_leave) :id=hr_leave
## 创建休假

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_leaves" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">can_approve</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能批准|
|<el-row justify="space-between"><el-col :span="20">can_cancel</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可以取消|
|<el-row justify="space-between"><el-col :span="20">can_reset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能重置|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duration_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求的（天/小时）|
|<el-row justify="space-between"><el-col :span="20">employee_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工公司|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">first_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|首次审批|
|<el-row justify="space-between"><el-col :span="20">has_mandatory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有义务日|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">holiday_status_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|休假类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_hatched</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已孵化|
|<el-row justify="space-between"><el-col :span="20">is_striked</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|罢工|
|<el-row justify="space-between"><el-col :span="20">last_several_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|全天|
|<el-row justify="space-between"><el-col :span="20">leave_type_increases_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|假期类型 增加持续时间|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_main_attachment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主要附件|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|理由|
|<el-row justify="space-between"><el-col :span="20">number_of_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间（天）|
|<el-row justify="space-between"><el-col :span="20">number_of_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间(小时)|
|<el-row justify="space-between"><el-col :span="20">overtime_deductible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|加班费免赔额|
|<el-row justify="space-between"><el-col :span="20">overtime_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班时间|
|<el-row justify="space-between"><el-col :span="20">private_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假描述|
|<el-row justify="space-between"><el-col :span="20">request_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请假开始日期|
|<el-row justify="space-between"><el-col :span="20">request_date_from_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日期开始|
|<el-row justify="space-between"><el-col :span="20">request_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请求结束日期|
|<el-row justify="space-between"><el-col :span="20">request_hour_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间从|
|<el-row justify="space-between"><el-col :span="20">request_hour_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间到|
|<el-row justify="space-between"><el-col :span="20">request_unit_half</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|半天|
|<el-row justify="space-between"><el-col :span="20">request_unit_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自定义时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源行事历|
|<el-row justify="space-between"><el-col :span="20">second_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第二次审批|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">supported_attachment_ids_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持的附件ID计数|
|<el-row justify="space-between"><el-col :span="20">tz_mismatch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|时区不匹配|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取休假

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_leaves/{key}" type="info" :closable="false" ></el-alert>
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
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除休假

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_leaves/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新休假

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_leaves/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">can_approve</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能批准|
|<el-row justify="space-between"><el-col :span="20">can_cancel</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可以取消|
|<el-row justify="space-between"><el-col :span="20">can_reset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能重置|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duration_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求的（天/小时）|
|<el-row justify="space-between"><el-col :span="20">employee_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工公司|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">first_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|首次审批|
|<el-row justify="space-between"><el-col :span="20">has_mandatory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有义务日|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">holiday_status_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|休假类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_hatched</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已孵化|
|<el-row justify="space-between"><el-col :span="20">is_striked</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|罢工|
|<el-row justify="space-between"><el-col :span="20">last_several_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|全天|
|<el-row justify="space-between"><el-col :span="20">leave_type_increases_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|假期类型 增加持续时间|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_main_attachment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主要附件|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|理由|
|<el-row justify="space-between"><el-col :span="20">number_of_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间（天）|
|<el-row justify="space-between"><el-col :span="20">number_of_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间(小时)|
|<el-row justify="space-between"><el-col :span="20">overtime_deductible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|加班费免赔额|
|<el-row justify="space-between"><el-col :span="20">overtime_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班时间|
|<el-row justify="space-between"><el-col :span="20">private_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假描述|
|<el-row justify="space-between"><el-col :span="20">request_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请假开始日期|
|<el-row justify="space-between"><el-col :span="20">request_date_from_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日期开始|
|<el-row justify="space-between"><el-col :span="20">request_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请求结束日期|
|<el-row justify="space-between"><el-col :span="20">request_hour_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间从|
|<el-row justify="space-between"><el-col :span="20">request_hour_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间到|
|<el-row justify="space-between"><el-col :span="20">request_unit_half</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|半天|
|<el-row justify="space-between"><el-col :span="20">request_unit_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自定义时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源行事历|
|<el-row justify="space-between"><el-col :span="20">second_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第二次审批|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">supported_attachment_ids_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持的附件ID计数|
|<el-row justify="space-between"><el-col :span="20">tz_mismatch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|时区不匹配|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查休假主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_leaves/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">can_approve</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能批准|
|<el-row justify="space-between"><el-col :span="20">can_cancel</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可以取消|
|<el-row justify="space-between"><el-col :span="20">can_reset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能重置|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duration_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求的（天/小时）|
|<el-row justify="space-between"><el-col :span="20">employee_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工公司|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">first_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|首次审批|
|<el-row justify="space-between"><el-col :span="20">has_mandatory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有义务日|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">holiday_status_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|休假类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_hatched</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已孵化|
|<el-row justify="space-between"><el-col :span="20">is_striked</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|罢工|
|<el-row justify="space-between"><el-col :span="20">last_several_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|全天|
|<el-row justify="space-between"><el-col :span="20">leave_type_increases_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|假期类型 增加持续时间|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_main_attachment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主要附件|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|理由|
|<el-row justify="space-between"><el-col :span="20">number_of_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间（天）|
|<el-row justify="space-between"><el-col :span="20">number_of_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间(小时)|
|<el-row justify="space-between"><el-col :span="20">overtime_deductible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|加班费免赔额|
|<el-row justify="space-between"><el-col :span="20">overtime_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班时间|
|<el-row justify="space-between"><el-col :span="20">private_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假描述|
|<el-row justify="space-between"><el-col :span="20">request_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请假开始日期|
|<el-row justify="space-between"><el-col :span="20">request_date_from_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日期开始|
|<el-row justify="space-between"><el-col :span="20">request_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请求结束日期|
|<el-row justify="space-between"><el-col :span="20">request_hour_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间从|
|<el-row justify="space-between"><el-col :span="20">request_hour_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间到|
|<el-row justify="space-between"><el-col :span="20">request_unit_half</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|半天|
|<el-row justify="space-between"><el-col :span="20">request_unit_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自定义时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源行事历|
|<el-row justify="space-between"><el-col :span="20">second_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第二次审批|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">supported_attachment_ids_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持的附件ID计数|
|<el-row justify="space-between"><el-col :span="20">tz_mismatch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|时区不匹配|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取休假草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_leaves/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">can_approve</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能批准|
|<el-row justify="space-between"><el-col :span="20">can_cancel</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可以取消|
|<el-row justify="space-between"><el-col :span="20">can_reset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能重置|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duration_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求的（天/小时）|
|<el-row justify="space-between"><el-col :span="20">employee_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工公司|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">first_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|首次审批|
|<el-row justify="space-between"><el-col :span="20">has_mandatory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有义务日|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">holiday_status_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|休假类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_hatched</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已孵化|
|<el-row justify="space-between"><el-col :span="20">is_striked</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|罢工|
|<el-row justify="space-between"><el-col :span="20">last_several_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|全天|
|<el-row justify="space-between"><el-col :span="20">leave_type_increases_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|假期类型 增加持续时间|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_main_attachment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主要附件|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|理由|
|<el-row justify="space-between"><el-col :span="20">number_of_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间（天）|
|<el-row justify="space-between"><el-col :span="20">number_of_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间(小时)|
|<el-row justify="space-between"><el-col :span="20">overtime_deductible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|加班费免赔额|
|<el-row justify="space-between"><el-col :span="20">overtime_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班时间|
|<el-row justify="space-between"><el-col :span="20">private_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假描述|
|<el-row justify="space-between"><el-col :span="20">request_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请假开始日期|
|<el-row justify="space-between"><el-col :span="20">request_date_from_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日期开始|
|<el-row justify="space-between"><el-col :span="20">request_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请求结束日期|
|<el-row justify="space-between"><el-col :span="20">request_hour_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间从|
|<el-row justify="space-between"><el-col :span="20">request_hour_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间到|
|<el-row justify="space-between"><el-col :span="20">request_unit_half</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|半天|
|<el-row justify="space-between"><el-col :span="20">request_unit_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自定义时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源行事历|
|<el-row justify="space-between"><el-col :span="20">second_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第二次审批|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">supported_attachment_ids_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持的附件ID计数|
|<el-row justify="space-between"><el-col :span="20">tz_mismatch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|时区不匹配|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存休假

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_leaves/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">can_approve</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能批准|
|<el-row justify="space-between"><el-col :span="20">can_cancel</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可以取消|
|<el-row justify="space-between"><el-col :span="20">can_reset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能重置|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duration_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求的（天/小时）|
|<el-row justify="space-between"><el-col :span="20">employee_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工公司|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">first_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|首次审批|
|<el-row justify="space-between"><el-col :span="20">has_mandatory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有义务日|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">holiday_status_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|休假类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_hatched</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已孵化|
|<el-row justify="space-between"><el-col :span="20">is_striked</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|罢工|
|<el-row justify="space-between"><el-col :span="20">last_several_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|全天|
|<el-row justify="space-between"><el-col :span="20">leave_type_increases_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|假期类型 增加持续时间|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_main_attachment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主要附件|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|理由|
|<el-row justify="space-between"><el-col :span="20">number_of_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间（天）|
|<el-row justify="space-between"><el-col :span="20">number_of_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间(小时)|
|<el-row justify="space-between"><el-col :span="20">overtime_deductible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|加班费免赔额|
|<el-row justify="space-between"><el-col :span="20">overtime_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班时间|
|<el-row justify="space-between"><el-col :span="20">private_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假描述|
|<el-row justify="space-between"><el-col :span="20">request_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请假开始日期|
|<el-row justify="space-between"><el-col :span="20">request_date_from_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日期开始|
|<el-row justify="space-between"><el-col :span="20">request_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|请求结束日期|
|<el-row justify="space-between"><el-col :span="20">request_hour_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间从|
|<el-row justify="space-between"><el-col :span="20">request_hour_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时间到|
|<el-row justify="space-between"><el-col :span="20">request_unit_half</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|半天|
|<el-row justify="space-between"><el-col :span="20">request_unit_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自定义时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源行事历|
|<el-row justify="space-between"><el-col :span="20">second_approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第二次审批|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">supported_attachment_ids_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支持的附件ID计数|
|<el-row justify="space-between"><el-col :span="20">tz_mismatch</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|时区不匹配|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "can_approve" : null,
  "can_cancel" : null,
  "can_reset" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "department_id" : null,
  "display_name" : null,
  "duration_display" : null,
  "employee_company_id" : null,
  "employee_id" : null,
  "first_approver_id" : null,
  "has_mandatory_day" : null,
  "has_message" : null,
  "holiday_status_id" : null,
  "id" : null,
  "is_hatched" : null,
  "is_striked" : null,
  "last_several_days" : null,
  "leave_type_increases_duration" : null,
  "manager_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_main_attachment_id" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "notes" : null,
  "number_of_days" : null,
  "number_of_hours" : null,
  "overtime_deductible" : null,
  "overtime_id" : null,
  "private_name" : null,
  "request_date_from" : null,
  "request_date_from_period" : null,
  "request_date_to" : null,
  "request_hour_from" : null,
  "request_hour_to" : null,
  "request_unit_half" : null,
  "request_unit_hours" : null,
  "resource_calendar_id" : null,
  "second_approver_id" : null,
  "state" : null,
  "supported_attachment_ids_count" : null,
  "tz_mismatch" : null,
  "user_id" : null,
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
<el-alert title="/hr_leaves/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_exception_decoration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">n_activity_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_employee_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工公司|
|<el-row justify="space-between"><el-col :span="20">n_employee_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">n_first_approver_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|首次审批|
|<el-row justify="space-between"><el-col :span="20">n_holiday_status_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manager_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_message_main_attachment_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主要附件|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_overtime_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班时间|
|<el-row justify="space-between"><el-col :span="20">n_request_date_from_period_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日期开始|
|<el-row justify="space-between"><el-col :span="20">n_resource_calendar_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源行事历|
|<el-row justify="space-between"><el-col :span="20">n_second_approver_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第二次审批|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_exception_decoration_eq" : null,
  "n_activity_state_eq" : null,
  "n_company_id_eq" : null,
  "n_department_id_eq" : null,
  "n_employee_company_id_eq" : null,
  "n_employee_id_eq" : null,
  "n_first_approver_id_eq" : null,
  "n_holiday_status_id_eq" : null,
  "n_id_eq" : null,
  "n_manager_id_eq" : null,
  "n_message_main_attachment_id_eq" : null,
  "n_name_like" : null,
  "n_overtime_id_eq" : null,
  "n_request_date_from_period_eq" : null,
  "n_resource_calendar_id_eq" : null,
  "n_second_approver_id_eq" : null,
  "n_state_eq" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "can_approve" : null,
    "can_cancel" : null,
    "can_reset" : null,
    "company_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "department_id" : null,
    "display_name" : null,
    "duration_display" : null,
    "employee_company_id" : null,
    "employee_id" : null,
    "first_approver_id" : null,
    "has_mandatory_day" : null,
    "has_message" : null,
    "holiday_status_id" : null,
    "id" : null,
    "is_hatched" : null,
    "is_striked" : null,
    "last_several_days" : null,
    "leave_type_increases_duration" : null,
    "manager_id" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_main_attachment_id" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "notes" : null,
    "number_of_days" : null,
    "number_of_hours" : null,
    "overtime_deductible" : null,
    "overtime_id" : null,
    "private_name" : null,
    "request_date_from" : null,
    "request_date_from_period" : null,
    "request_date_to" : null,
    "request_hour_from" : null,
    "request_hour_to" : null,
    "request_unit_half" : null,
    "request_unit_hours" : null,
    "resource_calendar_id" : null,
    "second_approver_id" : null,
    "state" : null,
    "supported_attachment_ids_count" : null,
    "tz_mismatch" : null,
    "user_id" : null,
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
<el-alert title="/hr_leaves/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_leaves/exportdata/{param},/hr_leaves/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_leaves/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_leaves/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_leaves/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_leaves/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_leaves/report" type="info" :closable="false" ></el-alert>
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