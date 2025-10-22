# 应聘人(hr_candidate)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|已接收录用通知的数目|ACCEPTED_APPLICATIONS_COUNT|整型||是||
|有效|ACTIVE|是否逻辑||是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_candidate_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_candidate_activity_state "活动状态")|200|是||
|# 期望薪资|APPLICATIONS_COUNT|整型||是||
|应用计数|APPLICATION_COUNT|整型||是||
|附件数量|ATTACHMENT_COUNT|整型||是||
|可入职日期|AVAILABILITY|日期型||是||
|颜色指标|COLOR|整型||是||
|公司|COMPANY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|邮件抄送|EMAIL_CC|文本，可指定长度|500|是||
|电子邮件|EMAIL_FROM|文本，可指定长度|500|是||
|规范化电子邮件|EMAIL_NORMALIZED|文本，可指定长度|500|是||
|员工|EMPLOYEE_ID|外键值|100|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|黑名单|IS_BLACKLISTED|是否逻辑||是||
|LinkedIn个人资料|LINKEDIN_PROFILE|文本，可指定长度|500|是||
|匹配分数（%）|MATCHING_SCORE|浮点||是||
|会议显示日期|MEETING_DISPLAY_DATE|日期型||是||
|会议显示文本|MEETING_DISPLAY_TEXT|文本，可指定长度|500|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|弹跳|MESSAGE_BOUNCE|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|主要附件|MESSAGE_MAIN_ATTACHMENT_ID|外键值|100|是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|手机黑名单|MOBILE_BLACKLISTED|是否逻辑||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|联系人|PARTNER_ID|外键值|100|是||
|候选人姓名|PARTNER_NAME|文本，可指定长度|500|是||
|电话|PARTNER_PHONE|文本，可指定长度|500|是||
|经过消毒的电话号码|PARTNER_PHONE_SANITIZED|文本，可指定长度|500|是||
|黑名单电话是电话|PHONE_BLACKLISTED|是否逻辑||是||
|电话/手机|PHONE_MOBILE_SEARCH|文本，可指定长度|500|是||
|消毒编号|PHONE_SANITIZED|文本，可指定长度|500|是||
|电话黑名单|PHONE_SANITIZED_BLACKLISTED|是否逻辑||是||
|评估|PRIORITY|[单项选择(文本值)](index/dictionary_index#hr_candidate_priority "评估")|60|是||
|已拒绝录用通知的数目|REFUSED_APPLICATIONS_COUNT|整型||是||
|相似候选人数|SIMILAR_CANDIDATES_COUNT|整型||是||
|学历|TYPE_ID|外键值|100|是||
|候选人管理员|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID](der/DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID)|[申请人(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_CANDIDATE_SKILL_HR_CANDIDATE_CANDIDATE_ID](der/DER1N_HR_CANDIDATE_SKILL_HR_CANDIDATE_CANDIDATE_ID)|[候选人的技能水平(HR_CANDIDATE_SKILL)](module/hr/hr_candidate_skill)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_CANDIDATE_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_CANDIDATE_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_CANDIDATE_HR_RECRUITMENT_DEGREE_TYPE_ID](der/DER1N_HR_CANDIDATE_HR_RECRUITMENT_DEGREE_TYPE_ID)|[申请人学历(HR_RECRUITMENT_DEGREE)](module/hr/hr_recruitment_degree)|1:N关系||
|[DER1N_HR_CANDIDATE_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID](der/DER1N_HR_CANDIDATE_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_HR_CANDIDATE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_CANDIDATE_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_CANDIDATE_RES_PARTNER_PARTNER_ID](der/DER1N_HR_CANDIDATE_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_HR_CANDIDATE_RES_USERS_USER_ID](der/DER1N_HR_CANDIDATE_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[DEFAULT](module/hr/hr_candidate/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_candidate/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_candidate/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_ID_EQ|标识|EQ||
|N_MESSAGE_MAIN_ATTACHMENT_ID_EQ|主要附件|EQ||
|N_PARTNER_ID_EQ|联系人|EQ||
|N_PRIORITY_EQ|评估|EQ||
|N_TYPE_ID_EQ|学历|EQ||
|N_USER_ID_EQ|候选人管理员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_candidate?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=搜索模式`">
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