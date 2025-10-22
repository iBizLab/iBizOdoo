# 线索/商机(crm_lead) :id=crm_lead
## 创建线索/商机

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration_tracking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|状态时间|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|自动概率|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">date_automation_last</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后操作|
|<el-row justify="space-between"><el-col :span="20">date_closed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">date_conversion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转化日期|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预期结束|
|<el-row justify="space-between"><el-col :span="20">date_last_stage_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后阶段更新|
|<el-row justify="space-between"><el-col :span="20">date_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|指派日期|
|<el-row justify="space-between"><el-col :span="20">day_close</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待关闭天数|
|<el-row justify="space-between"><el-col :span="20">day_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待分配天数|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicate_lead_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|潜在的重复线索数量|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件抄送|
|<el-row justify="space-between"><el-col :span="20">email_domain_criterion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱域名标准|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件质量|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期收入|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作岗位|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富结束|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自动概率？|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_partner_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是可见合作伙伴|
|<el-row justify="space-between"><el-col :span="20">lang_active_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">lang_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">lead_mining_request_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索挖掘申请|
|<el-row justify="space-between"><el-col :span="20">lost_reason_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|丢失原因|
|<el-row justify="space-between"><el-col :span="20">meeting_display_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|会议显示日期|
|<el-row justify="space-between"><el-col :span="20">meeting_display_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议显示标签|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话号码是手机号码|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_email_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电子邮箱将更新|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">partner_phone_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电话号码将更新|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码/手机号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已净化号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话号码已被列入黑名单|
|<el-row justify="space-between"><el-col :span="20">phone_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码质量|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|概率|
|<el-row justify="space-between"><el-col :span="20">prorated_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的收入|
|<el-row justify="space-between"><el-col :span="20">quotation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价的数量|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|经常性收入|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的经常性收入|
|<el-row justify="space-between"><el-col :span="20">referred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐人|
|<el-row justify="space-between"><el-col :span="20">reveal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示 ID|
|<el-row justify="space-between"><el-col :span="20">sale_amount_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|销售订单的总数|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单数量|
|<el-row justify="space-between"><el-col :span="20">show_enrich_button</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许手动丰富|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售团队|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售人员|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">file</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文件|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片|



##### 请求示例： {docsify-ignore}
```json
{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}

```

## 获取线索/商机

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|




##### 响应示例： {docsify-ignore}
```json

{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}

```

## 删除线索/商机

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新线索/商机

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration_tracking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|状态时间|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|自动概率|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">date_automation_last</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后操作|
|<el-row justify="space-between"><el-col :span="20">date_closed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">date_conversion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转化日期|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预期结束|
|<el-row justify="space-between"><el-col :span="20">date_last_stage_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后阶段更新|
|<el-row justify="space-between"><el-col :span="20">date_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|指派日期|
|<el-row justify="space-between"><el-col :span="20">day_close</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待关闭天数|
|<el-row justify="space-between"><el-col :span="20">day_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待分配天数|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicate_lead_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|潜在的重复线索数量|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件抄送|
|<el-row justify="space-between"><el-col :span="20">email_domain_criterion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱域名标准|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件质量|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期收入|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作岗位|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富结束|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自动概率？|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_partner_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是可见合作伙伴|
|<el-row justify="space-between"><el-col :span="20">lang_active_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">lang_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">lead_mining_request_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索挖掘申请|
|<el-row justify="space-between"><el-col :span="20">lost_reason_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|丢失原因|
|<el-row justify="space-between"><el-col :span="20">meeting_display_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|会议显示日期|
|<el-row justify="space-between"><el-col :span="20">meeting_display_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议显示标签|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话号码是手机号码|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_email_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电子邮箱将更新|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">partner_phone_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电话号码将更新|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码/手机号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已净化号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话号码已被列入黑名单|
|<el-row justify="space-between"><el-col :span="20">phone_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码质量|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|概率|
|<el-row justify="space-between"><el-col :span="20">prorated_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的收入|
|<el-row justify="space-between"><el-col :span="20">quotation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价的数量|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|经常性收入|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的经常性收入|
|<el-row justify="space-between"><el-col :span="20">referred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐人|
|<el-row justify="space-between"><el-col :span="20">reveal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示 ID|
|<el-row justify="space-between"><el-col :span="20">sale_amount_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|销售订单的总数|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单数量|
|<el-row justify="space-between"><el-col :span="20">show_enrich_button</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许手动丰富|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售团队|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售人员|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">file</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文件|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片|



##### 请求示例： {docsify-ignore}
```json
{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}

```

