import { CodeListService } from '@ibiz-template/runtime';
import {
  IAppCodeList,
  IAppDataEntity,
  IApplication,
  IAppView,
} from '@ibiz/model-core';

export async function registerCodeList(
  codeListService: CodeListService,
): Promise<void> {
  const setCodeList = (model: IData) => {
    codeListService.setCodeList(model as IAppCodeList);
  };
  setCodeList(await import('./code-list/sys-operator').then(m => m.default));
  setCodeList(await import('./code-list/yes-no').then(m => m.default));
  setCodeList(
    await import('./code-list/base-attendance-show').then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/base-ir-actions-server-activity-date-deadline-range-type'
    ).then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-ir-actions-server-activity-user-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-ir-actions-server-mail-post-method').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-ir-actions-server-sms-method').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-ir-actions-server-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-ir-actions-server-usage').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-ir-cron-interval-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-ir-mail-server-smtp-authentication').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-ir-mail-server-smtp-encryption').then(
      m => m.default,
    ),
  );
  setCodeList(await import('./code-list/base-ir-model').then(m => m.default));
  setCodeList(
    await import('./code-list/base-ir-model-state').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-ir-module-module-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-module-categroy').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-module-hr-presence').then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/base-res-config-settings-auth-signup-uninvited'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/base-res-config-settings-default-invoice-policy'
    ).then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-res-config-settings-lead-enrich-auto').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import(
      './code-list/base-res-config-settings-product-volume-volume-in-cubic-feet'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/base-res-config-settings-product-weight-in-lbs'
    ).then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-res-country').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-res-partner').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-res-partner-company-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-partner-tz').then(m => m.default),
  );
  setCodeList(await import('./code-list/base-res-users').then(m => m.default));
  setCodeList(
    await import('./code-list/base-res-users-calendar-default-privacy').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-users-notification-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-users-odoobot-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-users-state').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-extend-ir-unires').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-crm-lead-priority').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-crm-lead-type').then(m => m.default),
  );
  setCodeList(await import('./code-list/crm-crm-stage').then(m => m.default));
  setCodeList(
    await import('./code-list/discuss-discuss-channel-channel-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/extension-product-func-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/extension-pscoreprdfunc-category').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/extension-pscoreprdfunc-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-department-hierarchy').then(m => m.default),
  );
  setCodeList(await import('./code-list/hr-hr-employee').then(m => m.default));
  setCodeList(
    await import('./code-list/hr-hr-employee-certificate').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-distance-home-work-unit').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-employee-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-gender').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-hr-presence-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-work-location-location-type').then(
      m => m.default,
    ),
  );
  setCodeList(await import('./code-list/hr-org-chart').then(m => m.default));
  setCodeList(
    await import('./code-list/mail-activity-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-attention-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-fetchmail-server-server-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-fetchmail-server-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import(
      './code-list/mail-mail-activity-plan-template-delay-from'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/mail-mail-activity-plan-template-delay-unit'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/mail-mail-activity-plan-template-responsible-type'
    ).then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-plan-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-state').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-type-category').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-type-chaining-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-type-decoration-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-type-delay-from').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-type-delay-unit').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-alias-alias-contact').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-alias-alias-status').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-mail-state').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-mail-message-message-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-notification-failure-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-notification-notification-status').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-notification-notification-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import(
      './code-list/resource-resource-calendar-attendance-day-period'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/resource-resource-calendar-attendance-dayofweek'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/resource-resource-calendar-attendance-week-type'
    ).then(m => m.default),
  );
  setCodeList(
    await import('./code-list/resource-resource-resource-resource-type').then(
      m => m.default,
    ),
  );
}

