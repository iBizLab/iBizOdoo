# 部门(hr_department)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|今日缺勤|ABSENCE_OF_TODAY|整型||是||
|有效|ACTIVE|是否逻辑||是||
|活动集合|ACTIVITIES|继承属性|1048576|是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_department_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_department_activity_state "活动状态")|200|是||
|待批准的分配|ALLOCATION_TO_APPROVE_COUNT|整型||是||
|附件集合|ATTACHMENTS|继承属性|1048576|是||
|直接下属部门数|CHILD_COUNT|整型||是||
|颜色指标|COLOR|文本，可指定长度|100|是||
|公司|COMPANY_ID|外键值|100|是||
|公司|COMPANY_NAME|外键值文本|200|是||
|完整名称|COMPLETE_NAME|文本，可指定长度|500|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|预期的员工|EXPECTED_EMPLOYEE|整型||是||
|待批准的费用报表|EXPENSE_SHEETS_TO_APPROVE_COUNT|整型||是||
|关注者|FOLLOWERS|继承属性|1048576|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|Has Read Access|HAS_READ_ACCESS|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|待批准的休假|LEAVE_TO_APPROVE_COUNT|整型||是||
|管理员|MANAGER_ID|外键值|100|是||
|管理员|MANAGER_NAME|外键值文本|200|是||
|主部门|MASTER_DEPARTMENT_ID|外键值|100|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|是||
|新申请|NEW_APPLICANT_COUNT|整型||是||
|新雇用的员工|NEW_HIRED_EMPLOYEE|整型||是||
|备注|NOTE|长文本，没有长度限制|1048576|是||
|上级部门|PARENT_ID|外键值|100|是||
|上级部门|PARENT_NAME|外键值文本|200|是||
|父级路径|PARENT_PATH|文本，可指定长度|500|是||
|计划数量|PLANS_COUNT|整型||是||
|Total Employee|TOTAL_EMPLOYEE|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


###### 属性组

<el-row>
<el-tabs v-model="show_field_group">

<el-tab-pane label="默认属性组" name="field_group_Simple">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|颜色指标|COLOR|文本，可指定长度|100|是||
|公司|COMPANY_ID|外键值|100|是||
|公司|COMPANY_NAME|外键值文本|200|是||
|管理员|MANAGER_ID|外键值|100|是||
|管理员|MANAGER_NAME|外键值文本|200|是||
|名称|NAME|文本，可指定长度|200|是||
|上级部门|PARENT_ID|外键值|100|是||
|上级部门|PARENT_NAME|外键值文本|200|是||
|Total Employee|TOTAL_EMPLOYEE|整型||是||

</el-tab-pane>
<el-tab-pane label="计数属性组" name="field_group_counter">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|计划数量|PLANS_COUNT|整型||是||
|Total Employee|TOTAL_EMPLOYEE|整型||是||

</el-tab-pane>

