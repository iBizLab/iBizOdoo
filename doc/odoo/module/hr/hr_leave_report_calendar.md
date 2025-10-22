# 休假日历(hr_leave_report_calendar)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|公司|COMPANY_ID|外键值|100|是||
|部门|DEPARTMENT_ID|外键值|100|是||
|描述|DESCRIPTION|文本，可指定长度|500|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|时长|DURATION|浮点||是||
|员工|EMPLOYEE_ID|外键值|100|是||
|休假类型|HOLIDAY_STATUS_ID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|已孵化|IS_HATCHED|是否逻辑||是||
|管理员|IS_MANAGER|是否逻辑||是||
|罢工|IS_STRIKED|是否逻辑||是||
|工作|JOB_ID|外键值|100|是||
|离开|LEAVE_ID|外键值|100|是||
|来自|START_DATETIME|日期时间型||是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#hr_leave_report_calendar_state "状态")|60|是||
|至|STOP_DATETIME|日期时间型||是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_LEAVE_REPORT_CALENDAR_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_CALENDAR_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_CALENDAR_HR_JOB_JOB_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_HR_JOB_JOB_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_CALENDAR_HR_LEAVE_LEAVE_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_HR_LEAVE_LEAVE_ID)|[休假(HR_LEAVE)](module/hr/hr_leave)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_CALENDAR_HR_LEAVE_TYPE_HOLIDAY_STATUS_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_HR_LEAVE_TYPE_HOLIDAY_STATUS_ID)|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_CALENDAR_RES_COMPANY_COMPANY_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||

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
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_HOLIDAY_STATUS_ID_EQ|休假类型|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_ID_EQ|工作|EQ||
|N_LEAVE_ID_EQ|离开|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_leave_report_calendar?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_report_calendar?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_report_calendar?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_report_calendar?id=搜索模式`">
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