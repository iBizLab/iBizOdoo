# 数据结构 <!-- {docsify-ignore-all} -->

### 数据库体系[DEFAULT]
#### 审计记录(AUDIT_RECORD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUDIT_INFO|审计信息|TEXT|是|1048576|||
|AUDIT_TYPE|审计类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IP_ADDRESS|访问地址|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|OBJECT_ID|对象标识|VARCHAR|是|100|||
|OBJECT_TYPE|对象类型|VARCHAR|是|100|||
|OP_PERSON_ID|操作人|VARCHAR|是|100|||
|OP_PERSON_NAME|操作人|VARCHAR|是|100|||
#### 用户，更改密码向导(CHANGE_PASSWORD_OWN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CONFIRM_PASSWORD|新密码（确认）|VARCHAR|是|250|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NEW_PASSWORD|新密码|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户，更改密码向导(CHANGE_PASSWORD_USER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NEW_PASSWD|新密码|VARCHAR|是|250|||
|USER_LOGIN|用户登录|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 修改密码向导(CHANGE_PASSWORD_WIZARD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 变更生产数量(CHANGE_PRODUCTION_QTY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|PRODUCT_QTY|待生产的数量|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 客户关系管理活动分析(CRM_ACTIVITY_REPORT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|AUTHOR_ID|已指派给|VARCHAR|是|100|||
|BODY|活动描述|TEXT|是|1048576|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|DATE|完成日期|DATETIME|是||||
|DATE_CLOSED|关闭日期|DATETIME|是||||
|DATE_CONVERSION|转化日期|DATETIME|是||||
|DATE_DEADLINE|预期结束|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEAD_CREATE_DATE|创建日期|DATETIME|是||||
|LEAD_ID|商机|VARCHAR|是|100|||
|LEAD_TYPE|类型|VARCHAR|是|60|||
|MAIL_ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|PARTNER_ID|客户|VARCHAR|是|100|||
|STAGE_ID|阶段|VARCHAR|是|100|||
|SUBTYPE_ID|子类型|VARCHAR|是|100|||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|USER_ID|销售人员|VARCHAR|是|100|||
#### crm_iap_mine模块的帮助方法(CRM_IAP_LEAD_HELPERS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### CRM IAP 领先行业(CRM_IAP_LEAD_INDUSTRY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色指标|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|REVEAL_IDS|显示|VARCHAR|是|500|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### CRM线索挖掘需求(CRM_IAP_LEAD_MINING_REQUEST)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COMPANY_SIZE_MAX|公司最大规模|INT|是||||
|COMPANY_SIZE_MIN|尺寸|INT|是||||
|CONTACT_FILTER_TYPE|筛选于|VARCHAR|是|60|||
|CONTACT_NUMBER|联系人人数|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ERROR_TYPE|错误类型|VARCHAR|是|60|||
|FILTER_ON_SIZE|根据规模过滤|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEAD_CONTACTS_CREDITS|线索联络点数|VARCHAR|是|500|||
|LEAD_COUNT|生成线索的数量|INT|是||||
|LEAD_CREDITS|线索点数|VARCHAR|是|500|||
|LEAD_NUMBER|线索数量|INT|是||||
|LEAD_TOTAL_CREDITS|线索总点数|VARCHAR|是|500|||
|LEAD_TYPE|类型|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|PREFERRED_ROLE_ID|首选角色|VARCHAR|是|100|||
|SEARCH_TYPE|目标|VARCHAR|是|60|||
|SENIORITY_ID|资历|VARCHAR|是|100|||
|STATE|状态|VARCHAR|是|60|||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|USER_ID|销售员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 人物角色(CRM_IAP_LEAD_ROLE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色指标|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|REVEAL_ID|显示|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 人员资历(CRM_IAP_LEAD_SENIORITY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|REVEAL_ID|显示|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 线索/商机(CRM_LEAD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|AUTOMATED_PROBABILITY|自动概率|FLOAT|是||||
|CITY|城市|VARCHAR|是|500|||
|COLOR|颜色索引|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONTACT_NAME|联系人姓名|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_AUTOMATION_LAST|最后操作|DATETIME|是||||
|DATE_CLOSED|关闭日期|DATETIME|是||||
|DATE_CONVERSION|转化日期|DATETIME|是||||
|DATE_DEADLINE|预期结束|DATETIME|是||||
|DATE_LAST_STAGE_UPDATE|最后阶段更新|DATETIME|是||||
|DATE_OPEN|指派日期|DATETIME|是||||
|DAY_CLOSE|待关闭天数|FLOAT|是||||
|DAY_OPEN|待分配天数|FLOAT|是||||
|DESCRIPTION|备注|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DUPLICATE_LEAD_COUNT|潜在的重复线索数量|INT|是||||
|DURATION_TRACKING|状态时间|TEXT|是|1048576|||
|EMAIL_CC|电子邮件抄送|VARCHAR|是|500|||
|EMAIL_DOMAIN_CRITERION|电子邮箱域名标准|VARCHAR|是|500|||
|EMAIL_FROM|电子邮件|VARCHAR|是|500|||
|EMAIL_NORMALIZED|规范化电子邮件|VARCHAR|是|500|||
|EMAIL_STATE|电子邮件质量|VARCHAR|是|60|||
|EXPECTED_REVENUE|预期收入|DECIMAL|是||||
|FUNCTION|工作岗位|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|IAP_ENRICH_DONE|丰富结束|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_AUTOMATED_PROBABILITY|是自动概率？|INT|是||||
|IS_BLACKLISTED|黑名单|INT|是||||
|IS_PARTNER_VISIBLE|是可见合作伙伴|INT|是||||
|LANG_ACTIVE_COUNT|有效语言数量|INT|是||||
|LANG_ID|语言|VARCHAR|是|100|||
|LEAD_MINING_REQUEST_ID|线索挖掘申请|VARCHAR|是|100|||
|LOST_REASON_ID|丢失原因|VARCHAR|是|100|||
|MEETING_DISPLAY_DATE|会议显示日期|DATETIME|是||||
|MEETING_DISPLAY_LABEL|会议显示标签|VARCHAR|是|500|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_BOUNCE|退回|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MOBILE|手机号码|VARCHAR|是|500|||
|MOBILE_BLACKLISTED|列入黑名单的电话号码是手机号码|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_EMAIL_UPDATE|合作伙伴电子邮箱将更新|INT|是||||
|PARTNER_ID|客户|VARCHAR|是|100|||
|PARTNER_NAME|公司名称|VARCHAR|是|500|||
|PARTNER_PHONE_UPDATE|合作伙伴电话号码将更新|INT|是||||
|PHONE|电话号码|VARCHAR|是|500|||
|PHONE_BLACKLISTED|列入黑名单的电话是电话|INT|是||||
|PHONE_MOBILE_SEARCH|电话号码/手机号码|VARCHAR|是|500|||
|PHONE_SANITIZED|已净化号码|VARCHAR|是|500|||
|PHONE_SANITIZED_BLACKLISTED|电话号码已被列入黑名单|INT|是||||
|PHONE_STATE|电话号码质量|VARCHAR|是|60|||
|PRIORITY|优先级|VARCHAR|是|60|||
|PROBABILITY|概率|FLOAT|是||||
|PRORATED_REVENUE|按比例分配的收入|DECIMAL|是||||
|QUOTATION_COUNT|报价的数量|INT|是||||
|RECURRING_REVENUE|经常性收入|DECIMAL|是||||
|RECURRING_REVENUE_MONTHLY|预期 MRR|DECIMAL|是||||
|RECURRING_REVENUE_MONTHLY_PRORATED|按比例分配的 MRR|DECIMAL|是||||
|RECURRING_REVENUE_PRORATED|按比例分配的经常性收入|DECIMAL|是||||
|REFERRED|推荐人|VARCHAR|是|500|||
|REVEAL_ID|显示 ID|VARCHAR|是|500|||
|SALE_AMOUNT_TOTAL|销售订单的总数|DECIMAL|是||||
|SALE_ORDER_COUNT|销售订单数量|INT|是||||
|SHOW_ENRICH_BUTTON|允许手动丰富|INT|是||||
|STAGE_ID|阶段|VARCHAR|是|100|||
|STATE_ID|省/州|VARCHAR|是|100|||
|STREET|街道|VARCHAR|是|500|||
|STREET2|街道2|VARCHAR|是|500|||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|TYPE|类型|VARCHAR|是|60|||
|USER_ID|销售人员|VARCHAR|是|100|||
|WEBSITE|网站|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|ZIP|邮编|VARCHAR|是|500|||
#### 线索转化为商机（非批量）(CRM_LEAD2OPPORTUNITY_PARTNER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTION|相关客户|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|FORCE_ASSIGNMENT|强制指派|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEAD_ID|关联线索|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|客户|VARCHAR|是|100|||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|USER_ID|销售人员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 线索转化为商机（批量）(CRM_LEAD2OPPORTUNITY_PARTNER_MASS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTION|相关客户|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEDUPLICATE|应用去重|INT|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|FORCE_ASSIGNMENT|强制指派|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEAD_ID|关联线索|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|客户|VARCHAR|是|100|||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|USER_ID|销售人员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 获取丢失原因(CRM_LEAD_LOST)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOST_FEEDBACK|关闭说明|TEXT|是|1048576|||
|LOST_REASON_ID|丢失原因|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 更新概率(CRM_LEAD_PLS_UPDATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|PLS_START_DATE|Pls 开始日期|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 线索评分频率(CRM_LEAD_SCORING_FREQUENCY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOST_COUNT|丢失数量|FLOAT|是||||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|VALUE|值|VARCHAR|是|500|||
|VARIABLE|可变|VARCHAR|是|500|||
|WON_COUNT|赢得数量|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 可用于计算预测线索评分的字段(CRM_LEAD_SCORING_FREQUENCY_FIELD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 商机丢失原因(CRM_LOST_REASON)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEADS_COUNT|线索数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 合并商机(CRM_MERGE_OPPORTUNITY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|USER_ID|销售人员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 在新报价上创建新客户或使用现有客户(CRM_QUOTATION_PARTNER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTION|报价给客户|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEAD_ID|关联线索|VARCHAR|是|100|||
|PARTNER_ID|客户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 客户关系管理周期收入计划(CRM_RECURRING_PLAN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|NUMBER_OF_MONTHS|月数|INT|是||||
|SEQUENCE|序号|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 客户关系管理阶段(CRM_STAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|FOLD|在渠道中折叠|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_WON|是赢得阶段？|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|REQUIREMENTS|要求|TEXT|是|1048576|||
|SEQUENCE|序号|INT|是||||
|TEAM_COUNT|team_count|INT|是||||
|TEAM_ID|销售团队|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### CRM标签(CRM_TAG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 销售团队(CRM_TEAM)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ALIAS_EMAIL|电子邮箱别名|VARCHAR|是|500|||
|ALIAS_ID|别名|VARCHAR|是|100|||
|ASSIGNMENT_AUTO_ENABLED|自动指派|INT|是||||
|ASSIGNMENT_DOMAIN|指派域名|VARCHAR|是|500|||
|ASSIGNMENT_ENABLED|线索指派|INT|是||||
|ASSIGNMENT_MAX|线索平均能力|INT|是||||
|ASSIGNMENT_OPTOUT|跳过自动分配|INT|是||||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DASHBOARD_BUTTON_NAME|仪表板按钮|VARCHAR|是|500|||
|DASHBOARD_GRAPH_DATA|数据仪表图|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INVOICED|本月已开具发票|FLOAT|是||||
|INVOICED_TARGET|开票目标|FLOAT|是||||
|IS_FAVORITE|显示仪表|INT|是||||
|IS_MEMBERSHIP_MULTI|允许多个会员资格|INT|是||||
|LEAD_ALL_ASSIGNED_MONTH_COUNT|本月指派的线索/商机|INT|是||||
|LEAD_ALL_ASSIGNED_MONTH_EXCEEDED|超出每月线索分配|INT|是||||
|LEAD_PROPERTIES_DEFINITION|线索属性|TEXT|是|1048576|||
|LEAD_UNASSIGNED_COUNT|未指派的线索|INT|是||||
|MEMBER_WARNING|会员问题警告|TEXT|是|1048576|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OPPORTUNITIES_AMOUNT|商机收入|DECIMAL|是||||
|OPPORTUNITIES_COUNT|商机|INT|是||||
|OPPORTUNITIES_OVERDUE_AMOUNT|逾期商机收入|DECIMAL|是||||
|OPPORTUNITIES_OVERDUE_COUNT|逾期商机|INT|是||||
|QUOTATIONS_AMOUNT|待开票报价单金额|FLOAT|是||||
|QUOTATIONS_COUNT|待开票报价单的数量|INT|是||||
|SALES_TO_INVOICE_COUNT|待开票销售的数量|INT|是||||
|SALE_ORDER_COUNT|销售订单号|INT|是||||
|SEQUENCE|序列|INT|是||||
|USER_ID|团队负责人|VARCHAR|是|100|||
|USE_LEADS|线索|INT|是||||
|USE_OPPORTUNITIES|渠道|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 销售团队成员(CRM_TEAM_MEMBER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ASSIGNMENT_DOMAIN|指派域名|VARCHAR|是|500|||
|ASSIGNMENT_MAX|平均处理线索能力（30 天）|INT|是||||
|ASSIGNMENT_OPTOUT|跳过自动分配|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CRM_TEAM_ID|销售团队|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_MEMBERSHIP_MULTI|允许多个会员资格|INT|是||||
|LEAD_DAY_COUNT|销售线索（过去 24 小时）|INT|是||||
|LEAD_MONTH_COUNT|线索（30天）|INT|是||||
|MEMBER_WARNING|会员警告|TEXT|是|1048576|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|USER_ID|销售员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 讨论频道(DISCUSS_CHANNEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ALLOW_PUBLIC_UPLOAD|允许公开上传|INT|是||||
|CHANNEL_TYPE|频道类型|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT_DISPLAY_MODE|默认显示模式|VARCHAR|是|60|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|FROM_MESSAGE_ID|来自消息|VARCHAR|是|100|||
|GROUP_PUBLIC_ID|授权群组|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_INTEREST_DT|持续的兴趣|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|PARENT_CHANNEL_ID|父频道|VARCHAR|是|100|||
|SFU_CHANNEL_UUID|Sfu 频道 Uuid|VARCHAR|是|250|||
|SFU_SERVER_URL|Sfu 服务器网址|VARCHAR|是|250|||
|UUID|UUID|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 频道成员(DISCUSS_CHANNEL_MEMBER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHANNEL_ID|频道|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CUSTOM_CHANNEL_NAME|自定义频道名称|VARCHAR|是|250|||
|CUSTOM_NOTIFICATIONS|定制通知|VARCHAR|是|60|||
|FETCHED_MESSAGE_ID|最后一次提取|VARCHAR|是|100|||
|FOLD_STATE|对话收拢状态|VARCHAR|是|60|||
|GUEST_ID|访客|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_INTEREST_DT|持续的兴趣|DATETIME|是||||
|LAST_SEEN_DT|上次查看日期|DATETIME|是||||
|MUTE_UNTIL_DT|静音通知，直到|DATETIME|是||||
|NEW_MESSAGE_SEPARATOR|新信息分割符|INT|是||||
|PARTNER_ID|合作伙伴|VARCHAR|是|100|||
|RTC_INVITING_SESSION_ID|振铃会话|VARCHAR|是|100|||
|SEEN_MESSAGE_ID|最近一次查阅|VARCHAR|是|100|||
|UNPIN_DT|取消置顶日期|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件 RTC 会话(DISCUSS_CHANNEL_RTC_SESSION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHANNEL_ID|频道|VARCHAR|是|100|||
|CHANNEL_MEMBER_ID|频道成员|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_CAMERA_ON|正在发送用户视频|INT|是||||
|IS_DEAF|禁用来电声音|INT|是||||
|IS_MUTED|麦克风静音|INT|是||||
|IS_SCREEN_SHARING_ON|正在共享屏幕|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 从 Tenor API 保存收藏的 GIF(DISCUSS_GIF_FAVORITE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|TENOR_GIF_ID|来自 Tenor 的 GIF ID|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 语音附件的元数据(DISCUSS_VOICE_METADATA)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ATTACHMENT_ID|附件|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 收藏(FAV_FAVORITE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|DESCRIPTION|描述|TEXT|是|1048576|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|收藏者|VARCHAR|是|200|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|资源模型|VARCHAR|是|500|||
#### 收件服务器(FETCHMAIL_SERVER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ATTACH|保存附件|INT|是||||
|CONFIGURATION|配置|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|最后收取日期|DATETIME|是||||
|GOOGLE_GMAIL_ACCESS_TOKEN|访问令牌|VARCHAR|是|250|||
|GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION|访问令牌到期时间戳|INT|是||||
|GOOGLE_GMAIL_AUTHORIZATION_CODE|授权码|VARCHAR|是|250|||
|GOOGLE_GMAIL_REFRESH_TOKEN|更新 Token|VARCHAR|是|250|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_SSL|SSL/TLS|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OBJECT_ID|创建新记录|VARCHAR|是|100|||
|ORIGINAL|保留原件|INT|是||||
|PASSWORD|密码|VARCHAR|是|250|||
|PORT|端口|INT|是||||
|PRIORITY|服务器优先级|INT|是||||
|SCRIPT|脚本|VARCHAR|是|250|||
|SERVER|服务器名称|VARCHAR|是|250|||
|SERVER_TYPE|服务器类型|VARCHAR|是|60|||
|STATE|状态|VARCHAR|是|60|||
|USER|用户名|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 申请人(HR_APPLICANT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|APPLICANT_NOTES|申请人备注|TEXT|是|1048576|||
|APPLICATION_STATUS|表单状态|VARCHAR|是|60|||
|ATTACHMENT_NUMBER|附件数量|INT|是||||
|CANDIDATE_ID|应聘人|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_CLOSED|入职日期|DATETIME|是||||
|DATE_LAST_STAGE_UPDATE|最后阶段更新|DATETIME|是||||
|DATE_OPEN|已指派|DATETIME|是||||
|DAY_CLOSE|关闭日期|FLOAT|是||||
|DAY_OPEN|开启天数|FLOAT|是||||
|DELAY_CLOSE|延迟关闭|FLOAT|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_CC|邮件抄送|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|KANBAN_STATE|看板状态|VARCHAR|是|60|||
|LAST_STAGE_ID|最终阶段|VARCHAR|是|100|||
|MEETING_DISPLAY_DATE|会议显示日期|DATETIME|是||||
|MEETING_DISPLAY_TEXT|会议显示文本|VARCHAR|是|500|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|OTHER_APPLICATIONS_COUNT|其他申请数目|INT|是||||
|PARTNER_NAME|合作伙伴名称|VARCHAR|是|500|||
|PRIORITY|评估|VARCHAR|是|60|||
|PROBABILITY|概率|FLOAT|是||||
|REFUSE_DATE|拒绝日期|DATETIME|是||||
|REFUSE_REASON_ID|拒绝理由|VARCHAR|是|100|||
|SALARY_EXPECTED|期望薪资|FLOAT|是||||
|SALARY_EXPECTED_EXTRA|期望工资|VARCHAR|是|500|||
|SALARY_PROPOSED|建议薪资|FLOAT|是||||
|SALARY_PROPOSED_EXTRA|工资标准|VARCHAR|是|500|||
|STAGE_ID|阶段|VARCHAR|是|100|||
|USER_ID|招聘人员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 申请人类别(HR_APPLICANT_CATEGORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色指标|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 拒绝原因 申请人(HR_APPLICANT_REFUSE_REASON)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|TEMPLATE_ID|EMail模板|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 出勤(HR_ATTENDANCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHECK_IN|签到|DATETIME|是||||
|CHECK_OUT|签离|DATETIME|是||||
|COLOR|颜色|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|EXPECTED_HOURS|预期工时|FLOAT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IN_BROWSER|浏览器|VARCHAR|是|500|||
|IN_CITY|城市|VARCHAR|是|500|||
|IN_COUNTRY_NAME|国家|VARCHAR|是|500|||
|IN_IP_ADDRESS|IP地址|VARCHAR|是|500|||
|IN_LATITUDE|纬度|FLOAT|是||||
|IN_LONGITUDE|经度|FLOAT|是||||
|IN_MODE|模式|VARCHAR|是|60|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息传递错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|待处理|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数|INT|是||||
|NO_VALIDATED_OVERTIME_HOURS|无有效加班时间|INT|是||||
|OUT_BROWSER|退出浏览器|VARCHAR|是|500|||
|OUT_CITY|出城|VARCHAR|是|500|||
|OUT_COUNTRY_NAME|国家名称|VARCHAR|是|500|||
|OUT_IP_ADDRESS|出口IP 地址|VARCHAR|是|500|||
|OUT_LATITUDE|纬度|FLOAT|是||||
|OUT_LONGITUDE|出经度|FLOAT|是||||
|OUT_MODE|输出模式|VARCHAR|是|60|||
|OVERTIME_HOURS|随着时间的推移|FLOAT|是||||
|OVERTIME_STATUS|加班状态|VARCHAR|是|60|||
|VALIDATED_OVERTIME_HOURS|加班时间|FLOAT|是||||
|WORKED_HOURS|工作时数|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 出勤 加班(HR_ATTENDANCE_OVERTIME)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADJUSTMENT|调整|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|天|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DURATION|加班时间|FLOAT|是||||
|DURATION_REAL|加班时间（真实）|FLOAT|是||||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 应聘人(HR_CANDIDATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCEPTED_APPLICATIONS_COUNT|已接收录用通知的数目|INT|是||||
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|APPLICATIONS_COUNT|# 期望薪资|INT|是||||
|APPLICATION_COUNT|应用计数|INT|是||||
|ATTACHMENT_COUNT|附件数量|INT|是||||
|AVAILABILITY|可入职日期|DATETIME|是||||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_CC|邮件抄送|VARCHAR|是|500|||
|EMAIL_FROM|电子邮件|VARCHAR|是|500|||
|EMAIL_NORMALIZED|规范化电子邮件|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_BLACKLISTED|黑名单|INT|是||||
|LINKEDIN_PROFILE|LinkedIn个人资料|VARCHAR|是|500|||
|MATCHING_SCORE|匹配分数（%）|FLOAT|是||||
|MEETING_DISPLAY_DATE|会议显示日期|DATETIME|是||||
|MEETING_DISPLAY_TEXT|会议显示文本|VARCHAR|是|500|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_BOUNCE|弹跳|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MOBILE_BLACKLISTED|手机黑名单|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|PARTNER_ID|联系人|VARCHAR|是|100|||
|PARTNER_NAME|候选人姓名|VARCHAR|是|500|||
|PARTNER_PHONE|电话|VARCHAR|是|500|||
|PARTNER_PHONE_SANITIZED|经过消毒的电话号码|VARCHAR|是|500|||
|PHONE_BLACKLISTED|黑名单电话是电话|INT|是||||
|PHONE_MOBILE_SEARCH|电话/手机|VARCHAR|是|500|||
|PHONE_SANITIZED|消毒编号|VARCHAR|是|500|||
|PHONE_SANITIZED_BLACKLISTED|电话黑名单|INT|是||||
|PRIORITY|评估|VARCHAR|是|60|||
|REFUSED_APPLICATIONS_COUNT|已拒绝录用通知的数目|INT|是||||
|SIMILAR_CANDIDATES_COUNT|相似候选人数|INT|是||||
|TYPE_ID|学历|VARCHAR|是|100|||
|USER_ID|候选人管理员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人的技能水平(HR_CANDIDATE_SKILL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CANDIDATE_ID|应聘人|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SKILL_ID|技能|VARCHAR|是|100|||
|SKILL_LEVEL_ID|技能等级|VARCHAR|是|100|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工合同(HR_CONTRACT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|CALENDAR_MISMATCH|日历不匹配|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONTRACT_TYPE_ID|合同类型|VARCHAR|是|100|||
|CONTRACT_WAGE|合同工资|DECIMAL|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_END|结束日期|DATETIME|是||||
|DATE_START|开始日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HAS_MESSAGE|有消息|INT|是||||
|HR_RESPONSIBLE_ID|人力资源主管|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|KANBAN_STATE|看板状态|VARCHAR|是|60|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NOTES|备注|TEXT|是|1048576|||
|RESOURCE_CALENDAR_ID|工作安排|VARCHAR|是|100|||
|STATE|状态|VARCHAR|是|60|||
|STRUCTURE_TYPE_ID|工资结构类型|VARCHAR|是|100|||
|TRIAL_DATE_END|试用期结束|DATETIME|是||||
|WAGE|工资|DECIMAL|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 合同历史(HR_CONTRACT_HISTORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE_EMPLOYEE|在职员工|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONTRACT_COUNT|# 合同|INT|是||||
|CONTRACT_ID|合同|VARCHAR|是|100|||
|CONTRACT_TYPE_ID|合同类型|VARCHAR|是|100|||
|DATE_END|结束日期|DATETIME|是||||
|DATE_HIRED|入职日期|DATETIME|是||||
|DATE_START|开始日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HR_RESPONSIBLE_ID|人力资源主管|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_UNDER_CONTRACT|目前正在签约中|INT|是||||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_CALENDAR_ID|工作安排|VARCHAR|是|100|||
|STATE|状态|VARCHAR|是|60|||
|STRUCTURE_TYPE_ID|工资结构类型|VARCHAR|是|100|||
|UNDER_CONTRACT_STATE|合同状态|VARCHAR|是|60|||
|WAGE|工资|DECIMAL|是||||
#### 合同类型(HR_CONTRACT_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CODE|代码|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 部门(HR_DEPARTMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ABSENCE_OF_TODAY|今日缺勤|INT|是||||
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|ALLOCATION_TO_APPROVE_COUNT|待批准的分配|INT|是||||
|AVATAR|头像|TEXT|是|1048576|||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|COMPLETE_NAME|完整名称|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EXPECTED_EMPLOYEE|预期的员工|INT|是||||
|EXPENSE_SHEETS_TO_APPROVE_COUNT|待批准的费用报表|INT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|HAS_READ_ACCESS|null|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMAGE|头像|TEXT|是|1048576|||
|LEAVE_TO_APPROVE_COUNT|待批准的休假|INT|是||||
|MANAGER_ID|管理员|VARCHAR|是|100|||
|MASTER_DEPARTMENT_ID|主部门|VARCHAR|是|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NEW_APPLICANT_COUNT|新申请|INT|是||||
|NEW_HIRED_EMPLOYEE|新雇用的员工|INT|是||||
|NOTE|备注|TEXT|是|1048576|||
|PARENT_ID|上级部门|VARCHAR|是|100|||
|PARENT_PATH|父级路径|VARCHAR|是|500|||
|PLANS_COUNT|计划数量|INT|是||||
|TOTAL_EMPLOYEE|null|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 离职原因(HR_DEPARTURE_REASON)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|REASON_CODE|理由代码|INT|是||||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 离职向导(HR_DEPARTURE_WIZARD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPARTURE_DATE|离职日期|DATETIME|是||||
|DEPARTURE_DESCRIPTION|其它信息|TEXT|是|1048576|||
|DEPARTURE_REASON_ID|离职原因|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|RELEASE_CAMPANY_CAR|公司车辆发布|INT|是||||
|SET_DATE_END|设置合同结束日期|INT|是||||
|UNASSIGN_EQUIPMENT|免费装备|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工(HR_EMPLOYEE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|ADDITIONAL_NOTE|其它说明|TEXT|是|1048576|||
|ADDRESS_ID|工作地址|VARCHAR|是|100|||
|ALLOCATIONS_COUNT|分配总数量|INT|是||||
|ALLOCATION_COUNT|分配的总天数。|FLOAT|是||||
|ALLOCATION_DISPLAY|分配显示|VARCHAR|是|500|||
|ALLOCATION_REMAINING_DISPLAY|剩余的分配显示|VARCHAR|是|500|||
|ATTENDANCE_MANAGER_ID|考勤管理员|VARCHAR|是|100|||
|ATTENDANCE_STATE|出勤状态|VARCHAR|是|60|||
|BANK_ACCOUNT_ID|银行账户|VARCHAR|是|100|||
|BARCODE|徽标 ID|VARCHAR|是|500|||
|BIRTHDAY|出生日期|DATETIME|是||||
|CERTIFICATE|证书等级|VARCHAR|是|60|||
|CHILDREN|受抚养的子女数|INT|是||||
|CHILD_ALL_COUNT|间接下属统计|INT|是||||
|CHILD_COUNT|直接下属人数|INT|是||||
|COACH_ID|教练|VARCHAR|是|100|||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONTRACTS_COUNT|合同统计|INT|是||||
|CONTRACT_ID|当前合同|VARCHAR|是|100|||
|CONTRACT_WARNING|合同警告|INT|是||||
|COUNTRY_ID|国籍(国家)|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENT_LEAVE_STATE|当前休假状态|VARCHAR|是|60|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DEPARTURE_DATE|离职日期|DATETIME|是||||
|DEPARTURE_DESCRIPTION|其它信息|TEXT|是|1048576|||
|DEPARTURE_REASON_ID|离职原因|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DISTANCE_HOME_WORK|通勤距离|INT|是||||
|DISTANCE_HOME_WORK_UNIT|通勤距离（单位）|VARCHAR|是|60|||
|EMERGENCY_CONTACT|联系人姓名|VARCHAR|是|500|||
|EMERGENCY_PHONE|电话|VARCHAR|是|50|||
|EMPLOYEE_CARS_COUNT|车辆|INT|是||||
|EMPLOYEE_TYPE|员工类型|VARCHAR|是|60|||
|EQUIPMENT_COUNT|设备数量|INT|是||||
|EXPENSE_MANAGER_ID|费用|VARCHAR|是|100|||
|FILTER_FOR_EXPENSE|费用筛选|INT|是||||
|FIRST_CONTRACT_DATE|首次合同日期|DATETIME|是||||
|GENDER|性别|VARCHAR|是|60|||
|HAS_BADGES|有徽章|INT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|HOURS_LAST_MONTH|小时上月|FLOAT|是||||
|HOURS_LAST_MONTH_DISPLAY|小时上月显示|VARCHAR|是|500|||
|HOURS_PREVIOUSLY_TODAY|今天之前的小时数|FLOAT|是||||
|HOURS_TODAY|小时今天|FLOAT|是||||
|HR_ICON_DISPLAY|人力资源显示的图标|VARCHAR|是|60|||
|HR_PRESENCE_STATE|人力资源出席状态|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IDENTIFICATION_ID|身份证号|VARCHAR|是|500|||
|IMAGE|头像|VARCHAR|是|500|||
|IS_ABSENT|今日缺勤|INT|是||||
|IS_FLEXIBLE|灵活可变|INT|是||||
|IS_FULLY_FLEXIBLE|完全灵活|INT|是||||
|IS_SUBORDINATE|是下属|INT|是||||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|JOB_TITLE|工作头衔|VARCHAR|是|500|||
|KM_HOME_WORK|通勤距离（公里）|INT|是||||
|LAST_ACTIVITY|上个活动|DATETIME|是||||
|LAST_ACTIVITY_TIME|上个活动时间|VARCHAR|是|500|||
|LAST_ATTENDANCE_ID|上次出勤|VARCHAR|是|100|||
|LAST_ATTENDANCE_WORKED_HOURS|最后一次出勤 工作时数|FLOAT|是||||
|LEAVES_COUNT|休假次数|FLOAT|是||||
|LEAVE_DATE_FROM|起始日期|DATETIME|是||||
|LEAVE_DATE_TO|至日期|DATETIME|是||||
|LEAVE_MANAGER_ID|休假|VARCHAR|是|100|||
|LEGAL_NAME|法定名称|VARCHAR|是|500|||
|LICENSE_PLATE|车辆牌照|VARCHAR|是|50|||
|MEMBER_OF_DEPARTMENT|部门数量|INT|是||||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MOBILE_PHONE|办公手机|VARCHAR|是|50|||
|MOBILITY_CARD|调动卡|VARCHAR|是|500|||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NEWLY_HIRED|最近聘用的|INT|是||||
|NOTES|备注|TEXT|是|1048576|||
|PARENT_ID|管理员|VARCHAR|是|100|||
|PARENT_PATH|管理链|TEXT|是|1048576|||
|PASSPORT_ID|护照号|VARCHAR|是|500|||
|PERMIT_NO|工作证编号|VARCHAR|是|500|||
|PIN|PIN|VARCHAR|是|500|||
|PLACE_OF_BIRTH|出生地|VARCHAR|是|500|||
|PRIVATE_CAR_PLATE|私人车辆车牌|VARCHAR|是|500|||
|PRIVATE_CITY|城市|VARCHAR|是|500|||
|PRIVATE_COUNTRY_ID|国家|VARCHAR|是|100|||
|PRIVATE_EMAIL|私人电子邮箱|VARCHAR|是|500|||
|PRIVATE_PHONE|私人电话|VARCHAR|是|50|||
|PRIVATE_STATE_ID|私人省/州|VARCHAR|是|100|||
|PRIVATE_STREET|街道|VARCHAR|是|500|||
|PRIVATE_STREET2|街道2|VARCHAR|是|500|||
|PRIVATE_ZIP|邮编|VARCHAR|是|50|||
|RELATED_PARTNERS_COUNT|相关合作伙伴数量|INT|是||||
|REMAINING_LEAVES|可用休假天数|FLOAT|是||||
|RESOURCE_CALENDAR_ID|工作时间|VARCHAR|是|100|||
|RESOURCE_ID|资源|VARCHAR|是|100|||
|SHOW_HR_ICON_DISPLAY|显示HR图标|INT|是||||
|SHOW_LEAVES|能够查看到剩余休假|INT|是||||
|SINID|社会保险号SIN|VARCHAR|是|50|||
|SPOUSE_BIRTHDATE|配偶生日|DATETIME|是||||
|SPOUSE_COMPLETE_NAME|配偶全名|VARCHAR|是|500|||
|SSNID|社会保障号SSN|VARCHAR|是|500|||
|STUDY_FIELD|研究领域|VARCHAR|是|500|||
|STUDY_SCHOOL|毕业院校|VARCHAR|是|500|||
|TOTAL_OVERTIME|加班费总额|FLOAT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|VEHICLE|公司汽车|VARCHAR|是|50|||
|VISA_EXPIRE|签证有效期|DATETIME|是||||
|VISA_NO|签证号|VARCHAR|是|500|||
|WORK_CONTACT_ID|工作联系人|VARCHAR|是|100|||
|WORK_EMAIL|工作电子邮件|VARCHAR|是|500|||
|WORK_LOCATION_ID|工作地点|VARCHAR|是|100|||
|WORK_LOCATION_NAME|工作位置名称|VARCHAR|是|500|||
|WORK_LOCATION_TYPE|工作位置类型|VARCHAR|是|60|||
|WORK_PERMIT_EXPIRATION_DATE|工作许可证到期日期|DATETIME|是||||
|WORK_PERMIT_NAME|工作许可名称|VARCHAR|是|500|||
|WORK_PERMIT_SCHEDULED_ACTIVITY|工作许可的预定活动|INT|是||||
|WORK_PHONE|办公电话|VARCHAR|是|50|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 基本员工(HR_EMPLOYEE_BASE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDRESS_ID|工作地址|VARCHAR|是|100|||
|ALLOCATIONS_COUNT|分配总数量|INT|是||||
|ALLOCATION_COUNT|分配的总天数。|FLOAT|是||||
|ALLOCATION_DISPLAY|分配显示|VARCHAR|是|500|||
|ALLOCATION_REMAINING_DISPLAY|剩余的分配显示|VARCHAR|是|500|||
|CHILD_ALL_COUNT|间接下属统计|INT|是||||
|CHILD_COUNT|直接下属人数|INT|是||||
|COACH_ID|教练|VARCHAR|是|100|||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CURRENT_LEAVE_STATE|当前休假状态|VARCHAR|是|60|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|FILTER_FOR_EXPENSE|费用筛选|INT|是||||
|HAS_BADGES|有徽章|INT|是||||
|HR_ICON_DISPLAY|人力资源显示的图标|VARCHAR|是|60|||
|HR_PRESENCE_STATE|人力资源出席状态|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_ABSENT|今日缺勤|INT|是||||
|IS_FLEXIBLE|灵活可变|INT|是||||
|IS_FULLY_FLEXIBLE|完全灵活|INT|是||||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|JOB_TITLE|工作头衔|VARCHAR|是|500|||
|LAST_ACTIVITY|上个活动|DATETIME|是||||
|LAST_ACTIVITY_TIME|上个活动时间|VARCHAR|是|500|||
|LEAVES_COUNT|休假次数|FLOAT|是||||
|LEAVE_DATE_FROM|起始日期|DATETIME|是||||
|LEAVE_DATE_TO|至日期|DATETIME|是||||
|LEAVE_MANAGER_ID|休假|VARCHAR|是|100|||
|MEMBER_OF_DEPARTMENT|部门数量|INT|是||||
|MOBILE_PHONE|办公手机|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|NEWLY_HIRED|最近聘用的|INT|是||||
|PARENT_ID|管理员|VARCHAR|是|100|||
|REMAINING_LEAVES|可用休假天数|FLOAT|是||||
|SHOW_HR_ICON_DISPLAY|显示HR图标|INT|是||||
|SHOW_LEAVES|能够查看到剩余休假|INT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|WORK_CONTACT_ID|工作联系人|VARCHAR|是|100|||
|WORK_EMAIL|工作电子邮件|VARCHAR|是|500|||
|WORK_LOCATION_ID|工作地点|VARCHAR|是|100|||
|WORK_LOCATION_NAME|工作位置名称|VARCHAR|是|500|||
|WORK_LOCATION_TYPE|工作位置类型|VARCHAR|是|60|||
|WORK_PHONE|办公电话|VARCHAR|是|500|||
#### 员工类别(HR_EMPLOYEE_CATEGORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色指标|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 打印简历(HR_EMPLOYEE_CV_WIZARD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CAN_SHOW_OTHERS|能展示其他|INT|是||||
|CAN_SHOW_SKILLS|能展示技能|INT|是||||
|COLOR_PRIMARY|主要颜色|VARCHAR|是|500|||
|COLOR_SECONDARY|次要颜色|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SHOW_CONTACT|联系信息|INT|是||||
|SHOW_OTHERS|其它|INT|是||||
|SHOW_SKILLS|技能|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 公共员工(HR_EMPLOYEE_PUBLIC)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDRESS_ID|工作地址|VARCHAR|是|100|||
|ALLOCATIONS_COUNT|分配总数量|INT|是||||
|ALLOCATION_COUNT|分配的总天数。|FLOAT|是||||
|ALLOCATION_DISPLAY|分配显示|VARCHAR|是|500|||
|ALLOCATION_REMAINING_DISPLAY|剩余的分配显示|VARCHAR|是|500|||
|CHILD_ALL_COUNT|间接下属统计|INT|是||||
|CHILD_COUNT|直接下属人数|INT|是||||
|COACH_ID|教练|VARCHAR|是|100|||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENT_LEAVE_STATE|当前休假状态|VARCHAR|是|60|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EXPENSE_MANAGER_ID|费用经理|VARCHAR|是|100|||
|FILTER_FOR_EXPENSE|费用筛选|INT|是||||
|FIRST_CONTRACT_DATE|首次合同日期|DATETIME|是||||
|HAS_BADGES|有徽章|INT|是||||
|HR_ICON_DISPLAY|人力资源显示的图标|VARCHAR|是|60|||
|HR_PRESENCE_STATE|人力资源出席状态|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_ABSENT|今日缺勤|INT|是||||
|IS_FLEXIBLE|灵活可变|INT|是||||
|IS_FULLY_FLEXIBLE|完全灵活|INT|是||||
|IS_MANAGER|是经理|INT|是||||
|IS_SUBORDINATE|是下属|INT|是||||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|JOB_TITLE|工作头衔|VARCHAR|是|500|||
|LAST_ACTIVITY|上个活动|DATETIME|是||||
|LAST_ACTIVITY_TIME|上个活动时间|VARCHAR|是|500|||
|LEAVES_COUNT|休假次数|FLOAT|是||||
|LEAVE_DATE_FROM|起始日期|DATETIME|是||||
|LEAVE_DATE_TO|至日期|DATETIME|是||||
|LEAVE_MANAGER_ID|休假|VARCHAR|是|100|||
|MEMBER_OF_DEPARTMENT|部门数量|INT|是||||
|MOBILE_PHONE|办公手机|VARCHAR|是|500|||
|MOBILITY_CARD|调动卡|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|NEWLY_HIRED|最近聘用的|INT|是||||
|PARENT_ID|管理员|VARCHAR|是|100|||
|REMAINING_LEAVES|可用休假天数|FLOAT|是||||
|RESOURCE_CALENDAR_ID|资源日历|VARCHAR|是|100|||
|RESOURCE_ID|资源|VARCHAR|是|100|||
|SHOW_HR_ICON_DISPLAY|显示HR图标|INT|是||||
|SHOW_LEAVES|能够查看到剩余休假|INT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|WORK_CONTACT_ID|工作联系人|VARCHAR|是|100|||
|WORK_EMAIL|工作电子邮件|VARCHAR|是|500|||
|WORK_LOCATION_ID|工作地点|VARCHAR|是|100|||
|WORK_LOCATION_NAME|工作位置名称|VARCHAR|是|500|||
|WORK_LOCATION_TYPE|工作位置类型|VARCHAR|是|60|||
|WORK_PHONE|办公电话|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工的技能等级(HR_EMPLOYEE_SKILL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SKILL_ID|技能|VARCHAR|是|100|||
|SKILL_LEVEL_ID|技能等级|VARCHAR|是|100|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 技能历史(HR_EMPLOYEE_SKILL_LOG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SKILL_ID|技能|VARCHAR|是|100|||
|SKILL_LEVEL_ID|技能等级|VARCHAR|是|100|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工技能报表(HR_EMPLOYEE_SKILL_REPORT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COMPANY_ID|公司|VARCHAR|是|100|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HAS_DEPARTMENT_MANAGER_ACCESS|拥有部门经理访问权限|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEVEL_PROGRESS|等级进度|FLOAT|是||||
|SKILL_ID|技能|VARCHAR|是|100|||
|SKILL_LEVEL|技能等级|VARCHAR|是|500|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
#### 费用(HR_EXPENSE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|ANALYTIC_PRECISION|分析精度|INT|是||||
|CAN_BE_REINVOICED|可重开结算单|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|CURRENCY_RATE|汇率|FLOAT|是||||
|DATE|费用日期|DATETIME|是||||
|DESCRIPTION|内部说明|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_EDITABLE|可由当前用户编辑|INT|是||||
|IS_MULTIPLE_CURRENCY|currency_id是否与company_currency_id不同？|INT|是||||
|LABEL_CURRENCY_RATE|标签币别汇率|VARCHAR|是|500|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NB_ATTACHMENT|附件数量|INT|是||||
|PAYMENT_MODE|支付|VARCHAR|是|60|||
|PRICE_UNIT|单价|FLOAT|是||||
|PRODUCT_DESCRIPTION|产品说明|TEXT|是|1048576|||
|PRODUCT_HAS_COST|产品有成本|INT|是||||
|PRODUCT_HAS_TAX|是否对所选产品定义税费|INT|是||||
|QUANTITY|数量|FLOAT|是||||
|SHEET_ID|费用报表|VARCHAR|是|100|||
|STATE|状态|VARCHAR|是|60|||
|TAX_AMOUNT|税金金额|DECIMAL|是||||
|TAX_AMOUNT_CURRENCY|以币别计的税额|DECIMAL|是||||
|TOTAL_AMOUNT|总计|DECIMAL|是||||
|TOTAL_AMOUNT_CURRENCY|按币别合计|DECIMAL|是||||
|UNTAXED_AMOUNT_CURRENCY|以币别计算的未税总额|DECIMAL|是||||
|VENDOR_ID|供应商|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 费用批准重复(HR_EXPENSE_APPROVE_DUPLICATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 费用拒绝原因向导(HR_EXPENSE_REFUSE_WIZARD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|REASON|原因|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 费用报表(HR_EXPENSE_SHEET)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNTING_DATE|费用报表日期|DATETIME|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|AMOUNT_RESIDUAL|到期金额|DECIMAL|是||||
|APPROVAL_DATE|审批日期|DATETIME|是||||
|APPROVAL_STATE|审批状态|VARCHAR|是|60|||
|CANNOT_APPROVE_REASON|无法批准原因|VARCHAR|是|500|||
|CAN_APPROVE|能批准|INT|是||||
|CAN_RESET|可重置|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_EDITABLE|当前用户可编辑费用项目|INT|是||||
|IS_MULTIPLE_CURRENCY|处理明细中有不同的币别|INT|是||||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NB_ACCOUNT_MOVE|日记账分录编码|INT|是||||
|NB_EXPENSE|费用的数量|INT|是||||
|SALE_ORDER_COUNT|销售订单计数|INT|是||||
|STATE|状态|VARCHAR|是|60|||
|TOTAL_AMOUNT|总计|DECIMAL|是||||
|TOTAL_TAX_AMOUNT|税项|DECIMAL|是||||
|UNTAXED_AMOUNT|未税金额|DECIMAL|是||||
|USER_ID|管理员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 费用分摊(HR_EXPENSE_SPLIT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ANALYTIC_PRECISION|分析精度|INT|是||||
|CAN_BE_REINVOICED|可重开结算单|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|EXPENSE_ID|费用|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PRODUCT_HAS_COST|是否选择非零成本的产品|INT|是||||
|PRODUCT_HAS_TAX|是否对所选产品定义税费|INT|是||||
|TAX_AMOUNT_CURRENCY|以币别计的税额|DECIMAL|是||||
|TOTAL_AMOUNT_CURRENCY|按币别合计|DECIMAL|是||||
|WIZARD_ID|向导|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 费用拆分向导(HR_EXPENSE_SPLIT_WIZARD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EXPENSE_ID|费用|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SPLIT_POSSIBLE|拆分可能|INT|是||||
|TAX_AMOUNT_CURRENCY|税项|DECIMAL|是||||
|TOTAL_AMOUNT_CURRENCY|金额总计|DECIMAL|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 取消休假向导(HR_HOLIDAYS_CANCEL_LEAVE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEAVE_ID|休假要求|VARCHAR|是|100|||
|REASON|原因|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工休假总结报表(HR_HOLIDAYS_SUMMARY_EMPLOYEE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|来自|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HOLIDAY_TYPE|选择休假类别|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作岗位(HR_JOB)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITIES_OVERDUE|基于活动的状态
逾期：已经超过截止日期
现今：活动日期是当天
 计划：未来活动。|INT|是||||
|ACTIVITIES_TODAY|今天的活动|INT|是||||
|ADDRESS_ID|工作地点|VARCHAR|是|100|||
|ALIAS_EMAIL|电子邮箱别名|VARCHAR|是|500|||
|ALIAS_ID|别名|VARCHAR|是|100|||
|ALL_APPLICATION_COUNT|所有申请计计数|INT|是||||
|APPLICANT_HIRED|聘用的申请人|INT|是||||
|APPLICANT_PROPERTIES_DEFINITION|申请人物业|TEXT|是|1048576|||
|APPLICATION_COUNT|应用计数|INT|是||||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONTRACT_TYPE_ID|雇佣类型|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|起始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DESCRIPTION|工作说明|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DOCUMENTS_COUNT|文档数|INT|是||||
|EXPECTED_EMPLOYEES|预计员工数合计|INT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDUSTRY_ID|行业|VARCHAR|是|100|||
|IS_FAVORITE|是喜好的|INT|是||||
|MANAGER_ID|部门经理|VARCHAR|是|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|NEW_APPLICATION_COUNT|新的申请|INT|是||||
|NO_OF_EMPLOYEE|当前员工数量|INT|是||||
|NO_OF_HIRED_EMPLOYEE|被雇佣的|INT|是||||
|NO_OF_RECRUITMENT|目标|INT|是||||
|OLD_APPLICATION_COUNT|旧申请|INT|是||||
|REQUIREMENTS|要求|TEXT|是|1048576|||
|SEQUENCE|序列|INT|是||||
|USER_ID|招聘人员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘平台(HR_JOB_PLATFORM)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL|电子邮件|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|REGEX|Regex|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 休假(HR_LEAVE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|CAN_APPROVE|能批准|INT|是||||
|CAN_CANCEL|可以取消|INT|是||||
|CAN_RESET|能重置|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DURATION_DISPLAY|要求的（天/小时）|VARCHAR|是|500|||
|EMPLOYEE_COMPANY_ID|员工公司|VARCHAR|是|100|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|FIRST_APPROVER_ID|首次审批|VARCHAR|是|100|||
|HAS_MANDATORY_DAY|有义务日|INT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|HOLIDAY_STATUS_ID|休假类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_HATCHED|已孵化|INT|是||||
|IS_STRIKED|罢工|INT|是||||
|LAST_SEVERAL_DAYS|全天|INT|是||||
|LEAVE_TYPE_INCREASES_DURATION|假期类型 增加持续时间|INT|是||||
|MANAGER_ID|管理员|VARCHAR|是|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NOTES|理由|TEXT|是|1048576|||
|NUMBER_OF_DAYS|持续时间（天）|FLOAT|是||||
|NUMBER_OF_HOURS|持续时间(小时)|FLOAT|是||||
|OVERTIME_DEDUCTIBLE|加班费免赔额|INT|是||||
|OVERTIME_ID|加班时间|VARCHAR|是|100|||
|PRIVATE_NAME|休假描述|VARCHAR|是|500|||
|REQUEST_DATE_FROM|请假开始日期|DATETIME|是||||
|REQUEST_DATE_FROM_PERIOD|日期开始|VARCHAR|是|60|||
|REQUEST_DATE_TO|请求结束日期|DATETIME|是||||
|REQUEST_HOUR_FROM|时间从|FLOAT|是||||
|REQUEST_HOUR_TO|时间到|FLOAT|是||||
|REQUEST_UNIT_HALF|半天|INT|是||||
|REQUEST_UNIT_HOURS|自定义时间|INT|是||||
|RESOURCE_CALENDAR_ID|资源行事历|VARCHAR|是|100|||
|SECOND_APPROVER_ID|第二次审批|VARCHAR|是|100|||
|STATE|状态|VARCHAR|是|60|||
|SUPPORTED_ATTACHMENT_IDS_COUNT|支持的附件ID计数|INT|是||||
|TZ_MISMATCH|时区不匹配|INT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 应计方案等级(HR_LEAVE_ACCRUAL_LEVEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCRUAL_PLAN_ID|应计方案|VARCHAR|是|100|||
|ACCRUAL_VALIDITY|累计有效期|INT|是||||
|ACCRUAL_VALIDITY_COUNT|累计有效数|INT|是||||
|ACCRUAL_VALIDITY_TYPE|累计有效类型|VARCHAR|是|60|||
|ACTION_WITH_UNUSED_ACCRUALS|结转|VARCHAR|是|60|||
|ADDED_VALUE|比率|FLOAT|是||||
|ADDED_VALUE_TYPE|附加值类型|VARCHAR|是|60|||
|CAN_MODIFY_VALUE_TYPE|可修改值类型|INT|是||||
|CAP_ACCRUED_TIME|累计时间上限|INT|是||||
|CAP_ACCRUED_TIME_YEARLY|里程碑上限|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|FIRST_DAY|第一天|INT|是||||
|FIRST_MONTH|第一个月|VARCHAR|是|60|||
|FIRST_MONTH_DAY|第一个月日|INT|是||||
|FREQUENCY|频率|VARCHAR|是|60|||
|FREQUENCY_HOURLY_SOURCE|频率 每小时 来源|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAXIMUM_LEAVE|限制|FLOAT|是||||
|MAXIMUM_LEAVE_YEARLY|每年上限|FLOAT|是||||
|POSTPONE_MAX_DAYS|应计款项转出的最大金额|INT|是||||
|SECOND_DAY|第二天|INT|是||||
|SECOND_MONTH|第二个月|VARCHAR|是|60|||
|SECOND_MONTH_DAY|第二个月日|INT|是||||
|SEQUENCE|顺序|INT|是||||
|START_COUNT|之后开始|INT|是||||
|START_TYPE|null|VARCHAR|是|60|||
|WEEK_DAY|分配|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|YEARLY_DAY|年度日|INT|是||||
|YEARLY_MONTH|年 月|VARCHAR|是|60|||
#### 应计方案(HR_LEAVE_ACCRUAL_PLAN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCRUED_GAIN_TIME|应计收益时间|VARCHAR|是|60|||
|ACTIVE|有效|INT|是||||
|ADDED_VALUE_TYPE|附加值类型|VARCHAR|是|60|||
|CARRYOVER_DATE|结转时间|VARCHAR|是|60|||
|CARRYOVER_DAY|结转日|INT|是||||
|CARRYOVER_MONTH|结转月|VARCHAR|是|60|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEES_COUNT|员工|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_BASED_ON_WORKED_TIME|按工作时间计算|INT|是||||
|LEVEL_COUNT|等级|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|SHOW_TRANSITION_MODE|显示过渡模式|INT|是||||
|TIME_OFF_TYPE_ID|休假类型|VARCHAR|是|100|||
|TRANSITION_MODE|里程碑式的过渡|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 休息分配(HR_LEAVE_ALLOCATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCRUAL_PLAN_ID|应计方案|VARCHAR|是|100|||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|ACTUAL_LASTCALL|null|DATETIME|是||||
|ALLOCATION_TYPE|分配类别|VARCHAR|是|60|||
|ALREADY_ACCRUED|已累计|INT|是||||
|APPROVER_ID|首次审批|VARCHAR|是|100|||
|CAN_APPROVE|能批准|INT|是||||
|CARRIED_OVER_DAYS_EXPIRATION_DATE|到期日期顺延天数|DATETIME|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DURATION_DISPLAY|分配 （天/小时）|VARCHAR|是|500|||
|EMPLOYEE_COMPANY_ID|公司|VARCHAR|是|100|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|EXPIRING_CARRYOVER_DAYS|将于 Carry_over_days_expiration_date 到期的结转天数|FLOAT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|HOLIDAY_STATUS_ID|休假类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_NAME_CUSTOM|名称是否自订|INT|是||||
|IS_OFFICER|主管|INT|是||||
|LASTCALL|最后一次应计分配的日期|DATETIME|是||||
|LAST_EXECUTED_CARRYOVER_DATE|null|DATETIME|是||||
|LEAVES_TAKEN|已休假|FLOAT|是||||
|MANAGER_ID|管理员|VARCHAR|是|100|||
|MAX_LEAVES|休假總額|FLOAT|是||||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NAME_VALIDITY|具有有效性的描述|VARCHAR|是|500|||
|NEXTCALL|下一次应计分配的日期|DATETIME|是||||
|NOTES|理由|TEXT|是|1048576|||
|NUMBER_OF_DAYS|天数|FLOAT|是||||
|NUMBER_OF_DAYS_DISPLAY|持续时间（天）|FLOAT|是||||
|NUMBER_OF_HOURS_DISPLAY|时长(小时)|FLOAT|是||||
|OVERTIME_DEDUCTIBLE|加班费免赔额|INT|是||||
|OVERTIME_ID|加班时间|VARCHAR|是|100|||
|SECOND_APPROVER_ID|第二次审批|VARCHAR|是|100|||
|STATE|状态|VARCHAR|是|60|||
|TYPE_REQUEST_UNIT|类型 申请单位|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|YEARLY_ACCRUED_AMOUNT|null|FLOAT|是||||
#### 为多名员工生成休假时间分配(HR_LEAVE_ALLOCATION_GENERATE_MULTI_WIZARD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCRUAL_PLAN_ID|应计方案|VARCHAR|是|100|||
|ALLOCATION_MODE|分配模式|VARCHAR|是|60|||
|ALLOCATION_TYPE|分配类别|VARCHAR|是|60|||
|CATEGORY_ID|员工标签|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DURATION|分配|FLOAT|是||||
|HOLIDAY_STATUS_ID|休假类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|NOTES|理由|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 摘要 / 报表(HR_LEAVE_EMPLOYEE_TYPE_REPORT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE_EMPLOYEE|在职员工|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HOLIDAY_STATUS|假期状况|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NUMBER_OF_DAYS|天数|FLOAT|是||||
|NUMBER_OF_HOURS|工时数|FLOAT|是||||
|STATE|状态|VARCHAR|是|60|||
#### 为多名员工生成休假时间(HR_LEAVE_GENERATE_MULTI_WIZARD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALLOCATION_MODE|分配模式|VARCHAR|是|60|||
|CATEGORY_ID|员工标签|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HOLIDAY_STATUS_ID|休假类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 强制工作日(HR_LEAVE_MANDATORY_DAY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|END_DATE|结束日期|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_CALENDAR_ID|工作时间|VARCHAR|是|100|||
|START_DATE|开始日期|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 摘要 / 报表(HR_LEAVE_REPORT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALLOCATION_ID|分配申请|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HAS_DEPARTMENT_MANAGER_ACCESS|拥有部门经理访问权限|INT|是||||
|HOLIDAY_STATUS_ID|休假类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEAVE_ID|休假要求|VARCHAR|是|100|||
|LEAVE_TYPE|申请类型|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|NUMBER_OF_DAYS|天数|FLOAT|是||||
|NUMBER_OF_HOURS|工时数|FLOAT|是||||
|STATE|状态|VARCHAR|是|60|||
#### 休假日历(HR_LEAVE_REPORT_CALENDAR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COMPANY_ID|公司|VARCHAR|是|100|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DESCRIPTION|描述|VARCHAR|是|500|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DURATION|时长|FLOAT|是||||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HOLIDAY_STATUS_ID|休假类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_HATCHED|已孵化|INT|是||||
|IS_MANAGER|管理员|INT|是||||
|IS_STRIKED|罢工|INT|是||||
|JOB_ID|工作|VARCHAR|是|100|||
|LEAVE_ID|离开|VARCHAR|是|100|||
|START_DATETIME|来自|DATETIME|是||||
|STATE|状态|VARCHAR|是|60|||
|STOP_DATETIME|至|DATETIME|是||||
#### 休假类型(HR_LEAVE_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCRUAL_COUNT|应计数量|FLOAT|是||||
|ACTIVE|有效|INT|是||||
|ALLOCATION_COUNT|分配|INT|是||||
|ALLOCATION_NOTIF_SUBTYPE_ID|分配通知子类型|VARCHAR|是|100|||
|ALLOCATION_VALIDATION_TYPE|审批|VARCHAR|是|60|||
|ALLOWS_NEGATIVE|允许负上限|INT|是||||
|COLOR|颜色|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_CALENDAR_MEETING|在日历中显示休假|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_REQUESTS|员工要求|VARCHAR|是|60|||
|GROUP_DAYS_LEAVE|休假分组|FLOAT|是||||
|HAS_VALID_ALLOCATION|拥有有效的分配|INT|是||||
|ICON_ID|封面图片|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INCLUDE_PUBLIC_HOLIDAYS_IN_DURATION|包括公众假期|INT|是||||
|LEAVES_TAKEN|已休假|FLOAT|是||||
|LEAVE_NOTIF_SUBTYPE_ID|休假通知子类型|VARCHAR|是|100|||
|LEAVE_VALIDATION_TYPE|休假验证|VARCHAR|是|60|||
|MAX_ALLOWED_NEGATIVE|最大超量|INT|是||||
|MAX_LEAVES|最大允许|FLOAT|是||||
|NAME|名称|VARCHAR|是|200|||
|OVERTIME_DEDUCTIBLE|调休申请|INT|是||||
|REQUEST_UNIT|休假最小单位|VARCHAR|是|60|||
|REQUIRES_ALLOCATION|需要分配|VARCHAR|是|60|||
|SEQUENCE|序列|INT|是||||
|SHOW_ON_DASHBOARD|在仪表板显示|INT|是||||
|SUPPORT_DOCUMENT|支持性文件|INT|是||||
|TIME_TYPE|休假种类|VARCHAR|是|60|||
|UNPAID|没付款|INT|是||||
|VIRTUAL_REMAINING_LEAVES|有效的剩余休假|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 人力资源经理部门报告(HR_MANAGER_DEPARTMENT_REPORT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HAS_DEPARTMENT_MANAGER_ACCESS|拥有部门经理访问权限|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
#### 工资结构类型(HR_PAYROLL_STRUCTURE_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT_RESOURCE_CALENDAR_ID|默认工作时间|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 申请人学历(HR_RECRUITMENT_DEGREE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 申请人来源(HR_RECRUITMENT_SOURCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALIAS_ID|别名ID|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_DOMAIN|有域|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_ID|工作|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘阶段(HR_RECRUITMENT_STAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|FOLD|折叠看板|INT|是||||
|HIRED_STAGE|雇佣阶段|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_WARNING_VISIBLE|警告是否清晰可见|INT|是||||
|LEGEND_BLOCKED|红色的看板标签|VARCHAR|是|500|||
|LEGEND_DONE|绿色看板标签|VARCHAR|是|500|||
|LEGEND_NORMAL|灰色看板标签|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|REQUIREMENTS|要求|TEXT|是|1048576|||
|SEQUENCE|序列|INT|是||||
|TEMPLATE_ID|EMail模板|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工的简历明细(HR_RESUME_LINE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_END|结束日期|DATETIME|是||||
|DATE_START|开始日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DISPLAY_TYPE|显示类型|VARCHAR|是|60|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|EXPIRATION_STATUS|到期状态|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LINE_TYPE_ID|类型|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 简历明细的类型(HR_RESUME_LINE_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 技能(HR_SKILL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 技能等级(HR_SKILL_LEVEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT_LEVEL|默认等级|INT|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEVEL_PROGRESS|进度|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 技能类型(HR_SKILL_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COLOR|颜色|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作地点(HR_WORK_LOCATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDRESS_ID|工作地址|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCATION_NUMBER|地点编号|VARCHAR|是|500|||
|LOCATION_TYPE|封面图片|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 集成应用(HUB_APP)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|APP_ID|应用标识|VARCHAR|是|200|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDEX_ID|首页标识|VARCHAR|是|200|||
|NAME|名称|VARCHAR|是|200|||
|ORDER|排序值|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 服务器动作(IR_ACTIONS_SERVER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_DATE_DEADLINE_RANGE|截止日期至|INT|是||||
|ACTIVITY_DATE_DEADLINE_RANGE_TYPE|到期类型|VARCHAR|是|60|||
|ACTIVITY_NOTE|备注|TEXT|是|1048576|||
|ACTIVITY_SUMMARY|标题|VARCHAR|是|250|||
|ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|ACTIVITY_USER_FIELD_NAME|用户字段|VARCHAR|是|250|||
|ACTIVITY_USER_ID|负责人|VARCHAR|是|100|||
|ACTIVITY_USER_TYPE|用户类型|VARCHAR|是|60|||
|BINDING_TYPE|绑定类型|VARCHAR|是|60|||
|BINDING_VIEW_TYPES|绑定视图类型|VARCHAR|是|250|||
|CODE|Python 代码|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CRUD_MODEL_ID|创建记录|VARCHAR|是|100|||
|EVALUATION_TYPE|值类型|VARCHAR|是|60|||
|HELP|动作描述|TEXT|是|1048576|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LINK_FIELD_ID|链接字段|VARCHAR|是|100|||
|MAIL_POST_AUTOFOLLOW|订阅收件人|INT|是||||
|MAIL_POST_METHOD|发送电子邮件|VARCHAR|是|60|||
|MODEL_ID|模型|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|PATH|网站中显示的路径|VARCHAR|是|250|||
|SEQUENCE|序列|INT|是||||
|SMS_METHOD|发送短信为|VARCHAR|是|60|||
|STATE|类型|VARCHAR|是|60|||
|TEMPLATE_ID|EMail模板|VARCHAR|是|100|||
|TYPE|动作类型|VARCHAR|是|250|||
|UPDATE_BOOLEAN_VALUE|布尔值|VARCHAR|是|60|||
|UPDATE_FIELD_ID|要更新的字段|VARCHAR|是|100|||
|UPDATE_M2M_OPERATION|Many2many 业务|VARCHAR|是|60|||
|UPDATE_PATH|字段更新路径|VARCHAR|是|250|||
|UPDATE_RELATED_MODEL_ID|更新相关模型|VARCHAR|是|100|||
|USAGE|用途|VARCHAR|是|60|||
|VALUE|值|TEXT|是|1048576|||
|WEBHOOK_URL|Webhook URL|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 附件(IR_ATTACHMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCESS_TOKEN|访问令牌|VARCHAR|是|500|||
|CHECKSUM|校验码/SHA1|VARCHAR|是|500|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|FILE_ID|oss文件标识|VARCHAR|是|500|||
|FILE_SIZE|文件大小|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDEX_CONTENT|索引内容|TEXT|是|1048576|||
|MIMETYPE|Mime类型|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|ORIGINAL_ID|原始（未优化，未调整大小）附件|VARCHAR|是|100|||
|PUBLIC|是公开文件|INT|是||||
|RES_FIELD|资源字段|VARCHAR|是|500|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|资源模型|VARCHAR|是|500|||
|STORE_FNAME|存储的文件名|VARCHAR|是|500|||
|TYPE|类型|VARCHAR|是|60|||
|URL|网址|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 系统参数(IR_CONFIG_PARAMETER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KEY|密钥KEY|VARCHAR|是|250|||
|VALUE|值|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 计划的操作(IR_CRON)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CRON_NAME|名称|VARCHAR|是|250|||
|FAILURE_COUNT|失败次数|INT|是||||
|FIRST_FAILURE_DATE|首次失败日期|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERVAL_NUMBER|间隔数值|INT|是||||
|INTERVAL_TYPE|间隔单位|VARCHAR|是|60|||
|IR_ACTIONS_SERVER_ID|服务器动作标识|VARCHAR|是|100|||
|LASTCALL|最后执行日期|DATETIME|是||||
|MODEL_ID|模型|VARCHAR|是|100|||
|NEXTCALL|下一次执行日期|DATETIME|是||||
|PRIORITY|优先级|INT|是||||
|USER_ID|执行帐户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 预定操作进度(IR_CRON_PROGRESS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEACTIVATE|取消激活|INT|是||||
|DONE|完成|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|REMAINING|剩余|INT|是||||
|TIMED_OUT_COUNTER|计数器超时|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 触发行动(IR_CRON_TRIGGER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALL_AT|调用时间|DATETIME|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CRON_ID|标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 默认值(IR_DEFAULT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONDITION|条件|VARCHAR|是|250|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FIELD_ID|属性标识|VARCHAR|是|200|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JSON_VALUE|默认值 (JSON格式)|VARCHAR|是|250|||
|USER_ID|用户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件服务器(IR_MAIL_SERVER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FROM_FILTER|FROM 过滤|VARCHAR|是|250|||
|GOOGLE_GMAIL_ACCESS_TOKEN|访问令牌|VARCHAR|是|250|||
|GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION|访问令牌到期时间戳|INT|是||||
|GOOGLE_GMAIL_AUTHORIZATION_CODE|授权码|VARCHAR|是|250|||
|GOOGLE_GMAIL_REFRESH_TOKEN|更新 Token|VARCHAR|是|250|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAX_EMAIL_SIZE|最大电子邮件大小|FLOAT|是||||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|优先级|INT|是||||
|SMTP_AUTHENTICATION|验证|VARCHAR|是|60|||
|SMTP_DEBUG|调试|INT|是||||
|SMTP_ENCRYPTION|连接加密|VARCHAR|是|60|||
|SMTP_HOST|SMTP服务器|VARCHAR|是|250|||
|SMTP_PASS|密码|VARCHAR|是|250|||
|SMTP_PORT|SMTP端口|INT|是||||
|SMTP_USER|用户名|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模型(IR_MODEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INFO|信息|TEXT|是|1048576|||
|IS_MAIL_ACTIVITY|有邮件活动|INT|是||||
|IS_MAIL_BLACKLIST|有邮件黑名单|INT|是||||
|IS_MAIL_THREAD|有邮件会话|INT|是||||
|MODEL|模型|VARCHAR|是|250|||
|NAME|名称|VARCHAR|是|200|||
|ORDER|排序|VARCHAR|是|250|||
|STATE|类型|VARCHAR|是|60|||
|TRANSIENT|瞬态模型|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模型访问(IR_MODEL_ACCESS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|GROUP_ID|授权群组|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODEL_ID|模型|VARCHAR|是|200|||
|NAME|名称|VARCHAR|是|200|||
|PERM_CREATE|创建|INT|是||||
|PERM_READ|读取|INT|是||||
|PERM_UNLINK|删除|INT|是||||
|PERM_WRITE|写入|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模块限制(IR_MODEL_CONSTRAINT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFINITION|定义|VARCHAR|是|250|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE|信息|VARCHAR|是|250|||
|NAME|名称|VARCHAR|是|200|||
|TYPE|约束类型|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模型数据(IR_MODEL_DATA)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODEL|模型名称|VARCHAR|是|250|||
|MODULE|模块|VARCHAR|是|250|||
|NAME|名称|VARCHAR|是|200|||
|NOUPDATE|不可更新|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 字段(IR_MODEL_FIELDS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLUMN1|列 1|VARCHAR|是|250|||
|COLUMN2|列 2|VARCHAR|是|250|||
|COMPANY_DEPENDENT|公司依赖|INT|是||||
|COMPLETE_NAME|全名|VARCHAR|是|250|||
|COMPUTE|计算|TEXT|是|1048576|||
|COPIED|可复制|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_FIELD|币别字段|VARCHAR|是|250|||
|DEPENDS|依赖于|VARCHAR|是|250|||
|DOMAIN|域名|VARCHAR|是|250|||
|FIELD_DESCRIPTION|字段标签|VARCHAR|是|250|||
|GROUP_EXPAND|扩展组别|INT|是||||
|HELP|字段帮助|TEXT|是|1048576|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDEX|索引|INT|是||||
|MODEL|模型名称|VARCHAR|是|250|||
|NAME|名称|VARCHAR|是|200|||
|ON_DELETE|关于删除|VARCHAR|是|60|||
|READONLY|只读|INT|是||||
|RELATED|关联的字段|VARCHAR|是|250|||
|RELATION|关联的模型|VARCHAR|是|250|||
|RELATION_FIELD|关联字段|VARCHAR|是|250|||
|RELATION_TABLE|关系表|VARCHAR|是|250|||
|REQUIRED|必填|INT|是||||
|SANITIZE|净化 HTML|INT|是||||
|SANITIZE_ATTRIBUTES|净化 HTML 属性|INT|是||||
|SANITIZE_FORM|净化 HTML 表格|INT|是||||
|SANITIZE_OVERRIDABLE|可重写消毒 HTML|INT|是||||
|SANITIZE_STYLE|净化 HTML 样式|INT|是||||
|SANITIZE_TAGS|清除 HTML 标记|INT|是||||
|SELECTABLE|可选择|INT|是||||
|SIZE|大小|INT|是||||
|STATE|类型|VARCHAR|是|60|||
|STORE|存储|INT|是||||
|STRIP_CLASSES|剥离类属性|INT|是||||
|STRIP_STYLE|带状样式属性|INT|是||||
|TRACKING|启用跟踪|INT|是||||
|TRANSLATE|可翻译|INT|是||||
|TTYPE|字段类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 字段选择(IR_MODEL_FIELDS_SELECTION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|VALUE|值|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模型继承树(IR_MODEL_INHERIT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
#### 关系模型(IR_MODEL_RELATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 应用(IR_MODULE_CATEGORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|EXCLUSIVE|专属|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PARENT_ID|家长申请|VARCHAR|是|100|||
|SEQUENCE|序列|INT|是||||
|VISIBLE|显示|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模块(IR_MODULE_MODULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICATION|应用|INT|是||||
|APP_ID|应用标识|VARCHAR|是|200|||
|AUTHOR|作者|VARCHAR|是|250|||
|AUTO_INSTALL|自动安装|INT|是||||
|CATEGORY_ID|类别|VARCHAR|是|100|||
|CONTRIBUTORS|协作者|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEMO|演示数据|INT|是||||
|DESCRIPTION|描述|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ICON|图标网址|VARCHAR|是|250|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMPORTED|导入的模块|INT|是||||
|LATEST_VERSION|已安装版本|VARCHAR|是|250|||
|LICENSE|许可证|VARCHAR|是|60|||
|MAINTAINER|维护者|VARCHAR|是|250|||
|MENUS_BY_MODULE|菜单|TEXT|是|1048576|||
|MODULE_TYPE|模块类型|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|ORDER|排序值|INT|是||||
|PUBLISHED_VERSION|出版版本|VARCHAR|是|250|||
|REPORTS_BY_MODULE|报表|TEXT|是|1048576|||
|RES_CODE|资源标识|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|SHORTDESC|模块名|VARCHAR|是|250|||
|STATE|状态|VARCHAR|是|60|||
|SUMMARY|摘要|VARCHAR|是|250|||
|TO_BUY|ERP 企业版专属模块|INT|是||||
|URL|URL|VARCHAR|是|250|||
|VIEWS_BY_MODULE|视图|TEXT|是|1048576|||
|WEBSITE|网站|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模块依赖性(IR_MODULE_MODULE_DEPENDENCY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTO_INSTALL_REQUIRED|需要自动安装|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODULE_ID|模块|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
#### 模块排除(IR_MODULE_MODULE_EXCLUSION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODULE_ID|模块|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 规则(IR_RULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DOMAIN_FORCE|域名|TEXT|是|1048576|||
|GLOBAL|全局|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODEL_ID|模型|VARCHAR|是|200|||
|NAME|名称|VARCHAR|是|200|||
|PERM_CREATE|创建|INT|是||||
|PERM_READ|读取|INT|是||||
|PERM_UNLINK|删除|INT|是||||
|PERM_WRITE|写入|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 序列(IR_SEQUENCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CODE|序列类型|VARCHAR|是|500|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMPLEMENTATION|实施策略|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|NUMBER_INCREMENT|步长|INT|是||||
|NUMBER_NEXT|下一个编号|INT|是||||
|PADDING|序列填充长度|INT|是||||
|PREFIX|前缀|VARCHAR|是|500|||
|SUFFIX|后缀|VARCHAR|是|500|||
|USE_DATE_RANGE|按日期重编序列号|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 统一资源(IR_UNIRES)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RES_CODE|资源代码|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动(MAIL_ACTIVITY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|AUTOMATED|自动活动|INT|是||||
|CAN_WRITE|可写|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_DEADLINE|到期日期|DATETIME|是||||
|DATE_DONE|完成日期|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_RECOMMENDED_ACTIVITIES|下一活动可用|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NOTE|备注|TEXT|是|1048576|||
|PREVIOUS_ACTIVITY_TYPE_ID|上一个活动类型|VARCHAR|是|100|||
|RECOMMENDED_ACTIVITY_TYPE_ID|推荐的活动类型|VARCHAR|是|100|||
|REQUEST_PARTNER_ID|请求伙伴|VARCHAR|是|100|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|资源模型|VARCHAR|是|200|||
|RES_NAME|单据名称|VARCHAR|是|200|||
|STATE|状态|VARCHAR|是|60|||
|SUMMARY|摘要|VARCHAR|是|500|||
|USER_ID|分派给|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动Mixin(MAIL_ACTIVITY_MIXIN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
#### 活动计划(MAIL_ACTIVITY_PLAN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPARTMENT_ASSIGNABLE|部门可指派|INT|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_USER_ON_DEMAND|按需负责|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|STEPS_COUNT|步数计数|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DELAY_COUNT|间隔|INT|是||||
|DELAY_FROM|触发方式|VARCHAR|是|60|||
|DELAY_UNIT|延迟单位|VARCHAR|是|60|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NOTE|备注|TEXT|是|1048576|||
|PLAN_ID|计划|VARCHAR|是|100|||
|RESPONSIBLE_ID|分派给|VARCHAR|是|100|||
|RESPONSIBLE_TYPE|指派|VARCHAR|是|60|||
|SEQUENCE|序列|INT|是||||
|SUMMARY|摘要|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|ACTIVITY_USER_ID|分派给|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_DEADLINE|到期日期|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ERROR|错误|TEXT|是|1048576|||
|HAS_ERROR|有错误|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_BATCH_MODE|批量使用|INT|是||||
|NOTE|备注|TEXT|是|1048576|||
|PLAN_DATE|计划日期|DATETIME|是||||
|PLAN_DEPARTMENT_FILTERABLE|计划部门可筛选|INT|是||||
|PLAN_ID|计划|VARCHAR|是|100|||
|PLAN_ON_DEMAND_USER_ID|分派给|VARCHAR|是|100|||
|PLAN_SUMMARY|计划概要|TEXT|是|1048576|||
|RES_IDS|文档 ID|TEXT|是|1048576|||
|RES_MODEL|模型|VARCHAR|是|500|||
|SUMMARY|摘要|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 同时创建活动和待办事项(MAIL_ACTIVITY_TODO_CREATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_DEADLINE|截止日期|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NOTE|注意|TEXT|是|1048576|||
|SUMMARY|摘要|VARCHAR|是|500|||
|USER_ID|指派给|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动类型(MAIL_ACTIVITY_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CATEGORY|操作|VARCHAR|是|60|||
|CHAINING_TYPE|链接类型|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DECORATION_TYPE|排版类型|VARCHAR|是|60|||
|DEFAULT_NOTE|默认备注|TEXT|是|1048576|||
|DEFAULT_USER_ID|默认用户|VARCHAR|是|100|||
|DELAY_COUNT|安排|INT|是||||
|DELAY_FROM|延迟类型|VARCHAR|是|60|||
|DELAY_LABEL|延迟标签|VARCHAR|是|500|||
|DELAY_UNIT|延迟单位|VARCHAR|是|60|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ICON|图标|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KEEP_DONE|保持完成|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|RES_MODEL|资源模型|VARCHAR|是|200|||
|RES_MODEL_CHANGE|模型已更改|INT|是||||
|SEQUENCE|序列|INT|是||||
|SUMMARY|默认摘要|VARCHAR|是|500|||
|TRIGGERED_NEXT_TYPE_ID|触发方式|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动类型模板(MAIL_ACTIVITY_TYPE_MAIL_TEMPLATE_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAIL_ACTIVITY_TYPE_ID|标识|VARCHAR|是|100|||
|MAIL_TEMPLATE_ID|标识|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
#### EMail别名(MAIL_ALIAS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALIAS_BOUNCED_CONTENT|自定义退回消息|TEXT|是|1048576|||
|ALIAS_CONTACT|别名授权于|VARCHAR|是|60|||
|ALIAS_DEFAULTS|默认值|TEXT|是|1048576|||
|ALIAS_DOMAIN_ID|别名域|VARCHAR|是|100|||
|ALIAS_FORCE_THREAD_ID|记录线索ID|INT|是||||
|ALIAS_FULL_NAME|别名电子邮件|VARCHAR|是|500|||
|ALIAS_INCOMING_LOCAL|收件时检测本地的别名域|INT|是||||
|ALIAS_MODEL_ID|模型别名|VARCHAR|是|100|||
|ALIAS_NAME|别名|VARCHAR|是|500|||
|ALIAS_PARENT_MODEL_ID|上级模型|VARCHAR|是|100|||
|ALIAS_PARENT_THREAD_ID|上级记录ID|INT|是||||
|ALIAS_STATUS|别名状态|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 电子邮件域名(MAIL_ALIAS_DOMAIN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BOUNCE_ALIAS|弹跳别名|VARCHAR|是|500|||
|BOUNCE_EMAIL|退件电子邮件|VARCHAR|是|500|||
|CATCHALL_ALIAS|全部别名|VARCHAR|是|500|||
|CATCHALL_EMAIL|预设邮件|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT_FROM|默认发件人别名|VARCHAR|是|500|||
|DEFAULT_FROM_EMAIL|默认从|VARCHAR|是|500|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### EMail别名 Mixin(MAIL_ALIAS_MIXIN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALIAS_EMAIL|电子邮件别名|VARCHAR|是|500|||
|ALIAS_ID|别名|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
#### 电子邮件别名混合素（轻型）(MAIL_ALIAS_MIXIN_OPTIONAL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALIAS_EMAIL|电子邮件别名|VARCHAR|是|500|||
|ALIAS_ID|别名|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
#### 邮件黑名单(MAIL_BLACKLIST)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL|Email地址|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|待处理|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 从黑名单向导中删除电子邮件(MAIL_BLACKLIST_REMOVE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL|电子邮件|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|REASON|原因|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件机器人(MAIL_BOT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
#### 预设回复(MAIL_CANNED_RESPONSE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|VARCHAR|是|500|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_EDITABLE|确定当前用户是否可以编辑预制回复|INT|是||||
|IS_SHARED|确定预设回复当前是否与其他用户共享|INT|是||||
|LAST_USED|上次使用|DATETIME|是||||
|SOURCE|快捷|VARCHAR|是|500|||
|SUBSTITUTION|替换|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件编辑器混合(MAIL_COMPOSER_MIXIN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BODY|内容|TEXT|是|1048576|||
|BODY_HAS_TEMPLATE_VALUE|正文内容与模板相同|INT|是||||
|CAN_EDIT_BODY|可以编辑主体|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_MAIL_TEMPLATE_EDITOR|是编辑者|INT|是||||
|LANG|语言|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|RENDER_MODEL|渲染模型|VARCHAR|是|500|||
|SUBJECT|主旨|VARCHAR|是|500|||
|TEMPLATE_ID|邮件模板|VARCHAR|是|100|||
#### EMail撰写向导(MAIL_COMPOSE_MESSAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTHOR_ID|作者|VARCHAR|是|100|||
|AUTO_DELETE|删除邮件|INT|是||||
|AUTO_DELETE_KEEP_LOG|保存消息副本|INT|是||||
|BODY|内容|TEXT|是|1048576|||
|BODY_HAS_TEMPLATE_VALUE|正文内容与模板相同|INT|是||||
|CAN_EDIT_BODY|可以编辑主体|INT|是||||
|COMPOSITION_BATCH|批次组合|INT|是||||
|COMPOSITION_MODE|写作模式|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_ADD_SIGNATURE|添加签名|INT|是||||
|EMAIL_FROM|来自|VARCHAR|是|500|||
|EMAIL_LAYOUT_XMLID|电子邮件通知布局|VARCHAR|是|500|||
|FORCE_SEND|直接发送邮件或通知|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_MAIL_TEMPLATE_EDITOR|是编辑者|INT|是||||
|LANG|语言|VARCHAR|是|500|||
|MAIL_ACTIVITY_TYPE_ID|邮件活动类型|VARCHAR|是|100|||
|MASS_MAILING_NAME|邮件标题|VARCHAR|是|500|||
|MESSAGE_TYPE|类型|VARCHAR|是|60|||
|MODEL|相关单据模型|VARCHAR|是|500|||
|MODEL_IS_THREAD|已启用对话串|INT|是||||
|PARENT_ID|上级消息|VARCHAR|是|100|||
|RECORD_ALIAS_DOMAIN_ID|别名域|VARCHAR|是|100|||
|RECORD_COMPANY_ID|公司|VARCHAR|是|100|||
|RECORD_NAME|记录名称|VARCHAR|是|500|||
|RENDER_MODEL|渲染模型|VARCHAR|是|500|||
|REPLY_TO|回复|VARCHAR|是|500|||
|REPLY_TO_FORCE_NEW|视答案为新线程|INT|是||||
|REPLY_TO_MODE|回复|VARCHAR|是|60|||
|RES_DOMAIN|有效的域|TEXT|是|1048576|||
|RES_DOMAIN_USER_ID|负责人|VARCHAR|是|100|||
|RES_IDS|相关文档 ID|TEXT|是|1048576|||
|SCHEDULED_DATE|安排的日期|VARCHAR|是|500|||
|SUBJECT|主旨|VARCHAR|是|500|||
|SUBTYPE_ID|子类型|VARCHAR|是|100|||
|SUBTYPE_IS_LOG|是系统日志|INT|是||||
|TEMPLATE_ID|使用模版|VARCHAR|是|100|||
|TEMPLATE_NAME|模板名称|VARCHAR|是|500|||
|USE_EXCLUSION_LIST|检查排除清单|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 关注(MAIL_FOLLOWERS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|PARTNER_ID|相关的业务伙伴|VARCHAR|是|100|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|相关的单据模型名称|VARCHAR|是|500|||
|TYPE|关注类型|VARCHAR|是|60|||
|USER_ID|关注人|VARCHAR|是|100|||
#### 允许的邮件网关(MAIL_GATEWAY_ALLOWED)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL|Email地址|VARCHAR|是|500|||
|EMAIL_NORMALIZED|规范化邮件|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 访客(MAIL_GUEST)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCESS_TOKEN|访问令牌|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IM_STATUS|IM的状态|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### ICE 服务器(MAIL_ICE_SERVER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CREDENTIAL|凭据|VARCHAR|是|500|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SERVER_TYPE|类型|VARCHAR|是|60|||
|URI|URI|VARCHAR|是|500|||
|USERNAME|用户名|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 存储链接预览数据(MAIL_LINK_PREVIEW)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMAGE_MIMETYPE|图像哑剧类型|VARCHAR|是|500|||
|IS_HIDDEN|已隐藏|INT|是||||
|MESSAGE_ID|消息|VARCHAR|是|100|||
|OG_DESCRIPTION|描述|TEXT|是|1048576|||
|OG_IMAGE|图像|VARCHAR|是|500|||
|OG_MIMETYPE|MIME 类型|VARCHAR|是|500|||
|OG_SITE_NAME|网站名称|VARCHAR|是|500|||
|OG_TITLE|标题|VARCHAR|是|500|||
|OG_TYPE|类型|VARCHAR|是|500|||
|SOURCE_URL|网址|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 发出邮件(MAIL_MAIL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTO_DELETE|自动删除|INT|是||||
|BODY_CONTENT|富文本内容|TEXT|是|1048576|||
|BODY_HTML|文本内容|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_CC|抄送|VARCHAR|是|500|||
|EMAIL_TO|至|TEXT|是|1048576|||
|FAILURE_REASON|失败原因|TEXT|是|1048576|||
|FAILURE_TYPE|失败类型|VARCHAR|是|60|||
|HEADERS|请求头|TEXT|是|1048576|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_NOTIFICATION|通知电子邮件|INT|是||||
|MAIL_MESSAGE_ID|消息|VARCHAR|是|100|||
|MAIL_MESSAGE_ID_INT|邮件消息 ID 整型|INT|是||||
|REFERENCES|参考|TEXT|是|1048576|||
|RESTRICTED_ATTACHMENT_COUNT|受限制的附件|INT|是||||
|SCHEDULED_DATE|安排的发送日期|DATETIME|是||||
|STATE|状态|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 评论(MAIL_MESSAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNT_AUDIT_LOG_ACTIVATED|审计日志已启动|INT|是||||
|ACCOUNT_AUDIT_LOG_PREVIEW|描述|TEXT|是|1048576|||
|AUTHOR_GUEST_ID|访客|VARCHAR|是|100|||
|AUTHOR_ID|作者|VARCHAR|是|100|||
|BODY|内容|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|日期|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_ADD_SIGNATURE|电子邮件添加签字|INT|是||||
|EMAIL_FROM|来自|VARCHAR|是|500|||
|EMAIL_LAYOUT_XMLID|布局|VARCHAR|是|500|||
|HAS_ERROR|有错误|INT|是||||
|HAS_SMS_ERROR|有短信息错误|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_CURRENT_USER_OR_GUEST_AUTHOR|是当前用户还是访客作者|INT|是||||
|IS_INTERNAL|仅限员工|INT|是||||
|MAIL_ACTIVITY_TYPE_ID|邮件活动类型|VARCHAR|是|100|||
|MESSAGE_ID|消息ID|VARCHAR|是|500|||
|MESSAGE_TYPE|类型|VARCHAR|是|60|||
|MODEL|相关单据模型|VARCHAR|是|500|||
|NEEDACTION|需要行动|INT|是||||
|PARENT_AUTHOR_ID|上级消息作者|VARCHAR|是|100|||
|PARENT_ID|上级消息|VARCHAR|是|100|||
|PINNED_AT|已置顶|DATETIME|是||||
|PREVIEW|预览|VARCHAR|是|500|||
|PRINCIPAL_TYPE|评论主体类型|VARCHAR|是|100|||
|RATING_VALUE|评级值|FLOAT|是||||
|RECORD_ALIAS_DOMAIN_ID|别名域|VARCHAR|是|100|||
|RECORD_COMPANY_ID|公司|VARCHAR|是|100|||
|RECORD_NAME|消息记录名称|VARCHAR|是|500|||
|REPLY_TO|回复 至|VARCHAR|是|500|||
|REPLY_TO_FORCE_NEW|无响应|INT|是||||
|RES_ID|资源标识|VARCHAR|是|100|||
|SNAILMAIL_ERROR|蜗牛邮件错误消息|INT|是||||
|STARRED|星标消息|INT|是||||
|SUBJECT|主旨|VARCHAR|是|500|||
|SUBTYPE_ID|子类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 消息反应(MAIL_MESSAGE_REACTION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CONTENT|内容|VARCHAR|是|500|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|GUEST_ID|反应的访客|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ID|消息|VARCHAR|是|100|||
|PARTNER_ID|反应的伙伴|VARCHAR|是|100|||
#### 消息收件人(MAIL_MESSAGE_RECIPIENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ID|标识|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|标识|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 安排的消息(MAIL_MESSAGE_SCHEDULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAIL_MESSAGE_ID|消息|VARCHAR|是|100|||
|NOTIFICATION_PARAMETERS|通知参数|TEXT|是|1048576|||
|SCHEDULED_DATETIME|安排的发送日期|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 消息子类型(MAIL_MESSAGE_SUBTYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT|默认|INT|是||||
|DESCRIPTION|描述|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HIDDEN|隐藏|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERNAL|仅内部的|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|PARENT_ID|上级|VARCHAR|是|100|||
|RELATION_FIELD|关联字段|VARCHAR|是|500|||
|RES_MODEL|模型|VARCHAR|是|500|||
|SEQUENCE|序列|INT|是||||
|TRACK_RECIPIENTS|跟踪收件人|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 在线翻译(MAIL_MESSAGE_TRANSLATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BODY|翻译正文|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ID|消息|VARCHAR|是|100|||
|SOURCE_LANG|语言|VARCHAR|是|500|||
|TARGET_LANG|目标语言|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 消息通知(MAIL_NOTIFICATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTHOR_ID|作者|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|FAILURE_REASON|失败原因|TEXT|是|1048576|||
|FAILURE_TYPE|失败类型|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_READ|已读|INT|是||||
|MAIL_MAIL_ID|邮件|VARCHAR|是|100|||
|MAIL_MESSAGE_ID|消息|VARCHAR|是|100|||
|NOTIFICATION_STATUS|状态|VARCHAR|是|60|||
|NOTIFICATION_TYPE|通知类型|VARCHAR|是|60|||
|READ_DATE|读取日期|DATETIME|是||||
|RES_PARTNER_ID|收件人|VARCHAR|是|100|||
|SMS_ID_INT|短信 ID|INT|是||||
|SMS_NUMBER|短信息号码|VARCHAR|是|500|||
#### 推送通知(MAIL_PUSH)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAIL_PUSH_DEVICE_ID|设备|VARCHAR|是|100|||
|PAYLOAD|负载|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 推送通知设备(MAIL_PUSH_DEVICE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ENDPOINT|浏览器端点|VARCHAR|是|500|||
|EXPIRATION_TIME|到期令牌日期|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KEYS|浏览器按键|VARCHAR|是|500|||
|PARTNER_ID|合作伙伴|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件渲染混合(MAIL_RENDER_MIXIN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LANG|语言|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|RENDER_MODEL|渲染模型|VARCHAR|是|500|||
#### EMail重发向导(MAIL_RESEND_MESSAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CAN_CANCEL|可以取消|INT|是||||
|CAN_RESEND|可以重新发送|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAIL_MESSAGE_ID|消息|VARCHAR|是|100|||
|PARTNER_READONLY|业务合作伙伴只读|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 为邮件重新发送提供附加信息的合作伙伴(MAIL_RESEND_PARTNER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE|错误消息|VARCHAR|是|500|||
|NOTIFICATION_ID|通知|VARCHAR|是|100|||
|RESEND|重试|INT|是||||
|RESEND_WIZARD_ID|重发向导|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 安排的消息(MAIL_SCHEDULED_MESSAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTHOR_ID|作者|VARCHAR|是|100|||
|BODY|内容|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_NOTE|是备注|INT|是||||
|MODEL|相关单据模型|VARCHAR|是|500|||
|NOTIFICATION_PARAMETERS|通知参数|TEXT|是|1048576|||
|SCHEDULED_DATE|安排的日期|DATETIME|是||||
|SUBJECT|主旨|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### EMail模板(MAIL_TEMPLATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|AUTO_DELETE|自动删除|INT|是||||
|BODY_HTML|正文|TEXT|是|1048576|||
|CAN_WRITE|可写|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|模板描述|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_CC|抄送|VARCHAR|是|500|||
|EMAIL_FROM|来自|VARCHAR|是|500|||
|EMAIL_LAYOUT_XMLID|电子邮件通知布局|VARCHAR|是|500|||
|EMAIL_TO|至（EMail）|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_TEMPLATE_EDITOR|是模板编辑器|INT|是||||
|LANG|语言|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_TO|至（合作伙伴）|VARCHAR|是|500|||
|RENDER_MODEL|渲染模型|VARCHAR|是|500|||
|REPLY_TO|回复|VARCHAR|是|500|||
|SCHEDULED_DATE|安排的日期|VARCHAR|是|500|||
|SUBJECT|主旨|VARCHAR|是|500|||
|TEMPLATE_CATEGORY|模板类别|VARCHAR|是|60|||
|TEMPLATE_FS|模板文件名|VARCHAR|是|500|||
|USER_ID|用户|VARCHAR|是|100|||
|USE_DEFAULT_TO|默认收件人|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### EMail模板预览(MAIL_TEMPLATE_PREVIEW)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BODY_HTML|正文|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_CC|抄送|VARCHAR|是|500|||
|EMAIL_FROM|来自|VARCHAR|是|500|||
|EMAIL_TO|至|VARCHAR|是|500|||
|ERROR_MSG|错误消息|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAIL_TEMPLATE_ID|相关的邮件模板|VARCHAR|是|100|||
|NO_RECORD|没有记录|INT|是||||
|REPLY_TO|回复 至|VARCHAR|是|500|||
|SCHEDULED_DATE|安排的日期|VARCHAR|是|500|||
|SUBJECT|主旨|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件模板重置(MAIL_TEMPLATE_RESET)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件会话(MAIL_THREAD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|待处理|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
#### mixin邮件黑名单(MAIL_THREAD_BLACKLIST)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|EMAIL_NORMALIZED|规范化邮件|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_BLACKLISTED|黑名单|INT|是||||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_BOUNCE|退回|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|待处理|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
#### 电子邮件副本管理(MAIL_THREAD_CC)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|EMAIL_CC|邮件抄送|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|待处理|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
#### 主邮件附件管理(MAIL_THREAD_MAIN_ATTACHMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|待处理|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
#### 电话黑名单混混合(MAIL_THREAD_PHONE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MOBILE_BLACKLISTED|列入黑名单的手机是移动的|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|PHONE_BLACKLISTED|列入黑名单的电话是电话|INT|是||||
|PHONE_MOBILE_SEARCH|电话/手机|VARCHAR|是|500|||
|PHONE_SANITIZED|净化数量|VARCHAR|是|500|||
|PHONE_SANITIZED_BLACKLISTED|电话号码被列入黑名单|INT|是||||
#### 用于计算记录在 many2one 字段的每个值上所花费时间的混合函数(MAIL_TRACKING_DURATION_MIXIN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DURATION_TRACKING|状态时间|TEXT|是|1048576|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件跟踪值(MAIL_TRACKING_VALUE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|FIELD_ID|属性标识|VARCHAR|是|200|||
|FIELD_INFO|属性信息|TEXT|是|1048576|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAIL_MESSAGE_ID|消息ID|VARCHAR|是|100|||
|NEW_VALUE_CHAR|新字符值|VARCHAR|是|500|||
|NEW_VALUE_DATETIME|新日期时间值|DATETIME|是||||
|NEW_VALUE_FLOAT|新浮点值|FLOAT|是||||
|NEW_VALUE_INTEGER|新整数值|INT|是||||
|NEW_VALUE_TEXT|新文本值|TEXT|是|1048576|||
|OLD_VALUE_CHAR|旧字符值|VARCHAR|是|500|||
|OLD_VALUE_DATETIME|旧日期时间值|DATETIME|是||||
|OLD_VALUE_FLOAT|旧浮点值|FLOAT|是||||
|OLD_VALUE_INTEGER|旧整数值|INT|是||||
|OLD_VALUE_TEXT|旧文本值|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邀请向导(MAIL_WIZARD_INVITE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE|消息|TEXT|是|1048576|||
|NOTIFY|通知收件人|INT|是||||
|RES_ID|相关单据ID|INT|是||||
|RES_MODEL|相关单据模型|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 资源工作时间(RESOURCE_CALENDAR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FLEXIBLE_HOURS|灵活时间|INT|是||||
|FULL_TIME_REQUIRED_HOURS|公司全职|FLOAT|是||||
|HOURS_PER_DAY|每天平均小时数|FLOAT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|TWO_WEEKS_CALENDAR|双周模式下的日历|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作细节(RESOURCE_CALENDAR_ATTENDANCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALENDAR_ID|资源的日历|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|起始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DAYOFWEEK|星期|VARCHAR|是|60|||
|DAY_PERIOD|日期|VARCHAR|是|60|||
|DISPLAY_TYPE|显示类型|VARCHAR|是|60|||
|DURATION_DAYS|持续时间 (天)|FLOAT|是||||
|HOUR_FROM|工作起始|FLOAT|是||||
|HOUR_TO|工作截止|FLOAT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_ID|资源|VARCHAR|是|100|||
|SEQUENCE|序列|INT|是||||
|WEEK_TYPE|周数|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 休假详细信息(RESOURCE_CALENDAR_LEAVES)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALENDAR_ID|工作时间|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|HOLIDAY_ID|休假要求|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_ID|资源|VARCHAR|是|100|||
|TIME_TYPE|时间类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 资源(RESOURCE_RESOURCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CALENDAR_ID|工时|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_TYPE|类型|VARCHAR|是|60|||
|TIME_EFFICIENCY|效率因子|FLOAT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 银行(RES_BANK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|BIC|银行识别码|VARCHAR|是|500|||
|CITY|城市|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EMAIL|邮箱|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PHONE|电话|VARCHAR|是|500|||
|STREET|街道|VARCHAR|是|500|||
|STREET2|详细地址|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|ZIP|邮编|VARCHAR|是|500|||
#### 公司(RES_COMPANY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ABSENCE_MANAGEMENT|缺勤管理|INT|是||||
|ACCOUNT_FISCAL_COUNTRY_ID|会计所在国家/地区|VARCHAR|是|100|||
|ACCOUNT_OPENING_DATE|期初分录|DATETIME|是||||
|ACCOUNT_PRICE_INCLUDE|Default Sales Price Include|VARCHAR|是|60|||
|ACCOUNT_STORNO|Storno会计应用程序|INT|是||||
|ACCOUNT_USE_CREDIT_LIMIT|销售信用额度|INT|是||||
|ACTIVE|有效|INT|是||||
|ALIAS_DOMAIN_ID|电子邮件域名|VARCHAR|是|100|||
|ANGLO_SAXON_ACCOUNTING|使用盎格鲁撒克逊会计|INT|是||||
|ANNUAL_INVENTORY_DAY|日期|INT|是||||
|ANNUAL_INVENTORY_MONTH|年度库存月|VARCHAR|是|60|||
|ATTENDANCE_BARCODE_SOURCE|条码来源|VARCHAR|是|60|||
|ATTENDANCE_FROM_SYSTRAY|来自 Systray 的出席情况|INT|是||||
|ATTENDANCE_KIOSK_DELAY|自助考勤终端延迟|INT|是||||
|ATTENDANCE_KIOSK_KEY|自助考勤终端密钥|VARCHAR|是|500|||
|ATTENDANCE_KIOSK_MODE|考勤模式|VARCHAR|是|60|||
|ATTENDANCE_KIOSK_USE_PIN|员工PIN|INT|是||||
|ATTENDANCE_OVERTIME_VALIDATION|额外工时验证|VARCHAR|是|60|||
|AUTOPOST_BILLS|自动验证账单|INT|是||||
|AUTO_CHECK_OUT|自动签退|INT|是||||
|AUTO_CHECK_OUT_TOLERANCE|null|FLOAT|是||||
|BANK_ACCOUNT_CODE_PREFIX|Prefix of the bank accounts|VARCHAR|是|500|||
|BATCH_PAYMENT_SEQUENCE_ID|Batch Payment Sequence|VARCHAR|是|100|||
|CANDIDATE_PROPERTIES_DEFINITION|候选人属性|TEXT|是|1048576|||
|CASH_ACCOUNT_CODE_PREFIX|Prefix of the cash accounts|VARCHAR|是|500|||
|CHECK_ACCOUNT_AUDIT_TRAIL|审计跟踪|INT|是||||
|COMPANY_DETAILS|公司详情|TEXT|是|1048576|||
|CONTRACT_EXPIRATION_NOTICE_PERIOD|合同到期通知期|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|DAYS_TO_PURCHASE|采购前置天数|FLOAT|是||||
|DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS|大写发票总额|INT|是||||
|DISPLAY_INVOICE_TAX_COMPANY_CURRENCY|税款以公司币别表示|INT|是||||
|EMAIL_PRIMARY_COLOR|电子邮件标题颜色|VARCHAR|是|500|||
|EMAIL_SECONDARY_COLOR|电子邮件按钮颜色|VARCHAR|是|500|||
|EMPLOYEE_PROPERTIES_DEFINITION|员工属性|TEXT|是|1048576|||
|EXPECTS_CHART_OF_ACCOUNTS|Expects a Chart of Accounts|INT|是||||
|FISCALYEAR_LAST_DAY|会计年度最后一天|INT|是||||
|FISCALYEAR_LAST_MONTH|会计年度最后一个月|VARCHAR|是|60|||
|FISCALYEAR_LOCK_DATE|全球锁定日期|DATETIME|是||||
|FONT|字体|VARCHAR|是|60|||
|HARD_LOCK_DATE|硬锁定日期|DATETIME|是||||
|HAS_RECEIVED_WARNING_STOCK_SMS|已收到库存警告短信息|INT|是||||
|HR_ATTENDANCE_DISPLAY_OVERTIME|显示额外时间|INT|是||||
|HR_PRESENCE_CONTROL_ATTENDANCE|根据出勤率|INT|是||||
|HR_PRESENCE_CONTROL_EMAIL|根据发送的电子邮件数量|INT|是||||
|HR_PRESENCE_CONTROL_EMAIL_AMOUNT|# 要发送的电子邮件|INT|是||||
|HR_PRESENCE_CONTROL_IP|基于IP地址|INT|是||||
|HR_PRESENCE_CONTROL_IP_LIST|有效的IP地址|VARCHAR|是|500|||
|HR_PRESENCE_CONTROL_LOGIN|基于系统中的用户状态|INT|是||||
|IAP_ENRICH_AUTO_DONE|丰富完成|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INVOICE_TERMS|Default Terms and Conditions|TEXT|是|1048576|||
|INVOICE_TERMS_HTML|Default Terms and Conditions as a Web page|TEXT|是|1048576|||
|JOB_PROPERTIES_DEFINITION|职位属性|TEXT|是|1048576|||
|LAYOUT_BACKGROUND|布局背景|VARCHAR|是|60|||
|MANUFACTURING_LEAD|制造提前期|FLOAT|是||||
|NAME|名称|VARCHAR|是|200|||
|OVERTIME_COMPANY_THRESHOLD|对公司有利的宽容时间|INT|是||||
|OVERTIME_EMPLOYEE_THRESHOLD|对员工有利的宽容时间|INT|是||||
|PARENT_ID|上级公司|VARCHAR|是|100|||
|PARENT_PATH|上级路径|VARCHAR|是|500|||
|PARTNER_ID|合作伙伴|VARCHAR|是|100|||
|PAYMENT_ONBOARDING_PAYMENT_METHOD|选择支付方式|VARCHAR|是|60|||
|PORTAL_CONFIRMATION_PAY|线上付款|INT|是||||
|PORTAL_CONFIRMATION_SIGN|线上签署|INT|是||||
|PO_DOUBLE_VALIDATION|批准等级|VARCHAR|是|60|||
|PO_DOUBLE_VALIDATION_AMOUNT|再次验证金额|DECIMAL|是||||
|PO_LEAD|采购提前期|FLOAT|是||||
|PO_LOCK|销售订单修改|VARCHAR|是|60|||
|PREPAYMENT_PERCENT|预付百分比|FLOAT|是||||
|PRIMARY_COLOR|原色|VARCHAR|是|500|||
|PURCHASE_LOCK_DATE|采购锁定日期|DATETIME|是||||
|QR_CODE|Display QR-code on invoices|INT|是||||
|QUICK_EDIT_MODE|快速编码|VARCHAR|是|60|||
|QUOTATION_VALIDITY_DAYS|默认报价有效期|INT|是||||
|REPORT_FOOTER|报告页脚|TEXT|是|1048576|||
|REPORT_HEADER|公司标语|TEXT|是|1048576|||
|RESOURCE_CALENDAR_ID|默认工作时间|VARCHAR|是|100|||
|SALE_LOCK_DATE|销售锁定日期|DATETIME|是||||
|SALE_ONBOARDING_PAYMENT_METHOD|销售入门选择的付款方式|VARCHAR|是|60|||
|SECONDARY_COLOR|次要颜色|VARCHAR|是|500|||
|SECURITY_LEAD|销售安全天数|FLOAT|是||||
|SEQUENCE|序列|INT|是||||
|SNAILMAIL_COLOR|实体邮寄颜色|INT|是||||
|SNAILMAIL_COVER|添加一个封面页|INT|是||||
|SNAILMAIL_DUPLEX|双面|INT|是||||
|SOCIAL_FACEBOOK|Facebook 账户|VARCHAR|是|500|||
|SOCIAL_GITHUB|GitHub账户|VARCHAR|是|500|||
|SOCIAL_INSTAGRAM|Instagram 账号|VARCHAR|是|500|||
|SOCIAL_LINKEDIN|领英账号|VARCHAR|是|500|||
|SOCIAL_TIKTOK|TikTok / 抖音账号|VARCHAR|是|500|||
|SOCIAL_TWITTER|X 账户|VARCHAR|是|500|||
|SOCIAL_YOUTUBE|Youtube账号|VARCHAR|是|500|||
|STOCK_MAIL_CONFIRMATION_TEMPLATE_ID|确认拣货邮件模版|VARCHAR|是|100|||
|STOCK_MOVE_EMAIL_VALIDATION|邮件确认拣货|INT|是||||
|STOCK_MOVE_SMS_VALIDATION|短信息确认|INT|是||||
|TAX_CALCULATION_ROUNDING_METHOD|Tax Calculation Rounding Method|VARCHAR|是|60|||
|TAX_EXIGIBILITY|采用现金收付|INT|是||||
|TAX_LOCK_DATE|纳税申报表锁定日期|DATETIME|是||||
|TERMS_TYPE|Terms & Conditions format|VARCHAR|是|60|||
|TRANSFER_ACCOUNT_CODE_PREFIX|Prefix of the transfer accounts|VARCHAR|是|500|||
|USES_DEFAULT_LOGO|使用默认徽标|INT|是||||
|WORK_PERMIT_EXPIRATION_NOTICE_PERIOD|工作许可证到期通知期|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 配置(RES_CONFIG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 配置设定(RES_CONFIG_SETTINGS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTH_SIGNUP_RESET_PASSWORD|允许在登录页开启密码重置功能|INT|是||||
|AUTH_SIGNUP_TEMPLATE_USER_ID|用作通过注册创建的新用户的模版|VARCHAR|是|100|||
|AUTH_SIGNUP_UNINVITED|客户帐号|VARCHAR|是|60|||
|AUTOMATIC_INVOICE|自动发票|INT|是||||
|BARCODE_SEPARATOR|分隔符|VARCHAR|是|500|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CRM_AUTO_ASSIGNMENT_ACTION|自动分配操作|VARCHAR|是|60|||
|CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER|重复间隔为每|INT|是||||
|CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE|自动分配间隔单位|VARCHAR|是|60|||
|CRM_AUTO_ASSIGNMENT_RUN_DATETIME|自动指派下次执行日期|DATETIME|是||||
|CRM_USE_AUTO_ASSIGNMENT|基于规则的分配|INT|是||||
|DEFAULT_INVOICE_POLICY|开票原则|VARCHAR|是|60|||
|DEFAULT_PICKING_POLICY|拣货策略|VARCHAR|是|60|||
|DEFAULT_PURCHASE_METHOD|账单管理|VARCHAR|是|60|||
|DELAY_ALERT_CONTRACT|合同逾期延时预警|INT|是||||
|DIGEST_EMAILS|摘要邮件|INT|是||||
|EXTERNAL_EMAIL_SERVER_DEFAULT|使用自定义电子邮件服务器|INT|是||||
|GOOGLE_GMAIL_CLIENT_IDENTIFIER|Gmail 客户端 ID|VARCHAR|是|500|||
|GOOGLE_GMAIL_CLIENT_SECRET|Gmail客户端Secret|VARCHAR|是|500|||
|GOOGLE_TRANSLATE_API_KEY|消息翻译 API 密钥|VARCHAR|是|500|||
|GROUP_ANALYTIC_ACCOUNTING|分析会计|INT|是||||
|GROUP_APPLICANT_CV_DISPLAY|团体申请人简历展示|INT|是||||
|GROUP_AUTO_DONE_SETTING|锁定已确认的销售订单|INT|是||||
|GROUP_CASH_ROUNDING|现金舍入|INT|是||||
|GROUP_DISCOUNT_PER_SO_LINE|折扣|INT|是||||
|GROUP_LOT_ON_DELIVERY_SLIP|在送货单上显示批次 / 序列号|INT|是||||
|GROUP_LOT_ON_INVOICE|在结算单上显示批次 / 序列号|INT|是||||
|GROUP_MASS_MAILING_CAMPAIGN|邮件营销|INT|是||||
|GROUP_MRP_BYPRODUCTS|副产品|INT|是||||
|GROUP_MRP_RECEPTION_REPORT|制造订单分配报表|INT|是||||
|GROUP_MRP_ROUTINGS|物料需求计划（MRP）工单|INT|是||||
|GROUP_MRP_WORKORDER_DEPENDENCIES|工单依赖性|INT|是||||
|GROUP_MULTI_CURRENCY|多币别|INT|是||||
|GROUP_PRODUCT_PRICELIST|价格表|INT|是||||
|GROUP_PRODUCT_VARIANT|变体|INT|是||||
|GROUP_PROFORMA_SALES|形式发票|INT|是||||
|GROUP_PROJECT_MILESTONE|里程碑|INT|是||||
|GROUP_PROJECT_RATING|客户点评|INT|是||||
|GROUP_PROJECT_RECURRING_TASKS|周期任务|INT|是||||
|GROUP_PROJECT_STAGES|项目阶段|INT|是||||
|GROUP_PROJECT_TASK_DEPENDENCIES|任务依赖|INT|是||||
|GROUP_SALE_DELIVERY_ADDRESS|客户地址|INT|是||||
|GROUP_SALE_ORDER_TEMPLATE|报价模板|INT|是||||
|GROUP_SEND_REMINDER|收货提醒|INT|是||||
|GROUP_SHOW_PURCHASE_RECEIPTS|采购收据|INT|是||||
|GROUP_SHOW_SALE_RECEIPTS|销售收据|INT|是||||
|GROUP_STOCK_ACCOUNTING_AUTOMATIC|自动库存会计|INT|是||||
|GROUP_STOCK_ADV_LOCATION|多步路线|INT|是||||
|GROUP_STOCK_LOT_PRINT_GS1|使用GS1编码格式打印批号和序列号|INT|是||||
|GROUP_STOCK_MULTI_LOCATIONS|储存位置|INT|是||||
|GROUP_STOCK_PACKAGING|产品包装|INT|是||||
|GROUP_STOCK_PRODUCTION_LOT|批次 / 序列号|INT|是||||
|GROUP_STOCK_RECEPTION_REPORT|库存接收报表|INT|是||||
|GROUP_STOCK_SIGN_DELIVERY|签名|INT|是||||
|GROUP_STOCK_TRACKING_LOT|包裹|INT|是||||
|GROUP_STOCK_TRACKING_OWNER|寄售|INT|是||||
|GROUP_UNLOCKED_BY_DEFAULT|解锁制造订单|INT|是||||
|GROUP_UOM|计量单位|INT|是||||
|GROUP_USE_LEAD|线索|INT|是||||
|GROUP_USE_RECURRING_REVENUES|经常性收入|INT|是||||
|GROUP_WARNING_ACCOUNT|发票中的警告|INT|是||||
|GROUP_WARNING_PURCHASE|采购警告|INT|是||||
|GROUP_WARNING_SALE|销售订单警告信息|INT|是||||
|GROUP_WARNING_STOCK|库存警报|INT|是||||
|HR_EMPLOYEE_SELF_EDIT|员工编辑|INT|是||||
|HR_EXPENSE_ALIAS_PREFIX|默认的费用别名|VARCHAR|是|500|||
|HR_EXPENSE_USE_MAILGATEWAY|允许员工通过电子邮件记录费用|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INVOICE_MAIL_TEMPLATE_ID|发票电子邮件模板|VARCHAR|是|100|||
|IS_INSTALLED_SALE|销售模块是否已安装|INT|是||||
|IS_MEMBERSHIP_MULTI|多团队|INT|是||||
|LEAD_ENRICH_AUTO|自动丰富线索|VARCHAR|是|60|||
|LEAD_MINING_IN_PIPELINE|直接从商机商机创建线索挖掘申请。|INT|是||||
|LOCK_CONFIRMED_PO|锁定已确认的订单|INT|是||||
|MASS_MAILING_OUTGOING_MAIL_SERVER|专门服务器|INT|是||||
|MASS_MAILING_REPORTS|24小时统计邮寄报告|INT|是||||
|MASS_MAILING_SPLIT_CONTACT_NAME|拆分名字和姓氏|INT|是||||
|MODULE_ACCOUNT_3WAY_MATCH|3单匹配:采购订单，收货单与发票|INT|是||||
|MODULE_ACCOUNT_ACCOUNTANT|会计|INT|是||||
|MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT|Bank Statement Digitization|INT|是||||
|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT|以CAMT.053 格式导入|INT|是||||
|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV|以.csv、.xls和.xlsx格式导入|INT|是||||
|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX|以.ofx格式导入|INT|是||||
|MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF|导入.qif单据|INT|是||||
|MODULE_ACCOUNT_BATCH_PAYMENT|使用批量付款|INT|是||||
|MODULE_ACCOUNT_BUDGET|预算管理|INT|是||||
|MODULE_ACCOUNT_CHECK_PRINTING|Allow check printing and deposits|INT|是||||
|MODULE_ACCOUNT_EXTRACT|Document Digitization|INT|是||||
|MODULE_ACCOUNT_INTER_COMPANY_RULES|管理公司间交易|INT|是||||
|MODULE_ACCOUNT_INTRASTAT|国际联盟|INT|是||||
|MODULE_ACCOUNT_INVOICE_EXTRACT|Invoice Digitization|INT|是||||
|MODULE_ACCOUNT_ISO20022|SEPA Credit Transfer / ISO20022|INT|是||||
|MODULE_ACCOUNT_PAYMENT|Invoice Online Payment|INT|是||||
|MODULE_ACCOUNT_PEPPOL|PEPPOL 开具发票|INT|是||||
|MODULE_ACCOUNT_REPORTS|Dynamic Reports|INT|是||||
|MODULE_ACCOUNT_SEPA_DIRECT_DEBIT|Use SEPA Direct Debit|INT|是||||
|MODULE_AUTH_LDAP|LDAP认证|INT|是||||
|MODULE_AUTH_OAUTH|使用外部验证提供者 (OAuth)|INT|是||||
|MODULE_BASE_GEOLOCALIZE|地理定位|INT|是||||
|MODULE_BASE_IMPORT|允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据|INT|是||||
|MODULE_CRM_IAP_ENRICH|根据线索的电子邮箱地址、使用公司数据自动丰富线索。|INT|是||||
|MODULE_CRM_IAP_MINE|基于国家/地区、行业、规模等信息生成新的线索。|INT|是||||
|MODULE_CURRENCY_RATE_LIVE|自动汇率|INT|是||||
|MODULE_DELIVERY|交付方式|INT|是||||
|MODULE_DELIVERY_BPOST|bpost连接器|INT|是||||
|MODULE_DELIVERY_DHL|DHL快递连接器|INT|是||||
|MODULE_DELIVERY_EASYPOST|Easypost连接器|INT|是||||
|MODULE_DELIVERY_FEDEX|FedEx连接器|INT|是||||
|MODULE_DELIVERY_SENDCLOUD|Sendcloud连接器|INT|是||||
|MODULE_DELIVERY_SHIPROCKET|Shiprocket 连接器|INT|是||||
|MODULE_DELIVERY_STARSHIPIT|Starshipit 连接器|INT|是||||
|MODULE_DELIVERY_UPS|UPS连接器|INT|是||||
|MODULE_DELIVERY_USPS|USPS连接器|INT|是||||
|MODULE_GOOGLE_CALENDAR|允许用户同步谷歌日历|INT|是||||
|MODULE_GOOGLE_GMAIL|支持Gmail身份验证|INT|是||||
|MODULE_GOOGLE_RECAPTCHA|验证码|INT|是||||
|MODULE_HR_EXPENSE_EXTRACT|向OCR发送账单以产生费用|INT|是||||
|MODULE_HR_HOMEWORKING|远程工作|INT|是||||
|MODULE_HR_PAYROLL_EXPENSE|工资单上的报销费用|INT|是||||
|MODULE_HR_PRESENCE|高级出席控制|INT|是||||
|MODULE_HR_RECRUITMENT_EXTRACT|将简历发送到 OCR 以填写申请|INT|是||||
|MODULE_HR_RECRUITMENT_SURVEY|面试表单|INT|是||||
|MODULE_HR_SKILLS|技能管理|INT|是||||
|MODULE_HR_TIMESHEET|任务日志|INT|是||||
|MODULE_L10N_EU_OSS|欧盟共同体内部远程销售|INT|是||||
|MODULE_LOYALTY|促销、优惠券、礼品卡和会员方案|INT|是||||
|MODULE_MAIL_PLUGIN|允许与邮件插件集成|INT|是||||
|MODULE_MAINTENANCE_WORKSHEET|定制维护工作表|INT|是||||
|MODULE_MICROSOFT_CALENDAR|允许用户同步Outlook日历|INT|是||||
|MODULE_MICROSOFT_OUTLOOK|支持Outlook身份验证|INT|是||||
|MODULE_MRP_MPS|主生产计划|INT|是||||
|MODULE_MRP_PLM|产品生命周期管理（PLM）|INT|是||||
|MODULE_MRP_SUBCONTRACTING|外包|INT|是||||
|MODULE_PARTNER_AUTOCOMPLETE|合作伙伴自动完成|INT|是||||
|MODULE_PRODUCT_EMAIL_TEMPLATE|特定的电子邮件|INT|是||||
|MODULE_PRODUCT_EXPIRY|到期日期|INT|是||||
|MODULE_PRODUCT_IMAGES|使用条形码获取产品图片|INT|是||||
|MODULE_PRODUCT_MARGIN|允许产品毛利|INT|是||||
|MODULE_PURCHASE_PRODUCT_MATRIX|采购表格入口|INT|是||||
|MODULE_PURCHASE_REQUISITION|采购协议|INT|是||||
|MODULE_QUALITY_CONTROL|质量|INT|是||||
|MODULE_QUALITY_CONTROL_WORKSHEET|质量工作表|INT|是||||
|MODULE_SALE_AMAZON|亚马逊同步|INT|是||||
|MODULE_SALE_COMMISSION|佣金|INT|是||||
|MODULE_SALE_LOYALTY|优惠券和会员|INT|是||||
|MODULE_SALE_MARGIN|毛利|INT|是||||
|MODULE_SALE_PDF_QUOTE_BUILDER|PDF 报价生成器|INT|是||||
|MODULE_SALE_PRODUCT_MATRIX|销售表格录入|INT|是||||
|MODULE_SMS|短信息|INT|是||||
|MODULE_SNAILMAIL_ACCOUNT|传统信件|INT|是||||
|MODULE_STOCK_BARCODE|条码扫描器|INT|是||||
|MODULE_STOCK_BARCODE_BARCODELOOKUP|库存条形码数据库|INT|是||||
|MODULE_STOCK_DROPSHIPPING|代发货|INT|是||||
|MODULE_STOCK_FLEET|配送管理系统|INT|是||||
|MODULE_STOCK_LANDED_COSTS|到岸成本|INT|是||||
|MODULE_STOCK_PICKING_BATCH|批量、波次和集群调拨|INT|是||||
|MODULE_STOCK_SMS|短信息确认|INT|是||||
|MODULE_VOIP|网络电话|INT|是||||
|MODULE_WEBSITE_CF_TURNSTILE|Cloudflare Turnstile|INT|是||||
|MODULE_WEBSITE_CRM_IAP_REVEAL|从网站流量创建线索/商机|INT|是||||
|MODULE_WEBSITE_HR_RECRUITMENT|线上发布|INT|是||||
|MODULE_WEB_UNSPLASH|Unsplash图像库|INT|是||||
|OVERTIME_COMPANY_THRESHOLD|对公司有利的宽容时间|INT|是||||
|OVERTIME_EMPLOYEE_THRESHOLD|对员工有利的宽容时间|INT|是||||
|PAY_INVOICES_ONLINE|在线支付发票|INT|是||||
|PO_ORDER_APPROVAL|订单审批|INT|是||||
|PREDICTIVE_LEAD_SCORING_FIELDS_STR|字符串中的线索评分频率字段|VARCHAR|是|500|||
|PREDICTIVE_LEAD_SCORING_START_DATE_STR|字符串中的线索评分开始日期|VARCHAR|是|500|||
|PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET|体积单位|VARCHAR|是|60|||
|PRODUCT_WEIGHT_IN_LBS|重量单位|VARCHAR|是|60|||
|PROFILING_ENABLED_UNTIL|启用分析直到|DATETIME|是||||
|RESTRICT_TEMPLATE_RENDERING|限制模板渲染|INT|是||||
|SFU_SERVER_KEY|SFU 服务器密钥|VARCHAR|是|500|||
|SFU_SERVER_URL|SFU 服务器 URL|VARCHAR|是|500|||
|SHOW_BLACKLIST_BUTTONS|退订时黑名单选项|INT|是||||
|SHOW_EFFECT|显示效果|INT|是||||
|TENOR_API_KEY|Tenor API 密钥|VARCHAR|是|500|||
|TENOR_CONTENT_FILTER|Tenor 内容过滤器|VARCHAR|是|60|||
|TENOR_GIF_LIMIT|Tenor Gif 限额|INT|是||||
|TWILIO_ACCOUNT_SID|Twilio 帐户 SID|VARCHAR|是|500|||
|TWILIO_ACCOUNT_TOKEN|Twilio 帐户身份验证令牌|VARCHAR|是|500|||
|UNSPLASH_ACCESS_KEY|访问秘钥|VARCHAR|是|500|||
|UNSPLASH_APP_ID|应用程序ID|VARCHAR|是|500|||
|USER_DEFAULT_RIGHTS|默认访问权限|INT|是||||
|USE_INVOICE_TERMS|默认条款和条件|INT|是||||
|USE_MANUFACTURING_LEAD|默认制造提前期|INT|是||||
|USE_PO_LEAD|安全交货时间|INT|是||||
|USE_SECURITY_LEAD|销售的安全提前期|INT|是||||
|USE_TWILIO_RTC_SERVERS|使用 Twilio ICE 服务器|INT|是||||
|WEB_APP_NAME|网络应用程序名称|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 国家/地区(RES_COUNTRY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_FORMAT|报表中的布局|TEXT|是|1048576|||
|CODE|国家/地区代码|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|NAME_POSITION|客户姓名 职位|VARCHAR|是|60|||
|PHONE_CODE|国家/地区长途区号|INT|是||||
|STATE_REQUIRED|省/州必填|INT|是||||
|VAT_LABEL|大桶标签|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|ZIP_REQUIRED|需要邮编|INT|是||||
#### 国家/地区组(RES_COUNTRY_GROUP)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 国家省/州(RES_COUNTRY_STATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CODE|省/州代码|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 币别(RES_CURRENCY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_SUBUNIT_LABEL|币别小组|VARCHAR|是|500|||
|CURRENCY_UNIT_LABEL|币别单位|VARCHAR|是|500|||
|DECIMAL_PLACES|小数位数|INT|是||||
|FULL_NAME|名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|ISO_NUMERIC|币别的数字代码。|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|POSITION|符号位置|VARCHAR|是|60|||
|ROUNDING|四舍五入系数|FLOAT|是||||
|SYMBOL|符号|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 汇率(RES_CURRENCY_RATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RATE|技术费率|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 设备(RES_DEVICE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BROWSER|浏览器|VARCHAR|是|500|||
|CITY|城市|VARCHAR|是|500|||
|COUNTRY|国家/地区|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEVICE_TYPE|设备类型|VARCHAR|是|60|||
|FIRST_ACTIVITY|首次活动|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IP_ADDRESS|IP地址|VARCHAR|是|500|||
|LAST_ACTIVITY|上个活动|DATETIME|是||||
|PLATFORM|平台|VARCHAR|是|500|||
|REVOKED|已撤销|INT|是||||
|SESSION_IDENTIFIER|会话标识符|VARCHAR|是|500|||
|USER_ID|用户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 设备记录(RES_DEVICE_LOG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BROWSER|浏览器|VARCHAR|是|500|||
|CITY|城市|VARCHAR|是|500|||
|COUNTRY|国家/地区|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEVICE_TYPE|设备类型|VARCHAR|是|60|||
|FIRST_ACTIVITY|首次活动|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IP_ADDRESS|IP地址|VARCHAR|是|500|||
|LAST_ACTIVITY|上个活动|DATETIME|是||||
|PLATFORM|平台|VARCHAR|是|500|||
|REVOKED|已撤销|INT|是||||
|SESSION_IDENTIFIER|会话标识符|VARCHAR|是|500|||
|USER_ID|用户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 权限组(RES_GROUPS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|API_KEY_DURATION|API 密钥最长有效期（天）|FLOAT|是||||
|CATEGORY_ID|应用|VARCHAR|是|100|||
|COLOR|颜色索引|INT|是||||
|COMMENT|评论|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RULE_GROUP_RELS|规则权限引用|TEXT|是|1048576|||
|SHARE|共享组|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 权限组继承(RES_GROUPS_IMPLIED_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|GID|权限组标识|VARCHAR|是|100|||
|HID|继承权限组标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
#### 权限组成员(RES_GROUPS_USERS_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|GID|标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|USER_ID|标识|VARCHAR|是|100|||
#### 语言(RES_LANG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CODE|语言环境代码|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FORMAT|日期格式|VARCHAR|是|500|||
|DECIMAL_POINT|小数分隔符|VARCHAR|是|500|||
|DIRECTION|方向|VARCHAR|是|60|||
|GROUPING|分隔符格式|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|ISO_CODE|ISO 代码|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|SHORT_TIME_FORMAT|短时间格式|VARCHAR|是|500|||
|THOUSANDS_SEP|千位分隔符|VARCHAR|是|500|||
|TIME_FORMAT|时间格式|VARCHAR|是|500|||
|URL_CODE|URL 代码|VARCHAR|是|500|||
|WEEK_START|一周的第一天|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 联系人(RES_PARTNER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDITIONAL_INFO|附加信息|VARCHAR|是|500|||
|AUTOPOST_BILLS|Auto-post bills|VARCHAR|是|60|||
|BARCODE|条形码|VARCHAR|是|500|||
|BUYER_ID|采购员|VARCHAR|是|100|||
|CALENDAR_LAST_NOTIF_ACK|从基本日历中标记为已读的最后一条通知|DATETIME|是||||
|CITY|城市|VARCHAR|是|500|||
|COLOR|颜色索引|INT|是||||
|COMMENT|备注|TEXT|是|1048576|||
|COMMERCIAL_COMPANY_NAME|公司名称实体|VARCHAR|是|500|||
|COMMERCIAL_PARTNER_ID|商业实体|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|COMPANY_NAME|公司名称|VARCHAR|是|500|||
|COMPANY_REGISTRY|公司注册号|VARCHAR|是|500|||
|COMPLETE_NAME|全名|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CREDIT_LIMIT|信贷额度|FLOAT|是||||
|CUSTOMER_RANK|客户等级|INT|是||||
|DEBIT_LIMIT|应付账款限额|DECIMAL|是||||
|EMAIL|邮箱|VARCHAR|是|500|||
|EMAIL_NORMALIZED|规范化邮件|VARCHAR|是|500|||
|EMPLOYEE|员工|INT|是||||
|FUNCTION|工作职位|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IGNORE_ABNORMAL_INVOICE_AMOUNT|Ignore Abnormal Invoice Amount|INT|是||||
|IGNORE_ABNORMAL_INVOICE_DATE|Ignore Abnormal Invoice Date|INT|是||||
|INDUSTRY_ID|行业|VARCHAR|是|100|||
|INVOICE_EDI_FORMAT_STORE|发票 EDI 格式商店|VARCHAR|是|500|||
|INVOICE_SENDING_METHOD|传送发票|VARCHAR|是|60|||
|INVOICE_WARN|发票|VARCHAR|是|60|||
|INVOICE_WARN_MSG|发票消息|TEXT|是|1048576|||
|IS_COMPANY|是公司|INT|是||||
|MESSAGE_BOUNCE|退回|INT|是||||
|MOBILE|手机|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|PARENT_ID|相关公司|VARCHAR|是|100|||
|PARTNER_GID|公司数据库ID|INT|是||||
|PARTNER_LATITUDE|地理纬度|FLOAT|是||||
|PARTNER_LONGITUDE|地理经度|FLOAT|是||||
|PARTNER_SHARE|共享合作伙伴|INT|是||||
|PEPPOL_EAS|Peppol电子地址（EAS）|VARCHAR|是|60|||
|PEPPOL_ENDPOINT|Peppol Endpoint|VARCHAR|是|500|||
|PHONE|电话|VARCHAR|是|500|||
|PHONE_SANITIZED|净化数量|VARCHAR|是|500|||
|PICKING_WARN|库存拣货|VARCHAR|是|60|||
|PICKING_WARN_MSG|库存拣货单消息|TEXT|是|1048576|||
|PLAN_TO_CHANGE_BIKE|计划更换自行车|INT|是||||
|PLAN_TO_CHANGE_CAR|更换车辆计划|INT|是||||
|PROPERTY_PURCHASE_CURRENCY_ID|供应商币别|VARCHAR|是|100|||
|PURCHASE_WARN|采购订单预警|VARCHAR|是|60|||
|PURCHASE_WARN_MSG|采购订单消息|TEXT|是|1048576|||
|RECEIPT_REMINDER_EMAIL|收货提醒|INT|是||||
|REF|参考|VARCHAR|是|500|||
|REMINDER_DATE_BEFORE_RECEIPT|收货前几天|INT|是||||
|SALE_WARN|销售警告信息|VARCHAR|是|60|||
|SALE_WARN_MSG|销售订单消息|TEXT|是|1048576|||
|SIGNUP_TYPE|注册令牌（Token）类型|VARCHAR|是|500|||
|STATE_ID|省/州|VARCHAR|是|100|||
|STREET|街道|VARCHAR|是|500|||
|STREET2|详细地址|VARCHAR|是|500|||
|SUPPLIER_RANK|供应商排名|INT|是||||
|TRUST|Degree of trust you have in this debtor|VARCHAR|是|60|||
|TYPE|地址类型|VARCHAR|是|60|||
|TZ|时区|VARCHAR|是|60|||
|USER_ID|业务员|VARCHAR|是|100|||
|VAT|税号ID|VARCHAR|是|500|||
|WEBSITE|网站链接|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|ZIP|邮编|VARCHAR|是|500|||
#### 合作伙伴自动完成同步(RES_PARTNER_AUTOCOMPLETE_SYNC)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|PARTNER_ID|合作伙伴|VARCHAR|是|100|||
|SYNCHED|是同步的|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 银行账号(RES_PARTNER_BANK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ABA_ROUTING|null|VARCHAR|是|500|||
|ACC_HOLDER_NAME|账户持有人姓名|VARCHAR|是|500|||
|ACC_NUMBER|账户编号|VARCHAR|是|500|||
|ACTIVE|有效|INT|是||||
|ALLOW_OUT_PAYMENT|转出资金|INT|是||||
|BANK_ID|银行|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|HAS_IBAN_WARNING|有Iban警告消息|INT|是||||
|HAS_MONEY_TRANSFER_WARNING|有资金转账警告消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|账户持有者|VARCHAR|是|100|||
|SANITIZED_ACC_NUMBER|消毒账号|VARCHAR|是|500|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 联系人标签(RES_PARTNER_CATEGORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COLOR|颜色|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PARENT_ID|类别|VARCHAR|是|100|||
|PARENT_PATH|上级路径|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 行业(RES_PARTNER_INDUSTRY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FULL_NAME|全名|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 合作伙伴标题(RES_PARTNER_TITLE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SHORTCUT|简称|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户(RES_USERS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|姓名|VARCHAR|是|200|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KARMA|贡献值|INT|是||||
|LOGIN|登录|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|NOTIFICATION_TYPE|通知|VARCHAR|是|60|||
|ODOOBOT_FAILED|Odoobot 挂了|INT|是||||
|ODOOBOT_STATE|小秘书状态|VARCHAR|是|60|||
|PARTNER_ID|相关合作伙伴|VARCHAR|是|100|||
|PASSWORD|密码|VARCHAR|是|500|||
|SALE_TEAM_ID|用户销售团队|VARCHAR|是|100|||
|SHARE|共享用户|INT|是||||
|SIGNATURE|电子邮件签名|TEXT|是|1048576|||
|TARGET_SALES_DONE|活动完成目标|INT|是||||
|TARGET_SALES_INVOICED|销售订单目标结算单|INT|是||||
|TARGET_SALES_WON|商机赢得目标|INT|是||||
|TOUR_ENABLED|新手入门|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户 API 密钥(RES_USERS_APIKEYS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|EXPIRATION_DATE|有效期|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SCOPE|范围|VARCHAR|是|500|||
|USER_ID|用户|VARCHAR|是|100|||
#### API 密钥说明(RES_USERS_APIKEYS_DESCRIPTION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EXPIRATION_DATE|有效期|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 显示应用程序接口密钥(RES_USERS_APIKEYS_SHOW)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KEY|密钥KEY|VARCHAR|是|500|||
#### 用户删除请求(RES_USERS_DELETION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|STATE|省/州|VARCHAR|是|60|||
|USER_ID|用户|VARCHAR|是|100|||
|USER_ID_INT|用户ID|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 密码检查向导(RES_USERS_IDENTITYCHECK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTH_METHOD|验证方式|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|PASSWORD|密码|VARCHAR|是|500|||
|REQUEST|请求|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户日志(RES_USERS_LOG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户设置(RES_USERS_SETTINGS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALENDAR_DEFAULT_PRIVACY|日历默认隐私|VARCHAR|是|60|||
|CHANNEL_NOTIFICATIONS|频道通知|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_DISCUSS_SIDEBAR_CATEGORY_CHANNEL_OPEN|是否打开讨论侧边栏类别聊天？|INT|是||||
|IS_DISCUSS_SIDEBAR_CATEGORY_CHAT_OPEN|是否打开讨论侧边栏类别聊天？|INT|是||||
|MUTE_UNTIL_DT|静音通知，直到|DATETIME|是||||
|PUSH_TO_TALK_KEY|一键通话快捷方式|VARCHAR|是|500|||
|USER_ID|用户|VARCHAR|是|100|||
|USE_PUSH_TO_TALK|使用一键通话功能|INT|是||||
|VOICE_ACTIVE_DURATION|语音活动的持续时间（毫秒）|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户设置数量(RES_USERS_SETTINGS_VOLUMES)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|GUEST_ID|访客|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|PARTNER_ID|合作伙伴|VARCHAR|是|100|||
|USER_SETTING_ID|用户设置|VARCHAR|是|100|||
|VOLUME|体积|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 权限组关联规则(RULE_GROUP_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|DOMAIN_FORCE|域名|TEXT|是|1048576|||
|GID|标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODEL_ID|模型|VARCHAR|是|200|||
|NAME|名称|VARCHAR|是|200|||
|PERM_CREATE|创建|INT|是||||
|PERM_READ|读取|INT|是||||
|PERM_UNLINK|删除|INT|是||||
|PERM_WRITE|写入|INT|是||||
|RULE_ID|标识|VARCHAR|是|100|||
#### 总线事件记录(T_BUS_EVENT_RECORD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATA|对象数据|TEXT|是|1048576|||
|EVENT|事件|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|资源模型|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 消息收件人(T_MAIL_MESSAGE_RECIPIENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ID|标识|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|标识|VARCHAR|是|100|||
#### 权限组关联统一资源(UNIRES_GROUP_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|GID|标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|UNIRES_ID|标识|VARCHAR|是|100|||






