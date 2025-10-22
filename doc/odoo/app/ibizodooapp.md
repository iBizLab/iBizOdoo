# ibizodooapp(ibizodooapp)  <!-- {docsify-ignore-all} -->

## 菜单

<el-row>
  <el-menu :ellipsis="false" class="el-menu-demo" mode="horizontal" @select="handleSelect">
    <el-menu-item index="hr_employee" @click="itemClick('#/app/view/hr_employee_multi_data_view')">员工</el-menu-item>
    <el-menu-item index="hr_department" @click="itemClick('#/app/view/hr_department_multi_data_view')">部门</el-menu-item>
    <el-sub-menu index="hr_config">
      <template #title>设置</template>
    <el-menu-item index="mail_activity_plan" @click="itemClick('#/app/view/mail_activity_plan_multi_data_view')">活动计划</el-menu-item>
    <el-sub-menu index="hr_config_employee">
      <template #title>员工</template>
    <el-menu-item index="hr_work_location" @click="itemClick('#/app/view/hr_work_location_multi_data_view')">工作地点</el-menu-item>
    <el-menu-item index="resource_calendar" @click="itemClick('#/app/view/resource_calendar_multi_data_view')">工作时间表</el-menu-item>
    <el-menu-item index="hr_departure_reason" @click="itemClick('#/app/view/hr_departure_reason_multi_data_view')">离职原因</el-menu-item>
    <el-menu-item index="hr_skill_type" @click="itemClick('#/app/view/hr_skill_type_multi_data_view')">技能类型</el-menu-item>
    <el-menu-item index="hr_employee_category" @click="itemClick('#/app/view/hr_employee_category_multi_data_view')">标签</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="hr_resume_line_config">
      <template #title>简历</template>
    <el-menu-item index="hr_resume_line_type" @click="itemClick('#/app/view/hr_resume_line_type_multi_data_view')">简历明细类型</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="recruitment">
      <template #title>招聘</template>
    <el-menu-item index="hr_job" @click="itemClick('#/app/view/hr_job_multi_data_view')">工作岗位</el-menu-item>
    <el-menu-item index="hr_contract_type" @click="itemClick('#/app/view/hr_contract_type_multi_data_view')">就业类型</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="challenge">
      <template #title>挑战</template>
    <el-menu-item index="menuitem18" disabled>徽章</el-menu-item>
    <el-menu-item index="menuitem20" disabled>挑战</el-menu-item>
    <el-menu-item index="menuitem19" disabled>历史目标</el-menu-item>
    </el-sub-menu>
    </el-sub-menu>
  </el-menu>
</el-row>


## 视图清单

