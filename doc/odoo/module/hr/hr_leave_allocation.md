# 休息分配(hr_leave_allocation)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|应计方案|ACCRUAL_PLAN_ID|外键值|100|是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_leave_allocation_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_leave_allocation_activity_state "活动状态")|200|是||
|null|ACTUAL_LASTCALL|日期型||是||
|分配类别|ALLOCATION_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_allocation_allocation_type "分配类别")|60|否||
|已累计|ALREADY_ACCRUED|是否逻辑||是||
|首次审批|APPROVER_ID|外键值|100|是||
|能批准|CAN_APPROVE|是否逻辑||是||
|到期日期顺延天数|CARRIED_OVER_DAYS_EXPIRATION_DATE|日期型||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|开始日期|DATE_FROM|日期型||否||
|结束日期|DATE_TO|日期型||是||
|部门|DEPARTMENT_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|分配 （天/小时）|DURATION_DISPLAY|文本，可指定长度|500|是||
|公司|EMPLOYEE_COMPANY_ID|外键值|100|是||
|员工|EMPLOYEE_ID|外键值|100|否||
|将于 Carry_over_days_expiration_date 到期的结转天数|EXPIRING_CARRYOVER_DAYS|浮点||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|休假类型|HOLIDAY_STATUS_ID|外键值|100|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称是否自订|IS_NAME_CUSTOM|是否逻辑||是||
|主管|IS_OFFICER|是否逻辑||是||
|最后一次应计分配的日期|LASTCALL|日期型||是||
|null|LAST_EXECUTED_CARRYOVER_DATE|日期型||是||
|已休假|LEAVES_TAKEN|浮点||是||
|管理员|MANAGER_ID|外键值|100|是||
|休假總額|MAX_LEAVES|浮点||是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|是||
|具有有效性的描述|NAME_VALIDITY|文本，可指定长度|500|是||
|下一次应计分配的日期|NEXTCALL|日期型||是||
|理由|NOTES|长文本，没有长度限制|1048576|是||
|天数|NUMBER_OF_DAYS|浮点||是||
|持续时间（天）|NUMBER_OF_DAYS_DISPLAY|浮点||是||
|时长(小时)|NUMBER_OF_HOURS_DISPLAY|浮点||是||
|加班费免赔额|OVERTIME_DEDUCTIBLE|是否逻辑||是||
|加班时间|OVERTIME_ID|外键值|100|是||
|第二次审批|SECOND_APPROVER_ID|外键值|100|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#hr_leave_allocation_state "状态")|60|是||
|类型 申请单位|TYPE_REQUEST_UNIT|[单项选择(文本值)](index/dictionary_index#hr_leave_allocation_type_request_unit "类型 申请单位")|200|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|null|YEARLY_ACCRUED_AMOUNT|浮点||是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_LEAVE_REPORT_HR_LEAVE_ALLOCATION_ALLOCATION_ID](der/DER1N_HR_LEAVE_REPORT_HR_LEAVE_ALLOCATION_ALLOCATION_ID)|[摘要 / 报表(HR_LEAVE_REPORT)](module/hr/hr_leave_report)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_LEAVE_ALLOCATION_HR_ATTENDANCE_OVERTIME_OVERTIME_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_ATTENDANCE_OVERTIME_OVERTIME_ID)|[出勤 加班(HR_ATTENDANCE_OVERTIME)](module/hr/hr_attendance_overtime)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_APPROVER_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_APPROVER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_SECOND_APPROVER_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_EMPLOYEE_SECOND_APPROVER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_LEAVE_ACCRUAL_PLAN_ACCRUAL_PLAN_ID)|[应计方案(HR_LEAVE_ACCRUAL_PLAN)](module/hr/hr_leave_accrual_plan)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_LEAVE_TYPE_HOLIDAY_STATUS_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_LEAVE_TYPE_HOLIDAY_STATUS_ID)|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_RES_COMPANY_EMPLOYEE_COMPANY_ID](der/DER1N_HR_LEAVE_ALLOCATION_RES_COMPANY_EMPLOYEE_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCRUAL_PLAN_ID_EQ|应计方案|EQ||
|N_APPROVER_ID_EQ|首次审批|EQ||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_EMPLOYEE_COMPANY_ID_EQ|公司|EQ||
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_HOLIDAY_STATUS_ID_EQ|休假类型|EQ||
|N_ID_EQ|标识|EQ||
|N_MANAGER_ID_EQ|管理员|EQ||
|N_OVERTIME_ID_EQ|加班时间|EQ||
|N_SECOND_APPROVER_ID_EQ|第二次审批|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_leave_allocation?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_allocation?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_allocation?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_allocation?id=搜索模式`">
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