export async function getAppDataEntityModel(
  name: string,
): Promise<IAppDataEntity> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'ibizodooapp.hr_skill_level':
    case 'hr_skill_level':
      return import('./entities/hr-skill-level').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.crm_stage':
    case 'crm_stage':
      return import('./entities/crm-stage').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_mail':
    case 'mail_mail':
      return import('./entities/mail-mail').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_thread':
    case 'mail_thread':
      return import('./entities/mail-thread').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_alias':
    case 'mail_alias':
      return import('./entities/mail-alias').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_rule':
    case 'ir_rule':
      return import('./entities/ir-rule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_config_settings':
    case 'res_config_settings':
      return import('./entities/res-config-settings').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.resource_resource':
    case 'resource_resource':
      return import('./entities/resource-resource').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.pscoreprdcat':
    case 'pscoreprdcat':
      return import('./entities/ps-core-prd-cat').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_users':
    case 'res_users':
      return import('./entities/res-users').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_cron':
    case 'ir_cron':
      return import('./entities/ir-cron').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_groups':
    case 'res_groups':
      return import('./entities/res-groups').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_model_access':
    case 'ir_model_access':
      return import('./entities/ir-model-access').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_module_category':
    case 'ir_module_category':
      return import('./entities/ir-module-category').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_actions_server':
    case 'ir_actions_server':
      return import('./entities/ir-actions-server').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_department':
    case 'hr_department':
      return import('./entities/hr-department').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_mail_server':
    case 'ir_mail_server':
      return import('./entities/ir-mail-server').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_partner':
    case 'res_partner':
      return import('./entities/res-partner').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.resource_calendar_leaves':
    case 'resource_calendar_leaves':
      return import('./entities/resource-calendar-leaves').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_resume_line_type':
    case 'hr_resume_line_type':
      return import('./entities/hr-resume-line-type').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_skill':
    case 'hr_skill':
      return import('./entities/hr-skill').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_alias_domain':
    case 'mail_alias_domain':
      return import('./entities/mail-alias-domain').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_tracking_value':
    case 'mail_tracking_value':
      return import('./entities/mail-tracking-value').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_notification':
    case 'mail_notification':
      return import('./entities/mail-notification').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_message':
    case 'mail_message':
      return import('./entities/mail-message').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_leave':
    case 'hr_leave':
      return import('./entities/hr-leave').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_contract_type':
    case 'hr_contract_type':
      return import('./entities/hr-contract-type').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_skill_type':
    case 'hr_skill_type':
      return import('./entities/hr-skill-type').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_groups_users_rel':
    case 'res_groups_users_rel':
      return import('./entities/res-groups-users-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_departure_reason':
    case 'hr_departure_reason':
      return import('./entities/hr-departure-reason').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_activity_type':
    case 'mail_activity_type':
      return import('./entities/mail-activity-type').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_cron_trigger':
    case 'ir_cron_trigger':
      return import('./entities/ir-cron-trigger').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_employee':
    case 'hr_employee':
      return import('./entities/hr-employee').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_job':
    case 'hr_job':
      return import('./entities/hr-job').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.resource_calendar':
    case 'resource_calendar':
      return import('./entities/resource-calendar').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.pscoreprd':
    case 'pscoreprd':
      return import('./entities/ps-core-prd').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.resource_calendar_attendance':
    case 'resource_calendar_attendance':
      return import('./entities/resource-calendar-attendance').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_activity':
    case 'mail_activity':
      return import('./entities/mail-activity').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_unires':
    case 'ir_unires':
      return import('./entities/ir-unires').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.pscoreprdfunc':
    case 'pscoreprdfunc':
      return import('./entities/ps-core-prd-func').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.unires_group_rel':
    case 'unires_group_rel':
      return import('./entities/unires-group-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.discuss_channel':
    case 'discuss_channel':
      return import('./entities/discuss-channel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_currency':
    case 'res_currency':
      return import('./entities/res-currency').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_employee_category':
    case 'hr_employee_category':
      return import('./entities/hr-employee-category').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_activity_plan':
    case 'mail_activity_plan':
      return import('./entities/mail-activity-plan').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_groups_implied_rel':
    case 'res_groups_implied_rel':
      return import('./entities/res-groups-implied-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.discuss_channel_member':
    case 'discuss_channel_member':
      return import('./entities/discuss-channel-member').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_config_parameter':
    case 'ir_config_parameter':
      return import('./entities/ir-config-parameter').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_model':
    case 'ir_model':
      return import('./entities/ir-model').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_template':
    case 'mail_template':
      return import('./entities/mail-template').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.fetchmail_server':
    case 'fetchmail_server':
      return import('./entities/fetchmail-server').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_country':
    case 'res_country':
      return import('./entities/res-country').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.crm_lead':
    case 'crm_lead':
      return import('./entities/crm-lead').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_default':
    case 'ir_default':
      return import('./entities/ir-default').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.res_company':
    case 'res_company':
      return import('./entities/res-company').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_activity_mixin':
    case 'mail_activity_mixin':
      return import('./entities/mail-activity-mixin').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_activity_plan_template':
    case 'mail_activity_plan_template':
      return import('./entities/mail-activity-plan-template').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_attachment':
    case 'ir_attachment':
      return import('./entities/ir-attachment').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hub_app':
    case 'hub_app':
      return import('./entities/hub-app').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_followers':
    case 'mail_followers':
      return import('./entities/mail-followers').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.ir_module_module':
    case 'ir_module_module':
      return import('./entities/ir-module-module').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.mail_activity_schedule':
    case 'mail_activity_schedule':
      return import('./entities/mail-activity-schedule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.rule_group_rel':
    case 'rule_group_rel':
      return import('./entities/rule-group-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ibizodooapp.hr_work_location':
    case 'hr_work_location':
      return import('./entities/hr-work-location').then(
        m => m.default as unknown as IAppDataEntity,
      );
    default:
      throw new Error(`无法找到实体模型：${name}`);
  }
}
export async function getAppViewModel(name: string): Promise<IAppView> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'resource_resource_multi_data_view':
      return import('./views/resource-resource-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_category_edit_view':
      return import('./views/hr-employee-category-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_users_m_pickup_view':
      return import('./views/res-users-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_leaves_multi_data_view':
      return import('./views/resource-calendar-leaves-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_config_parameter_multi_data_view':
      return import('./views/ir-config-parameter-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_pickup_view':
      return import('./views/hr-department-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_sub_channel_grid_view':
      return import('./views/discuss-channel-sub-channel-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_leaves_multi_data_view1':
      return import('./views/resource-calendar-leaves-multi-data-view-1').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_unires_pickup_grid_view':
      return import('./views/ir-unires-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_edit_view':
      return import('./views/res-company-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_multi_data_view':
      return import('./views/res-company-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partner_pickup_view':
      return import('./views/res-partner-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_type_pickup_grid_view':
      return import('./views/mail-activity-type-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_mail_server_multi_data_view':
      return import('./views/ir-mail-server-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_main_view':
      return import('./views/res-groups-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_info_view':
      return import('./views/ps-core-prd-func-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_multi_data_view':
      return import('./views/mail-activity-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_main_view':
      return import('./views/mail-activity-plan-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_template_main_view':
      return import('./views/mail-template-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_org_chart_view':
      return import('./views/hr-employee-org-chart-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_main_view':
      return import('./views/res-company-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_resume_line_type_multi_data_view':
      return import('./views/hr-resume-line-type-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_resource_pickup_grid_view':
      return import('./views/resource-resource-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_alias_domain_pickup_view':
      return import('./views/mail-alias-domain-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'crm_index_view':
      return import('./views/crm-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_type_multi_data_view':
      return import('./views/mail-activity-type-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_multi_data_view':
      return import('./views/resource-calendar-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_main_view':
      return import('./views/mail-activity-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_discuss_history_list_view':
      return import('./views/mail-message-discuss-history-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_country_pickup_grid_view':
      return import('./views/res-country-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_multi_data_view':
      return import('./views/res-groups-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rule_pickup_grid_view':
      return import('./views/ir-rule-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_template_multi_data_view':
      return import('./views/mail-template-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_contract_type_edit_view':
      return import('./views/hr-contract-type-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_invite_member_view':
      return import('./views/discuss-channel-invite-member-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'partner_index_view':
      return import('./views/partner-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_pickup_view':
      return import('./views/hr-job-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_mail_main_view':
      return import('./views/mail-mail-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_cron_pickup_grid_view':
      return import('./views/ir-cron-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_redirect_view':
      return import('./views/mail-activity-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_actions_server_multi_data_view':
      return import('./views/ir-actions-server-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_cron_pickup_view':
      return import('./views/ir-cron-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_pickup_grid_view':
      return import('./views/mail-message-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_resource_main_view':
      return import('./views/resource-resource-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_market_application_view':
      return import('./views/ps-core-prd-func-market-application-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_main_view':
      return import('./views/discuss-channel-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_location_main_view':
      return import('./views/hr-work-location-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_skill_level_edit_view':
      return import('./views/hr-skill-level-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_alias_main_view':
      return import('./views/mail-alias-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_main_view2':
      return import('./views/mail-activity-plan-main-view-2').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_multi_data_view':
      return import('./views/mail-activity-plan-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_multi_data_view':
      return import('./views/hr-employee-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_currency_pickup_view':
      return import('./views/res-currency-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_m_pickup_view':
      return import('./views/res-groups-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_alias_multi_data_view':
      return import('./views/mail-alias-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_currency_pickup_grid_view':
      return import('./views/res-currency-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_main_pop_view':
      return import('./views/discuss-channel-main-pop-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_pickup_view':
      return import('./views/res-groups-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_info_view':
      return import('./views/ps-core-prd-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_installed_grid_view':
      return import('./views/ps-core-prd-func-installed-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_alias_domain_pickup_grid_view':
      return import('./views/mail-alias-domain-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rule_multi_data_view':
      return import('./views/ir-rule-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_template_grid_view':
      return import('./views/mail-activity-plan-template-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partner_pick_up_list_view':
      return import('./views/res-partner-pick-up-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_config_parameter_main_view':
      return import('./views/ir-config-parameter-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_users_rel_edit_view':
      return import('./views/res-groups-users-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_template_pickup_view':
      return import('./views/mail-template-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_pickup_grid_view':
      return import('./views/res-company-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_followers_main_view':
      return import('./views/mail-followers-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_notification_main_view':
      return import('./views/mail-notification-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_thread_component_view':
      return import('./views/mail-thread-component-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_alias_domain_multi_data_view':
      return import('./views/mail-alias-domain-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_config_settings_modify_setting':
      return import('./views/res-config-settings-modify-setting').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_unires_m_pickup_view':
      return import('./views/ir-unires-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_public_multi_data_view':
      return import('./views/discuss-channel-public-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_actions_server_main_view':
      return import('./views/ir-actions-server-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_access_multi_data_view':
      return import('./views/ir-model-access-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_pickup_view':
      return import('./views/resource-calendar-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_skill_edit_view':
      return import('./views/hr-skill-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_market_application_view':
      return import('./views/ps-core-prd-market-application-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_multi_data_view_user':
      return import('./views/res-groups-multi-data-view-user').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_main_view':
      return import('./views/hr-employee-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_skill_type_main_view':
      return import('./views/hr-skill-type-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_discuss_starred_list_view':
      return import('./views/mail-message-discuss-starred-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_default_multi_data_view':
      return import('./views/ir-default-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_country_pickup_view':
      return import('./views/res-country-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_followers_multi_data_view':
      return import('./views/mail-followers-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'crm_lead_main_view':
      return import('./views/crm-lead-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_unires_multi_data_view':
      return import('./views/ir-unires-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_member_grid_view':
      return import('./views/discuss-channel-member-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_notification_multi_data_view':
      return import('./views/mail-notification-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'crm_lead_multi_data_view':
      return import('./views/crm-lead-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_pickup_view':
      return import('./views/res-company-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_multi_data_view':
      return import('./views/ir-model-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_category_multi_data_view':
      return import('./views/hr-employee-category-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_skill_grid_view':
      return import('./views/hr-skill-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_category_grid_view':
      return import('./views/ir-module-category-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'rule_group_rel_nested_group_grid_view':
      return import('./views/rule-group-rel-nested-group-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_users_pickup_grid_view':
      return import('./views/res-users-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_mail_server_main_view':
      return import('./views/ir-mail-server-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'setting_index_view':
      return import('./views/setting-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_type_main_view':
      return import('./views/mail-activity-type-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rule_m_pickup_view':
      return import('./views/ir-rule-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'unires_group_rel_nested_group_grid_view':
      return import('./views/unires-group-rel-nested-group-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_pickup_grid_view':
      return import('./views/hr-department-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_location_multi_data_view':
      return import('./views/hr-work-location-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_access_edit_view':
      return import('./views/ir-model-access-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_contract_type_multi_data_view':
      return import('./views/hr-contract-type-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_location_pickup_view':
      return import('./views/hr-work-location-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_edit_view':
      return import('./views/mail-activity-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_leave_pickup_grid_view':
      return import('./views/hr-leave-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_category_edit_view':
      return import('./views/ir-module-category-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_multi_data_view2':
      return import('./views/mail-activity-plan-multi-data-view-2').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_search_list_view':
      return import('./views/mail-message-search-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_main_view':
      return import('./views/resource-calendar-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_edit_view':
      return import('./views/mail-message-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_access_grid_view':
      return import('./views/ir-model-access-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_attendance_edit_view':
      return import('./views/resource-calendar-attendance-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_attendance_grid_view_nested':
      return import(
        './views/resource-calendar-attendance-grid-view-nested'
      ).then(m => m.default as unknown as IAppView);
    case 'ir_module_module_edit_view':
      return import('./views/ir-module-module-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_users_info_view':
      return import('./views/res-users-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_index_view':
      return import('./views/hr-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_multi_data_view':
      return import('./views/hr-department-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'fetchmail_server_main_view':
      return import('./views/fetchmail-server-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_users_multi_data_view':
      return import('./views/res-users-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_users_rel_grid_view':
      return import('./views/res-groups-users-rel-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_template_pickup_grid_view':
      return import('./views/mail-template-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_cron_multi_data_view':
      return import('./views/ir-cron-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_main_view':
      return import('./views/hr-department-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'rule_group_rel_nested_rule_grid_view':
      return import('./views/rule-group-rel-nested-rule-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_quick_cfg_view':
      return import('./views/discuss-channel-quick-cfg-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_category_pickup_grid_view':
      return import('./views/ir-module-category-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_skill_level_grid_view':
      return import('./views/hr-skill-level-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_resume_line_type_edit_view':
      return import('./views/hr-resume-line-type-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_multi_data_view':
      return import('./views/mail-message-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rule_pickup_view':
      return import('./views/ir-rule-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'rule_group_rel_edit_view':
      return import('./views/rule-group-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_cron_main_view':
      return import('./views/ir-cron-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_default_main_view':
      return import('./views/ir-default-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_users_main_view':
      return import('./views/res-users-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_pickup_grid_view':
      return import('./views/discuss-channel-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_main_view':
      return import('./views/hr-job-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_pickup_view':
      return import('./views/discuss-channel-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_implied_rel_grid_view':
      return import('./views/res-groups-implied-rel-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_channel_member_edit_view':
      return import('./views/discuss-channel-member-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_main_view':
      return import('./views/mail-message-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_pickup_grid_view':
      return import('./views/hr-job-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'fetchmail_server_multi_data_view':
      return import('./views/fetchmail-server-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partner_pickup_grid_view':
      return import('./views/res-partner-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_departure_reason_multi_data_view':
      return import('./views/hr-departure-reason-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_alias_domain_main_view':
      return import('./views/mail-alias-domain-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_module_grid_view':
      return import('./views/ir-module-module-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_implied_rel_edit_view':
      return import('./views/res-groups-implied-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_mail_multi_data_view':
      return import('./views/mail-mail-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_multi_data_view':
      return import('./views/hr-job-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_users_pickup_view':
      return import('./views/res-users-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_pickup_grid_view':
      return import('./views/res-groups-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_unires_main_view':
      return import('./views/ir-unires-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_template_quick_create_view':
      return import(
        './views/mail-activity-plan-template-quick-create-view'
      ).then(m => m.default as unknown as IAppView);
    case 'ir_cron_trigger_main_view':
      return import('./views/ir-cron-trigger-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_location_pickup_grid_view':
      return import('./views/hr-work-location-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partner_main_view':
      return import('./views/res-partner-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_tree_exp_view':
      return import('./views/ps-core-prd-func-tree-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rule_main_view':
      return import('./views/ir-rule-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_cron_trigger_multi_data_view':
      return import('./views/ir-cron-trigger-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_discuss_inbox_list_view':
      return import('./views/mail-message-discuss-inbox-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_users_rel_user_group_mgr_view':
      return import('./views/res-groups-users-rel-user-group-mgr-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_edit_view':
      return import('./views/ir-model-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_pickup_grid_view':
      return import('./views/resource-calendar-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_discuss_main_view':
      return import('./views/mail-message-discuss-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_skill_type_multi_data_view':
      return import('./views/hr-skill-type-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_department_hierarchy_view':
      return import('./views/hr-department-department-hierarchy-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_category_pickup_view':
      return import('./views/ir-module-category-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_pinned_list_view':
      return import('./views/mail-message-pinned-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_resource_pickup_view':
      return import('./views/resource-resource-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partner_multi_data_view':
      return import('./views/res-partner-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'discuss_index_view':
      return import('./views/discuss-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_users_edit_view':
      return import('./views/res-users-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'unires_group_rel_edit_view':
      return import('./views/unires-group-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_type_pickup_view':
      return import('./views/mail-activity-type-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_redirect_view':
      return import('./views/mail-message-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_leaves_main_view':
      return import('./views/resource-calendar-leaves-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_message_pickup_view':
      return import('./views/mail-message-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_leave_pickup_view':
      return import('./views/hr-leave-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}

export async function getAppModel(): Promise<IApplication> {
  ibiz.hub.defaultAppIndexViewName = 'hr_index_view';
  return import('./app/app').then(m => {
    const app = m.default as IData;
    // 设置应用原始模型到hub中
    ibiz.hub.setAppSourceModel(app.appId, app);
    app.appUtils?.forEach((util: IData) => {
      util.appId = app.appId;
    });
    // app.appId = undefined;
    return app as IApplication;
  });
}