|  中文名     |   代码名  |  视图标题 | 视图类型   |   备注  |
|  --------   |------------| -----------|  -----   |  -----   |
|[客户关系管理首页](app/view/crm_index_view)|crm_index_view|客户关系管理|应用首页视图||
|[线索/商机编辑视图](app/view/crm_lead_main_view)|crm_lead_main_view|线索/商机|实体编辑视图|系统自动添加|
|[渠道](app/view/crm_lead_multi_data_view)|crm_lead_multi_data_view|渠道|实体多数据自定义视图||
|[邀请成员](app/view/discuss_channel_invite_member_view)|discuss_channel_invite_member_view|邀请成员|实体选项操作视图||
|[讨论频道](app/view/discuss_channel_main_pop_view)|discuss_channel_main_pop_view|讨论频道|实体自定义视图|系统自动添加|
|[讨论频道主视图](app/view/discuss_channel_main_view)|discuss_channel_main_view|讨论频道|实体自定义视图|系统自动添加|
|[频道成员编辑视图](app/view/discuss_channel_member_edit_view)|discuss_channel_member_edit_view|频道成员|实体编辑视图|系统自动添加|
|[频道成员表格视图](app/view/discuss_channel_member_grid_view)|discuss_channel_member_grid_view|频道成员|实体表格视图|系统自动添加|
|[频道成员](app/view/discuss_channel_member_list_view)|discuss_channel_member_list_view|频道成员|实体列表视图||
|[讨论频道选择表格视图](app/view/discuss_channel_pickup_grid_view)|discuss_channel_pickup_grid_view|讨论频道|实体选择表格视图（部件视图）|系统自动添加|
|[讨论频道数据选择视图](app/view/discuss_channel_pickup_view)|discuss_channel_pickup_view|讨论频道|实体数据选择视图|系统自动添加|
|[公共频道](app/view/discuss_channel_public_multi_data_view)|discuss_channel_public_multi_data_view|公共频道|实体多数据自定义视图||
|[讨论频道快速配置视图](app/view/discuss_channel_quick_cfg_view)|discuss_channel_quick_cfg_view|讨论频道|实体编辑视图|系统自动添加|
|[子频道列表](app/view/discuss_channel_sub_channel_grid_view)|discuss_channel_sub_channel_grid_view|子频道|实体表格视图||
|[讨论](app/view/discuss_index_view)|discuss_index_view|讨论|应用首页视图||
|[收件服务器](app/view/fetchmail_server_main_view)|fetchmail_server_main_view|收件服务器|实体编辑视图||
|[收件服务器](app/view/fetchmail_server_multi_data_view)|fetchmail_server_multi_data_view|收件服务器|实体多数据自定义视图||
|[合同类型编辑视图](app/view/hr_contract_type_edit_view)|hr_contract_type_edit_view|合同类型|实体编辑视图|系统自动添加|
|[合同类型](app/view/hr_contract_type_multi_data_view)|hr_contract_type_multi_data_view|就业类型|实体多数据自定义视图||
|[组织架构](app/view/hr_department_department_hierarchy_view)|hr_department_department_hierarchy_view|组织架构|实体树视图||
|[部门](app/view/hr_department_main_view)|hr_department_main_view|部门|实体编辑视图||
|[部门](app/view/hr_department_multi_data_view)|hr_department_multi_data_view|部门|实体多数据自定义视图||
|[部门选择表格视图](app/view/hr_department_pickup_grid_view)|hr_department_pickup_grid_view|部门|实体选择表格视图（部件视图）|系统自动添加|
|[部门数据选择视图](app/view/hr_department_pickup_view)|hr_department_pickup_view|部门|实体数据选择视图|系统自动添加|
|[离职原因编辑视图](app/view/hr_departure_reason_edit_view)|hr_departure_reason_edit_view|离职原因|实体编辑视图|系统自动添加|
|[离职原因表格视图](app/view/hr_departure_reason_grid_view)|hr_departure_reason_grid_view|离职原因|实体表格视图||
|[离职原因](app/view/hr_departure_reason_multi_data_view)|hr_departure_reason_multi_data_view|离职原因|实体多数据自定义视图||
|[基本信息视图](app/view/hr_employee_base_info_view)|hr_employee_base_info_view|员工|实体编辑视图||
|[员工类别编辑视图](app/view/hr_employee_category_edit_view)|hr_employee_category_edit_view|员工类别|实体编辑视图|系统自动添加|
|[员工类别](app/view/hr_employee_category_multi_data_view)|hr_employee_category_multi_data_view|员工标签|实体多数据自定义视图||
|[员工表格视图](app/view/hr_employee_grid_view)|hr_employee_grid_view|员工|实体表格视图|系统自动添加|
|[员工编辑视图](app/view/hr_employee_main_view)|hr_employee_main_view|员工|实体编辑视图|系统自动添加|
|[员工](app/view/hr_employee_multi_data_view)|hr_employee_multi_data_view|员工|实体多数据自定义视图||
|[组织图表](app/view/hr_employee_org_chart_view)|hr_employee_org_chart_view|组织图表|实体树视图||
|[组织架构](app/view/hr_employee_org_tree_view9)|hr_employee_org_tree_view9|组织架构|实体树视图（部件视图）||
|[员工选择表格视图](app/view/hr_employee_pickup_grid_view)|hr_employee_pickup_grid_view|员工|实体选择表格视图（部件视图）|系统自动添加|
|[员工数据选择视图](app/view/hr_employee_pickup_view)|hr_employee_pickup_view|员工|实体数据选择视图|系统自动添加|
|[ibizodooapp](app/view/hr_index_view)|hr_index_view|人力资源|应用首页视图||
|[工作岗位编辑视图](app/view/hr_job_edit_view)|hr_job_edit_view|工作岗位|实体编辑视图|系统自动添加|
|[工作岗位](app/view/hr_job_main_view)|hr_job_main_view|工作岗位|实体编辑视图||
|[工作岗位](app/view/hr_job_main_view_test)|hr_job_main_view_test|工作岗位|实体编辑视图||
|[工作岗位](app/view/hr_job_multi_data_view)|hr_job_multi_data_view|工作岗位|实体多数据自定义视图||
|[工作岗位](app/view/hr_job_multi_data_view_test)|hr_job_multi_data_view_test|工作岗位|实体多数据自定义视图||
|[工作岗位选择表格视图](app/view/hr_job_pickup_grid_view)|hr_job_pickup_grid_view|工作岗位|实体选择表格视图（部件视图）|系统自动添加|
|[工作岗位数据选择视图](app/view/hr_job_pickup_view)|hr_job_pickup_view|工作岗位|实体数据选择视图|系统自动添加|
|[休假选择表格视图](app/view/hr_leave_pickup_grid_view)|hr_leave_pickup_grid_view|休假|实体选择表格视图（部件视图）|系统自动添加|
|[休假数据选择视图](app/view/hr_leave_pickup_view)|hr_leave_pickup_view|休假|实体数据选择视图|系统自动添加|
|[简历明细的类型编辑视图](app/view/hr_resume_line_type_edit_view)|hr_resume_line_type_edit_view|简历明细的类型|实体编辑视图|系统自动添加|
|[简历明细类型](app/view/hr_resume_line_type_multi_data_view)|hr_resume_line_type_multi_data_view|简历明细类型|实体多数据自定义视图||
|[技能编辑视图](app/view/hr_skill_edit_view)|hr_skill_edit_view|技能|实体编辑视图|系统自动添加|
|[技能表格视图](app/view/hr_skill_grid_view)|hr_skill_grid_view|技能|实体表格视图||
|[技能等级编辑视图](app/view/hr_skill_level_edit_view)|hr_skill_level_edit_view|技能等级|实体编辑视图|系统自动添加|
|[技能等级表格视图](app/view/hr_skill_level_grid_view)|hr_skill_level_grid_view|技能等级|实体表格视图||
|[技能类型](app/view/hr_skill_type_main_view)|hr_skill_type_main_view|技能类型|实体编辑视图||
|[技能类型](app/view/hr_skill_type_multi_data_view)|hr_skill_type_multi_data_view|技能类型|实体多数据自定义视图||
|[工作地点](app/view/hr_work_location_main_view)|hr_work_location_main_view|工作地点|实体编辑视图||
|[工作地点](app/view/hr_work_location_multi_data_view)|hr_work_location_multi_data_view|工作地点|实体多数据自定义视图||
|[工作地点选择表格视图](app/view/hr_work_location_pickup_grid_view)|hr_work_location_pickup_grid_view|工作地点|实体选择表格视图（部件视图）|系统自动添加|
|[工作地点数据选择视图](app/view/hr_work_location_pickup_view)|hr_work_location_pickup_view|工作地点|实体数据选择视图|系统自动添加|
|[集成应用](app/view/hub_app_edit_view)|hub_app_edit_view|集成应用|实体编辑视图||
|[集成应用](app/view/hub_app_grid_view)|hub_app_grid_view|集成应用|实体表格视图||
|[服务器动作编辑视图](app/view/ir_actions_server_edit_view)|ir_actions_server_edit_view|服务器动作|实体编辑视图|系统自动添加|
|[服务器动作](app/view/ir_actions_server_main_view)|ir_actions_server_main_view|服务器操作|实体编辑视图||
|[服务器动作](app/view/ir_actions_server_multi_data_view)|ir_actions_server_multi_data_view|服务器操作|实体多数据自定义视图||
|[系统参数编辑视图](app/view/ir_config_parameter_edit_view)|ir_config_parameter_edit_view|系统参数|实体编辑视图|系统自动添加|
|[系统参数](app/view/ir_config_parameter_main_view)|ir_config_parameter_main_view|系统参数|实体编辑视图||
|[系统参数](app/view/ir_config_parameter_multi_data_view)|ir_config_parameter_multi_data_view|系统参数|实体多数据自定义视图||
|[计划的操作](app/view/ir_cron_main_view)|ir_cron_main_view|计划的操作|实体编辑视图||
|[计划的操作](app/view/ir_cron_multi_data_view)|ir_cron_multi_data_view|计划的操作|实体多数据自定义视图||
|[计划的操作选择表格视图](app/view/ir_cron_pickup_grid_view)|ir_cron_pickup_grid_view|计划的操作|实体选择表格视图（部件视图）|系统自动添加|
|[计划的操作数据选择视图](app/view/ir_cron_pickup_view)|ir_cron_pickup_view|计划的操作|实体数据选择视图|系统自动添加|
|[触发行动编辑视图](app/view/ir_cron_trigger_edit_view)|ir_cron_trigger_edit_view|触发行动|实体编辑视图|系统自动添加|
|[触发行动](app/view/ir_cron_trigger_main_view)|ir_cron_trigger_main_view|计划行动触发器|实体编辑视图||
|[触发行动](app/view/ir_cron_trigger_multi_data_view)|ir_cron_trigger_multi_data_view|计划行动触发器|实体多数据自定义视图||
|[默认值编辑视图](app/view/ir_default_edit_view)|ir_default_edit_view|默认值|实体编辑视图|系统自动添加|
|[默认值](app/view/ir_default_main_view)|ir_default_main_view|默认值|实体编辑视图||
|[默认值](app/view/ir_default_multi_data_view)|ir_default_multi_data_view|默认值|实体多数据自定义视图||
|[邮件服务器编辑视图](app/view/ir_mail_server_edit_view)|ir_mail_server_edit_view|邮件服务器|实体编辑视图|系统自动添加|
|[邮件服务器](app/view/ir_mail_server_main_view)|ir_mail_server_main_view|发送服务器|实体编辑视图||
|[邮件服务器](app/view/ir_mail_server_multi_data_view)|ir_mail_server_multi_data_view|发送服务器|实体多数据自定义视图||
|[模型访问编辑视图](app/view/ir_model_access_edit_view)|ir_model_access_edit_view|模型访问|实体编辑视图|系统自动添加|
|[模型访问表格视图](app/view/ir_model_access_grid_view)|ir_model_access_grid_view|模型访问|实体表格视图||
|[模型访问](app/view/ir_model_access_multi_data_view)|ir_model_access_multi_data_view|模型访问|实体多数据自定义视图||
|[模型编辑视图](app/view/ir_model_edit_view)|ir_model_edit_view|模型|实体编辑视图|系统自动添加|
|[模型](app/view/ir_model_multi_data_view)|ir_model_multi_data_view|模型|实体多数据自定义视图||
|[模型选择表格视图](app/view/ir_model_pickup_grid_view)|ir_model_pickup_grid_view|模型|实体选择表格视图（部件视图）|系统自动添加|
|[模型数据选择视图](app/view/ir_model_pickup_view)|ir_model_pickup_view|模型|实体数据选择视图|系统自动添加|
|[应用编辑视图](app/view/ir_module_category_edit_view)|ir_module_category_edit_view|应用|实体编辑视图||
|[应用表格视图](app/view/ir_module_category_grid_view)|ir_module_category_grid_view|应用分类|实体表格视图||
|[应用选择表格视图](app/view/ir_module_category_pickup_grid_view)|ir_module_category_pickup_grid_view|应用|实体选择表格视图（部件视图）|系统自动添加|
|[应用数据选择视图](app/view/ir_module_category_pickup_view)|ir_module_category_pickup_view|应用|实体数据选择视图|系统自动添加|
|[模块编辑视图](app/view/ir_module_module_edit_view)|ir_module_module_edit_view|模块|实体编辑视图||
|[模块表格视图](app/view/ir_module_module_grid_view)|ir_module_module_grid_view|模块|实体表格视图||
|[模块表格视图_测试](app/view/ir_module_module_grid_view_test)|ir_module_module_grid_view_test|模块|实体表格视图||
|[规则编辑视图](app/view/ir_rule_edit_view)|ir_rule_edit_view|规则|实体编辑视图|系统自动添加|
|[规则表格视图](app/view/ir_rule_grid_view)|ir_rule_grid_view|规则|实体表格视图||
|[规则数据多项选择视图](app/view/ir_rule_m_pickup_view)|ir_rule_m_pickup_view|规则|实体数据多项选择视图||
|[规则](app/view/ir_rule_main_view)|ir_rule_main_view|规则|实体编辑视图||
|[规则](app/view/ir_rule_multi_data_view)|ir_rule_multi_data_view|规则|实体多数据自定义视图||
|[规则选择表格视图](app/view/ir_rule_pickup_grid_view)|ir_rule_pickup_grid_view|规则|实体选择表格视图（部件视图）|系统自动添加|
|[规则数据选择视图](app/view/ir_rule_pickup_view)|ir_rule_pickup_view|规则|实体数据选择视图|系统自动添加|
|[统一资源编辑视图](app/view/ir_unires_edit_view)|ir_unires_edit_view|统一资源|实体编辑视图|系统自动添加|
|[统一资源表格视图](app/view/ir_unires_grid_view)|ir_unires_grid_view|统一资源|实体表格视图||
|[统一资源](app/view/ir_unires_info_view)|ir_unires_info_view|基本信息|实体编辑视图||
|[统一资源数据多项选择视图](app/view/ir_unires_m_pickup_view)|ir_unires_m_pickup_view|统一资源|实体数据多项选择视图||
|[统一资源](app/view/ir_unires_main_view)|ir_unires_main_view|统一资源|实体编辑视图||
|[统一资源](app/view/ir_unires_multi_data_view)|ir_unires_multi_data_view|统一资源|实体多数据自定义视图||
|[统一资源选择表格视图](app/view/ir_unires_pickup_grid_view)|ir_unires_pickup_grid_view|统一资源|实体选择表格视图（部件视图）|系统自动添加|
|[活动编辑视图](app/view/mail_activity_edit_view)|mail_activity_edit_view|活动|实体编辑视图|系统自动添加|
|[员工安排活动](app/view/mail_activity_emp_schedule_act_view)|mail_activity_emp_schedule_act_view|活动|实体列表视图||
|[标记完成](app/view/mail_activity_feedback_view)|mail_activity_feedback_view|标记完成|实体编辑视图||
|[活动](app/view/mail_activity_main_view)|mail_activity_main_view|活动|实体编辑视图||
|[活动](app/view/mail_activity_multi_data_view)|mail_activity_multi_data_view|活动|实体多数据自定义视图||
|[活动计划](app/view/mail_activity_plan_main_view)|mail_activity_plan_main_view|员工计划|实体编辑视图||
|[活动计划](app/view/mail_activity_plan_main_view2)|mail_activity_plan_main_view2|员工计划|实体编辑视图||
|[活动计划](app/view/mail_activity_plan_multi_data_view)|mail_activity_plan_multi_data_view|员工计划|实体多数据自定义视图||
|[活动计划](app/view/mail_activity_plan_multi_data_view2)|mail_activity_plan_multi_data_view2|员工计划|实体多数据自定义视图||
|[活动计划模板编辑视图](app/view/mail_activity_plan_template_edit_view)|mail_activity_plan_template_edit_view|活动计划模板|实体编辑视图|系统自动添加|
|[活动计划模板](app/view/mail_activity_plan_template_grid_view)|mail_activity_plan_template_grid_view|待创建的活动|实体表格视图||
|[活动计划模板](app/view/mail_activity_plan_template_quick_create_view)|mail_activity_plan_template_quick_create_view|活动计划模板|实体选项操作视图||
|[安排活动](app/view/mail_activity_quick_cfg_view)|mail_activity_quick_cfg_view|安排活动|实体编辑视图||
|[活动实体数据重定向视图](app/view/mail_activity_redirect_view)|mail_activity_redirect_view|活动|实体数据重定向视图||
|[活动日程计划向导](app/view/mail_activity_schedule_quick_create_view)|mail_activity_schedule_quick_create_view|安排活动|实体编辑视图||
|[活动类型编辑视图](app/view/mail_activity_type_edit_view)|mail_activity_type_edit_view|活动类型|实体编辑视图|系统自动添加|
|[活动类型](app/view/mail_activity_type_main_view)|mail_activity_type_main_view|活动类型|实体编辑视图||
|[活动类型](app/view/mail_activity_type_multi_data_view)|mail_activity_type_multi_data_view|活动类型|实体多数据自定义视图||
|[活动类型选择表格视图](app/view/mail_activity_type_pickup_grid_view)|mail_activity_type_pickup_grid_view|活动类型|实体选择表格视图（部件视图）|系统自动添加|
|[活动类型数据选择视图](app/view/mail_activity_type_pickup_view)|mail_activity_type_pickup_view|活动类型|实体数据选择视图|系统自动添加|
|[电子邮件域名](app/view/mail_alias_domain_main_view)|mail_alias_domain_main_view|别名域|实体编辑视图||
|[电子邮件域名](app/view/mail_alias_domain_multi_data_view)|mail_alias_domain_multi_data_view|别名域|实体多数据自定义视图||
|[电子邮件域名选择表格视图](app/view/mail_alias_domain_pickup_grid_view)|mail_alias_domain_pickup_grid_view|电子邮件域名|实体选择表格视图（部件视图）|系统自动添加|
|[电子邮件域名数据选择视图](app/view/mail_alias_domain_pickup_view)|mail_alias_domain_pickup_view|电子邮件域名|实体数据选择视图|系统自动添加|
|[EMail别名实体](app/view/mail_alias_main_view)|mail_alias_main_view|别名|实体编辑视图||
|[EMail别名](app/view/mail_alias_multi_data_view)|mail_alias_multi_data_view|别名|实体多数据自定义视图||
|[单据关注者](app/view/mail_followers_main_view)|mail_followers_main_view|单据关注者|实体编辑视图||
|[单据关注者](app/view/mail_followers_multi_data_view)|mail_followers_multi_data_view|单据关注者|实体多数据自定义视图||
|[发送邮件](app/view/mail_mail_main_view)|mail_mail_main_view|EMail|实体编辑视图||
|[发送邮件](app/view/mail_mail_multi_data_view)|mail_mail_multi_data_view|EMail|实体多数据自定义视图||
|[频道](app/view/mail_message_discuss_channel_list_view)|mail_message_discuss_channel_list_view|频道|实体列表视图|系统自动添加|
|[历史消息](app/view/mail_message_discuss_history_list_view)|mail_message_discuss_history_list_view|历史消息|实体列表视图|系统自动添加|
|[收件箱](app/view/mail_message_discuss_inbox_list_view)|mail_message_discuss_inbox_list_view|收件箱|实体列表视图||
|[讨论](app/view/mail_message_discuss_main_view)|mail_message_discuss_main_view|讨论|实体树导航视图||
|[星标消息](app/view/mail_message_discuss_starred_list_view)|mail_message_discuss_starred_list_view|星标消息|实体列表视图|系统自动添加|
|[消息编辑视图](app/view/mail_message_edit_view)|mail_message_edit_view|消息|实体编辑视图|系统自动添加|
|[消息](app/view/mail_message_main_view)|mail_message_main_view|消息|实体编辑视图||
|[消息](app/view/mail_message_multi_data_view)|mail_message_multi_data_view|消息|实体多数据自定义视图||
|[消息选择表格视图](app/view/mail_message_pickup_grid_view)|mail_message_pickup_grid_view|消息|实体选择表格视图（部件视图）|系统自动添加|
|[消息数据选择视图](app/view/mail_message_pickup_view)|mail_message_pickup_view|消息|实体数据选择视图|系统自动添加|
|[置顶消息](app/view/mail_message_pinned_list_view)|mail_message_pinned_list_view|置顶消息|实体列表视图|系统自动添加|
|[消息数据重定向视图](app/view/mail_message_redirect_view)|mail_message_redirect_view|消息|实体数据重定向视图|系统自动添加|
|[消息检索](app/view/mail_message_search_list_view)|mail_message_search_list_view|消息检索|实体列表视图|系统自动添加|
|[消息通知](app/view/mail_notification_main_view)|mail_notification_main_view|消息通知|实体编辑视图||
|[消息通知](app/view/mail_notification_multi_data_view)|mail_notification_multi_data_view|消息通知|实体多数据自定义视图||
|[EMail模板](app/view/mail_template_main_view)|mail_template_main_view|EMail模板|实体编辑视图||
|[EMail模板](app/view/mail_template_multi_data_view)|mail_template_multi_data_view|EMail模板|实体多数据自定义视图||
|[EMail模板选择表格视图](app/view/mail_template_pickup_grid_view)|mail_template_pickup_grid_view|EMail模板|实体选择表格视图（部件视图）|系统自动添加|
|[EMail模板数据选择视图](app/view/mail_template_pickup_view)|mail_template_pickup_view|EMail模板|实体数据选择视图|系统自动添加|
|[邮件会话](app/view/mail_thread_component_view)|mail_thread_component_view|邮件会话|实体自定义视图||
|[联系人首页](app/view/partner_index_view)|partner_index_view|联系人|应用首页视图||
|[核心产品功能编辑视图](app/view/ps_core_prd_func_info_view)|ps_core_prd_func_info_view|核心产品功能|实体编辑视图|系统自动添加|
|[已安装应用](app/view/ps_core_prd_func_installed_grid_view)|ps_core_prd_func_installed_grid_view|已安装应用|实体表格视图|系统自动添加|
|[应用市场](app/view/ps_core_prd_func_market_application_view)|ps_core_prd_func_market_application_view|应用市场|实体数据视图|系统自动添加|
|[组件扩展设置](app/view/ps_core_prd_func_setting_edit_view)|ps_core_prd_func_setting_edit_view|扩展设置|实体编辑视图|系统自动添加|
|[应用管理](app/view/ps_core_prd_func_tree_exp_view)|ps_core_prd_func_tree_exp_view|应用市场|实体树导航视图||
|[应用](app/view/ps_core_prd_info_view)|ps_core_prd_info_view|应用|实体编辑视图|系统自动添加|
|[应用市场](app/view/ps_core_prd_market_application_view)|ps_core_prd_market_application_view|核心产品|实体数据视图|系统自动添加|
|[公司](app/view/res_company_edit_view)|res_company_edit_view|打开公司|实体选项操作视图||
|[公司](app/view/res_company_main_view)|res_company_main_view|公司|实体编辑视图||
|[公司](app/view/res_company_multi_data_view)|res_company_multi_data_view|公司|实体多数据自定义视图||
|[公司选择表格视图](app/view/res_company_pickup_grid_view)|res_company_pickup_grid_view|公司|实体选择表格视图（部件视图）|系统自动添加|
|[公司数据选择视图](app/view/res_company_pickup_view)|res_company_pickup_view|公司|实体数据选择视图|系统自动添加|
|[配置设定编辑视图](app/view/res_config_settings_modify_setting)|res_config_settings_modify_setting|配置设定|实体编辑视图||
|[国家/地区选择表格视图](app/view/res_country_pickup_grid_view)|res_country_pickup_grid_view|国家/地区|实体选择表格视图（部件视图）|系统自动添加|
|[国家/地区数据选择视图](app/view/res_country_pickup_view)|res_country_pickup_view|国家/地区|实体数据选择视图|系统自动添加|
|[币别选择表格视图](app/view/res_currency_pickup_grid_view)|res_currency_pickup_grid_view|币别|实体选择表格视图（部件视图）|系统自动添加|
|[币别数据选择视图](app/view/res_currency_pickup_view)|res_currency_pickup_view|币别|实体数据选择视图|系统自动添加|
|[权限组信息](app/view/res_groups_edit_view)|res_groups_edit_view|群组|实体编辑视图||
|[权限组继承编辑视图](app/view/res_groups_implied_rel_edit_view)|res_groups_implied_rel_edit_view|权限组继承|实体编辑视图|系统自动添加|
|[权限组继承表格视图](app/view/res_groups_implied_rel_grid_view)|res_groups_implied_rel_grid_view|权限组继承|实体表格视图||
|[权限组继承数据多项选择视图](app/view/res_groups_implied_rel_m_pickup_view)|res_groups_implied_rel_m_pickup_view|权限组继承|实体数据多项选择视图||
|[权限组继承选择表格视图](app/view/res_groups_implied_rel_pickup_grid_view)|res_groups_implied_rel_pickup_grid_view|权限组继承|实体选择表格视图（部件视图）||
|[权限组继承数据选择视图](app/view/res_groups_implied_rel_pickup_view)|res_groups_implied_rel_pickup_view|权限组继承|实体数据选择视图||
|[权限组数据多项选择视图](app/view/res_groups_m_pickup_view)|res_groups_m_pickup_view|权限组|实体数据多项选择视图||
|[权限组信息](app/view/res_groups_main_view)|res_groups_main_view|群组|实体编辑视图||
|[群组](app/view/res_groups_multi_data_view)|res_groups_multi_data_view|群组|实体多数据自定义视图||
|[群组](app/view/res_groups_multi_data_view_user)|res_groups_multi_data_view_user|用户所属群组|实体多数据自定义视图||
|[权限组选择表格视图](app/view/res_groups_pickup_grid_view)|res_groups_pickup_grid_view|权限组|实体选择表格视图（部件视图）|系统自动添加|
|[权限组数据选择视图](app/view/res_groups_pickup_view)|res_groups_pickup_view|权限组|实体数据选择视图|系统自动添加|
|[权限组成员编辑视图](app/view/res_groups_users_rel_edit_view)|res_groups_users_rel_edit_view|权限组成员|实体编辑视图|系统自动添加|
|[权限组成员表格视图](app/view/res_groups_users_rel_grid_view)|res_groups_users_rel_grid_view|权限组成员|实体表格视图||
|[用户权限组管理](app/view/res_groups_users_rel_user_group_mgr_view)|res_groups_users_rel_user_group_mgr_view|权限组成员|实体表格视图||
|[联系人](app/view/res_partner_main_view)|res_partner_main_view|联系人|实体编辑视图||
|[联系人](app/view/res_partner_multi_data_view)|res_partner_multi_data_view|联系人|实体多数据自定义视图||
|[联系人](app/view/res_partner_pick_up_list_view)|res_partner_pick_up_list_view|邀请成员|实体列表视图||
|[联系人选择表格视图](app/view/res_partner_pickup_grid_view)|res_partner_pickup_grid_view|联系人|实体选择表格视图（部件视图）|系统自动添加|
|[联系人数据选择视图](app/view/res_partner_pickup_view)|res_partner_pickup_view|联系人|实体数据选择视图|系统自动添加|
|[帐号设置](app/view/res_users_chg_pwd_view)|res_users_chg_pwd_view|修改密码|实体编辑视图|系统自动添加|
|[创建用户](app/view/res_users_create_user_view)|res_users_create_user_view|创建用户|实体选项操作视图||
|[打开用户](app/view/res_users_edit_view)|res_users_edit_view|打开用户|实体选项操作视图||
|[用户表格视图](app/view/res_users_grid_view)|res_users_grid_view|用户|实体表格视图||
|[用户信息自定义视图](app/view/res_users_info_custom_view)|res_users_info_custom_view|用户信息自定义视图|实体自定义视图||
|[基本信息](app/view/res_users_info_view)|res_users_info_view|基本信息|实体编辑视图||
|[用户数据多项选择视图](app/view/res_users_m_pickup_view)|res_users_m_pickup_view|用户|实体数据多项选择视图||
|[用户信息](app/view/res_users_main_view)|res_users_main_view|用户|实体编辑视图||
|[用户](app/view/res_users_multi_data_view)|res_users_multi_data_view|用户|实体多数据自定义视图||
|[用户信息](app/view/res_users_personal_view)|res_users_personal_view|用户|实体编辑视图||
|[用户选择表格视图](app/view/res_users_pickup_grid_view)|res_users_pickup_grid_view|用户|实体选择表格视图（部件视图）|系统自动添加|
|[用户数据选择视图](app/view/res_users_pickup_view)|res_users_pickup_view|用户|实体数据选择视图|系统自动添加|
|[工作细节编辑视图](app/view/resource_calendar_attendance_edit_view)|resource_calendar_attendance_edit_view|工作细节|实体编辑视图|系统自动添加|
|[工作细节](app/view/resource_calendar_attendance_grid_view_nested)|resource_calendar_attendance_grid_view_nested|工作细节|实体表格视图||
|[休假详细信息表格视图](app/view/resource_calendar_leaves_grid_view)|resource_calendar_leaves_grid_view|休假详细信息|实体表格视图||
|[休假详细信息](app/view/resource_calendar_leaves_main_view)|resource_calendar_leaves_main_view|休假详细信息|实体编辑视图||
|[休假详细信息](app/view/resource_calendar_leaves_multi_data_view)|resource_calendar_leaves_multi_data_view|休息时间|实体多数据自定义视图||
|[休假详细信息](app/view/resource_calendar_leaves_multi_data_view1)|resource_calendar_leaves_multi_data_view1|休息时间|实体多数据自定义视图||
|[资源工作时间](app/view/resource_calendar_main_view)|resource_calendar_main_view|工作时间表|实体编辑视图||
|[资源工作时间](app/view/resource_calendar_multi_data_view)|resource_calendar_multi_data_view|工作时间表|实体多数据自定义视图||
|[资源工作时间选择表格视图](app/view/resource_calendar_pickup_grid_view)|resource_calendar_pickup_grid_view|资源工作时间|实体选择表格视图（部件视图）|系统自动添加|
|[资源工作时间数据选择视图](app/view/resource_calendar_pickup_view)|resource_calendar_pickup_view|资源工作时间|实体数据选择视图|系统自动添加|
|[资源编辑视图](app/view/resource_resource_main_view)|resource_resource_main_view|资源|实体编辑视图||
|[资源](app/view/resource_resource_multi_data_view)|resource_resource_multi_data_view|资源|实体多数据自定义视图||
|[资源选择表格视图](app/view/resource_resource_pickup_grid_view)|resource_resource_pickup_grid_view|资源|实体选择表格视图（部件视图）|系统自动添加|
|[资源数据选择视图](app/view/resource_resource_pickup_view)|resource_resource_pickup_view|资源|实体数据选择视图|系统自动添加|
|[权限组关联规则编辑视图](app/view/rule_group_rel_edit_view)|rule_group_rel_edit_view|权限组关联规则|实体编辑视图|系统自动添加|
|[权限组关联规则表格视图](app/view/rule_group_rel_nested_group_grid_view)|rule_group_rel_nested_group_grid_view|权限组关联规则|实体表格视图||
|[权限组关联规则表格视图](app/view/rule_group_rel_nested_rule_grid_view)|rule_group_rel_nested_rule_grid_view|权限组关联规则|实体表格视图||
|[设置](app/view/setting_index_view)|setting_index_view|设置|应用首页视图||
|[权限组关联统一资源编辑视图](app/view/unires_group_rel_edit_view)|unires_group_rel_edit_view|权限组关联统一资源|实体编辑视图|系统自动添加|
|[权限组关联统一资源数据多项选择视图](app/view/unires_group_rel_m_pickup_view)|unires_group_rel_m_pickup_view|权限组关联统一资源|实体数据多项选择视图||
|[权限组关联统一资源](app/view/unires_group_rel_nested_group_grid_view)|unires_group_rel_nested_group_grid_view|权限组关联统一资源|实体表格视图||
|[权限组关联统一资源选择表格视图](app/view/unires_group_rel_pickup_grid_view)|unires_group_rel_pickup_grid_view|权限组关联统一资源|实体选择表格视图（部件视图）||

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {
      itemClick(url) {
        location.href = url
      }
    }
  }).use(ElementPlus).mount('#app')
</script>