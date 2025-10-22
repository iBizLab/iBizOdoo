# 合同历史(hr_contract_history)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|在职员工|ACTIVE_EMPLOYEE|是否逻辑||是||
|公司|COMPANY_ID|外键值|100|是||
|# 合同|CONTRACT_COUNT|整型||是||
|合同|CONTRACT_ID|外键值|100|是||
|合同类型|CONTRACT_TYPE_ID|外键值|100|是||
|结束日期|DATE_END|日期型||是||
|入职日期|DATE_HIRED|日期型||是||
|开始日期|DATE_START|日期型||是||
|部门|DEPARTMENT_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|员工|EMPLOYEE_ID|外键值|100|是||
|人力资源主管|HR_RESPONSIBLE_ID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|目前正在签约中|IS_UNDER_CONTRACT|是否逻辑||是||
|工作岗位|JOB_ID|外键值|100|是||
|名称|NAME|文本，可指定长度|200|是||
|工作安排|RESOURCE_CALENDAR_ID|外键值|100|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#hr_contract_history_state "状态")|60|是||
|工资结构类型|STRUCTURE_TYPE_ID|外键值|100|是||
|合同状态|UNDER_CONTRACT_STATE|[单项选择(文本值)](index/dictionary_index#hr_contract_history_under_contract_state "合同状态")|200|是||
|工资|WAGE|数值||是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_CONTRACT_HISTORY_HR_CONTRACT_CONTRACT_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_CONTRACT_CONTRACT_ID)|[员工合同(HR_CONTRACT)](module/hr/hr_contract)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_HR_CONTRACT_TYPE_CONTRACT_TYPE_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_CONTRACT_TYPE_CONTRACT_TYPE_ID)|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_HR_JOB_JOB_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_JOB_JOB_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_PAYROLL_STRUCTURE_TYPE_STRUCTURE_TYPE_ID)|[工资结构类型(HR_PAYROLL_STRUCTURE_TYPE)](module/hr/hr_payroll_structure_type)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_CONTRACT_HISTORY_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_RES_COMPANY_COMPANY_ID](der/DER1N_HR_CONTRACT_HISTORY_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_RES_USERS_HR_RESPONSIBLE_ID](der/DER1N_HR_CONTRACT_HISTORY_RES_USERS_HR_RESPONSIBLE_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|N_CONTRACT_ID_EQ|合同|EQ||
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
<el-anchor-link :href="`#/module/hr/hr_contract_history?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_contract_history?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_contract_history?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_contract_history?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>