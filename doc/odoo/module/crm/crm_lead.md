# 线索/商机(crm_lead)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|活动集合|ACTIVITIES|继承属性|1048576|是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#crm_lead_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#crm_lead_activity_state "活动状态")|200|是||
|附件集合|ATTACHMENTS|继承属性|1048576|是||
|自动概率|AUTOMATED_PROBABILITY|浮点||是||
|城市|CITY|文本，可指定长度|500|是||
|颜色索引|COLOR|整型||是||
|公司|COMPANY_ID|外键值|100|是||
|联系人姓名|CONTACT_NAME|文本，可指定长度|500|是||
|国家/地区|COUNTRY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|最后操作|DATE_AUTOMATION_LAST|日期时间型||是||
|关闭日期|DATE_CLOSED|日期时间型||是||
|转化日期|DATE_CONVERSION|日期时间型||是||
|预期结束|DATE_DEADLINE|日期型||是||
|最后阶段更新|DATE_LAST_STAGE_UPDATE|日期时间型||是||
|指派日期|DATE_OPEN|日期时间型||是||
|待关闭天数|DAY_CLOSE|浮点||是||
|待分配天数|DAY_OPEN|浮点||是||
|备注|DESCRIPTION|HTML文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|潜在的重复线索数量|DUPLICATE_LEAD_COUNT|整型||是||
|状态时间|DURATION_TRACKING|继承属性|1048576|是||
|电子邮件抄送|EMAIL_CC|文本，可指定长度|500|是||
|电子邮箱域名标准|EMAIL_DOMAIN_CRITERION|文本，可指定长度|500|是||
|电子邮件|EMAIL_FROM|文本，可指定长度|500|是||
|规范化电子邮件|EMAIL_NORMALIZED|文本，可指定长度|500|是||
|电子邮件质量|EMAIL_STATE|[单项选择(文本值)](index/dictionary_index#crm_lead_email_state "电子邮件质量")|60|是||
|预期收入|EXPECTED_REVENUE|数值||是||
|文件|FILE|文件|200|是||
|关注者|FOLLOWERS|继承属性|1048576|是||
|工作岗位|FUNCTION|文本，可指定长度|500|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|丰富结束|IAP_ENRICH_DONE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|图片|IMAGE|图片|200|是||
|是自动概率？|IS_AUTOMATED_PROBABILITY|是否逻辑||是||
|黑名单|IS_BLACKLISTED|是否逻辑||是||
|是可见合作伙伴|IS_PARTNER_VISIBLE|是否逻辑||是||
|有效语言数量|LANG_ACTIVE_COUNT|整型||是||
|语言|LANG_ID|外键值|100|是||
|线索挖掘申请|LEAD_MINING_REQUEST_ID|外键值|100|是||
|丢失原因|LOST_REASON_ID|外键值|100|是||
|会议显示日期|MEETING_DISPLAY_DATE|日期型||是||
|会议显示标签|MEETING_DISPLAY_LABEL|文本，可指定长度|500|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|退回|MESSAGE_BOUNCE|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|手机号码|MOBILE|文本，可指定长度|500|是||
|列入黑名单的电话号码是手机号码|MOBILE_BLACKLISTED|是否逻辑||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|是||
|合作伙伴电子邮箱将更新|PARTNER_EMAIL_UPDATE|是否逻辑||是||
|客户|PARTNER_ID|外键值|100|是||
|公司名称|PARTNER_NAME|文本，可指定长度|500|是||
|合作伙伴电话号码将更新|PARTNER_PHONE_UPDATE|是否逻辑||是||
|电话号码|PHONE|文本，可指定长度|500|是||
|列入黑名单的电话是电话|PHONE_BLACKLISTED|是否逻辑||是||
|电话号码/手机号码|PHONE_MOBILE_SEARCH|文本，可指定长度|500|是||
|已净化号码|PHONE_SANITIZED|文本，可指定长度|500|是||
|电话号码已被列入黑名单|PHONE_SANITIZED_BLACKLISTED|是否逻辑||是||
|电话号码质量|PHONE_STATE|[单项选择(文本值)](index/dictionary_index#crm_lead_phone_state "电话号码质量")|60|是||
|优先级|PRIORITY|[单项选择(文本值)](index/dictionary_index#crm_lead_priority "优先级")|60|是||
|概率|PROBABILITY|浮点||是||
|按比例分配的收入|PRORATED_REVENUE|数值||是||
|报价的数量|QUOTATION_COUNT|整型||是||
|经常性收入|RECURRING_REVENUE|数值||是||
|预期 MRR|RECURRING_REVENUE_MONTHLY|数值||是||
|按比例分配的 MRR|RECURRING_REVENUE_MONTHLY_PRORATED|数值||是||
|按比例分配的经常性收入|RECURRING_REVENUE_PRORATED|数值||是||
|推荐人|REFERRED|文本，可指定长度|500|是||
|显示 ID|REVEAL_ID|文本，可指定长度|500|是||
|销售订单的总数|SALE_AMOUNT_TOTAL|数值||是||
|销售订单数量|SALE_ORDER_COUNT|整型||是||
|允许手动丰富|SHOW_ENRICH_BUTTON|是否逻辑||是||
|阶段|STAGE_ID|外键值|100|是||
|省/州|STATE_ID|外键值|100|是||
|街道|STREET|文本，可指定长度|500|是||
|街道2|STREET2|文本，可指定长度|500|是||
|销售团队|TEAM_ID|外键值|100|是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#crm_lead_type "类型")|60|否||
|销售人员|USER_ID|外键值|100|是||
|网站|WEBSITE|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|邮编|ZIP|文本，可指定长度|500|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_CRM_ACTIVITY_REPORT_CRM_LEAD_LEAD_ID](der/DER1N_CRM_ACTIVITY_REPORT_CRM_LEAD_LEAD_ID)|[客户关系管理活动分析(CRM_ACTIVITY_REPORT)](module/crm/crm_activity_report)|1:N关系||
|[DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_CRM_LEAD_LEAD_ID](der/DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_CRM_LEAD_LEAD_ID)|[线索转化为商机（非批量）(CRM_LEAD2OPPORTUNITY_PARTNER)](module/crm/crm_lead2opportunity_partner)|1:N关系||
|[DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_CRM_LEAD_LEAD_ID](der/DER1N_CRM_LEAD2OPPORTUNITY_PARTNER_MASS_CRM_LEAD_LEAD_ID)|[线索转化为商机（批量）(CRM_LEAD2OPPORTUNITY_PARTNER_MASS)](module/crm/crm_lead2opportunity_partner_mass)|1:N关系||
|[DER1N_CRM_QUOTATION_PARTNER_CRM_LEAD_LEAD_ID](der/DER1N_CRM_QUOTATION_PARTNER_CRM_LEAD_LEAD_ID)|[在新报价上创建新客户或使用现有客户(CRM_QUOTATION_PARTNER)](module/crm/crm_quotation_partner)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_CRM_LEAD_CRM_IAP_LEAD_MINING_REQUEST_LEAD_MINING_REQUEST_ID](der/DER1N_CRM_LEAD_CRM_IAP_LEAD_MINING_REQUEST_LEAD_MINING_REQUEST_ID)|[CRM线索挖掘需求(CRM_IAP_LEAD_MINING_REQUEST)](module/crm/crm_iap_lead_mining_request)|1:N关系||
|[DER1N_CRM_LEAD_CRM_LOST_REASON_LOST_REASON_ID](der/DER1N_CRM_LEAD_CRM_LOST_REASON_LOST_REASON_ID)|[商机丢失原因(CRM_LOST_REASON)](module/crm/crm_lost_reason)|1:N关系||
|[DER1N_CRM_LEAD_CRM_STAGE_STAGE_ID](der/DER1N_CRM_LEAD_CRM_STAGE_STAGE_ID)|[客户关系管理阶段(CRM_STAGE)](module/crm/crm_stage)|1:N关系||
|[DER1N_CRM_LEAD_CRM_TEAM_TEAM_ID](der/DER1N_CRM_LEAD_CRM_TEAM_TEAM_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_CRM_LEAD_RES_COMPANY_COMPANY_ID](der/DER1N_CRM_LEAD_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_CRM_LEAD_RES_COUNTRY_COUNTRY_ID](der/DER1N_CRM_LEAD_RES_COUNTRY_COUNTRY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||
|[DER1N_CRM_LEAD_RES_COUNTRY_STATE_STATE_ID](der/DER1N_CRM_LEAD_RES_COUNTRY_STATE_STATE_ID)|[国家省/州(RES_COUNTRY_STATE)](module/base/res_country_state)|1:N关系||
|[DER1N_CRM_LEAD_RES_LANG_LANG_ID](der/DER1N_CRM_LEAD_RES_LANG_LANG_ID)|[语言(RES_LANG)](module/base/res_lang)|1:N关系||
|[DER1N_CRM_LEAD_RES_PARTNER_PARTNER_ID](der/DER1N_CRM_LEAD_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_CRM_LEAD_RES_USERS_USER_ID](der/DER1N_CRM_LEAD_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DERMULINH_CRM_LEAD_MAIL_ACTIVITY_MIXIN](der/DERMULINH_CRM_LEAD_MAIL_ACTIVITY_MIXIN)|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|多继承关系（虚拟实体）||
|[DERMULINH_CRM_LEAD_MAIL_THREAD](der/DERMULINH_CRM_LEAD_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|多继承关系（虚拟实体）||
|[DERMULINH_CRM_LEAD_MAIL_TRACKING_DURATION_MIXIN](der/DERMULINH_CRM_LEAD_MAIL_TRACKING_DURATION_MIXIN)|[用于计算记录在 many2one 字段的每个值上所花费时间的混合函数(MAIL_TRACKING_DURATION_MIXIN)](module/mail/mail_tracking_duration_mixin)|多继承关系（虚拟实体）||

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
|带模板的消息发送|message_post_with_source|继承行为|默认|不支持||||

## 功能配置
| 中文名col200    | 功能类型col150    | 功能实体col200 |  备注col700|
| --------  | :----:    | ---- |----- |
|审计|数据审计|[审计记录(AUDIT_RECORD)](module/audit/audit_record)||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/crm/crm_lead/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/crm_lead/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/crm/crm_lead/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_COUNTRY_ID_EQ|国家/地区|EQ||
|N_EMAIL_STATE_EQ|电子邮件质量|EQ||
|N_ID_EQ|标识|EQ||
|N_LANG_ID_EQ|语言|EQ||
|N_LEAD_MINING_REQUEST_ID_EQ|线索挖掘申请|EQ||
|N_LOST_REASON_ID_EQ|丢失原因|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARTNER_ID_EQ|客户|EQ||
|N_PHONE_STATE_EQ|电话号码质量|EQ||
|N_PRIORITY_EQ|优先级|EQ||
|N_STAGE_ID_EQ|阶段|EQ||
|N_STATE_ID_EQ|省/州|EQ||
|N_TEAM_ID_EQ|销售团队|EQ||
|N_TYPE_EQ|类型|EQ||
|N_USER_ID_EQ|销售人员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/crm_lead?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead?id=功能配置`">
  功能配置
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_lead?id=搜索模式`">
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