## 检查线索/商机主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration_tracking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|状态时间|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|自动概率|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">date_automation_last</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后操作|
|<el-row justify="space-between"><el-col :span="20">date_closed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">date_conversion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转化日期|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预期结束|
|<el-row justify="space-between"><el-col :span="20">date_last_stage_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后阶段更新|
|<el-row justify="space-between"><el-col :span="20">date_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|指派日期|
|<el-row justify="space-between"><el-col :span="20">day_close</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待关闭天数|
|<el-row justify="space-between"><el-col :span="20">day_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待分配天数|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicate_lead_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|潜在的重复线索数量|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件抄送|
|<el-row justify="space-between"><el-col :span="20">email_domain_criterion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱域名标准|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件质量|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期收入|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作岗位|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富结束|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自动概率？|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_partner_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是可见合作伙伴|
|<el-row justify="space-between"><el-col :span="20">lang_active_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">lang_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">lead_mining_request_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索挖掘申请|
|<el-row justify="space-between"><el-col :span="20">lost_reason_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|丢失原因|
|<el-row justify="space-between"><el-col :span="20">meeting_display_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|会议显示日期|
|<el-row justify="space-between"><el-col :span="20">meeting_display_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议显示标签|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话号码是手机号码|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_email_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电子邮箱将更新|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">partner_phone_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电话号码将更新|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码/手机号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已净化号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话号码已被列入黑名单|
|<el-row justify="space-between"><el-col :span="20">phone_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码质量|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|概率|
|<el-row justify="space-between"><el-col :span="20">prorated_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的收入|
|<el-row justify="space-between"><el-col :span="20">quotation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价的数量|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|经常性收入|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的经常性收入|
|<el-row justify="space-between"><el-col :span="20">referred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐人|
|<el-row justify="space-between"><el-col :span="20">reveal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示 ID|
|<el-row justify="space-between"><el-col :span="20">sale_amount_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|销售订单的总数|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单数量|
|<el-row justify="space-between"><el-col :span="20">show_enrich_button</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许手动丰富|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售团队|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售人员|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">file</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文件|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片|



##### 请求示例： {docsify-ignore}
```json
{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取线索/商机草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration_tracking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|状态时间|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|自动概率|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">date_automation_last</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后操作|
|<el-row justify="space-between"><el-col :span="20">date_closed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">date_conversion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转化日期|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预期结束|
|<el-row justify="space-between"><el-col :span="20">date_last_stage_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后阶段更新|
|<el-row justify="space-between"><el-col :span="20">date_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|指派日期|
|<el-row justify="space-between"><el-col :span="20">day_close</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待关闭天数|
|<el-row justify="space-between"><el-col :span="20">day_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待分配天数|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicate_lead_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|潜在的重复线索数量|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件抄送|
|<el-row justify="space-between"><el-col :span="20">email_domain_criterion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱域名标准|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件质量|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期收入|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作岗位|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富结束|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自动概率？|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_partner_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是可见合作伙伴|
|<el-row justify="space-between"><el-col :span="20">lang_active_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">lang_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">lead_mining_request_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索挖掘申请|
|<el-row justify="space-between"><el-col :span="20">lost_reason_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|丢失原因|
|<el-row justify="space-between"><el-col :span="20">meeting_display_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|会议显示日期|
|<el-row justify="space-between"><el-col :span="20">meeting_display_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议显示标签|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话号码是手机号码|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_email_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电子邮箱将更新|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">partner_phone_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电话号码将更新|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码/手机号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已净化号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话号码已被列入黑名单|
|<el-row justify="space-between"><el-col :span="20">phone_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码质量|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|概率|
|<el-row justify="space-between"><el-col :span="20">prorated_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的收入|
|<el-row justify="space-between"><el-col :span="20">quotation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价的数量|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|经常性收入|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的经常性收入|
|<el-row justify="space-between"><el-col :span="20">referred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐人|
|<el-row justify="space-between"><el-col :span="20">reveal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示 ID|
|<el-row justify="space-between"><el-col :span="20">sale_amount_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|销售订单的总数|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单数量|
|<el-row justify="space-between"><el-col :span="20">show_enrich_button</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许手动丰富|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售团队|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售人员|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">file</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文件|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片|



##### 请求示例： {docsify-ignore}
```json
{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}

