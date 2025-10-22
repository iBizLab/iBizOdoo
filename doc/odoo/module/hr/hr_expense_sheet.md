# 费用报表(hr_expense_sheet)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|费用报表日期|ACCOUNTING_DATE|日期型||是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_expense_sheet_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_expense_sheet_activity_state "活动状态")|200|是||
|到期金额|AMOUNT_RESIDUAL|数值||是||
|审批日期|APPROVAL_DATE|日期时间型||是||
|审批状态|APPROVAL_STATE|[单项选择(文本值)](index/dictionary_index#hr_expense_sheet_approval_state "审批状态")|60|是||
|无法批准原因|CANNOT_APPROVE_REASON|文本，可指定长度|500|是||
|能批准|CAN_APPROVE|是否逻辑||是||
|可重置|CAN_RESET|是否逻辑||是||
|公司|COMPANY_ID|外键值|100|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|币别|CURRENCY_ID|外键值|100|是||
|部门|DEPARTMENT_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|员工|EMPLOYEE_ID|外键值|100|否||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|当前用户可编辑费用项目|IS_EDITABLE|是否逻辑||是||
|处理明细中有不同的币别|IS_MULTIPLE_CURRENCY|是否逻辑||是||
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
|日记账分录编码|NB_ACCOUNT_MOVE|整型||是||
|费用的数量|NB_EXPENSE|整型||是||
|销售订单计数|SALE_ORDER_COUNT|整型||是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#hr_expense_sheet_state "状态")|60|否||
|总计|TOTAL_AMOUNT|数值||是||
|税项|TOTAL_TAX_AMOUNT|数值||是||
|未税金额|UNTAXED_AMOUNT|数值||是||
|管理员|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_EXPENSE_HR_EXPENSE_SHEET_SHEET_ID](der/DER1N_HR_EXPENSE_HR_EXPENSE_SHEET_SHEET_ID)|[费用(HR_EXPENSE)](module/hr/hr_expense)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_EXPENSE_SHEET_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EXPENSE_SHEET_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EXPENSE_SHEET_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_EXPENSE_SHEET_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EXPENSE_SHEET_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID](der/DER1N_HR_EXPENSE_SHEET_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_HR_EXPENSE_SHEET_RES_COMPANY_COMPANY_ID](der/DER1N_HR_EXPENSE_SHEET_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_EXPENSE_SHEET_RES_CURRENCY_CURRENCY_ID](der/DER1N_HR_EXPENSE_SHEET_RES_CURRENCY_CURRENCY_ID)|[币别(RES_CURRENCY)](module/base/res_currency)|1:N关系||
|[DER1N_HR_EXPENSE_SHEET_RES_USERS_USER_ID](der/DER1N_HR_EXPENSE_SHEET_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[DEFAULT](module/hr/hr_expense_sheet/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_expense_sheet/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_expense_sheet/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_APPROVAL_STATE_EQ|审批状态|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_CURRENCY_ID_EQ|币别|EQ||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_ID_EQ|标识|EQ||
|N_MESSAGE_MAIN_ATTACHMENT_ID_EQ|主要附件|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_STATE_EQ|状态|EQ||
|N_USER_ID_EQ|管理员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_expense_sheet?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_expense_sheet?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_expense_sheet?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_expense_sheet?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_expense_sheet?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_expense_sheet?id=搜索模式`">
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