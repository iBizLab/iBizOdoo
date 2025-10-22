import { Component, defineAsyncComponent } from 'vue';

function calcAppViewId(tag: string): string {
  let id = '';
  if (tag.indexOf('.') !== -1) {
    const ids = tag.split('.');
    id = ids[ids.length - 1];
  } else {
    id = tag.toLowerCase();
  }
  return id;
}

export async function getAppViewComponent(
  name: string,
  appId: string,
): Promise<Component> {
  const _name = calcAppViewId(name).toLowerCase();
  // 子应用视图
  if (appId !== ibiz.env.appId) {
    return defineAsyncComponent(
      () => import('../../components/sub-app-view/sub-app-view.vue'),
    );
  }
  switch (_name) {
    case 'resource_resource_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-resource/resource-resource-multi-data-view/resource-resource-multi-data-view.vue'
          ),
      );
    case 'hr_employee_category_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee-category/hr-employee-category-edit-view/hr-employee-category-edit-view.vue'
          ),
      );
    case 'res_users_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-users/res-users-m-pickup-view/res-users-m-pickup-view.vue'
          ),
      );
    case 'resource_calendar_leaves_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-leaves/resource-calendar-leaves-multi-data-view/resource-calendar-leaves-multi-data-view.vue'
          ),
      );
    case 'ir_config_parameter_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-config-parameter/ir-config-parameter-multi-data-view/ir-config-parameter-multi-data-view.vue'
          ),
      );
    case 'hr_department_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-pickup-view/hr-department-pickup-view.vue'
          ),
      );
    case 'discuss_channel_sub_channel_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-sub-channel-grid-view/discuss-channel-sub-channel-grid-view.vue'
          ),
      );
    case 'resource_calendar_leaves_multi_data_view1':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-leaves/resource-calendar-leaves-multi-data-view-1/resource-calendar-leaves-multi-data-view-1.vue'
          ),
      );
    case 'ir_unires_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-unires/ir-unires-pickup-grid-view/ir-unires-pickup-grid-view.vue'
          ),
      );
    case 'res_company_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-edit-view/res-company-edit-view.vue'
          ),
      );
    case 'res_company_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-multi-data-view/res-company-multi-data-view.vue'
          ),
      );
    case 'res_partner_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-partner/res-partner-pickup-view/res-partner-pickup-view.vue'
          ),
      );
    case 'mail_activity_type_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-type/mail-activity-type-pickup-grid-view/mail-activity-type-pickup-grid-view.vue'
          ),
      );
    case 'ir_mail_server_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-mail-server/ir-mail-server-multi-data-view/ir-mail-server-multi-data-view.vue'
          ),
      );
    case 'res_groups_main_view':
      return defineAsyncComponent(
        () =>
          import('./res-groups/res-groups-main-view/res-groups-main-view.vue'),
      );
    case 'ps_core_prd_func_info_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-info-view/ps-core-prd-func-info-view.vue'
          ),
      );
    case 'mail_activity_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity/mail-activity-multi-data-view/mail-activity-multi-data-view.vue'
          ),
      );
    case 'mail_activity_plan_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan/mail-activity-plan-main-view/mail-activity-plan-main-view.vue'
          ),
      );
    case 'mail_template_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-template/mail-template-main-view/mail-template-main-view.vue'
          ),
      );
    case 'hr_employee_org_chart_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-org-chart-view/hr-employee-org-chart-view.vue'
          ),
      );
    case 'res_company_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-main-view/res-company-main-view.vue'
          ),
      );
    case 'hr_resume_line_type_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-resume-line-type/hr-resume-line-type-multi-data-view/hr-resume-line-type-multi-data-view.vue'
          ),
      );
    case 'resource_resource_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-resource/resource-resource-pickup-grid-view/resource-resource-pickup-grid-view.vue'
          ),
      );
    case 'mail_alias_domain_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-alias-domain/mail-alias-domain-pickup-view/mail-alias-domain-pickup-view.vue'
          ),
      );
    case 'crm_index_view':
      return defineAsyncComponent(
        () => import('./crm-index-view/crm-index-view.vue'),
      );
    case 'mail_activity_type_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-type/mail-activity-type-multi-data-view/mail-activity-type-multi-data-view.vue'
          ),
      );
    case 'resource_calendar_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar/resource-calendar-multi-data-view/resource-calendar-multi-data-view.vue'
          ),
      );
    case 'mail_activity_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity/mail-activity-main-view/mail-activity-main-view.vue'
          ),
      );
    case 'mail_message_discuss_history_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-discuss-history-list-view/mail-message-discuss-history-list-view.vue'
          ),
      );
    case 'res_country_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-country/res-country-pickup-grid-view/res-country-pickup-grid-view.vue'
          ),
      );
    case 'res_groups_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groups-multi-data-view/res-groups-multi-data-view.vue'
          ),
      );
    case 'ir_rule_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-rule/ir-rule-pickup-grid-view/ir-rule-pickup-grid-view.vue'
          ),
      );
    case 'mail_template_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-template/mail-template-multi-data-view/mail-template-multi-data-view.vue'
          ),
      );
    case 'hr_contract_type_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-contract-type/hr-contract-type-edit-view/hr-contract-type-edit-view.vue'
          ),
      );
    case 'discuss_channel_invite_member_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-invite-member-view/discuss-channel-invite-member-view.vue'
          ),
      );
    case 'partner_index_view':
      return defineAsyncComponent(
        () => import('./partner-index-view/partner-index-view.vue'),
      );
    case 'hr_job_pickup_view':
      return defineAsyncComponent(
        () => import('./hr-job/hr-job-pickup-view/hr-job-pickup-view.vue'),
      );
    case 'mail_mail_main_view':
      return defineAsyncComponent(
        () => import('./mail-mail/mail-mail-main-view/mail-mail-main-view.vue'),
      );
    case 'ir_cron_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-cron/ir-cron-pickup-grid-view/ir-cron-pickup-grid-view.vue'
          ),
      );
    case 'mail_activity_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity/mail-activity-redirect-view/mail-activity-redirect-view.vue'
          ),
      );
    case 'ir_actions_server_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-actions-server/ir-actions-server-multi-data-view/ir-actions-server-multi-data-view.vue'
          ),
      );
    case 'ir_cron_pickup_view':
      return defineAsyncComponent(
        () => import('./ir-cron/ir-cron-pickup-view/ir-cron-pickup-view.vue'),
      );
    case 'mail_message_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-pickup-grid-view/mail-message-pickup-grid-view.vue'
          ),
      );
    case 'resource_resource_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-resource/resource-resource-main-view/resource-resource-main-view.vue'
          ),
      );
    case 'ps_core_prd_func_market_application_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-market-application-view/ps-core-prd-func-market-application-view.vue'
          ),
      );
    case 'discuss_channel_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-main-view/discuss-channel-main-view.vue'
          ),
      );
    case 'hr_work_location_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-main-view/hr-work-location-main-view.vue'
          ),
      );
    case 'hr_skill_level_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-skill-level/hr-skill-level-edit-view/hr-skill-level-edit-view.vue'
          ),
      );
    case 'mail_alias_main_view':
      return defineAsyncComponent(
        () =>
          import('./mail-alias/mail-alias-main-view/mail-alias-main-view.vue'),
      );
    case 'mail_activity_plan_main_view2':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan/mail-activity-plan-main-view-2/mail-activity-plan-main-view-2.vue'
          ),
      );
    case 'mail_activity_plan_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan/mail-activity-plan-multi-data-view/mail-activity-plan-multi-data-view.vue'
          ),
      );
    case 'hr_employee_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-multi-data-view/hr-employee-multi-data-view.vue'
          ),
      );
    case 'res_currency_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-currency/res-currency-pickup-view/res-currency-pickup-view.vue'
          ),
      );
    case 'res_groups_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groups-m-pickup-view/res-groups-m-pickup-view.vue'
          ),
      );
    case 'mail_alias_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-alias/mail-alias-multi-data-view/mail-alias-multi-data-view.vue'
          ),
      );
    case 'res_currency_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-currency/res-currency-pickup-grid-view/res-currency-pickup-grid-view.vue'
          ),
      );
    case 'discuss_channel_main_pop_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-main-pop-view/discuss-channel-main-pop-view.vue'
          ),
      );
    case 'res_groups_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groups-pickup-view/res-groups-pickup-view.vue'
          ),
      );
    case 'ps_core_prd_info_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd/ps-core-prd-info-view/ps-core-prd-info-view.vue'
          ),
      );
    case 'ps_core_prd_func_installed_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-installed-grid-view/ps-core-prd-func-installed-grid-view.vue'
          ),
      );
    case 'mail_alias_domain_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-alias-domain/mail-alias-domain-pickup-grid-view/mail-alias-domain-pickup-grid-view.vue'
          ),
      );
    case 'ir_rule_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-rule/ir-rule-multi-data-view/ir-rule-multi-data-view.vue'
          ),
      );
    case 'mail_activity_plan_template_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan-template/mail-activity-plan-template-grid-view/mail-activity-plan-template-grid-view.vue'
          ),
      );
    case 'res_partner_pick_up_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-partner/res-partner-pick-up-list-view/res-partner-pick-up-list-view.vue'
          ),
      );
    case 'ir_config_parameter_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-config-parameter/ir-config-parameter-main-view/ir-config-parameter-main-view.vue'
          ),
      );
    case 'res_groups_users_rel_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-users-rel/res-groups-users-rel-edit-view/res-groups-users-rel-edit-view.vue'
          ),
      );
    case 'mail_template_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-template/mail-template-pickup-view/mail-template-pickup-view.vue'
          ),
      );
    case 'res_company_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-pickup-grid-view/res-company-pickup-grid-view.vue'
          ),
      );
    case 'mail_followers_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-followers/mail-followers-main-view/mail-followers-main-view.vue'
          ),
      );
    case 'mail_notification_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-notification/mail-notification-main-view/mail-notification-main-view.vue'
          ),
      );
    case 'mail_thread_component_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-thread/mail-thread-component-view/mail-thread-component-view.vue'
          ),
      );
    case 'mail_alias_domain_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-alias-domain/mail-alias-domain-multi-data-view/mail-alias-domain-multi-data-view.vue'
          ),
      );
    case 'res_config_settings_modify_setting':
      return defineAsyncComponent(
        () =>
          import(
            './res-config-settings/res-config-settings-modify-setting/res-config-settings-modify-setting.vue'
          ),
      );
    case 'ir_unires_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-unires/ir-unires-m-pickup-view/ir-unires-m-pickup-view.vue'
          ),
      );
    case 'discuss_channel_public_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-public-multi-data-view/discuss-channel-public-multi-data-view.vue'
          ),
      );
    case 'ir_actions_server_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-actions-server/ir-actions-server-main-view/ir-actions-server-main-view.vue'
          ),
      );
    case 'ir_model_access_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-model-access/ir-model-access-multi-data-view/ir-model-access-multi-data-view.vue'
          ),
      );
    case 'resource_calendar_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar/resource-calendar-pickup-view/resource-calendar-pickup-view.vue'
          ),
      );
    case 'hr_skill_edit_view':
      return defineAsyncComponent(
        () => import('./hr-skill/hr-skill-edit-view/hr-skill-edit-view.vue'),
      );
    case 'ps_core_prd_market_application_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd/ps-core-prd-market-application-view/ps-core-prd-market-application-view.vue'
          ),
      );
    case 'res_groups_multi_data_view_user':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groups-multi-data-view-user/res-groups-multi-data-view-user.vue'
          ),
      );
    case 'hr_employee_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-main-view/hr-employee-main-view.vue'
          ),
      );
    case 'hr_skill_type_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-skill-type/hr-skill-type-main-view/hr-skill-type-main-view.vue'
          ),
      );
    case 'mail_message_discuss_starred_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-discuss-starred-list-view/mail-message-discuss-starred-list-view.vue'
          ),
      );
    case 'ir_default_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-default/ir-default-multi-data-view/ir-default-multi-data-view.vue'
          ),
      );
    case 'res_country_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-country/res-country-pickup-view/res-country-pickup-view.vue'
          ),
      );
    case 'mail_followers_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-followers/mail-followers-multi-data-view/mail-followers-multi-data-view.vue'
          ),
      );
    case 'crm_lead_main_view':
      return defineAsyncComponent(
        () => import('./crm-lead/crm-lead-main-view/crm-lead-main-view.vue'),
      );
    case 'ir_unires_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-unires/ir-unires-multi-data-view/ir-unires-multi-data-view.vue'
          ),
      );
    case 'discuss_channel_member_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel-member/discuss-channel-member-grid-view/discuss-channel-member-grid-view.vue'
          ),
      );
    case 'mail_notification_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-notification/mail-notification-multi-data-view/mail-notification-multi-data-view.vue'
          ),
      );
    case 'crm_lead_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './crm-lead/crm-lead-multi-data-view/crm-lead-multi-data-view.vue'
          ),
      );
    case 'res_company_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-pickup-view/res-company-pickup-view.vue'
          ),
      );
    case 'ir_model_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-model/ir-model-multi-data-view/ir-model-multi-data-view.vue'
          ),
      );
    case 'hr_employee_category_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee-category/hr-employee-category-multi-data-view/hr-employee-category-multi-data-view.vue'
          ),
      );
    case 'hr_skill_grid_view':
      return defineAsyncComponent(
        () => import('./hr-skill/hr-skill-grid-view/hr-skill-grid-view.vue'),
      );
    case 'ir_module_category_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-category/ir-module-category-grid-view/ir-module-category-grid-view.vue'
          ),
      );
    case 'rule_group_rel_nested_group_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './rule-group-rel/rule-group-rel-nested-group-grid-view/rule-group-rel-nested-group-grid-view.vue'
          ),
      );
    case 'res_users_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-users/res-users-pickup-grid-view/res-users-pickup-grid-view.vue'
          ),
      );
    case 'ir_mail_server_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-mail-server/ir-mail-server-main-view/ir-mail-server-main-view.vue'
          ),
      );
    case 'setting_index_view':
      return defineAsyncComponent(
        () => import('./setting-index-view/setting-index-view.vue'),
      );
    case 'mail_activity_type_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-type/mail-activity-type-main-view/mail-activity-type-main-view.vue'
          ),
      );
    case 'ir_rule_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import('./ir-rule/ir-rule-m-pickup-view/ir-rule-m-pickup-view.vue'),
      );
    case 'unires_group_rel_nested_group_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './unires-group-rel/unires-group-rel-nested-group-grid-view/unires-group-rel-nested-group-grid-view.vue'
          ),
      );
    case 'hr_department_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-pickup-grid-view/hr-department-pickup-grid-view.vue'
          ),
      );
    case 'hr_work_location_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-multi-data-view/hr-work-location-multi-data-view.vue'
          ),
      );
    case 'ir_model_access_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-model-access/ir-model-access-edit-view/ir-model-access-edit-view.vue'
          ),
      );
    case 'hr_contract_type_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-contract-type/hr-contract-type-multi-data-view/hr-contract-type-multi-data-view.vue'
          ),
      );
    case 'hr_work_location_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-pickup-view/hr-work-location-pickup-view.vue'
          ),
      );
    case 'mail_activity_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity/mail-activity-edit-view/mail-activity-edit-view.vue'
          ),
      );
    case 'hr_leave_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-leave/hr-leave-pickup-grid-view/hr-leave-pickup-grid-view.vue'
          ),
      );
    case 'ir_module_category_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-category/ir-module-category-edit-view/ir-module-category-edit-view.vue'
          ),
      );
    case 'mail_activity_plan_multi_data_view2':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan/mail-activity-plan-multi-data-view-2/mail-activity-plan-multi-data-view-2.vue'
          ),
      );
    case 'mail_message_search_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-search-list-view/mail-message-search-list-view.vue'
          ),
      );
    case 'resource_calendar_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar/resource-calendar-main-view/resource-calendar-main-view.vue'
          ),
      );
    case 'mail_message_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-edit-view/mail-message-edit-view.vue'
          ),
      );
    case 'ir_model_access_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-model-access/ir-model-access-grid-view/ir-model-access-grid-view.vue'
          ),
      );
    case 'resource_calendar_attendance_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-attendance/resource-calendar-attendance-edit-view/resource-calendar-attendance-edit-view.vue'
          ),
      );
    case 'resource_calendar_attendance_grid_view_nested':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-attendance/resource-calendar-attendance-grid-view-nested/resource-calendar-attendance-grid-view-nested.vue'
          ),
      );
    case 'ir_module_module_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-module/ir-module-module-edit-view/ir-module-module-edit-view.vue'
          ),
      );
    case 'res_users_info_view':
      return defineAsyncComponent(
        () => import('./res-users/res-users-info-view/res-users-info-view.vue'),
      );
    case 'hr_index_view':
      return defineAsyncComponent(
        () => import('./hr-index-view/hr-index-view.vue'),
      );
    case 'hr_department_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-multi-data-view/hr-department-multi-data-view.vue'
          ),
      );
    case 'fetchmail_server_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './fetchmail-server/fetchmail-server-main-view/fetchmail-server-main-view.vue'
          ),
      );
    case 'res_users_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-users/res-users-multi-data-view/res-users-multi-data-view.vue'
          ),
      );
    case 'res_groups_users_rel_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-users-rel/res-groups-users-rel-grid-view/res-groups-users-rel-grid-view.vue'
          ),
      );
    case 'mail_template_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-template/mail-template-pickup-grid-view/mail-template-pickup-grid-view.vue'
          ),
      );
    case 'ir_cron_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-cron/ir-cron-multi-data-view/ir-cron-multi-data-view.vue'
          ),
      );
    case 'hr_department_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-main-view/hr-department-main-view.vue'
          ),
      );
    case 'rule_group_rel_nested_rule_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './rule-group-rel/rule-group-rel-nested-rule-grid-view/rule-group-rel-nested-rule-grid-view.vue'
          ),
      );
    case 'discuss_channel_quick_cfg_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-quick-cfg-view/discuss-channel-quick-cfg-view.vue'
          ),
      );
    case 'ir_module_category_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-category/ir-module-category-pickup-grid-view/ir-module-category-pickup-grid-view.vue'
          ),
      );
    case 'hr_skill_level_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-skill-level/hr-skill-level-grid-view/hr-skill-level-grid-view.vue'
          ),
      );
    case 'hr_resume_line_type_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-resume-line-type/hr-resume-line-type-edit-view/hr-resume-line-type-edit-view.vue'
          ),
      );
    case 'mail_message_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-multi-data-view/mail-message-multi-data-view.vue'
          ),
      );
    case 'ir_rule_pickup_view':
      return defineAsyncComponent(
        () => import('./ir-rule/ir-rule-pickup-view/ir-rule-pickup-view.vue'),
      );
    case 'rule_group_rel_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './rule-group-rel/rule-group-rel-edit-view/rule-group-rel-edit-view.vue'
          ),
      );
    case 'ir_cron_main_view':
      return defineAsyncComponent(
        () => import('./ir-cron/ir-cron-main-view/ir-cron-main-view.vue'),
      );
    case 'ir_default_main_view':
      return defineAsyncComponent(
        () =>
          import('./ir-default/ir-default-main-view/ir-default-main-view.vue'),
      );
    case 'res_users_main_view':
      return defineAsyncComponent(
        () => import('./res-users/res-users-main-view/res-users-main-view.vue'),
      );
    case 'discuss_channel_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-pickup-grid-view/discuss-channel-pickup-grid-view.vue'
          ),
      );
    case 'hr_job_main_view':
      return defineAsyncComponent(
        () => import('./hr-job/hr-job-main-view/hr-job-main-view.vue'),
      );
    case 'discuss_channel_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel/discuss-channel-pickup-view/discuss-channel-pickup-view.vue'
          ),
      );
    case 'res_groups_implied_rel_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-implied-rel/res-groups-implied-rel-grid-view/res-groups-implied-rel-grid-view.vue'
          ),
      );
    case 'discuss_channel_member_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './discuss-channel-member/discuss-channel-member-edit-view/discuss-channel-member-edit-view.vue'
          ),
      );
    case 'mail_message_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-main-view/mail-message-main-view.vue'
          ),
      );
    case 'hr_job_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job/hr-job-pickup-grid-view/hr-job-pickup-grid-view.vue'
          ),
      );
    case 'fetchmail_server_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './fetchmail-server/fetchmail-server-multi-data-view/fetchmail-server-multi-data-view.vue'
          ),
      );
    case 'res_partner_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-partner/res-partner-pickup-grid-view/res-partner-pickup-grid-view.vue'
          ),
      );
    case 'hr_departure_reason_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-departure-reason/hr-departure-reason-multi-data-view/hr-departure-reason-multi-data-view.vue'
          ),
      );
    case 'mail_alias_domain_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-alias-domain/mail-alias-domain-main-view/mail-alias-domain-main-view.vue'
          ),
      );
    case 'ir_module_module_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-module/ir-module-module-grid-view/ir-module-module-grid-view.vue'
          ),
      );
    case 'res_groups_implied_rel_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-implied-rel/res-groups-implied-rel-edit-view/res-groups-implied-rel-edit-view.vue'
          ),
      );
    case 'mail_mail_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-mail/mail-mail-multi-data-view/mail-mail-multi-data-view.vue'
          ),
      );
    case 'hr_job_multi_data_view':
      return defineAsyncComponent(
        () =>
          import('./hr-job/hr-job-multi-data-view/hr-job-multi-data-view.vue'),
      );
    case 'res_users_pickup_view':
      return defineAsyncComponent(
        () =>
          import('./res-users/res-users-pickup-view/res-users-pickup-view.vue'),
      );
    case 'res_groups_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groups-pickup-grid-view/res-groups-pickup-grid-view.vue'
          ),
      );
    case 'ir_unires_main_view':
      return defineAsyncComponent(
        () => import('./ir-unires/ir-unires-main-view/ir-unires-main-view.vue'),
      );
    case 'mail_activity_plan_template_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan-template/mail-activity-plan-template-quick-create-view/mail-activity-plan-template-quick-create-view.vue'
          ),
      );
    case 'ir_cron_trigger_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-cron-trigger/ir-cron-trigger-main-view/ir-cron-trigger-main-view.vue'
          ),
      );
    case 'hr_work_location_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-pickup-grid-view/hr-work-location-pickup-grid-view.vue'
          ),
      );
    case 'res_partner_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-partner/res-partner-main-view/res-partner-main-view.vue'
          ),
      );
    case 'ps_core_prd_func_tree_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-tree-exp-view/ps-core-prd-func-tree-exp-view.vue'
          ),
      );
    case 'ir_rule_main_view':
      return defineAsyncComponent(
        () => import('./ir-rule/ir-rule-main-view/ir-rule-main-view.vue'),
      );
    case 'ir_cron_trigger_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-cron-trigger/ir-cron-trigger-multi-data-view/ir-cron-trigger-multi-data-view.vue'
          ),
      );
    case 'mail_message_discuss_inbox_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-discuss-inbox-list-view/mail-message-discuss-inbox-list-view.vue'
          ),
      );
    case 'res_groups_users_rel_user_group_mgr_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-users-rel/res-groups-users-rel-user-group-mgr-view/res-groups-users-rel-user-group-mgr-view.vue'
          ),
      );
    case 'ir_model_edit_view':
      return defineAsyncComponent(
        () => import('./ir-model/ir-model-edit-view/ir-model-edit-view.vue'),
      );
    case 'resource_calendar_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar/resource-calendar-pickup-grid-view/resource-calendar-pickup-grid-view.vue'
          ),
      );
    case 'mail_message_discuss_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-discuss-main-view/mail-message-discuss-main-view.vue'
          ),
      );
    case 'hr_skill_type_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-skill-type/hr-skill-type-multi-data-view/hr-skill-type-multi-data-view.vue'
          ),
      );
    case 'hr_department_department_hierarchy_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-department-hierarchy-view/hr-department-department-hierarchy-view.vue'
          ),
      );
    case 'ir_module_category_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-category/ir-module-category-pickup-view/ir-module-category-pickup-view.vue'
          ),
      );
    case 'mail_message_pinned_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-pinned-list-view/mail-message-pinned-list-view.vue'
          ),
      );
    case 'resource_resource_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-resource/resource-resource-pickup-view/resource-resource-pickup-view.vue'
          ),
      );
    case 'res_partner_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-partner/res-partner-multi-data-view/res-partner-multi-data-view.vue'
          ),
      );
    case 'discuss_index_view':
      return defineAsyncComponent(
        () => import('./discuss-index-view/discuss-index-view.vue'),
      );
    case 'res_users_edit_view':
      return defineAsyncComponent(
        () => import('./res-users/res-users-edit-view/res-users-edit-view.vue'),
      );
    case 'unires_group_rel_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './unires-group-rel/unires-group-rel-edit-view/unires-group-rel-edit-view.vue'
          ),
      );
    case 'mail_activity_type_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-type/mail-activity-type-pickup-view/mail-activity-type-pickup-view.vue'
          ),
      );
    case 'mail_message_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-redirect-view/mail-message-redirect-view.vue'
          ),
      );
    case 'resource_calendar_leaves_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-leaves/resource-calendar-leaves-main-view/resource-calendar-leaves-main-view.vue'
          ),
      );
    case 'mail_message_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-message/mail-message-pickup-view/mail-message-pickup-view.vue'
          ),
      );
    case 'hr_leave_pickup_view':
      return defineAsyncComponent(
        () =>
          import('./hr-leave/hr-leave-pickup-view/hr-leave-pickup-view.vue'),
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}