```

## 带模板的消息发送

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/{key}/message_post_with_source" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration_tracking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|状态时间|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|自动概率|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">date_automation_last</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后操作|
|<el-row justify="space-between"><el-col :span="20">date_closed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">date_conversion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转化日期|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预期结束|
|<el-row justify="space-between"><el-col :span="20">date_last_stage_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后阶段更新|
|<el-row justify="space-between"><el-col :span="20">date_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|指派日期|
|<el-row justify="space-between"><el-col :span="20">day_close</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待关闭天数|
|<el-row justify="space-between"><el-col :span="20">day_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待分配天数|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicate_lead_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|潜在的重复线索数量|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件抄送|
|<el-row justify="space-between"><el-col :span="20">email_domain_criterion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱域名标准|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件质量|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期收入|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作岗位|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富结束|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自动概率？|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_partner_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是可见合作伙伴|
|<el-row justify="space-between"><el-col :span="20">lang_active_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">lang_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">lead_mining_request_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索挖掘申请|
|<el-row justify="space-between"><el-col :span="20">lost_reason_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|丢失原因|
|<el-row justify="space-between"><el-col :span="20">meeting_display_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|会议显示日期|
|<el-row justify="space-between"><el-col :span="20">meeting_display_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议显示标签|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话号码是手机号码|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_email_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电子邮箱将更新|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">partner_phone_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电话号码将更新|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码/手机号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已净化号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话号码已被列入黑名单|
|<el-row justify="space-between"><el-col :span="20">phone_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码质量|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|概率|
|<el-row justify="space-between"><el-col :span="20">prorated_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的收入|
|<el-row justify="space-between"><el-col :span="20">quotation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价的数量|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|经常性收入|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的经常性收入|
|<el-row justify="space-between"><el-col :span="20">referred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐人|
|<el-row justify="space-between"><el-col :span="20">reveal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示 ID|
|<el-row justify="space-between"><el-col :span="20">sale_amount_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|销售订单的总数|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单数量|
|<el-row justify="space-between"><el-col :span="20">show_enrich_button</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许手动丰富|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售团队|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售人员|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">file</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文件|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片|



##### 请求示例： {docsify-ignore}
```json
{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}
```



## 保存线索/商机

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration_tracking</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|状态时间|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|自动概率|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">contact_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">date_automation_last</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后操作|
|<el-row justify="space-between"><el-col :span="20">date_closed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">date_conversion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转化日期|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预期结束|
|<el-row justify="space-between"><el-col :span="20">date_last_stage_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最后阶段更新|
|<el-row justify="space-between"><el-col :span="20">date_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|指派日期|
|<el-row justify="space-between"><el-col :span="20">day_close</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待关闭天数|
|<el-row justify="space-between"><el-col :span="20">day_open</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|待分配天数|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicate_lead_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|潜在的重复线索数量|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件抄送|
|<el-row justify="space-between"><el-col :span="20">email_domain_criterion</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱域名标准|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件质量|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期收入|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作岗位|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富结束|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_automated_probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是自动概率？|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_partner_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是可见合作伙伴|
|<el-row justify="space-between"><el-col :span="20">lang_active_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">lang_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">lead_mining_request_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索挖掘申请|
|<el-row justify="space-between"><el-col :span="20">lost_reason_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|丢失原因|
|<el-row justify="space-between"><el-col :span="20">meeting_display_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|会议显示日期|
|<el-row justify="space-between"><el-col :span="20">meeting_display_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议显示标签|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话号码是手机号码|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_email_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电子邮箱将更新|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">partner_phone_update</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴电话号码将更新|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码/手机号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已净化号码|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话号码已被列入黑名单|
|<el-row justify="space-between"><el-col :span="20">phone_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码质量|
|<el-row justify="space-between"><el-col :span="20">priority</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">probability</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|概率|
|<el-row justify="space-between"><el-col :span="20">prorated_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的收入|
|<el-row justify="space-between"><el-col :span="20">quotation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|报价的数量|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|经常性收入|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|预期 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_monthly_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的 MRR|
|<el-row justify="space-between"><el-col :span="20">recurring_revenue_prorated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|按比例分配的经常性收入|
|<el-row justify="space-between"><el-col :span="20">referred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐人|
|<el-row justify="space-between"><el-col :span="20">reveal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示 ID|
|<el-row justify="space-between"><el-col :span="20">sale_amount_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|销售订单的总数|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单数量|
|<el-row justify="space-between"><el-col :span="20">show_enrich_button</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|允许手动丰富|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售团队|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售人员|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">file</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文件|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片|



##### 请求示例： {docsify-ignore}
```json
{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration_tracking" : null,
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "automated_probability" : null,
  "city" : null,
  "color" : null,
  "company_id" : null,
  "contact_name" : null,
  "country_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_automation_last" : null,
  "date_closed" : null,
  "date_conversion" : null,
  "date_deadline" : null,
  "date_last_stage_update" : null,
  "date_open" : null,
  "day_close" : null,
  "day_open" : null,
  "description" : null,
  "display_name" : null,
  "duplicate_lead_count" : null,
  "email_cc" : null,
  "email_domain_criterion" : null,
  "email_from" : null,
  "email_normalized" : null,
  "email_state" : null,
  "expected_revenue" : null,
  "function" : null,
  "has_message" : null,
  "iap_enrich_done" : null,
  "id" : null,
  "is_automated_probability" : null,
  "is_blacklisted" : null,
  "is_partner_visible" : null,
  "lang_active_count" : null,
  "lang_id" : null,
  "lead_mining_request_id" : null,
  "lost_reason_id" : null,
  "meeting_display_date" : null,
  "meeting_display_label" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "partner_email_update" : null,
  "partner_id" : null,
  "partner_name" : null,
  "partner_phone_update" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "phone_state" : null,
  "priority" : null,
  "probability" : null,
  "prorated_revenue" : null,
  "quotation_count" : null,
  "recurring_revenue" : null,
  "recurring_revenue_monthly" : null,
  "recurring_revenue_monthly_prorated" : null,
  "recurring_revenue_prorated" : null,
  "referred" : null,
  "reveal_id" : null,
  "sale_amount_total" : null,
  "sale_order_count" : null,
  "show_enrich_button" : null,
  "stage_id" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "team_id" : null,
  "type" : null,
  "user_id" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "file" : null,
  "image" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_exception_decoration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">n_activity_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_country_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_email_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件质量|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_lang_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">n_lead_mining_request_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索挖掘申请|
|<el-row justify="space-between"><el-col :span="20">n_lost_reason_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|丢失原因|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户|
|<el-row justify="space-between"><el-col :span="20">n_phone_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话号码质量|
|<el-row justify="space-between"><el-col :span="20">n_priority_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段|
|<el-row justify="space-between"><el-col :span="20">n_state_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_team_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售团队|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售人员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_exception_decoration_eq" : null,
  "n_activity_state_eq" : null,
  "n_company_id_eq" : null,
  "n_country_id_eq" : null,
  "n_email_state_eq" : null,
  "n_id_eq" : null,
  "n_lang_id_eq" : null,
  "n_lead_mining_request_id_eq" : null,
  "n_lost_reason_id_eq" : null,
  "n_name_like" : null,
  "n_partner_id_eq" : null,
  "n_phone_state_eq" : null,
  "n_priority_eq" : null,
  "n_stage_id_eq" : null,
  "n_state_id_eq" : null,
  "n_team_id_eq" : null,
  "n_type_eq" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "duration_tracking" : null,
    "activities" : null,
    "attachments" : null,
    "followers" : null,
    "active" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "automated_probability" : null,
    "city" : null,
    "color" : null,
    "company_id" : null,
    "contact_name" : null,
    "country_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_automation_last" : null,
    "date_closed" : null,
    "date_conversion" : null,
    "date_deadline" : null,
    "date_last_stage_update" : null,
    "date_open" : null,
    "day_close" : null,
    "day_open" : null,
    "description" : null,
    "display_name" : null,
    "duplicate_lead_count" : null,
    "email_cc" : null,
    "email_domain_criterion" : null,
    "email_from" : null,
    "email_normalized" : null,
    "email_state" : null,
    "expected_revenue" : null,
    "function" : null,
    "has_message" : null,
    "iap_enrich_done" : null,
    "id" : null,
    "is_automated_probability" : null,
    "is_blacklisted" : null,
    "is_partner_visible" : null,
    "lang_active_count" : null,
    "lang_id" : null,
    "lead_mining_request_id" : null,
    "lost_reason_id" : null,
    "meeting_display_date" : null,
    "meeting_display_label" : null,
    "message_attachment_count" : null,
    "message_bounce" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "mobile" : null,
    "mobile_blacklisted" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "partner_email_update" : null,
    "partner_id" : null,
    "partner_name" : null,
    "partner_phone_update" : null,
    "phone" : null,
    "phone_blacklisted" : null,
    "phone_mobile_search" : null,
    "phone_sanitized" : null,
    "phone_sanitized_blacklisted" : null,
    "phone_state" : null,
    "priority" : null,
    "probability" : null,
    "prorated_revenue" : null,
    "quotation_count" : null,
    "recurring_revenue" : null,
    "recurring_revenue_monthly" : null,
    "recurring_revenue_monthly_prorated" : null,
    "recurring_revenue_prorated" : null,
    "referred" : null,
    "reveal_id" : null,
    "sale_amount_total" : null,
    "sale_order_count" : null,
    "show_enrich_button" : null,
    "stage_id" : null,
    "state_id" : null,
    "street" : null,
    "street2" : null,
    "team_id" : null,
    "type" : null,
    "user_id" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
    "zip" : null,
    "file" : null,
    "image" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/exportdata/{param},/crm_leads/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/crm_leads/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {

    }
  }).use(ElementPlus).mount('#app')
</script>