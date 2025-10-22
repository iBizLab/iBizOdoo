# 模型预警 <!-- {docsify-ignore-all} -->


### 行为使用脚本<sup class="footnote-symbol"> <font color=orange>[3]</font></sup>
| 实体col200   | 行为col300  |
| --------   |------------|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[员工计数器(emp_counter)](module/hr/hr_employee#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|[消息发送代理(mail_message_post)](module/mail/mail_thread#行为)|
|[用户(RES_USERS)](module/base/res_users)|[用户计数器(user_counter)](module/base/res_users#行为)|

### 处理逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[24]</font></sup>
| 实体col200   | 处理逻辑col300  | 脚本模式col100  |
| --------   |------------|----------|
|[头像混合(AVATAR_MIXIN)](module/base/avatar_mixin#处理逻辑)|[计算头像(compute_avatar)](module/base/avatar_mixin/logic/compute_avatar.md)|是|
|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel#处理逻辑)|[添加邀请成员(add_members)](module/discuss/discuss_channel/logic/add_members.md)|否|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee#处理逻辑)|[生成徽标 ID(generate_random_barcode)](module/hr/hr_employee/logic/generate_random_barcode.md)|否|
|[模块(IR_MODULE_MODULE)](module/base/ir_module_module#处理逻辑)|[cur_user_app](module/base/ir_module_module/logic/cur_user_app.md)|否|
|[规则(IR_RULE)](module/base/ir_rule#处理逻辑)|[计算全局(compute_global)](module/base/ir_rule/logic/compute_global.md)|是|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity#处理逻辑)|[compute_deadline_day](module/mail/mail_activity/logic/compute_deadline_day.md)|是|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity#处理逻辑)|[compute_state](module/mail/mail_activity/logic/compute_state.md)|是|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity#处理逻辑)|[完成活动(action_done)](module/mail/mail_activity/logic/action_done.md)|否|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity#处理逻辑)|[延迟活动(action_snooze)](module/mail/mail_activity/logic/action_snooze.md)|否|
|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin#处理逻辑)|[处理活动状态(process_activities)](module/mail/mail_activity_mixin/logic/process_activities.md)|否|
|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan#处理逻辑)|[步数计数计算(compute_steps_count)](module/mail/mail_activity_plan/logic/compute_steps_count.md)|是|
|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule#处理逻辑)|[安排(action_schedule_activities)](module/mail/mail_activity_schedule/logic/action_schedule_activities.md)|否|
|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule#处理逻辑)|[安排并标记完成(schedule_activities_done)](module/mail/mail_activity_schedule/logic/schedule_activities_done.md)|否|
|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type#处理逻辑)|[获取到期日期(get_date_deadline)](module/mail/mail_activity_type/logic/get_date_deadline.md)|否|
|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain#处理逻辑)|[compute_bounce_email](module/mail/mail_alias_domain/logic/compute_bounce_email.md)|是|
|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain#处理逻辑)|[compute_catchall_email](module/mail/mail_alias_domain/logic/compute_catchall_email.md)|是|
|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain#处理逻辑)|[compute_default_from_email](module/mail/mail_alias_domain/logic/compute_default_from_email.md)|是|
|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template#处理逻辑)|[刷新消息模板缓存(refresh_cache)](module/mail/mail_template/logic/refresh_cache.md)|否|
|[用于计算记录在 many2one 字段的每个值上所花费时间的混合函数(MAIL_TRACKING_DURATION_MIXIN)](module/mail/mail_tracking_duration_mixin#处理逻辑)|[计算跟踪属性耗时(compute_duration_tracking)](module/mail/mail_tracking_duration_mixin/logic/compute_duration_tracking.md)|否|
|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar#处理逻辑)|[填充资源工作时间数据(fill_data)](module/resource/resource_calendar/logic/fill_data.md)|否|
|[配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings#处理逻辑)|[默认获取数据逻辑(default_get)](module/base/res_config_settings/logic/default_get.md)|否|
|[权限组(RES_GROUPS)](module/base/res_groups#处理逻辑)|[组名称计算(compute_full_name)](module/base/res_groups/logic/compute_full_name.md)|是|
|[联系人(RES_PARTNER)](module/base/res_partner#处理逻辑)|[计算公司类型(compute_company_type)](module/base/res_partner/logic/compute_company_type.md)|是|
|[用户(RES_USERS)](module/base/res_users#处理逻辑)|[计算状态(compute_state)](module/base/res_users/logic/compute_state.md)|是|

### 界面逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[23]</font></sup>
| 实体col200   | 界面逻辑col300  |
| --------   |------------|
|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel#界面逻辑)|[刷新频道列表](module/discuss/discuss_channel/uilogic/refresh__channel)|
|[离职原因(HR_DEPARTURE_REASON)](module/hr/hr_departure_reason#界面逻辑)|[表格新建行](module/hr/hr_departure_reason/uilogic/new_row)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee#界面逻辑)|[打开员工基本信息视图](module/hr/hr_employee/uilogic/open_emp_info_view)|
|[附件(IR_ATTACHMENT)](module/base/ir_attachment#界面逻辑)|[添加附件数据](module/base/ir_attachment/uilogic/add_attachment)|
|[附件(IR_ATTACHMENT)](module/base/ir_attachment#界面逻辑)|[删除附件数据](module/base/ir_attachment/uilogic/delete_attachment)|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity#界面逻辑)|[完成并安排下一个](module/mail/mail_activity/uilogic/done_next)|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity#界面逻辑)|[刷新活动和消息列表](module/mail/mail_activity/uilogic/refresh_activity_message)|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity#界面逻辑)|[刷新活动列表](module/mail/mail_activity/uilogic/refresh_activity)|
|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule#界面逻辑)|[完成并安排下一个](module/mail/mail_activity_schedule/uilogic/done_next)|
|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule#界面逻辑)|[刷新活动和消息列表](module/mail/mail_activity_schedule/uilogic/refresh_activity_message)|
|[单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers#界面逻辑)|[关注人员更新(嵌入)](module/mail/mail_followers/uilogic/attention_personnel_update_emb)|
|[消息(MAIL_MESSAGE)](module/mail/mail_message#界面逻辑)|[清空评论](module/mail/mail_message/uilogic/clear_comment)|
|[消息(MAIL_MESSAGE)](module/mail/mail_message#界面逻辑)|[编辑评论](module/mail/mail_message/uilogic/edit_comment)|
|[消息(MAIL_MESSAGE)](module/mail/mail_message#界面逻辑)|[刷新评论列表](module/mail/mail_message/uilogic/refresh_comment)|
|[消息(MAIL_MESSAGE)](module/mail/mail_message#界面逻辑)|[回复评论](module/mail/mail_message/uilogic/reply_comment)|
|[消息(MAIL_MESSAGE)](module/mail/mail_message#界面逻辑)|[发送评论](module/mail/mail_message/uilogic/send_comment)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc#界面逻辑)|[跳转设置页面](module/extension/PSCorePrdFunc/uilogic/skip_setting)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc#界面逻辑)|[clone此应用](module/extension/PSCorePrdFunc/uilogic/clone_git)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc#界面逻辑)|[初始化插件信息](module/extension/PSCorePrdFunc/uilogic/init_plugin_info)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc#界面逻辑)|[跳转应用详情页面](module/extension/PSCorePrdFunc/uilogic/open_app_info)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc#界面逻辑)|[跳转gitlab](module/extension/PSCorePrdFunc/uilogic/skip_gitlab)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc#界面逻辑)|[更新插件设置](module/extension/PSCorePrdFunc/uilogic/update_plugin_setting)|
|[用户(RES_USERS)](module/base/res_users#界面逻辑)|[修改密码（表单）](module/base/res_users/uilogic/change_pas)|

### 包含长文本的查询<sup class="footnote-symbol"> <font color=orange>[10]</font></sup>
| 实体col200   | 数据查询col300  |
| --------   |------------|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[DEFAULT](module/hr/hr_employee/query/Default)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[员工组织图表(emp_org_chart)](module/hr/hr_employee/query/emp_org_chart)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[员工组织图表2(emp_org_chart2)](module/hr/hr_employee/query/emp_org_chart2)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[组织图表(org_chart)](module/hr/hr_employee/query/org_chart)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[简单查询(simple)](module/hr/hr_employee/query/simple)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[带活动查询(with_activities)](module/hr/hr_employee/query/with_activities)|
|[系统参数(IR_CONFIG_PARAMETER)](module/base/ir_config_parameter)|[DEFAULT](module/base/ir_config_parameter/query/Default)|
|[规则(IR_RULE)](module/base/ir_rule)|[DEFAULT](module/base/ir_rule/query/Default)|
|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|[DEFAULT](module/mail/mail_template/query/Default)|
|[权限组(RES_GROUPS)](module/base/res_groups)|[当前用户权限组(cur_user_ref)](module/base/res_groups/query/cur_user_ref)|


### 未配置权限请求接口<sup class="footnote-symbol"> <font color=orange>[11]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel.md)|/discuss_channels/{key}/set_message_pin|POST|[设置置顶消息(set_message_pin)](module/discuss/discuss_channel#行为)|
|[员工类别(HR_EMPLOYEE_CATEGORY)](module/hr/hr_employee_category.md)|/hr_employee_categories/{key}/move_order|POST|[移动位置(MoveOrder)](module/hr/hr_employee_category#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/mail_track|POST|[构造跟踪数据(mail_track)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/message_notify|POST|[通知消息(message_notify)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/message_track|POST|[跟踪消息(message_track)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/process_attachments_for_post|POST|[发送消息将附件归属转换至主对象中(process_attachments_for_post)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/track_discard|POST|[新建时属性跟踪(track_discard)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/track_finalize|POST|[跟踪数据建立(track_finalize)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/track_prepare|POST|[属性跟踪准备(track_prepare)](module/mail/mail_thread#行为)|
|[配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings.md)|/res_config_settings/{key}/set_values|POST|[设置配置值(set_values)](module/base/res_config_settings#行为)|
|[用户(RES_USERS)](module/base/res_users.md)|/res_users/{key}/change_password|POST|[修改密码(change_password)](module/base/res_users#行为)|

### NONE权限请求接口<sup class="footnote-symbol"> <font color=orange>[10]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type.md)|/hr_contract_types/{key}/move_order|POST|[移动位置(MoveOrder)](module/hr/hr_contract_type#行为)|
|[离职原因(HR_DEPARTURE_REASON)](module/hr/hr_departure_reason.md)|/hr_departure_reasons/{key}/move_order|POST|[移动位置(MoveOrder)](module/hr/hr_departure_reason#行为)|
|[工作岗位(HR_JOB)](module/hr/hr_job.md)|/hr_jobs/{key}/move_order|POST|[移动位置(MoveOrder)](module/hr/hr_job#行为)|
|[简历明细的类型(HR_RESUME_LINE_TYPE)](module/hr/hr_resume_line_type.md)|/hr_resume_line_types/{key}/move_order|POST|[移动位置(MoveOrder)](module/hr/hr_resume_line_type#行为)|
|[邮件服务器(IR_MAIL_SERVER)](module/base/ir_mail_server.md)|/ir_mail_servers/{key}/move_order|POST|[移动位置(MoveOrder)](module/base/ir_mail_server#行为)|
|[活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template.md)|/mail_activity_plan_templates/{key}/move_order|POST|[移动位置(MoveOrder)](module/mail/mail_activity_plan_template#行为)|
|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type.md)|/mail_activity_types/{key}/move_order|POST|[移动位置(MoveOrder)](module/mail/mail_activity_type#行为)|
|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain.md)|/mail_alias_domains/{key}/move_order|POST|[移动位置(MoveOrder)](module/mail/mail_alias_domain#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/mail_message_post|POST|[消息发送代理(mail_message_post)](module/mail/mail_thread#行为)|
|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar.md)|/resource_calendars/{key}/fill_data|POST|[填充资源工作时间数据(fill_data)](module/resource/resource_calendar#行为)|

### 操作标识未配置映射<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200   | 操作标识col300  |
| --------   |------------|
|[权限组继承(RES_GROUPS_IMPLIED_REL)](module/base/res_groups_implied_rel.md)|CREATE<br>READ<br>DELETE<br>UPDATE|

### 除主键、主信息、预置属性外，不包含其他配置的表格<sup class="footnote-symbol"> <font color=orange>[8]</font></sup>
| 实体col200   |   视图col400 | 表格col400  |
| --------   |------------|------------|
|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|主表格(main)|[讨论频道(discuss_channel_pickup_grid_view)](app/view/discuss_channel_pickup_grid_view)|
|[离职原因(HR_DEPARTURE_REASON)](module/hr/hr_departure_reason)|行编辑主表格(edit_main)|[离职原因(hr_departure_reason_grid_view)](app/view/hr_departure_reason_grid_view)|
|[工作岗位(HR_JOB)](module/hr/hr_job)|主表格(main)|[工作岗位(hr_job_pickup_grid_view)](app/view/hr_job_pickup_grid_view)|
|[休假(HR_LEAVE)](module/hr/hr_leave)|主表格(main)|[休假(hr_leave_pickup_grid_view)](app/view/hr_leave_pickup_grid_view)|
|[国家/地区(RES_COUNTRY)](module/base/res_country)|主表格(main)|[国家/地区(res_country_pickup_grid_view)](app/view/res_country_pickup_grid_view)|
|[币别(RES_CURRENCY)](module/base/res_currency)|主表格(main)|[币别(res_currency_pickup_grid_view)](app/view/res_currency_pickup_grid_view)|
|[权限组(RES_GROUPS)](module/base/res_groups)|多项选择视图表格(m_pickup)|[权限组(res_groups_pickup_grid_view)](app/view/res_groups_pickup_grid_view)|
|[权限组关联统一资源(UNIRES_GROUP_REL)](module/base_extend/unires_group_rel)|主表格(main)|[权限组关联统一资源(unires_group_rel_pickup_grid_view)](app/view/unires_group_rel_pickup_grid_view)|

### 无搜索项的搜索表单<sup class="footnote-symbol"> <font color=orange>[24]</font></sup>
| 实体col200   |   视图col400 | 搜索表单col400  |
| --------   |------------|-----------|
|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|默认搜索表单(default)|[讨论频道(discuss_channel_pickup_grid_view)](app/view/discuss_channel_pickup_grid_view)|
|[离职原因(HR_DEPARTURE_REASON)](module/hr/hr_departure_reason)|默认搜索表单(default)|[离职原因(hr_departure_reason_grid_view)](app/view/hr_departure_reason_grid_view)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|默认搜索表单(default)|[员工(hr_employee_grid_view)](app/view/hr_employee_grid_view)|
|[工作岗位(HR_JOB)](module/hr/hr_job)|默认搜索表单(default)|[工作岗位(hr_job_pickup_grid_view)](app/view/hr_job_pickup_grid_view)|
|[休假(HR_LEAVE)](module/hr/hr_leave)|默认搜索表单(default)|[休假(hr_leave_pickup_grid_view)](app/view/hr_leave_pickup_grid_view)|
|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|默认搜索表单(default)|[工作地点(hr_work_location_pickup_grid_view)](app/view/hr_work_location_pickup_grid_view)|
|[集成应用(HUB_APP)](module/base/hub_app)|默认搜索表单(default)|[集成应用(hub_app_grid_view)](app/view/hub_app_grid_view)|
|[计划的操作(IR_CRON)](module/base/ir_cron)|默认搜索表单(default)|[计划的操作(ir_cron_pickup_grid_view)](app/view/ir_cron_pickup_grid_view)|
|[模型(IR_MODEL)](module/base/ir_model)|默认搜索表单(default)|[模型(ir_model_pickup_grid_view)](app/view/ir_model_pickup_grid_view)|
|[应用(IR_MODULE_CATEGORY)](module/base/ir_module_category)|默认搜索表单(default)|[应用分类(ir_module_category_grid_view)](app/view/ir_module_category_grid_view)|
|[模块(IR_MODULE_MODULE)](module/base/ir_module_module)|默认搜索表单(default)|[模块(ir_module_module_grid_view)](app/view/ir_module_module_grid_view)|
|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|默认搜索表单(default)|[活动类型(mail_activity_type_pickup_grid_view)](app/view/mail_activity_type_pickup_grid_view)|
|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain)|默认搜索表单(default)|[电子邮件域名(mail_alias_domain_pickup_grid_view)](app/view/mail_alias_domain_pickup_grid_view)|
|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|默认搜索表单(default)|[EMail模板(mail_template_pickup_grid_view)](app/view/mail_template_pickup_grid_view)|
|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|默认搜索表单(default)|[资源工作时间(resource_calendar_pickup_grid_view)](app/view/resource_calendar_pickup_grid_view)|
|[休假详细信息(RESOURCE_CALENDAR_LEAVES)](module/resource/resource_calendar_leaves)|默认搜索表单(default)|[休假详细信息(resource_calendar_leaves_grid_view)](app/view/resource_calendar_leaves_grid_view)|
|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|默认搜索表单(default)|[资源(resource_resource_pickup_grid_view)](app/view/resource_resource_pickup_grid_view)|
|[公司(RES_COMPANY)](module/base/res_company)|默认搜索表单(default)|[公司(res_company_pickup_grid_view)](app/view/res_company_pickup_grid_view)|
|[国家/地区(RES_COUNTRY)](module/base/res_country)|默认搜索表单(default)|[国家/地区(res_country_pickup_grid_view)](app/view/res_country_pickup_grid_view)|
|[币别(RES_CURRENCY)](module/base/res_currency)|默认搜索表单(default)|[币别(res_currency_pickup_grid_view)](app/view/res_currency_pickup_grid_view)|
|[权限组继承(RES_GROUPS_IMPLIED_REL)](module/base/res_groups_implied_rel)|默认搜索表单(default)|[权限组继承(res_groups_implied_rel_pickup_grid_view)](app/view/res_groups_implied_rel_pickup_grid_view)|
|[权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel)|默认搜索表单(default)|[权限组成员(res_groups_users_rel_user_group_mgr_view)](app/view/res_groups_users_rel_user_group_mgr_view)|
|[联系人(RES_PARTNER)](module/base/res_partner)|默认搜索表单(default)|[联系人(res_partner_pickup_grid_view)](app/view/res_partner_pickup_grid_view)|
|[权限组关联统一资源(UNIRES_GROUP_REL)](module/base_extend/unires_group_rel)|默认搜索表单(default)|[权限组关联统一资源(unires_group_rel_pickup_grid_view)](app/view/unires_group_rel_pickup_grid_view)|

### 除主键、主信息、预置属性外，不包含其他配置的表单<sup class="footnote-symbol"> <font color=orange>[22]</font></sup>
| 实体col200   |   视图col400 |表单col400  |
| --------   |------------|------------|
|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|主编辑表单(main)|[合同类型(hr_contract_type_edit_view)](app/view/hr_contract_type_edit_view)|
|[离职原因(HR_DEPARTURE_REASON)](module/hr/hr_departure_reason)|主编辑表单(main)|[离职原因(hr_departure_reason_edit_view)](app/view/hr_departure_reason_edit_view)|
|[员工类别(HR_EMPLOYEE_CATEGORY)](module/hr/hr_employee_category)|主编辑表单(main)|[员工类别(hr_employee_category_edit_view)](app/view/hr_employee_category_edit_view)|
|[工作岗位(HR_JOB)](module/hr/hr_job)|主编辑表单(main)|[工作岗位(hr_job_edit_view)](app/view/hr_job_edit_view)|
|[简历明细的类型(HR_RESUME_LINE_TYPE)](module/hr/hr_resume_line_type)|主编辑表单(main)|[简历明细的类型(hr_resume_line_type_edit_view)](app/view/hr_resume_line_type_edit_view)|
|[技能(HR_SKILL)](module/hr/hr_skill)|主编辑表单(main)|[技能(hr_skill_edit_view)](app/view/hr_skill_edit_view)|
|[技能等级(HR_SKILL_LEVEL)](module/hr/hr_skill_level)|主编辑表单(main)|[技能等级(hr_skill_level_edit_view)](app/view/hr_skill_level_edit_view)|
|[系统参数(IR_CONFIG_PARAMETER)](module/base/ir_config_parameter)|主编辑表单(main)|[系统参数(ir_config_parameter_edit_view)](app/view/ir_config_parameter_edit_view)|
|[触发行动(IR_CRON_TRIGGER)](module/base/ir_cron_trigger)|主编辑表单(main)|[触发行动(ir_cron_trigger_edit_view)](app/view/ir_cron_trigger_edit_view)|
|[默认值(IR_DEFAULT)](module/base/ir_default)|主编辑表单(main)|[默认值(ir_default_edit_view)](app/view/ir_default_edit_view)|
|[模型(IR_MODEL)](module/base/ir_model)|主编辑表单(main)|[模型(ir_model_edit_view)](app/view/ir_model_edit_view)|
|[模型访问(IR_MODEL_ACCESS)](module/base/ir_model_access)|主编辑表单(main)|[模型访问(ir_model_access_edit_view)](app/view/ir_model_access_edit_view)|
|[规则(IR_RULE)](module/base/ir_rule)|主编辑表单(main)|[规则(ir_rule_edit_view)](app/view/ir_rule_edit_view)|
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|活动反馈视图_表单(feedback)|[活动(mail_activity_edit_view)](app/view/mail_activity_edit_view)|
|[活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template)|主编辑表单(main)|[活动计划模板(mail_activity_plan_template_edit_view)](app/view/mail_activity_plan_template_edit_view)|
|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|主编辑表单(main)|[活动类型(mail_activity_type_edit_view)](app/view/mail_activity_type_edit_view)|
|[工作细节(RESOURCE_CALENDAR_ATTENDANCE)](module/resource/resource_calendar_attendance)|主编辑表单(main)|[工作细节(resource_calendar_attendance_edit_view)](app/view/resource_calendar_attendance_edit_view)|
|[权限组继承(RES_GROUPS_IMPLIED_REL)](module/base/res_groups_implied_rel)|主编辑表单(main)|[权限组继承(res_groups_implied_rel_edit_view)](app/view/res_groups_implied_rel_edit_view)|
|[权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel)|主编辑表单(main)|[权限组成员(res_groups_users_rel_edit_view)](app/view/res_groups_users_rel_edit_view)|
|[用户(RES_USERS)](module/base/res_users)|修改密码(chg_pwd)|[修改密码(res_users_chg_pwd_view)](app/view/res_users_chg_pwd_view)|
|[权限组关联规则(RULE_GROUP_REL)](module/base/rule_group_rel)|主编辑表单(main)|[权限组关联规则(rule_group_rel_edit_view)](app/view/rule_group_rel_edit_view)|
|[权限组关联统一资源(UNIRES_GROUP_REL)](module/base_extend/unires_group_rel)|主编辑表单(main)|[权限组关联统一资源(unires_group_rel_edit_view)](app/view/unires_group_rel_edit_view)|