</el-tabs>
</el-row>

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_APPLICANT_HR_DEPARTMENT_DEPARTMENT_ID)|[申请人(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_CONTRACT_HISTORY_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_CONTRACT_HISTORY_HR_DEPARTMENT_DEPARTMENT_ID)|[合同历史(HR_CONTRACT_HISTORY)](module/hr/hr_contract_history)|1:N关系||
|[DER1N_HR_CONTRACT_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_CONTRACT_HR_DEPARTMENT_DEPARTMENT_ID)|[员工合同(HR_CONTRACT)](module/hr/hr_contract)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_DEPARTMENT_DEPARTMENT_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_PUBLIC_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_PUBLIC_HR_DEPARTMENT_DEPARTMENT_ID)|[公共员工(HR_EMPLOYEE_PUBLIC)](module/hr/hr_employee_public)|1:N关系||
|[DER1N_HR_EMPLOYEE_SKILL_LOG_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_SKILL_LOG_HR_DEPARTMENT_DEPARTMENT_ID)|[技能历史(HR_EMPLOYEE_SKILL_LOG)](module/hr/hr_employee_skill_log)|1:N关系||
|[DER1N_HR_EMPLOYEE_SKILL_REPORT_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_SKILL_REPORT_HR_DEPARTMENT_DEPARTMENT_ID)|[员工技能报表(HR_EMPLOYEE_SKILL_REPORT)](module/hr/hr_employee_skill_report)|1:N关系||
|[DER1N_HR_EXPENSE_SHEET_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EXPENSE_SHEET_HR_DEPARTMENT_DEPARTMENT_ID)|[费用报表(HR_EXPENSE_SHEET)](module/hr/hr_expense_sheet)|1:N关系||
|[DER1N_HR_JOB_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_JOB_HR_DEPARTMENT_DEPARTMENT_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD_HR_DEPARTMENT_DEPARTMENT_ID)|[为多名员工生成休假时间分配(HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD)](module/hr/hr_leave_allocation_generate_multi_wizard)|1:N关系||
|[DER1N_HR_LEAVE_ALLOCATION_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_ALLOCATION_HR_DEPARTMENT_DEPARTMENT_ID)|[休息分配(HR_LEAVE_ALLOCATION)](module/hr/hr_leave_allocation)|1:N关系||
|[DER1N_HR_LEAVE_EMPLOYEE_TYPE_REPORT_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_EMPLOYEE_TYPE_REPORT_HR_DEPARTMENT_DEPARTMENT_ID)|[摘要 / 报表(HR_LEAVE_EMPLOYEE_TYPE_REPORT)](module/hr/hr_leave_employee_type_report)|1:N关系||
|[DER1N_HR_LEAVE_GENERATE_MULTI_WIZARD_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_GENERATE_MULTI_WIZARD_HR_DEPARTMENT_DEPARTMENT_ID)|[为多名员工生成休假时间(HR_LEAVE_GENERATE_MULTI_WIZARD)](module/hr/hr_leave_generate_multi_wizard)|1:N关系||
|[DER1N_HR_LEAVE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_HR_DEPARTMENT_DEPARTMENT_ID)|[休假(HR_LEAVE)](module/hr/hr_leave)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_CALENDAR_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_REPORT_CALENDAR_HR_DEPARTMENT_DEPARTMENT_ID)|[休假日历(HR_LEAVE_REPORT_CALENDAR)](module/hr/hr_leave_report_calendar)|1:N关系||
|[DER1N_HR_LEAVE_REPORT_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_LEAVE_REPORT_HR_DEPARTMENT_DEPARTMENT_ID)|[摘要 / 报表(HR_LEAVE_REPORT)](module/hr/hr_leave_report)|1:N关系||
|[DER1N_HR_RESUME_LINE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_RESUME_LINE_HR_DEPARTMENT_DEPARTMENT_ID)|[员工的简历明细(HR_RESUME_LINE)](module/hr/hr_resume_line)|1:N关系||
|[DER1N_MAIL_ACTIVITY_PLAN_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_MAIL_ACTIVITY_PLAN_HR_DEPARTMENT_DEPARTMENT_ID)|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_DEPARTMENT_RES_COMPANY_COMPANY_ID](der/DER1N_HR_DEPARTMENT_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DERMULINH_HR_DEPARTMENT_MAIL_ACTIVITY_MIXIN](der/DERMULINH_HR_DEPARTMENT_MAIL_ACTIVITY_MIXIN)|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|多继承关系（虚拟实体）||
|[DERMULINH_HR_DEPARTMENT_MAIL_THREAD](der/DERMULINH_HR_DEPARTMENT_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|多继承关系（虚拟实体）||

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
|部门计数器|department_counter|[实体处理逻辑](module/hr/hr_department/logic/department_counter "部门计数器")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[部门计数器](module/hr/hr_department/logic/department_counter)|department_counter|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_department/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_department/query/View)|VIEW|否|否 |否 ||
|[部门架构(department_chart)](module/hr/hr_department/query/department_chart)|department_chart|否|否 |否 ||
|[部门层级(department_hierarchy)](module/hr/hr_department/query/department_hierarchy)|department_hierarchy|否|否 |否 ||
|[根部门(ROOT)](module/hr/hr_department/query/root)|ROOT|否|否 |否 ||
|[简单查询(simple)](module/hr/hr_department/query/simple)|simple|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_department/dataset/Default)|DEFAULT|数据查询|是|||
|[部门架构(department_chart)](module/hr/hr_department/dataset/department_chart)|department_chart|数据查询|否|||
|[部门层级(department_hierarchy)](module/hr/hr_department/dataset/department_hierarchy)|department_hierarchy|数据查询|否|||
|[根部门(ROOT)](module/hr/hr_department/dataset/root)|ROOT|数据查询|否||注意附加当前权限公司范围|
|[简单查询(simple)](module/hr/hr_department/dataset/simple)|simple|数据查询|否|||

## 数据权限

##### hr_department_employee :id=hr_department-hr_department_employee

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COMPANY_ID_EQ|公司|EQ||
|N_COMPANY_NAME_EQ|公司|EQ||
|N_COMPANY_NAME_LIKE|公司|LIKE||
|N_ID_EQ|标识|EQ||
|N_MANAGER_ID_EQ|管理员|EQ||
|N_MANAGER_NAME_EQ|管理员|EQ||
|N_MANAGER_NAME_LIKE|管理员|LIKE||
|N_MASTER_DEPARTMENT_ID_EQ|主部门|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|上级部门|EQ||
|N_PARENT_NAME_EQ|上级部门|EQ||
|N_PARENT_NAME_LIKE|上级部门|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 打开员工实体管理页面 | open_employee_multi_data_view | 员工 |无数据|<details><summary>打开视图或向导（模态）</summary>[员工](app/view/hr_employee_multi_data_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_department?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=界面行为`">
  界面行为
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',
show_field_group:'field_group_Simple',

      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>