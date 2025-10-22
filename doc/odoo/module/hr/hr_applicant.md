# 申请人(hr_applicant)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_applicant_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_applicant_activity_state "活动状态")|200|是||
|申请人备注|APPLICANT_NOTES|HTML文本，没有长度限制|1048576|是||
|表单状态|APPLICATION_STATUS|[单项选择(文本值)](index/dictionary_index#hr_applicant_application_status "表单状态")|200|是||
|附件数量|ATTACHMENT_NUMBER|整型||是||
|应聘人|CANDIDATE_ID|外键值|100|否||
|公司|COMPANY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|入职日期|DATE_CLOSED|日期时间型||是||
|最后阶段更新|DATE_LAST_STAGE_UPDATE|日期时间型||是||
|已指派|DATE_OPEN|日期时间型||是||
|关闭日期|DAY_CLOSE|浮点||是||
|开启天数|DAY_OPEN|浮点||是||
|延迟关闭|DELAY_CLOSE|浮点||是||
|部门|DEPARTMENT_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|邮件抄送|EMAIL_CC|文本，可指定长度|500|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|工作岗位|JOB_ID|外键值|100|是||
|看板状态|KANBAN_STATE|[单项选择(文本值)](index/dictionary_index#hr_applicant_kanban_state "看板状态")|60|是||
|最终阶段|LAST_STAGE_ID|外键值|100|是||
|会议显示日期|MEETING_DISPLAY_DATE|日期型||是||
|会议显示文本|MEETING_DISPLAY_TEXT|文本，可指定长度|500|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|主要附件|MESSAGE_MAIN_ATTACHMENT_ID|外键值|100|是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|其他申请数目|OTHER_APPLICATIONS_COUNT|整型||是||
|合作伙伴名称|PARTNER_NAME|文本，可指定长度|500|是||
|评估|PRIORITY|[单项选择(文本值)](index/dictionary_index#hr_applicant_priority "评估")|60|是||
|概率|PROBABILITY|浮点||是||
|拒绝日期|REFUSE_DATE|日期时间型||是||
|拒绝理由|REFUSE_REASON_ID|外键值|100|是||
|期望薪资|SALARY_EXPECTED|浮点||是||
|期望工资|SALARY_EXPECTED_EXTRA|文本，可指定长度|500|是||
|建议薪资|SALARY_PROPOSED|浮点||是||
|工资标准|SALARY_PROPOSED_EXTRA|文本，可指定长度|500|是||
|阶段|STAGE_ID|外键值|100|是||
|招聘人员|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_APPLICANT_HR_APPLICANT_REFUSE_REASON_REFUSE_REASON_ID](der/DER1N_HR_APPLICANT_HR_APPLICANT_REFUSE_REASON_REFUSE_REASON_ID)|[拒绝原因 申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID](der/DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID)|[应聘人(HR_CANDIDATE)](module/hr/hr_candidate)|1:N关系||
|[DER1N_HR_APPLICANT_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_APPLICANT_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_APPLICANT_HR_JOB_JOB_ID](der/DER1N_HR_APPLICANT_HR_JOB_JOB_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_LAST_STAGE_ID](der/DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_LAST_STAGE_ID)|[招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|1:N关系||
|[DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID](der/DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID)|[招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|1:N关系||
|[DER1N_HR_APPLICANT_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID](der/DER1N_HR_APPLICANT_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_HR_APPLICANT_RES_COMPANY_COMPANY_ID](der/DER1N_HR_APPLICANT_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_APPLICANT_RES_USERS_USER_ID](der/DER1N_HR_APPLICANT_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[DEFAULT](module/hr/hr_applicant/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_applicant/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_applicant/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_APPLICATION_STATUS_EQ|表单状态|EQ||
|N_CANDIDATE_ID_EQ|应聘人|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_ID_EQ|工作岗位|EQ||
|N_KANBAN_STATE_EQ|看板状态|EQ||
|N_LAST_STAGE_ID_EQ|最终阶段|EQ||
|N_MESSAGE_MAIN_ATTACHMENT_ID_EQ|主要附件|EQ||
|N_PRIORITY_EQ|评估|EQ||
|N_REFUSE_REASON_ID_EQ|拒绝理由|EQ||
|N_STAGE_ID_EQ|阶段|EQ||
|N_USER_ID_EQ|招聘人员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_applicant?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=搜索模式`">
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