# 休假(hr_leave)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_leave_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_leave_activity_state "活动状态")|200|是||
|能批准|CAN_APPROVE|是否逻辑||是||
|可以取消|CAN_CANCEL|是否逻辑||是||
|能重置|CAN_RESET|是否逻辑||是||
|公司|COMPANY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|开始日期|DATE_FROM|日期时间型||是||
|结束日期|DATE_TO|日期时间型||是||
|部门|DEPARTMENT_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|要求的（天/小时）|DURATION_DISPLAY|文本，可指定长度|500|是||
|员工公司|EMPLOYEE_COMPANY_ID|外键值|100|是||
|员工|EMPLOYEE_ID|外键值|100|否||
|首次审批|FIRST_APPROVER_ID|外键值|100|是||
|有义务日|HAS_MANDATORY_DAY|是否逻辑||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|休假类型|HOLIDAY_STATUS_ID|外键值|100|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|已孵化|IS_HATCHED|是否逻辑||是||
|罢工|IS_STRIKED|是否逻辑||是||
|全天|LAST_SEVERAL_DAYS|是否逻辑||是||
|假期类型 增加持续时间|LEAVE_TYPE_INCREASES_DURATION|是否逻辑||是||
|管理员|MANAGER_ID|外键值|100|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|主要附件|MESSAGE_MAIN_ATTACHMENT_ID|外键值|100|是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|是||
|理由|NOTES|长文本，没有长度限制|1048576|是||
|持续时间（天）|NUMBER_OF_DAYS|浮点||是||
|持续时间(小时)|NUMBER_OF_HOURS|浮点||是||
|加班费免赔额|OVERTIME_DEDUCTIBLE|是否逻辑||是||
|加班时间|OVERTIME_ID|外键值|100|是||
|休假描述|PRIVATE_NAME|文本，可指定长度|500|是||
|请假开始日期|REQUEST_DATE_FROM|日期型||是||
|日期开始|REQUEST_DATE_FROM_PERIOD|[单项选择(文本值)](index/dictionary_index#hr_leave_request_date_from_period "日期开始")|60|是||
|请求结束日期|REQUEST_DATE_TO|日期型||是||
|时间从|REQUEST_HOUR_FROM|浮点||是||
|时间到|REQUEST_HOUR_TO|浮点||是||
|半天|REQUEST_UNIT_HALF|是否逻辑||是||
|自定义时间|REQUEST_UNIT_HOURS|是否逻辑||是||
|资源行事历|RESOURCE_CALENDAR_ID|外键值|100|是||
|第二次审批|SECOND_APPROVER_ID|外键值|100|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#hr_leave_state "状态")|60|是||
|支持的附件ID计数|SUPPORTED_ATTACHMENT_IDS_COUNT|整型||是||
|时区不匹配|TZ_MISMATCH|是否逻辑||是||
|用户|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_HOLIDAYS_CANCEL_LEAVE_HR_LEAVE_LEAVE_ID](der/DER1N_HR_HOLIDAYS_CANCEL_LEAVE_HR_LEAVE_LEAVE_ID)|[取消休假向导(HR_HOLIDAYS_CANCEL_LEAVE)](module/hr/hr_holidays_cancel_leave)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_CALENDAR_HR_LEAVE_LEAVE_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_HR_LEAVE_LEAVE_ID)|[休假日历(HR_LEAVE_REPORT_CALENDAR)](module/hr/hr_leave_report_calendar)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_HR_LEAVE_LEAVE_ID](der/DER1N_HR_LEAVE_REPORT_HR_LEAVE_LEAVE_ID)|[摘要 / 报表(HR_LEAVE_REPORT)](module/hr/hr_leave_report)|1:N关系||
|[DER1N_RESOURCE_CALENDAR_LEAVES_HR_LEAVE_HOLIDAY_ID](der/DER1N_RESOURCE_CALENDAR_LEAVES_HR_LEAVE_HOLIDAY_ID)|[休假详细信息(RESOURCE_CALENDAR_LEAVES)](module/resource/resource_calendar_leaves)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_LEAVE_HR_ATTENDANCE_OVERTIME_OVERTIME_ID](der/DER1N_HR_LEAVE_HR_ATTENDANCE_OVERTIME_OVERTIME_ID)|[出勤 加班(HR_ATTENDANCE_OVERTIME)](module/hr/hr_attendance_overtime)|1:N关系||
|[DER1N_HR_LEAVE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_LEAVE_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_LEAVE_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_HR_EMPLOYEE_FIRST_APPROVER_ID](der/DER1N_HR_LEAVE_HR_EMPLOYEE_FIRST_APPROVER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_LEAVE_HR_EMPLOYEE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_HR_EMPLOYEE_SECOND_APPROVER_ID](der/DER1N_HR_LEAVE_HR_EMPLOYEE_SECOND_APPROVER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_HR_LEAVE_TYPE_HOLIDAY_STATUS_ID](der/DER1N_HR_LEAVE_HR_LEAVE_TYPE_HOLIDAY_STATUS_ID)|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|1:N关系||
|[DER1N_HR_LEAVE_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID](der/DER1N_HR_LEAVE_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_HR_LEAVE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_LEAVE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_HR_LEAVE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_LEAVE_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_LEAVE_RES_COMPANY_EMPLOYEE_COMPANY_ID](der/DER1N_HR_LEAVE_RES_COMPANY_EMPLOYEE_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_LEAVE_RES_USERS_USER_ID](der/DER1N_HR_LEAVE_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_leave/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_leave/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_leave/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_EMPLOYEE_COMPANY_ID_EQ|员工公司|EQ||
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_FIRST_APPROVER_ID_EQ|首次审批|EQ||
|N_HOLIDAY_STATUS_ID_EQ|休假类型|EQ||
|N_ID_EQ|标识|EQ||
|N_MANAGER_ID_EQ|管理员|EQ||
|N_MESSAGE_MAIN_ATTACHMENT_ID_EQ|主要附件|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OVERTIME_ID_EQ|加班时间|EQ||
|N_REQUEST_DATE_FROM_PERIOD_EQ|日期开始|EQ||
|N_RESOURCE_CALENDAR_ID_EQ|资源行事历|EQ||
|N_SECOND_APPROVER_ID_EQ|第二次审批|EQ||
|N_STATE_EQ|状态|EQ||
|N_USER_ID_EQ|用户|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_leave?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>