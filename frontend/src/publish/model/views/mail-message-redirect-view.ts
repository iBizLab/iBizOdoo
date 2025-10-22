export default {
  getDataAppDEActionId: 'get',
  redirectAppViewRefs: [
    {
      realTitle: '消息编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.MAIL_MESSAGE.EDITVIEW',
      },
      refAppViewId: 'ibizodooapp.mail_message_edit_view',
      name: 'MAIL_MESSAGE:EDITVIEW',
      id: 'mail_message:editview',
    },
    {
      realTitle: '消息编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.MAIL_MESSAGE.EDITVIEW',
      },
      refAppViewId: 'ibizodooapp.mail_message_edit_view',
      name: 'EDITVIEW',
      id: 'editview',
    },
  ],
  typeAppDEFieldId: 'model',
  enableCustomGetDataAction: true,
  enableWorkflow: true,
  funcViewMode: 'REDIRECTVIEW',
  deviewCodeName: 'RedirectView',
  deviewId: '63162782a292bb807ec4467b2dd2b17d',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'DE.LNAME.MAIL_MESSAGE',
  },
  caption: '消息',
  codeName: 'mail_message_redirect_view',
  appDataEntityId: 'ibizodooapp.mail_message',
  appViewRefs: [
    {
      navigateContexts: [
        {
          key: 'CRM_LEAD',
          value: 'res_id',
          name: 'CRM_LEAD',
          id: 'crm_lead',
        },
      ],
      realTitle: '线索/商机编辑视图',
      refAppViewId: 'ibizodooapp.crm_lead_main_view',
      name: 'CRM_LEAD',
      id: 'crm_lead',
    },
    {
      navigateContexts: [
        {
          key: 'RES_PARTNER',
          value: 'res_id',
          name: 'RES_PARTNER',
          id: 'res_partner',
        },
      ],
      realTitle: '联系人',
      refAppViewId: 'ibizodooapp.res_partner_main_view',
      name: 'RES_PARTNER',
      id: 'res_partner',
    },
    {
      navigateContexts: [
        {
          key: 'RES_COMPANY',
          value: 'res_id',
          name: 'RES_COMPANY',
          id: 'res_company',
        },
      ],
      realTitle: '公司',
      refAppViewId: 'ibizodooapp.res_company_main_view',
      name: 'RES_COMPANY',
      id: 'res_company',
    },
    {
      navigateContexts: [
        {
          key: 'HR_DEPARTMENT',
          value: 'res_id',
          name: 'HR_DEPARTMENT',
          id: 'hr_department',
        },
      ],
      realTitle: '部门',
      refAppViewId: 'ibizodooapp.hr_department_main_view',
      name: 'HR_DEPARTMENT',
      id: 'hr_department',
    },
    {
      navigateContexts: [
        {
          key: 'HR_EMPLOYEE',
          value: 'res_id',
          name: 'HR_EMPLOYEE',
          id: 'hr_employee',
        },
      ],
      realOpenMode: 'INDEXVIEWTAB',
      realTitle: '员工编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.HR_EMPLOYEE.MAIN_VIEW',
      },
      refAppViewId: 'ibizodooapp.hr_employee_main_view',
      name: 'HR_EMPLOYEE',
      id: 'hr_employee',
    },
  ],
  controls: [
    {
      capLanguageRes: {
        lanResTag: 'DE.LNAME.MAIL_MESSAGE',
      },
      caption: '消息',
      codeName: 'redirect_view_captionbar',
      controlType: 'CAPTIONBAR',
      appDataEntityId: 'ibizodooapp.mail_message',
      controlParam: {},
      name: 'captionbar',
      id: 'redirect_view_captionbar',
    },
  ],
  viewLayoutPanel: {
    layoutBodyOnly: true,
    useDefaultLayout: true,
    layoutPanel: true,
    codeName: 'layoutpanel',
    controlStyle: 'APPDEREDIRECTVIEW',
    controlType: 'VIEWLAYOUTPANEL',
    appDataEntityId: 'ibizodooapp.mail_message',
    controlParam: {},
    id: 'layoutpanel',
  },
  title: '消息数据重定向视图',
  titleLanguageRes: {
    lanResTag: 'PAGE.TITLE.MAIL_MESSAGE.REDIRECTVIEW',
  },
  viewStyle: 'DEFAULT',
  viewType: 'DEREDIRECTVIEW',
  enableDP: true,
  redirectView: true,
  showCaptionBar: true,
  modelId: 'fdc033234206b755420b6f9a96eed5c0',
  modelType: 'PSAPPDEVIEW',
  name: 'mail_messageRedirectView',
  id: 'ibizodooapp.mail_message_redirect_view',
};
