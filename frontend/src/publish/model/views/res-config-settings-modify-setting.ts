export default {
  enableDirtyChecking: true,
  showDataInfoBar: true,
  xdataControlName: 'form',
  loadDefault: true,
  deviewCodeName: 'modify_setting',
  deviewId: 'ffde25fbd56b2afba232db0d32e586fb',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'DE.LNAME.RES_CONFIG_SETTINGS',
  },
  caption: '配置设定',
  codeName: 'res_config_settings_modify_setting',
  appDataEntityId: 'ibizodooapp.res_config_settings',
  appViewNavContexts: [
    {
      rawValue: true,
      key: 'RES_CONFIG_SETTINGS',
      value: '__DEFAULT__',
      name: 'RES_CONFIG_SETTINGS',
      id: 'res_config_settings',
    },
  ],
  viewLayoutPanel: {
    layoutBodyOnly: true,
    viewProxyMode: true,
    layoutMode: 'FLEX',
    layout: {
      layout: 'FLEX',
    },
    rootPanelItems: [
      {
        actionGroupExtractMode: 'ITEM',
        panelItems: [
          {
            actionGroupExtractMode: 'ITEM',
            panelItems: [
              {
                actionGroupExtractMode: 'ITEM',
                panelItems: [
                  {
                    caption: '页面标题',
                    itemStyle: 'DEFAULT',
                    itemType: 'CTRLPOS',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                    },
                    showCaption: true,
                    id: 'captionbar',
                  },
                ],
                layout: {
                  align: 'center',
                  layout: 'FLEX',
                },
                dataRegionType: 'INHERIT',
                caption: '容器',
                itemStyle: 'DEFAULT',
                itemType: 'CONTAINER',
                layoutPos: {
                  shrink: 1,
                  heightMode: 'FULL',
                  layout: 'FLEX',
                },
                id: 'view_captionbar',
              },
            ],
            layout: {
              layout: 'FLEX',
            },
            dataRegionType: 'INHERIT',
            caption: '容器',
            itemStyle: 'DEFAULT',
            itemType: 'CONTAINER',
            layoutPos: {
              shrink: 1,
              heightMode: 'FULL',
              layout: 'FLEX',
            },
            id: 'view_header_left',
          },
          {
            actionGroupExtractMode: 'ITEM',
            panelItems: [
              {
                actionGroupExtractMode: 'ITEM',
                panelItems: [
                  {
                    caption: '工具栏',
                    itemStyle: 'DEFAULT',
                    itemType: 'CTRLPOS',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                    },
                    showCaption: true,
                    id: 'toolbar',
                  },
                ],
                layout: {
                  align: 'center',
                  layout: 'FLEX',
                },
                dataRegionType: 'INHERIT',
                caption: '容器',
                itemStyle: 'DEFAULT',
                itemType: 'CONTAINER',
                layoutPos: {
                  shrink: 1,
                  heightMode: 'FULL',
                  layout: 'FLEX',
                },
                id: 'view_toolbar',
              },
            ],
            layout: {
              layout: 'FLEX',
            },
            dataRegionType: 'INHERIT',
            caption: '容器',
            itemStyle: 'DEFAULT',
            itemType: 'CONTAINER',
            layoutPos: {
              shrink: 1,
              heightMode: 'FULL',
              layout: 'FLEX',
            },
            id: 'view_header_right',
          },
        ],
        predefinedType: 'VIEWHEADER',
        layout: {
          align: 'space-between',
          dir: 'row',
          layout: 'FLEX',
          valign: 'center',
        },
        dataRegionType: 'INHERIT',
        caption: '容器',
        itemStyle: 'DEFAULT',
        itemType: 'CONTAINER',
        layoutPos: {
          shrink: 0,
          layout: 'FLEX',
        },
        id: 'view_header',
      },
      {
        actionGroupExtractMode: 'ITEM',
        panelItems: [
          {
            caption: '表单',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              grow: 1,
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'form',
          },
        ],
        predefinedType: 'VIEWCONTENT',
        layout: {
          layout: 'FLEX',
        },
        dataRegionType: 'INHERIT',
        caption: '容器',
        itemStyle: 'DEFAULT',
        itemType: 'CONTAINER',
        layoutPos: {
          grow: 1,
          shrink: 1,
          layout: 'FLEX',
        },
        id: 'view_content',
      },
    ],
    layoutPanel: true,
    appViewEngines: [
      {
        engineCat: 'VIEW',
        engineType: 'EditView',
        id: 'engine',
      },
    ],
    controls: [
      {
        detoolbarItems: [
          {
            actionLevel: 100,
            noPrivDisplayMode: 2,
            uiactionId: 'editview_saveaction',
            valid: true,
            capLanguageRes: {
              lanResTag: 'TBB.TEXT.*.SAVE',
            },
            caption: '保存',
            itemType: 'DEUIACTION',
            sysImage: {
              cssClass: 'fa fa-save',
              glyph: 'xf0c7@FontAwesome',
            },
            tooltip: '保存',
            tooltipLanguageRes: {
              lanResTag: 'TBB.TOOLTIP.*.SAVE',
            },
            showCaption: true,
            showIcon: true,
            id: 'tbitem1',
          },
        ],
        xdataControlName: 'form',
        codeName: 'modify_setting_toolbar',
        controlType: 'TOOLBAR',
        logicName: '工具栏模板（嵌入编辑表单，只有一个保存按钮）',
        appDataEntityId: 'ibizodooapp.res_config_settings',
        controlParam: {
          id: 'toolbar',
        },
        modelId: '25823041a044e2dfc60cdebdb06ebd82',
        modelType: 'PSDETOOLBAR',
        name: 'toolbar',
        id: 'modify_setting_toolbar',
      },
      {
        createControlAction: {
          appDEMethodId: 'create',
          appDataEntityId: 'ibizodooapp.res_config_settings',
          id: 'create',
        },
        getDraftFromControlAction: {
          appDataEntityId: 'ibizodooapp.res_config_settings',
          id: 'loaddraftfrom',
        },
        getDraftControlAction: {
          appDEMethodId: 'get_draft',
          appDataEntityId: 'ibizodooapp.res_config_settings',
          id: 'loaddraft',
        },
        getControlAction: {
          appDEMethodId: 'get',
          appDataEntityId: 'ibizodooapp.res_config_settings',
          id: 'load',
        },
        removeControlAction: {
          appDEMethodId: 'remove',
          appDataEntityId: 'ibizodooapp.res_config_settings',
          id: 'remove',
        },
        updateControlAction: {
          appDEMethodId: 'update',
          appDataEntityId: 'ibizodooapp.res_config_settings',
          id: 'update',
        },
        deformPages: [
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        rawItem: {
                          caption: '邀请新用户',
                          halign: 'LEFT',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          contentType: 'RAW',
                          id: 'rawitem2',
                        },
                        codeName: 'rawitem2',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'rawitem2',
                      },
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'NONE',
                        noPrivDisplayMode: 1,
                        editor: {
                          editorType: 'TEXTBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'formitem',
                        },
                        allowEmpty: true,
                        codeName: 'formitem',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colLG: 18,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'formitem',
                      },
                      {
                        actionType: 'UIACTION',
                        buttonStyle: 'DEFAULT',
                        uiactionId: 'editview_refreshaction',
                        tooltip: '邀请',
                        uiactionTarget: 'SINGLEKEY',
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.BUTTON.BUTTON2',
                        },
                        caption: '邀请',
                        codeName: 'button2',
                        detailStyle: 'DEFAULT',
                        detailType: 'BUTTON',
                        layoutPos: {
                          colLG: 6,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        sysImage: {
                          cssClass: 'fa fa-refresh',
                          glyph: 'xf021@FontAwesome',
                        },
                        showCaption: true,
                        id: 'button2',
                      },
                      {
                        rawItem: {
                          caption: '待定邀请：',
                          halign: 'LEFT',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          contentType: 'RAW',
                          id: 'rawitem3',
                        },
                        codeName: 'rawitem3',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'rawitem3',
                      },
                    ],
                    codeName: 'grouppanel13',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel13',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        labelPos: 'NONE',
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'active_user_count',
                        editor: {
                          halign: 'LEFT',
                          linkAppViewId:
                            'ibizodooapp.res_users_multi_data_view',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          enableLinkView: true,
                          editorParams: {
                            'srfnavparam.n_share_eq': '0',
                            LINKVIEW: 'TRUE',
                          },
                          editorType: 'SPAN_LINK',
                          valueType: 'SIMPLE',
                          editable: true,
                          navigateParams: [
                            {
                              key: 'n_share_eq',
                              value: '0',
                              rawValue: true,
                              id: 'n_share_eq',
                            },
                          ],
                          id: 'active_user_count',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.ACTIVE_USER_COUNT',
                        },
                        caption: '有效用户数量',
                        codeName: 'active_user_count',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colLG: 1,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'active_user_count',
                      },
                      {
                        rawItem: {
                          caption: '活跃用户',
                          halign: 'LEFT',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          contentType: 'RAW',
                          id: 'rawitem1',
                        },
                        codeName: 'rawitem1',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          colLG: 21,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'rawitem1',
                      },
                    ],
                    codeName: 'grouppanel14',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel14',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.GROUPPANEL.GROUP1',
                },
                caption: '用户',
                codeName: 'group1',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group1',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'NONE',
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'company_name',
                        editor: {
                          halign: 'LEFT',
                          linkAppViewId: 'ibizodooapp.res_company_main_view',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          enableLinkView: true,
                          editorParams: {
                            'SRFNAVCTX.res_company': '%company_id%',
                            LINKVIEW: 'TRUE',
                          },
                          editorType: 'SPAN_LINK',
                          valueType: 'SIMPLE',
                          editable: true,
                          navigateContexts: [
                            {
                              key: 'RES_COMPANY',
                              value: 'company_id',
                              name: 'RES_COMPANY',
                              id: 'res_company',
                            },
                          ],
                          id: 'company_name',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag: 'DEF.LNAME.RES_CONFIG_SETTINGS.COMPANY_ID',
                        },
                        caption: '公司',
                        codeName: 'company_name',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'company_name',
                      },
                    ],
                    codeName: 'grouppanel16',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel16',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        labelPos: 'NONE',
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'company_count',
                        editor: {
                          halign: 'LEFT',
                          linkAppViewId:
                            'ibizodooapp.res_company_multi_data_view',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          enableLinkView: true,
                          editorParams: {
                            LINKVIEW: 'TRUE',
                          },
                          editorType: 'SPAN_LINK',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'company_count',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.COMPANY_COUNT',
                        },
                        caption: '公司数量',
                        codeName: 'company_count',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colLG: 1,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'company_count',
                      },
                      {
                        rawItem: {
                          caption: '公司',
                          halign: 'LEFT',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          contentType: 'RAW',
                          id: 'rawitem5',
                        },
                        codeName: 'rawitem5',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          colLG: 10,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'rawitem5',
                      },
                    ],
                    codeName: 'grouppanel17',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel17',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.GROUPPANEL.GROUPPANEL2',
                },
                caption: '公司',
                codeName: 'grouppanel2',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel2',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'product_weight_in_lbs',
                        editor: {
                          appCodeListId:
                            'ibizodooapp.base__res_config_settings_product_weight_in_lbs',
                          editorType: 'RADIOBUTTONLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'product_weight_in_lbs',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.PRODUCT_WEIGHT_IN_LBS',
                        },
                        caption: '重量单位',
                        codeName: 'product_weight_in_lbs',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'product_weight_in_lbs',
                      },
                    ],
                    codeName: 'grouppanel18',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel18',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'product_volume_volume_in_cubic_feet',
                        editor: {
                          appCodeListId:
                            'ibizodooapp.base__res_config_settings_product_volume_volume_in_cubic_feet',
                          editorType: 'RADIOBUTTONLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'product_volume_volume_in_cubic_feet',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET',
                        },
                        caption: '体积单位',
                        codeName: 'product_volume_volume_in_cubic_feet',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'product_volume_volume_in_cubic_feet',
                      },
                    ],
                    codeName: 'grouppanel19',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel19',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.GROUPPANEL.GROUPPANEL3',
                },
                caption: '计量单位',
                codeName: 'grouppanel3',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel3',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'auth_signup_uninvited',
                        editor: {
                          appCodeListId:
                            'ibizodooapp.base__res_config_settings_auth_signup_uninvited',
                          editorType: 'RADIOBUTTONLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'auth_signup_uninvited',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.AUTH_SIGNUP_UNINVITED',
                        },
                        caption: '客户帐号',
                        codeName: 'auth_signup_uninvited',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'auth_signup_uninvited',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'user_default_rights',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'user_default_rights',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.USER_DEFAULT_RIGHTS',
                        },
                        caption: '默认访问权限',
                        codeName: 'user_default_rights',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'user_default_rights',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_base_import',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_base_import',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMITEM.MODULE_BASE_IMPORT',
                        },
                        caption: '导入和导出',
                        codeName: 'module_base_import',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_base_import',
                      },
                    ],
                    codeName: 'grouppanel26',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel26',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'auth_signup_reset_password',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'auth_signup_reset_password',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMITEM.AUTH_SIGNUP_RESET_PASSWORD',
                        },
                        caption: '密码重置',
                        codeName: 'auth_signup_reset_password',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'auth_signup_reset_password',
                      },
                      {
                        dataType: 9,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'portal_allow_api_keys',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'portal_allow_api_keys',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMITEM.PORTAL_ALLOW_API_KEYS',
                        },
                        caption: '客户可以生成API密钥',
                        codeName: 'portal_allow_api_keys',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'portal_allow_api_keys',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'show_effect',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'show_effect',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.SHOW_EFFECT',
                        },
                        caption: '显示效果',
                        codeName: 'show_effect',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'show_effect',
                      },
                    ],
                    codeName: 'grouppanel27',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel27',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.GROUPPANEL.GROUPPANEL7',
                },
                caption: '权限',
                codeName: 'grouppanel7',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                defdgroupLogics: [
                  {
                    logicCat: 'PANELVISIBLE',
                    relatedDetailNames: ['module_mail_plugin'],
                    groupOP: 'AND',
                    defdlogics: [
                      {
                        condOP: 'EQ',
                        defdname: 'module_mail_plugin',
                        value: 'module_mail_plugin',
                        logicType: 'SINGLE',
                        id: 'module_mail_plugin等于(=) module_mail_plugin',
                      },
                    ],
                    logicType: 'GROUP',
                  },
                ],
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel7',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_mail_plugin',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_mail_plugin',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMITEM.MODULE_MAIL_PLUGIN',
                        },
                        caption: '邮件插件',
                        codeName: 'module_mail_plugin',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_mail_plugin',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_auth_oauth',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_auth_oauth',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMITEM.MODULE_AUTH_OAUTH',
                        },
                        caption: 'OAuth认证',
                        codeName: 'module_auth_oauth',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_auth_oauth',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_auth_ldap',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_auth_ldap',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_AUTH_LDAP',
                        },
                        caption: 'LDAP认证',
                        codeName: 'module_auth_ldap',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_auth_ldap',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_base_geolocalize',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_base_geolocalize',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMITEM.MODULE_BASE_GEOLOCALIZE',
                        },
                        caption: '地理位置',
                        codeName: 'module_base_geolocalize',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_base_geolocalize',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_website_cf_turnstile',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_website_cf_turnstile',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_WEBSITE_CF_TURNSTILE',
                        },
                        caption: 'Cloudflare Turnstile',
                        codeName: 'module_website_cf_turnstile',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_website_cf_turnstile',
                      },
                    ],
                    codeName: 'grouppanel28',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel28',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_product_images',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_product_images',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMITEM.MODULE_PRODUCT_IMAGES',
                        },
                        caption: '使用条码获取产品图片',
                        codeName: 'module_product_images',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_product_images',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_web_unsplash',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_web_unsplash',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_WEB_UNSPLASH',
                        },
                        caption: 'Unsplash图像库',
                        codeName: 'module_web_unsplash',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_web_unsplash',
                      },
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'unsplash_access_key',
                        editor: {
                          maxLength: 500,
                          editorType: 'TEXTBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'unsplash_access_key',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.UNSPLASH_ACCESS_KEY',
                        },
                        caption: '访问秘钥',
                        codeName: 'unsplash_access_key',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'unsplash_access_key',
                      },
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'unsplash_app_id',
                        editor: {
                          maxLength: 500,
                          editorType: 'TEXTBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'unsplash_app_id',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.UNSPLASH_APP_ID',
                        },
                        caption: '应用程序ID',
                        codeName: 'unsplash_app_id',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'unsplash_app_id',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        itemWidth: 230,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_google_recaptcha',
                        editor: {
                          singleSelect: true,
                          appCodeListId: 'ibizodooapp.yesno',
                          editorType: 'DROPDOWNLIST_100',
                          editorWidth: 100,
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_google_recaptcha',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_GOOGLE_RECAPTCHA',
                        },
                        caption: '验证码',
                        codeName: 'module_google_recaptcha',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_google_recaptcha',
                      },
                    ],
                    codeName: 'grouppanel29',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel29',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.GROUPPANEL.GROUPPANEL9',
                },
                caption: '集成',
                codeName: 'grouppanel9',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                defdgroupLogics: [
                  {
                    logicCat: 'PANELVISIBLE',
                    relatedDetailNames: ['module_mail_plugin'],
                    groupOP: 'AND',
                    defdlogics: [
                      {
                        condOP: 'EQ',
                        defdname: 'module_mail_plugin',
                        value: 'module_mail_plugin',
                        logicType: 'SINGLE',
                        id: 'module_mail_plugin等于(=) module_mail_plugin',
                      },
                    ],
                    logicType: 'GROUP',
                  },
                ],
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel9',
              },
              {
                dataType: 25,
                enableCond: 3,
                labelPos: 'LEFT',
                labelWidth: 130,
                noPrivDisplayMode: 1,
                appDEFieldId: 'id',
                editor: {
                  editorType: 'HIDDEN',
                  valueType: 'SIMPLE',
                  editable: true,
                  id: 'id',
                },
                allowEmpty: true,
                hidden: true,
                capLanguageRes: {
                  lanResTag: 'DEF.LNAME.RES_CONFIG_SETTINGS.ID',
                },
                caption: '标识',
                codeName: 'id',
                detailStyle: 'DEFAULT',
                detailType: 'FORMITEM',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                id: 'id',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMPAGE.GENERAL',
            },
            caption: '一般设置',
            codeName: 'general',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            id: 'general',
          },
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        layout: {
                          columnCount: 24,
                          layout: 'TABLE_24COL',
                        },
                        deformDetails: [
                          {
                            layout: {
                              dir: 'row',
                              layout: 'FLEX',
                            },
                            deformDetails: [
                              {
                                rawItem: {
                                  contentType: 'PLACEHOLDER',
                                  id: 'rawitem22',
                                },
                                codeName: 'rawitem22',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                  width: 40,
                                  widthMode: 'PX',
                                },
                                showCaption: true,
                                id: 'rawitem22',
                              },
                              {
                                rawItem: {
                                  caption: '出勤显示',
                                  halign: 'LEFT',
                                  valign: 'MIDDLE',
                                  wrapMode: 'NOWRAP',
                                  contentType: 'RAW',
                                  id: 'att_disp',
                                },
                                codeName: 'att_disp',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                showCaption: true,
                                id: 'att_disp',
                              },
                            ],
                            codeName: 'grouppanel_employee3',
                            detailStyle: 'DEFAULT',
                            detailType: 'GROUPPANEL',
                            layoutPos: {
                              colMD: 24,
                              layout: 'TABLE_24COL',
                            },
                            id: 'grouppanel_employee3',
                          },
                          {
                            dataType: 25,
                            enableCond: 3,
                            labelPos: 'LEFT',
                            labelWidth: 55,
                            noPrivDisplayMode: 1,
                            editor: {
                              appCodeListId:
                                'ibizodooapp.base__attendance_show',
                              editorType: 'CHECKBOXLIST',
                              valueType: 'SIMPLE',
                              editable: true,
                              id: 'attendanceshow',
                            },
                            allowEmpty: true,
                            needCodeListConfig: true,
                            codeName: 'attendanceshow',
                            detailStyle: 'DEFAULT',
                            detailType: 'FORMITEM',
                            layoutPos: {
                              colMD: 24,
                              layout: 'TABLE_24COL',
                            },
                            showCaption: true,
                            id: 'attendanceshow',
                          },
                        ],
                        codeName: 'grouppanel_employee2',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        layoutPos: {
                          colLG: 8,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'grouppanel_employee2',
                      },
                      {
                        layout: {
                          dir: 'row',
                          layout: 'FLEX',
                        },
                        deformDetails: [
                          {
                            dataType: 9,
                            enableCond: 3,
                            labelPos: 'LEFT',
                            labelWidth: 1,
                            noPrivDisplayMode: 1,
                            appDEFieldId: 'module_hr_presence',
                            editor: {
                              editorType: 'CHECKBOX',
                              valueType: 'SIMPLE',
                              editable: true,
                              id: 'module_hr_presence',
                            },
                            allowEmpty: true,
                            emptyCaption: true,
                            capLanguageRes: {
                              lanResTag:
                                'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_HR_PRESENCE',
                            },
                            codeName: 'module_hr_presence',
                            detailStyle: 'DEFAULT',
                            detailType: 'FORMITEM',
                            defdgroupLogics: [
                              {
                                logicCat: 'SCRIPTCODE_CHANGE',
                                groupOP: 'AND',
                                defdlogics: [
                                  {
                                    logicType: 'SINGLE',
                                  },
                                ],
                                logicType: 'GROUP',
                              },
                              {
                                logicCat: 'SCRIPTCODE_CLICK',
                                groupOP: 'AND',
                                defdlogics: [
                                  {
                                    logicType: 'SINGLE',
                                  },
                                ],
                                logicType: 'GROUP',
                              },
                            ],
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                              width: 30,
                              widthMode: 'PX',
                            },
                            showCaption: true,
                            id: 'module_hr_presence',
                          },
                          {
                            rawItem: {
                              contentType: 'PLACEHOLDER',
                              id: 'rawitem6',
                            },
                            codeName: 'rawitem6',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                              width: 10,
                              widthMode: 'PX',
                            },
                            showCaption: true,
                            id: 'rawitem6',
                          },
                          {
                            layout: {
                              layout: 'FLEX',
                            },
                            deformDetails: [
                              {
                                rawItem: {
                                  caption: '高级出席控制\n',
                                  halign: 'LEFT',
                                  valign: 'MIDDLE',
                                  wrapMode: 'NOWRAP',
                                  contentType: 'RAW',
                                  id: 'rawitem7',
                                },
                                codeName: 'rawitem7',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                showCaption: true,
                                id: 'rawitem7',
                              },
                              {
                                rawItem: {
                                  caption:
                                    '出席状态报告屏幕，电子邮件和IP地址控制。',
                                  halign: 'LEFT',
                                  valign: 'MIDDLE',
                                  wrapMode: 'NOWRAP',
                                  contentType: 'RAW',
                                  id: 'rawitem8',
                                },
                                codeName: 'rawitem8',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                showCaption: true,
                                id: 'rawitem8',
                              },
                              {
                                layout: {
                                  layout: 'FLEX',
                                },
                                deformDetails: [
                                  {
                                    dataType: 25,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 15,
                                    noPrivDisplayMode: 1,
                                    editor: {
                                      appCodeListId:
                                        'ibizodooapp.base__module_hr_presence',
                                      editorType: 'CHECKBOXLIST',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'hr_presence',
                                    },
                                    allowEmpty: true,
                                    needCodeListConfig: true,
                                    codeName: 'hr_presence',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    layoutPos: {
                                      shrink: 1,
                                      layout: 'FLEX',
                                    },
                                    showCaption: true,
                                    id: 'hr_presence',
                                  },
                                ],
                                codeName: 'hr_presence_group',
                                detailStyle: 'DEFAULT',
                                detailType: 'GROUPPANEL',
                                defdgroupLogics: [
                                  {
                                    logicCat: 'PANELVISIBLE',
                                    relatedDetailNames: ['module_hr_presence'],
                                    groupOP: 'AND',
                                    defdlogics: [
                                      {
                                        condOP: 'EQ',
                                        defdname: 'module_hr_presence',
                                        value: '1',
                                        logicType: 'SINGLE',
                                        id: 'module_hr_presence等于(=) 1',
                                      },
                                    ],
                                    logicType: 'GROUP',
                                  },
                                ],
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                id: 'hr_presence_group',
                              },
                            ],
                            codeName: 'grouppanel_employee5',
                            detailStyle: 'DEFAULT',
                            detailType: 'GROUPPANEL',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            id: 'grouppanel_employee5',
                          },
                        ],
                        codeName: 'grouppanel_employee4',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        layoutPos: {
                          colLG: 12,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'grouppanel_employee4',
                      },
                    ],
                    codeName: 'grouppanel_employee',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_employee',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        layout: {
                          dir: 'row',
                          layout: 'FLEX',
                        },
                        deformDetails: [
                          {
                            rawItem: {
                              contentType: 'PLACEHOLDER',
                              id: 'rawitem21',
                            },
                            codeName: 'rawitem21',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                              width: 40,
                              widthMode: 'PX',
                            },
                            showCaption: true,
                            id: 'rawitem21',
                          },
                          {
                            layout: {
                              layout: 'FLEX',
                            },
                            deformDetails: [
                              {
                                rawItem: {
                                  caption: '出勤条件',
                                  halign: 'LEFT',
                                  valign: 'MIDDLE',
                                  wrapMode: 'NOWRAP',
                                  contentType: 'RAW',
                                  id: 'rawitem9',
                                },
                                codeName: 'rawitem9',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                showCaption: true,
                                id: 'rawitem9',
                              },
                              {
                                rawItem: {
                                  caption:
                                    '定义要显示为“当前”的已发送电子邮件的最小数量。',
                                  halign: 'LEFT',
                                  valign: 'MIDDLE',
                                  wrapMode: 'NOWRAP',
                                  contentType: 'RAW',
                                  id: 'rawitem11',
                                },
                                codeName: 'rawitem11',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                showCaption: true,
                                id: 'rawitem11',
                              },
                            ],
                            codeName: 'grouppanel_employee6',
                            detailStyle: 'DEFAULT',
                            detailType: 'GROUPPANEL',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            id: 'grouppanel_employee6',
                          },
                        ],
                        codeName: 'attendance_group_mail',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        defdgroupLogics: [
                          {
                            logicCat: 'PANELVISIBLE',
                            relatedDetailNames: [
                              'module_hr_presence',
                              'hr_presence',
                            ],
                            groupOP: 'AND',
                            defdlogics: [
                              {
                                condOP: 'EQ',
                                defdname: 'module_hr_presence',
                                value: '1',
                                logicType: 'SINGLE',
                                id: 'module_hr_presence等于(=) 1',
                              },
                              {
                                condOP: 'LIKE',
                                defdname: 'hr_presence',
                                value: '1',
                                logicType: 'SINGLE',
                                id: 'hr_presence文本包含(%) 1',
                              },
                            ],
                            logicType: 'GROUP',
                          },
                        ],
                        layoutPos: {
                          colLG: 8,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'attendance_group_mail',
                      },
                      {
                        layout: {
                          dir: 'row',
                          layout: 'FLEX',
                        },
                        deformDetails: [
                          {
                            rawItem: {
                              contentType: 'PLACEHOLDER',
                              id: 'rawitem20',
                            },
                            codeName: 'rawitem20',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                              width: 40,
                              widthMode: 'PX',
                            },
                            showCaption: true,
                            id: 'rawitem20',
                          },
                          {
                            layout: {
                              layout: 'FLEX',
                            },
                            deformDetails: [
                              {
                                rawItem: {
                                  caption: '出勤条件',
                                  halign: 'LEFT',
                                  valign: 'MIDDLE',
                                  wrapMode: 'NOWRAP',
                                  contentType: 'RAW',
                                  id: 'rawitem10',
                                },
                                codeName: 'rawitem10',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                showCaption: true,
                                id: 'rawitem10',
                              },
                              {
                                rawItem: {
                                  caption:
                                    '定义允许的 IP 显示为“存在”。如果有多个地址，请用逗号分隔它们。',
                                  halign: 'LEFT',
                                  valign: 'MIDDLE',
                                  wrapMode: 'NOWRAP',
                                  contentType: 'RAW',
                                  id: 'rawitem12',
                                },
                                codeName: 'rawitem12',
                                detailStyle: 'DEFAULT',
                                detailType: 'RAWITEM',
                                layoutPos: {
                                  shrink: 1,
                                  layout: 'FLEX',
                                },
                                showCaption: true,
                                id: 'rawitem12',
                              },
                            ],
                            codeName: 'grouppanel_employee7',
                            detailStyle: 'DEFAULT',
                            detailType: 'GROUPPANEL',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            id: 'grouppanel_employee7',
                          },
                        ],
                        codeName: 'attendance_group_ip',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        defdgroupLogics: [
                          {
                            logicCat: 'PANELVISIBLE',
                            relatedDetailNames: [
                              'hr_presence',
                              'module_hr_presence',
                            ],
                            groupOP: 'AND',
                            defdlogics: [
                              {
                                condOP: 'LIKE',
                                defdname: 'hr_presence',
                                value: '2',
                                logicType: 'SINGLE',
                                id: 'hr_presence文本包含(%) 2',
                              },
                              {
                                condOP: 'EQ',
                                defdname: 'module_hr_presence',
                                value: '1',
                                logicType: 'SINGLE',
                                id: 'module_hr_presence等于(=) 1',
                              },
                            ],
                            logicType: 'GROUP',
                          },
                        ],
                        layoutPos: {
                          colLG: 12,
                          colMD: 24,
                          colSM: 12,
                          layout: 'TABLE_24COL',
                        },
                        id: 'attendance_group_ip',
                      },
                    ],
                    codeName: 'attendance_group',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'attendance_group',
                  },
                  {
                    layout: {
                      dir: 'row',
                      layout: 'FLEX',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 1,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_hr_skills',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_hr_skills',
                        },
                        allowEmpty: true,
                        emptyCaption: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_HR_SKILLS',
                        },
                        codeName: 'module_hr_skills',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                          width: 30,
                          widthMode: 'PX',
                        },
                        showCaption: true,
                        id: 'module_hr_skills',
                      },
                      {
                        rawItem: {
                          contentType: 'PLACEHOLDER',
                          id: 'rawitem13',
                        },
                        codeName: 'rawitem13',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                          width: 10,
                          widthMode: 'PX',
                        },
                        showCaption: true,
                        id: 'rawitem13',
                      },
                      {
                        layout: {
                          layout: 'FLEX',
                        },
                        deformDetails: [
                          {
                            rawItem: {
                              caption: '技能管理',
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              contentType: 'RAW',
                              id: 'rawitem14',
                            },
                            codeName: 'rawitem14',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            showCaption: true,
                            id: 'rawitem14',
                          },
                          {
                            rawItem: {
                              caption: '填充技能和简历到员工资料',
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              contentType: 'RAW',
                              id: 'rawitem15',
                            },
                            codeName: 'rawitem15',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            showCaption: true,
                            id: 'rawitem15',
                          },
                        ],
                        codeName: 'grouppanel_employee9',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                        },
                        id: 'grouppanel_employee9',
                      },
                    ],
                    codeName: 'grouppanel_employee8',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 8,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_employee8',
                  },
                  {
                    layout: {
                      dir: 'row',
                      layout: 'FLEX',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 1,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_hr_homeworking',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_hr_homeworking',
                        },
                        allowEmpty: true,
                        emptyCaption: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_HR_HOMEWORKING',
                        },
                        codeName: 'module_hr_homeworking',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                          width: 30,
                          widthMode: 'PX',
                        },
                        showCaption: true,
                        id: 'module_hr_homeworking',
                      },
                      {
                        rawItem: {
                          contentType: 'PLACEHOLDER',
                          id: 'rawitem16',
                        },
                        codeName: 'rawitem16',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                          width: 10,
                          widthMode: 'PX',
                        },
                        showCaption: true,
                        id: 'rawitem16',
                      },
                      {
                        layout: {
                          layout: 'FLEX',
                        },
                        deformDetails: [
                          {
                            rawItem: {
                              caption: '远程工作',
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              contentType: 'RAW',
                              id: 'rawitem17',
                            },
                            codeName: 'rawitem17',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            showCaption: true,
                            id: 'rawitem17',
                          },
                          {
                            rawItem: {
                              caption:
                                '显示每位员工远程工作设置和专用报告。出勤状态图标将更新为远程工作地点。',
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              contentType: 'RAW',
                              id: 'rawitem18',
                            },
                            codeName: 'rawitem18',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            showCaption: true,
                            id: 'rawitem18',
                          },
                        ],
                        codeName: 'grouppanel_employee11',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                        },
                        id: 'grouppanel_employee11',
                      },
                    ],
                    codeName: 'grouppanel_employee10',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 12,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_employee10',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.MAIN.GROUPPANEL.GROUP1',
                },
                caption: '员工',
                codeName: 'group_employee',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group_employee',
              },
              {
                layout: {
                  dir: 'row',
                  layout: 'FLEX',
                },
                deformDetails: [
                  {
                    dataType: 9,
                    enableCond: 3,
                    labelPos: 'LEFT',
                    labelWidth: 1,
                    noPrivDisplayMode: 1,
                    appDEFieldId: 'hr_employee_self_edit',
                    editor: {
                      editorType: 'CHECKBOX',
                      valueType: 'SIMPLE',
                      editable: true,
                      id: 'hr_employee_self_edit',
                    },
                    allowEmpty: true,
                    emptyCaption: true,
                    capLanguageRes: {
                      lanResTag:
                        'DEF.LNAME.RES_CONFIG_SETTINGS.HR_EMPLOYEE_SELF_EDIT',
                    },
                    codeName: 'hr_employee_self_edit',
                    detailStyle: 'DEFAULT',
                    detailType: 'FORMITEM',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                      width: 30,
                      widthMode: 'PX',
                    },
                    showCaption: true,
                    id: 'hr_employee_self_edit',
                  },
                  {
                    rawItem: {
                      halign: 'LEFT',
                      valign: 'MIDDLE',
                      wrapMode: 'NOWRAP',
                      contentType: 'RAW',
                      id: 'rawitemc',
                    },
                    codeName: 'rawitemc',
                    detailStyle: 'DEFAULT',
                    detailType: 'RAWITEM',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                      width: 10,
                      widthMode: 'PX',
                    },
                    showCaption: true,
                    id: 'rawitemc',
                  },
                  {
                    layout: {
                      layout: 'FLEX',
                    },
                    deformDetails: [
                      {
                        rawItem: {
                          caption: '员工编辑',
                          halign: 'LEFT',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          contentType: 'RAW',
                          id: 'rawitemd',
                        },
                        codeName: 'rawitemd',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                        },
                        showCaption: true,
                        id: 'rawitemd',
                      },
                      {
                        rawItem: {
                          caption: '允许员工更新自己的数据',
                          halign: 'LEFT',
                          valign: 'MIDDLE',
                          wrapMode: 'NOWRAP',
                          contentType: 'RAW',
                          id: 'rawiteme',
                        },
                        codeName: 'rawiteme',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                        },
                        showCaption: true,
                        id: 'rawiteme',
                      },
                    ],
                    codeName: 'grouppanel_employee14',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                    },
                    id: 'grouppanel_employee14',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.EMPLOYEE.GROUPPANEL.GROUPPANEL2',
                },
                caption: '员工资料',
                codeName: 'grouppanel_employee13',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_employee13',
              },
              {
                createDV: '4574e071f4379e0353c7d4ff5045350e',
                dataType: 25,
                enableCond: 3,
                labelPos: 'LEFT',
                labelWidth: 130,
                noPrivDisplayMode: 1,
                appDEFieldId: 'company_id',
                editor: {
                  editorType: 'HIDDEN',
                  valueType: 'SIMPLE',
                  editable: true,
                  id: 'company_id',
                },
                allowEmpty: true,
                hidden: true,
                capLanguageRes: {
                  lanResTag: 'DEF.LNAME.RES_CONFIG_SETTINGS.COMPANY_ID',
                },
                caption: '公司',
                codeName: 'company_id',
                detailStyle: 'DEFAULT',
                detailType: 'FORMITEM',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                id: 'company_id',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.MAIN.FORMPAGE.FORMPAGE1',
            },
            caption: '员工',
            codeName: 'formpage_employee',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            id: 'formpage_employee',
          },
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_use_recurring_revenues',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_use_recurring_revenues',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_USE_RECURRING_REVENUES',
                        },
                        caption: '经常性收入',
                        codeName: 'group_use_recurring_revenues',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_use_recurring_revenues',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'is_membership_multi',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'is_membership_multi',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.IS_MEMBERSHIP_MULTI',
                        },
                        caption: '多团队',
                        codeName: 'is_membership_multi',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'is_membership_multi',
                      },
                      {
                        layout: {
                          columnCount: 24,
                          layout: 'TABLE_24COL',
                        },
                        deformDetails: [
                          {
                            rawItem: {
                              caption: '成功率计算基于',
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              contentType: 'RAW',
                              id: 'sr_calc_based_on',
                            },
                            codeName: 'sr_calc_based_on',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              colLG: 6,
                              colMD: 24,
                              layout: 'TABLE_24COL',
                            },
                            showCaption: true,
                            id: 'sr_calc_based_on',
                          },
                          {
                            dataType: 25,
                            labelPos: 'NONE',
                            noPrivDisplayMode: 1,
                            appDEFieldId:
                              'predictive_lead_scoring_field_labels',
                            editor: {
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              editorType: 'SPAN',
                              valueType: 'SIMPLE',
                              editable: true,
                              id: 'predictive_lead_scoring_field_labels',
                            },
                            allowEmpty: true,
                            capLanguageRes: {
                              lanResTag:
                                'DEF.LNAME.RES_CONFIG_SETTINGS.PREDICTIVE_LEAD_SCORING_FIELD_LABELS',
                            },
                            caption: '预测线索评分字段标签',
                            codeName: 'predictive_lead_scoring_field_labels',
                            detailStyle: 'DEFAULT',
                            detailType: 'FORMITEM',
                            layoutPos: {
                              colLG: 12,
                              colMD: 24,
                              layout: 'TABLE_24COL',
                            },
                            id: 'predictive_lead_scoring_field_labels',
                          },
                          {
                            rawItem: {
                              caption: '对于目前创建的线索日期截至',
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              contentType: 'RAW',
                              id: 'for_leads_to',
                            },
                            codeName: 'for_leads_to',
                            detailStyle: 'DEFAULT',
                            detailType: 'RAWITEM',
                            layoutPos: {
                              colLG: 10,
                              colMD: 24,
                              layout: 'TABLE_24COL',
                            },
                            showCaption: true,
                            id: 'for_leads_to',
                          },
                          {
                            dataType: 5,
                            labelPos: 'NONE',
                            noPrivDisplayMode: 1,
                            appDEFieldId: 'predictive_lead_scoring_start_date',
                            editor: {
                              halign: 'LEFT',
                              valign: 'MIDDLE',
                              wrapMode: 'NOWRAP',
                              editorType: 'SPAN',
                              valueType: 'SIMPLE',
                              editable: true,
                              id: 'predictive_lead_scoring_start_date',
                            },
                            valueFormat: 'YYYY-MM-DD',
                            allowEmpty: true,
                            capLanguageRes: {
                              lanResTag:
                                'DEF.LNAME.RES_CONFIG_SETTINGS.PREDICTIVE_LEAD_SCORING_START_DATE',
                            },
                            caption: '线索评分开始日期',
                            codeName: 'predictive_lead_scoring_start_date',
                            detailStyle: 'DEFAULT',
                            detailType: 'FORMITEM',
                            layoutPos: {
                              colLG: 6,
                              colMD: 24,
                              layout: 'TABLE_24COL',
                            },
                            id: 'predictive_lead_scoring_start_date',
                          },
                        ],
                        codeName: 'grouppanel_crm2',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'grouppanel_crm2',
                      },
                      {
                        actionType: 'UIACTION',
                        buttonStyle: 'DEFAULT',
                        uiactionId: 'editview_refreshaction',
                        tooltip: '更新概率',
                        uiactionTarget: 'SINGLEKEY',
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CRM.BUTTON.BUTTON2',
                        },
                        caption: '更新概率',
                        codeName: 'update_prob',
                        detailStyle: 'DEFAULT',
                        detailType: 'BUTTON',
                        layoutPos: {
                          colLG: 6,
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        sysImage: {
                          cssClass: 'fa fa-refresh',
                          glyph: 'xf021@FontAwesome',
                        },
                        showCaption: true,
                        id: 'update_prob',
                      },
                    ],
                    codeName: 'grouppanel_crm',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_crm',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_use_lead',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_use_lead',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_USE_LEAD',
                        },
                        caption: '线索',
                        codeName: 'group_use_lead',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_use_lead',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'crm_use_auto_assignment',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'crm_use_auto_assignment',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.CRM_USE_AUTO_ASSIGNMENT',
                        },
                        caption: '基于规则的分配',
                        codeName: 'crm_use_auto_assignment',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'crm_use_auto_assignment',
                      },
                    ],
                    codeName: 'grouppanel_crm3',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_crm3',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CRM.GROUPPANEL.GROUP1',
                },
                caption: '客户关系管理',
                codeName: 'group_crm',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group_crm',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'lead_enrich_auto',
                        editor: {
                          appCodeListId:
                            'ibizodooapp.base__res_config_settings_lead_enrich_auto',
                          editorType: 'RADIOBUTTONLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'lead_enrich_auto',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CRM.FORMITEM.LEAD_ENRICH_AUTO',
                        },
                        caption: '丰富线索',
                        codeName: 'lead_enrich_auto',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'lead_enrich_auto',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_website_crm_iap_reveal',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_website_crm_iap_reveal',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CRM.FORMITEM.MODULE_WEBSITE_CRM_IAP_REVEAL',
                        },
                        caption: '访问线索',
                        codeName: 'module_website_crm_iap_reveal',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_website_crm_iap_reveal',
                      },
                    ],
                    codeName: 'grouppanel_crm5',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_crm5',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_crm_iap_mine',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_crm_iap_mine',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CRM.FORMITEM.MODULE_CRM_IAP_MINE',
                        },
                        caption: '挖掘线索',
                        codeName: 'module_crm_iap_mine',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_crm_iap_mine',
                      },
                    ],
                    codeName: 'grouppanel_crm6',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_crm6',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CRM.GROUPPANEL.GROUPPANEL9',
                },
                caption: '生成线索',
                codeName: 'grouppanel_crm4',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_crm4',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CRM.FORMPAGE.FORMPAGE1',
            },
            caption: '客户关系管理',
            codeName: 'formpage_crm',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            defdgroupLogics: [
              {
                logicCat: 'PANELVISIBLE',
                relatedDetailNames: ['group_use_recurring_revenues'],
                groupOP: 'AND',
                defdlogics: [
                  {
                    condOP: 'EQ',
                    defdname: 'group_use_recurring_revenues',
                    value: 'group_use_recurring_revenues',
                    logicType: 'SINGLE',
                    id: 'group_use_recurring_revenues等于(=) group_use_recurring_revenues',
                  },
                ],
                logicType: 'GROUP',
              },
            ],
            id: 'formpage_crm',
          },
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_product_variant',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_product_variant',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PRODUCT_VARIANT',
                        },
                        caption: '变体',
                        codeName: 'group_product_variant',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_product_variant',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_uom',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_uom1',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag: 'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_UOM',
                        },
                        caption: '计量单位',
                        codeName: 'group_uom1',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_uom1',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_stock_packaging',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_stock_packaging',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_STOCK_PACKAGING',
                        },
                        caption: '产品包装',
                        codeName: 'group_stock_packaging',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_stock_packaging',
                      },
                    ],
                    codeName: 'grouppanel_sale',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_sale_product_matrix',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_sale_product_matrix',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.FORMITEM.MODULE_SALE_PRODUCT_MATRIX',
                        },
                        caption: '通过网格录入变体',
                        codeName: 'module_sale_product_matrix',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_sale_product_matrix',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_product_email_template',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_product_email_template',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.FORMITEM.MODULE_PRODUCT_EMAIL_TEMPLATE',
                        },
                        caption: '通过电子邮件发送交付内容',
                        codeName: 'module_product_email_template',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_product_email_template',
                      },
                    ],
                    codeName: 'grouppanel_sale2',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale2',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.GROUPPANEL.GROUP1',
                },
                caption: '产品目录',
                codeName: 'group_sale',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group_sale',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_discount_per_so_line',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_discount_per_so_line',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_DISCOUNT_PER_SO_LINE',
                        },
                        caption: '折扣',
                        codeName: 'group_discount_per_so_line',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_discount_per_so_line',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_product_pricelist',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_product_pricelist',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PRODUCT_PRICELIST',
                        },
                        caption: '价格表',
                        codeName: 'group_product_pricelist',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_product_pricelist',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_sale_margin',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_sale_margin',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_SALE_MARGIN',
                        },
                        caption: '毛利',
                        codeName: 'module_sale_margin',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_sale_margin',
                      },
                    ],
                    codeName: 'grouppanel_sale4',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale4',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_loyalty',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_loyalty',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.FORMITEM.MODULE_LOYALTY',
                        },
                        caption: '促销、会员和礼品卡',
                        codeName: 'module_loyalty',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_loyalty',
                      },
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'auth_signup_uninvited',
                        editor: {
                          appCodeListId:
                            'ibizodooapp.base__res_config_settings_auth_signup_uninvited',
                          editorType: 'RADIOBUTTONLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'auth_signup_uninvited1',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.AUTH_SIGNUP_UNINVITED',
                        },
                        caption: '客户帐号',
                        codeName: 'auth_signup_uninvited1',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'auth_signup_uninvited1',
                      },
                    ],
                    codeName: 'grouppanel_sale5',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale5',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.GROUPPANEL.GROUPPANEL2',
                },
                caption: '定价',
                codeName: 'grouppanel_sale3',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_sale3',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_warning_sale',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_warning_sale',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_WARNING_SALE',
                        },
                        caption: '销售订单警告信息',
                        codeName: 'group_warning_sale',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_warning_sale',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_auto_done_setting',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_auto_done_setting',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_AUTO_DONE_SETTING',
                        },
                        caption: '锁定已确认的销售订单',
                        codeName: 'group_auto_done_setting',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_auto_done_setting',
                      },
                    ],
                    codeName: 'grouppanel_sale7',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale7',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_sale_order_template',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_sale_order_template',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_SALE_ORDER_TEMPLATE',
                        },
                        caption: '报价模板',
                        codeName: 'group_sale_order_template',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_sale_order_template',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_sale_pdf_quote_builder',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_sale_pdf_quote_builder',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_SALE_PDF_QUOTE_BUILDER',
                        },
                        caption: 'PDF 报价生成器',
                        codeName: 'module_sale_pdf_quote_builder',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_sale_pdf_quote_builder',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_proforma_sales',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_proforma_sales',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PROFORMA_SALES',
                        },
                        caption: '形式发票',
                        codeName: 'group_proforma_sales',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_proforma_sales',
                      },
                    ],
                    codeName: 'grouppanel_sale8',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale8',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.GROUPPANEL.GROUPPANEL3',
                },
                caption: '报价单和订单',
                codeName: 'grouppanel_sale6',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_sale6',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY',
                        },
                        caption: '交付方式',
                        codeName: 'module_delivery',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_dhl',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_dhl',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_DHL',
                        },
                        caption: 'DHL快递连接器',
                        codeName: 'module_delivery_dhl',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_dhl',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_usps',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_usps',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_USPS',
                        },
                        caption: 'USPS连接器',
                        codeName: 'module_delivery_usps',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_usps',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_easypost',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_easypost',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_EASYPOST',
                        },
                        caption: 'Easypost连接器',
                        codeName: 'module_delivery_easypost',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_easypost',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_shiprocket',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_shiprocket',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_SHIPROCKET',
                        },
                        caption: 'Shiprocket 连接器',
                        codeName: 'module_delivery_shiprocket',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_shiprocket',
                      },
                    ],
                    codeName: 'grouppanel_sale10',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale10',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_ups',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_ups',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_UPS',
                        },
                        caption: 'UPS连接器',
                        codeName: 'module_delivery_ups',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_ups',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_fedex',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_fedex',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_FEDEX',
                        },
                        caption: 'FedEx连接器',
                        codeName: 'module_delivery_fedex',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_fedex',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_bpost',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_bpost',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_BPOST',
                        },
                        caption: 'bpost连接器',
                        codeName: 'module_delivery_bpost',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_bpost',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_sendcloud',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_sendcloud',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_SENDCLOUD',
                        },
                        caption: 'Sendcloud连接器',
                        codeName: 'module_delivery_sendcloud',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_sendcloud',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_delivery_starshipit',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_delivery_starshipit',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_DELIVERY_STARSHIPIT',
                        },
                        caption: 'Starshipit 连接器',
                        codeName: 'module_delivery_starshipit',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_delivery_starshipit',
                      },
                    ],
                    codeName: 'grouppanel_sale11',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale11',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.GROUPPANEL.GROUPPANEL4',
                },
                caption: '发货',
                codeName: 'grouppanel_sale9',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_sale9',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'default_invoice_policy',
                        editor: {
                          appCodeListId:
                            'ibizodooapp.base__res_config_settings_default_invoice_policy',
                          editorType: 'RADIOBUTTONLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'default_invoice_policy',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.DEFAULT_INVOICE_POLICY',
                        },
                        caption: '开票原则',
                        codeName: 'default_invoice_policy',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'default_invoice_policy',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_sale_commission',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_sale_commission',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_SALE_COMMISSION',
                        },
                        caption: '佣金',
                        codeName: 'module_sale_commission',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_sale_commission',
                      },
                    ],
                    codeName: 'grouppanel_sale13',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale13',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'automatic_invoice',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'automatic_invoice',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.AUTOMATIC_INVOICE',
                        },
                        caption: '自动发票',
                        codeName: 'automatic_invoice',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'automatic_invoice',
                      },
                    ],
                    codeName: 'grouppanel_sale14',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale14',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.GROUPPANEL.GROUPPANEL5',
                },
                caption: '发票',
                codeName: 'grouppanel_sale12',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_sale12',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_sale_amazon',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_sale_amazon',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_SALE_AMAZON',
                        },
                        caption: '亚马逊同步',
                        codeName: 'module_sale_amazon',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_sale_amazon',
                      },
                    ],
                    codeName: 'grouppanel_sale16',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale16',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    codeName: 'grouppanel_sale17',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_sale17',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.GROUPPANEL.GROUPPANEL9',
                },
                caption: '连接器',
                codeName: 'grouppanel_sale15',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_sale15',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.SALE.FORMPAGE.FORMPAGE1',
            },
            caption: '销售',
            codeName: 'formpage_sale',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            defdgroupLogics: [
              {
                logicCat: 'PANELVISIBLE',
                relatedDetailNames: ['group_product_variant'],
                groupOP: 'AND',
                defdlogics: [
                  {
                    condOP: 'EQ',
                    defdname: 'group_product_variant',
                    value: 'group_product_variant',
                    logicType: 'SINGLE',
                    id: 'group_product_variant等于(=) group_product_variant',
                  },
                ],
                logicType: 'GROUP',
              },
            ],
            id: 'formpage_sale',
          },
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_microsoft_calendar',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_microsoft_calendar',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_MICROSOFT_CALENDAR',
                        },
                        caption: '允许用户同步Outlook日历',
                        codeName: 'module_microsoft_calendar',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_microsoft_calendar',
                      },
                    ],
                    codeName: 'grouppanel_calendar',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_calendar',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_google_calendar',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_google_calendar',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_GOOGLE_CALENDAR',
                        },
                        caption: '允许用户同步谷歌日历',
                        codeName: 'module_google_calendar',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_google_calendar',
                      },
                    ],
                    codeName: 'grouppanel_calendar2',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_calendar2',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CALENDAR.GROUPPANEL.GROUP1',
                },
                caption: '日历设置',
                codeName: 'group_calendar',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group_calendar',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.CALENDAR.FORMPAGE.FORMPAGE1',
            },
            caption: '日历',
            codeName: 'formpage_calendar',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            defdgroupLogics: [
              {
                logicCat: 'PANELVISIBLE',
                relatedDetailNames: ['module_microsoft_calendar'],
                groupOP: 'AND',
                defdlogics: [
                  {
                    condOP: 'EQ',
                    defdname: 'module_microsoft_calendar',
                    value: 'module_microsoft_calendar',
                    logicType: 'SINGLE',
                    id: 'module_microsoft_calendar等于(=) module_microsoft_calendar',
                  },
                ],
                logicType: 'GROUP',
              },
            ],
            id: 'formpage_calendar',
          },
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_l10n_eu_oss',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_l10n_eu_oss',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_L10N_EU_OSS',
                        },
                        caption: '欧盟共同体内部远程销售',
                        codeName: 'module_l10n_eu_oss',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_l10n_eu_oss',
                      },
                    ],
                    codeName: 'grouppanel_invoice',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    codeName: 'grouppanel_invoice1',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice1',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUP1',
                },
                caption: '税项',
                codeName: 'group_invoice',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group_invoice',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    codeName: 'grouppanel_invoice3',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice3',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_currency_rate_live',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_currency_rate_live',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_CURRENCY_RATE_LIVE',
                        },
                        caption: '自动汇率',
                        codeName: 'module_currency_rate_live',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_currency_rate_live',
                      },
                    ],
                    codeName: 'grouppanel_invoice4',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice4',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL2',
                },
                caption: '币别',
                codeName: 'grouppanel_invoice2',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice2',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_snailmail_account',
                        editor: {
                          appCodeListId: 'ibizodooapp.yesno',
                          editorType: 'CHECKBOXLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_snailmail_account',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_SNAILMAIL_ACCOUNT',
                        },
                        caption: '传统信件',
                        codeName: 'module_snailmail_account',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_snailmail_account',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_warning_account',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_warning_account',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_WARNING_ACCOUNT',
                        },
                        caption: '发票中的警告',
                        codeName: 'group_warning_account',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_warning_account',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_account_intrastat',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_account_intrastat',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_ACCOUNT_INTRASTAT',
                        },
                        caption: '国际联盟',
                        codeName: 'module_account_intrastat',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_account_intrastat',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_show_sale_receipts',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_show_sale_receipts',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_SHOW_SALE_RECEIPTS',
                        },
                        caption: '销售收据',
                        codeName: 'group_show_sale_receipts',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_show_sale_receipts',
                      },
                    ],
                    codeName: 'grouppanel_invoice6',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice6',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_sale_delivery_address',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_sale_delivery_address',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_SALE_DELIVERY_ADDRESS',
                        },
                        caption: '客户地址',
                        codeName: 'group_sale_delivery_address',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_sale_delivery_address',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_cash_rounding',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_cash_rounding',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_CASH_ROUNDING',
                        },
                        caption: '现金舍入',
                        codeName: 'group_cash_rounding',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_cash_rounding',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'use_invoice_terms',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'use_invoice_terms',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.USE_INVOICE_TERMS',
                        },
                        caption: '默认条款和条件',
                        codeName: 'use_invoice_terms',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'use_invoice_terms',
                      },
                    ],
                    codeName: 'grouppanel_invoice7',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice7',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL3',
                },
                caption: '客户发票',
                codeName: 'grouppanel_invoice5',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice5',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_uom',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_uom',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag: 'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_UOM',
                        },
                        caption: '计量单位',
                        codeName: 'group_uom',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_uom',
                      },
                    ],
                    codeName: 'grouppanel_invoice9',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice9',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    codeName: 'grouppanel_invoice10',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice10',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL4',
                },
                caption: '计量单位',
                codeName: 'grouppanel_invoice8',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice8',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_account_payment',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_account_payment',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_ACCOUNT_PAYMENT',
                        },
                        caption: 'Invoice Online Payment',
                        codeName: 'module_account_payment',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_account_payment',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_account_sepa_direct_debit',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_account_sepa_direct_debit',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_ACCOUNT_SEPA_DIRECT_DEBIT',
                        },
                        caption: 'Use SEPA Direct Debit',
                        codeName: 'module_account_sepa_direct_debit',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_account_sepa_direct_debit',
                      },
                    ],
                    codeName: 'grouppanel_invoice12',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice12',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_account_batch_payment',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_account_batch_payment',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_ACCOUNT_BATCH_PAYMENT',
                        },
                        caption: '使用批量付款',
                        codeName: 'module_account_batch_payment',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_account_batch_payment',
                      },
                    ],
                    codeName: 'grouppanel_invoice13',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice13',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL5',
                },
                caption: '客户付款',
                codeName: 'grouppanel_invoice11',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice11',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_show_purchase_receipts',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_show_purchase_receipts',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_SHOW_PURCHASE_RECEIPTS',
                        },
                        caption: '采购收据',
                        codeName: 'group_show_purchase_receipts',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_show_purchase_receipts',
                      },
                    ],
                    codeName: 'grouppanel_invoice15',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice15',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    codeName: 'grouppanel_invoice16',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice16',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL6',
                },
                caption: '供应商账单',
                codeName: 'grouppanel_invoice14',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice14',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_account_iso20022',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_account_iso20022',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_ACCOUNT_ISO20022',
                        },
                        caption: 'SEPA Credit Transfer / ISO20022',
                        codeName: 'module_account_iso20022',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_account_iso20022',
                      },
                    ],
                    codeName: 'grouppanel_invoice18',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice18',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL7',
                },
                caption: '供应商付款',
                codeName: 'grouppanel_invoice17',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice17',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_account_extract',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_account_extract',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_ACCOUNT_EXTRACT',
                        },
                        caption: 'Document Digitization',
                        codeName: 'module_account_extract',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_account_extract',
                      },
                    ],
                    codeName: 'grouppanel_invoice20',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice20',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL8',
                },
                caption: '数字化',
                codeName: 'grouppanel_invoice19',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice19',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    dataType: 9,
                    enableCond: 3,
                    labelPos: 'LEFT',
                    labelWidth: 130,
                    noPrivDisplayMode: 1,
                    appDEFieldId: 'module_account_peppol',
                    editor: {
                      editorType: 'CHECKBOX',
                      valueType: 'SIMPLE',
                      editable: true,
                      id: 'module_account_peppol',
                    },
                    allowEmpty: true,
                    capLanguageRes: {
                      lanResTag:
                        'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_ACCOUNT_PEPPOL',
                    },
                    caption: 'PEPPOL 开具发票',
                    codeName: 'module_account_peppol',
                    detailStyle: 'DEFAULT',
                    detailType: 'FORMITEM',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    showCaption: true,
                    id: 'module_account_peppol',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL1',
                },
                caption: 'PEPPOL Electronic Invoicing',
                codeName: 'grouppanel_invoice21',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice21',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    codeName: 'grouppanel_invoice23',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_invoice23',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL9',
                },
                caption: '会计师事务所模式',
                codeName: 'grouppanel_invoice22',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice22',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.GROUPPANEL.GROUPPANEL12',
                },
                caption: '审计跟踪',
                codeName: 'grouppanel_invoice24',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_invoice24',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.INVOICE.FORMPAGE.FORMPAGE1',
            },
            caption: '发票',
            codeName: 'formpage_invoice',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            defdgroupLogics: [
              {
                logicCat: 'PANELVISIBLE',
                relatedDetailNames: ['module_l10n_eu_oss'],
                groupOP: 'AND',
                defdlogics: [
                  {
                    condOP: 'EQ',
                    defdname: 'module_l10n_eu_oss',
                    value: 'module_l10n_eu_oss',
                    logicType: 'SINGLE',
                    id: 'module_l10n_eu_oss等于(=) module_l10n_eu_oss',
                  },
                ],
                logicType: 'GROUP',
              },
            ],
            id: 'formpage_invoice',
          },
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_project_recurring_tasks',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_project_recurring_tasks',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PROJECT_RECURRING_TASKS',
                        },
                        caption: '周期任务',
                        codeName: 'group_project_recurring_tasks',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_project_recurring_tasks',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_project_stages',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_project_stages',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PROJECT_STAGES',
                        },
                        caption: '项目阶段',
                        codeName: 'group_project_stages',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_project_stages',
                      },
                    ],
                    codeName: 'grouppanel_project',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_project',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_project_task_dependencies',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_project_task_dependencies',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PROJECT_TASK_DEPENDENCIES',
                        },
                        caption: '任务依赖',
                        codeName: 'group_project_task_dependencies',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_project_task_dependencies',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_project_milestone',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_project_milestone',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PROJECT_MILESTONE',
                        },
                        caption: '里程碑',
                        codeName: 'group_project_milestone',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_project_milestone',
                      },
                    ],
                    codeName: 'grouppanel_project1',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_project1',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.PROJECT.GROUPPANEL.GROUP1',
                },
                caption: '任务管理',
                codeName: 'group_project',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group_project',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'module_hr_timesheet',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'module_hr_timesheet',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MODULE_HR_TIMESHEET',
                        },
                        caption: '任务日志',
                        codeName: 'module_hr_timesheet',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'module_hr_timesheet',
                      },
                    ],
                    codeName: 'grouppanel_project3',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_project3',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.PROJECT.GROUPPANEL.GROUPPANEL1',
                },
                caption: '时间管理',
                codeName: 'grouppanel_project2',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_project2',
              },
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_project_rating',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_project_rating',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_PROJECT_RATING',
                        },
                        caption: '客户点评',
                        codeName: 'group_project_rating',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_project_rating',
                      },
                    ],
                    codeName: 'grouppanel_project5',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel_project5',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.PROJECT.GROUPPANEL.GROUPPANEL2',
                },
                caption: '分析',
                codeName: 'grouppanel_project4',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'grouppanel_project4',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.PROJECT.FORMPAGE.FORMPAGE1',
            },
            caption: '项目',
            codeName: 'formpage_project',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            defdgroupLogics: [
              {
                logicCat: 'PANELVISIBLE',
                relatedDetailNames: ['group_project_recurring_tasks'],
                groupOP: 'AND',
                defdlogics: [
                  {
                    condOP: 'EQ',
                    defdname: 'group_project_recurring_tasks',
                    value: 'group_project_recurring_tasks',
                    logicType: 'SINGLE',
                    id: 'group_project_recurring_tasks等于(=) group_project_recurring_tasks',
                  },
                ],
                logicType: 'GROUP',
              },
            ],
            id: 'formpage_project',
          },
          {
            layout: {
              columnCount: 24,
              layout: 'TABLE_24COL',
            },
            deformDetails: [
              {
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                deformDetails: [
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'group_mass_mailing_campaign',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'group_mass_mailing_campaign',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.GROUP_MASS_MAILING_CAMPAIGN',
                        },
                        caption: '邮件营销',
                        codeName: 'group_mass_mailing_campaign',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'group_mass_mailing_campaign',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'show_blacklist_buttons',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'show_blacklist_buttons',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.SHOW_BLACKLIST_BUTTONS',
                        },
                        caption: '退订时黑名单选项',
                        codeName: 'show_blacklist_buttons',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'show_blacklist_buttons',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'mass_mailing_outgoing_mail_server',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'mass_mailing_outgoing_mail_server',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MASS_MAILING_OUTGOING_MAIL_SERVER',
                        },
                        caption: '专门服务器',
                        codeName: 'mass_mailing_outgoing_mail_server',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'mass_mailing_outgoing_mail_server',
                      },
                    ],
                    codeName: 'email_marketing',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 6,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'email_marketing',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'mass_mailing_split_contact_name',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'mass_mailing_split_contact_name',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MASS_MAILING_SPLIT_CONTACT_NAME',
                        },
                        caption: '拆分名字和姓氏',
                        codeName: 'mass_mailing_split_contact_name',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'mass_mailing_split_contact_name',
                      },
                      {
                        dataType: 9,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'mass_mailing_reports',
                        editor: {
                          editorType: 'CHECKBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'mass_mailing_reports',
                        },
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag:
                            'DEF.LNAME.RES_CONFIG_SETTINGS.MASS_MAILING_REPORTS',
                        },
                        caption: '24小时统计邮寄报告',
                        codeName: 'mass_mailing_reports',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'mass_mailing_reports',
                      },
                    ],
                    codeName: 'email_marketing2',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 16,
                      colLGOffset: 1,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'email_marketing2',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.RES_CONFIG_SETTINGS.EMAIL_MARKETING.GROUPPANEL.GROUP1',
                },
                caption: '邮件营销',
                codeName: 'group_email_marketing',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                showCaption: true,
                id: 'group_email_marketing',
              },
            ],
            capLanguageRes: {
              lanResTag:
                'CONTROL.DEFORM.RES_CONFIG_SETTINGS.EMAIL_MARKETING.FORMPAGE.FORMPAGE1',
            },
            caption: '邮件营销',
            codeName: 'formpage1',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            defdgroupLogics: [
              {
                logicCat: 'PANELVISIBLE',
                relatedDetailNames: ['group_mass_mailing_campaign'],
                groupOP: 'AND',
                defdlogics: [
                  {
                    condOP: 'EQ',
                    defdname: 'group_mass_mailing_campaign',
                    value: 'group_mass_mailing_campaign',
                    logicType: 'SINGLE',
                    id: 'group_mass_mailing_campaign等于(=) group_mass_mailing_campaign',
                  },
                ],
                logicType: 'GROUP',
              },
            ],
            id: 'formpage1',
          },
        ],
        layout: {
          columnCount: 24,
          layout: 'TABLE_24COL',
        },
        tabHeaderPos: 'TOP',
        autoLoad: true,
        showBusyIndicator: true,
        codeName: 'general_setting',
        controlType: 'FORM',
        logicName: '一般设置',
        appDataEntityId: 'ibizodooapp.res_config_settings',
        controlParam: {
          ctrlParams: {
            EDITMODE: 'hover',
          },
          id: 'form',
        },
        modelId: 'd8314f0342b9cc9ea88b89b2c97ab3dc',
        modelType: 'PSDEFORM_EDITFORM',
        name: 'form',
        id: 'ibizodooapp.res_config_settings.general_setting',
      },
      {
        codeName: 'modify_setting_datainfobar',
        controlType: 'DATAINFOBAR',
        appDataEntityId: 'ibizodooapp.res_config_settings',
        controlParam: {
          id: 'datainfobar',
        },
        name: 'datainfobar',
        id: 'modify_setting_datainfobar',
      },
      {
        capLanguageRes: {
          lanResTag: 'DE.LNAME.RES_CONFIG_SETTINGS',
        },
        caption: '配置设定',
        codeName: 'modify_setting_captionbar',
        controlType: 'CAPTIONBAR',
        appDataEntityId: 'ibizodooapp.res_config_settings',
        controlParam: {},
        name: 'captionbar',
        id: 'modify_setting_captionbar',
      },
    ],
    codeName: 'auto21446057',
    controlType: 'VIEWLAYOUTPANEL',
    logicName: 'ModifySetting编辑视图布局面板',
    appDataEntityId: 'ibizodooapp.res_config_settings',
    controlParam: {},
    modelId: 'dab261f86814b8aae65451b7e89fb144',
    modelType: 'PSSYSVIEWLAYOUTPANEL',
    name: 'layoutpanel',
    id: 'auto21446057',
  },
  title: '配置设定编辑视图',
  titleLanguageRes: {
    lanResTag: 'PAGE.TITLE.RES_CONFIG_SETTINGS.MODIFY_SETTING',
  },
  viewStyle: 'DEFAULT',
  viewType: 'DEEDITVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: '50292a0dafc8bc5390afd3de8cc225c2',
  modelType: 'PSAPPDEVIEW',
  name: 'res_config_settingsmodify_setting',
  id: 'ibizodooapp.res_config_settings_modify_setting',
};
