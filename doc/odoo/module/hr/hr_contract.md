# 员工合同(hr_contract)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_contract_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_contract_activity_state "活动状态")|200|是||
|日历不匹配|CALENDAR_MISMATCH|是否逻辑||是||
|公司|COMPANY_ID|外键值|100|否||
|合同类型|CONTRACT_TYPE_ID|外键值|100|是||
|合同工资|CONTRACT_WAGE|数值||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|结束日期|DATE_END|日期型||是||
|开始日期|DATE_START|日期型||否||
|部门|DEPARTMENT_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|员工|EMPLOYEE_ID|外键值|100|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|人力资源主管|HR_RESPONSIBLE_ID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|工作岗位|JOB_ID|外键值|100|是||
|看板状态|KANBAN_STATE|[单项选择(文本值)](index/dictionary_index#hr_contract_kanban_state "看板状态")|60|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|是||
|备注|NOTES|HTML文本，没有长度限制|1048576|是||
|工作安排|RESOURCE_CALENDAR_ID|外键值|100|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#hr_contract_state "状态")|60|是||
|工资结构类型|STRUCTURE_TYPE_ID|外键值|100|是||
|试用期结束|TRIAL_DATE_END|日期型||是||
|工资|WAGE|数值||否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_CONTRACT_HISTORY_HR_CONTRACT_CONTRACT_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_CONTRACT_CONTRACT_ID)|[合同历史(HR_CONTRACT_HISTORY)](module/hr/hr_contract_history)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_CONTRACT_CONTRACT_ID](der/DER1N_HR_EMPLOYEE_HR_CONTRACT_CONTRACT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_CONTRACT_HR_CONTRACT_TYPE_CONTRACT_TYPE_ID](der/DER1N_HR_CONTRACT_HR_CONTRACT_TYPE_CONTRACT_TYPE_ID)|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|1:N关系||
|[DER1N_HR_CONTRACT_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_CONTRACT_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_CONTRACT_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_CONTRACT_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_CONTRACT_HR_JOB_JOB_ID](der/DER1N_HR_CONTRACT_HR_JOB_JOB_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_CONTRACT_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID](der/DER1N_HR_CONTRACT_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID)|[工资结构类型(HR_PAYROLL_STRUCTURE_TYPE)](module/hr/hr_payroll_structure_type)|1:N关系||
|[DER1N_HR_CONTRACT_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_CONTRACT_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_HR_CONTRACT_RES_COMPANY_COMPANY_ID](der/DER1N_HR_CONTRACT_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_CONTRACT_RES_USERS_HR_RESPONSIBLE_ID](der/DER1N_HR_CONTRACT_RES_USERS_HR_RESPONSIBLE_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COMPANY_ID_EQ|公司|EQ||
|N_CONTRACT_TYPE_ID_EQ|合同类型|EQ||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_HR_RESPONSIBLE_ID_EQ|人力资源主管|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_ID_EQ|工作岗位|EQ||
|N_RESOURCE_CALENDAR_ID_EQ|工作安排|EQ||
|N_STRUCTURE_TYPE_ID_EQ|工资结构类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_contract?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_contract?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_contract?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_contract?id=搜索模式`">
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