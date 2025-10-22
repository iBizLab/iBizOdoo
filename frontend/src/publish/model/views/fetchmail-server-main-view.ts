export default {
  enableDirtyChecking: true,
  showDataInfoBar: true,
  xdataControlName: 'form',
  loadDefault: true,
  deviewCodeName: 'main_view',
  deviewId: 'f18efdb8ae603d69b2835b58e6a5be6b',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'DE.LNAME.FETCHMAIL_SERVER',
  },
  caption: '收件服务器',
  codeName: 'fetchmail_server_main_view',
  appDataEntityId: 'ibizodooapp.fetchmail_server',
  viewLayoutPanel: {
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
                    caption: '工具栏',
                    itemStyle: 'DEFAULT',
                    itemType: 'CTRLPOS',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                    },
                    showCaption: true,
                    id: 'toolbar1',
                  },
                ],
                layout: {
                  align: 'center',
                  dir: 'row',
                  layout: 'FLEX',
                  valign: 'center',
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
                    sysPFPluginId: 'identifier_title',
                    showCaption: true,
                    userTag: 'name',
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
                  dir: 'row',
                  layout: 'FLEX',
                  valign: 'center',
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
                id: 'view_toolbar2',
              },
            ],
            layout: {
              dir: 'row',
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
            caption: '关系数据栏',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              grow: 1,
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'drbar',
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
        rawItem: {
          rawItemParams: [
            {
              key: 'POSITION',
              value: 'TOP',
            },
          ],
          predefinedType: 'VIEWMSG_POS',
          id: 'viewmsg_pos',
        },
        caption: '视图消息占位',
        itemStyle: 'DEFAULT',
        itemType: 'RAWITEM',
        layoutPos: {
          shrink: 0,
          layout: 'FLEX',
        },
        showCaption: true,
        id: 'viewmsg_pos',
      },
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
                    caption: '表单',
                    itemStyle: 'DEFAULT',
                    itemType: 'CTRLPOS',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    showCaption: true,
                    id: 'form',
                  },
                ],
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                dataRegionType: 'INHERIT',
                caption: '面板容器',
                itemStyle: 'DEFAULT',
                itemType: 'CONTAINER',
                layoutPos: {
                  grow: 8,
                  shrink: 1,
                  layout: 'SIMPLEFLEX',
                },
                id: 'container3',
              },
              {
                actionGroupExtractMode: 'ITEM',
                layout: {
                  columnCount: 24,
                  layout: 'TABLE_24COL',
                },
                dataRegionType: 'INHERIT',
                caption: '面板容器',
                itemStyle: 'DEFAULT',
                itemType: 'CONTAINER',
                layoutPos: {
                  grow: 4,
                  shrink: 1,
                  layout: 'SIMPLEFLEX',
                },
                id: 'container4',
              },
            ],
            predefinedType: 'CONTAINER_GRID',
            layout: {
              layout: 'SIMPLEFLEX',
            },
            dataRegionType: 'INHERIT',
            caption: '栅格容器',
            itemStyle: 'DEFAULT',
            itemType: 'CONTAINER',
            layoutPos: {
              shrink: 1,
              layout: 'FLEX',
            },
            id: 'container_grid',
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
            detoolbarItems: [
              {
                actionLevel: 100,
                groupExtractMode: 'ITEM',
                uiactionGroup: {
                  uiactionGroupDetails: [
                    {
                      actionLevel: 100,
                      afterItemType: 'NONE',
                      beforeItemType: 'NONE',
                      buttonStyle: 'DEFAULT',
                      capLanguageRes: {
                        lanResTag: 'TBB.TEXT.EDITVIEW.REMOVEANDCLOSE',
                      },
                      caption: '删除并关闭',
                      detailType: 'DEUIACTION',
                      uiactionId: 'editview_removeandexitaction',
                      tooltipLanguageRes: {
                        lanResTag: 'TBB.TOOLTIP.EDITVIEW.REMOVEANDCLOSE',
                      },
                      showCaption: true,
                      showIcon: true,
                      sysImage: {
                        cssClass: 'fa fa-remove',
                        glyph: 'xf00d@FontAwesome',
                      },
                      id: 'u3e46fa4',
                    },
                  ],
                  name: '通用编辑页面删除界面行为组',
                  id: 'auto94538916',
                },
                valid: true,
                itemType: 'ITEMS',
                showCaption: true,
                showIcon: true,
                id: 'deuiaction2',
              },
            ],
            valid: true,
            caption: '更多',
            itemType: 'ITEMS',
            sysImage: {
              cssClass: 'fa fa-cog',
              glyph: 'xf013@FontAwesome',
            },
            tooltip: '更多',
            showIcon: true,
            id: 'items1',
          },
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
            controlLogics: [
              {
                itemName: 'toolbar_save',
                logicTag: 'toolbar',
                logicType: 'SCRIPT',
                scriptCode:
                  'data.id == null || view.getController("form").state.modified || ibiz.uiDomainManager.get(view.context.srfsessionid).dataModification',
                triggerType: 'ITEMVISIBLE',
                id: 'logic',
              },
            ],
            sysImage: {
              cssClass: 'fa fa-cloud-upload',
              glyph: 'xf0ee@FontAwesome',
            },
            tooltip: '保存',
            tooltipLanguageRes: {
              lanResTag: 'TBB.TOOLTIP.*.SAVE',
            },
            showIcon: true,
            id: 'toolbar_save',
          },
          {
            actionLevel: 100,
            noPrivDisplayMode: 2,
            uiactionId: 'data_cancelchanges',
            valid: true,
            caption: '取消变更',
            itemType: 'DEUIACTION',
            controlLogics: [
              {
                itemName: 'toolbar_cancel',
                logicTag: 'toolbar',
                logicType: 'SCRIPT',
                scriptCode:
                  'data.id == null || view.getController("form").state.modified || ibiz.uiDomainManager.get(view.context.srfsessionid).dataModification',
                triggerType: 'ITEMVISIBLE',
                id: 'logic2',
              },
            ],
            sysImage: {
              cssClass: 'fa fa-times',
              glyph: 'xf00d@FontAwesome',
            },
            tooltip: '取消变更',
            showIcon: true,
            id: 'toolbar_cancel',
          },
        ],
        xdataControlName: 'form',
        codeName: 'main_view_toolbar',
        controlType: 'TOOLBAR',
        logicName: '工具栏模板（默认主视图）',
        appDataEntityId: 'ibizodooapp.fetchmail_server',
        controlParam: {
          id: 'toolbar',
        },
        modelId: '8f5624914fcfc7bbc63de650a6b2aa59',
        modelType: 'PSDETOOLBAR',
        name: 'toolbar',
        id: 'main_view_toolbar',
      },
      {
        createControlAction: {
          appDEMethodId: 'create',
          appDataEntityId: 'ibizodooapp.fetchmail_server',
          id: 'create',
        },
        getDraftFromControlAction: {
          appDataEntityId: 'ibizodooapp.fetchmail_server',
          id: 'loaddraftfrom',
        },
        getDraftControlAction: {
          appDEMethodId: 'get_draft',
          appDataEntityId: 'ibizodooapp.fetchmail_server',
          id: 'loaddraft',
        },
        getControlAction: {
          appDEMethodId: 'get',
          appDataEntityId: 'ibizodooapp.fetchmail_server',
          id: 'load',
        },
        removeControlAction: {
          appDEMethodId: 'remove',
          appDataEntityId: 'ibizodooapp.fetchmail_server',
          id: 'remove',
        },
        updateControlAction: {
          appDEMethodId: 'update',
          appDataEntityId: 'ibizodooapp.fetchmail_server',
          id: 'update',
        },
        deformItemUpdates: [
          {
            codeName: 'change_port',
            defiupdateDetails: [
              {
                id: 'port',
              },
            ],
            scriptCode:
              'if(data.server_type === "imap"){\r\n   data.port = "143";\r\n   if(data.is_ssl === 1){\r\n      data.port = "993";\r\n   }\r\n}\r\n\r\nif(data.server_type === "pop"){\r\n   data.port = "110";\r\n   if(data.is_ssl === 1){\r\n      data.port = "995";\r\n   }\r\n}',
            customCode: true,
            showBusyIndicator: true,
            id: 'change_port',
          },
        ],
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
                      align: 'space-between',
                      dir: 'row',
                      layout: 'FLEX',
                    },
                    deformDetails: [
                      {
                        layout: {
                          dir: 'row',
                          layout: 'FLEX',
                        },
                        deformDetails: [
                          {
                            actionType: 'UIACTION',
                            buttonStyle: 'DEFAULT',
                            uiactionId: 'button_confirm_login@fetchmail_server',
                            tooltip: '测试和确认',
                            uiactionTarget: 'SINGLEKEY',
                            caption: '测试和确认',
                            codeName: 'button2',
                            detailStyle: 'DEFAULT',
                            detailType: 'BUTTON',
                            defdgroupLogics: [
                              {
                                logicCat: 'PANELVISIBLE',
                                relatedDetailNames: ['state'],
                                groupOP: 'AND',
                                defdlogics: [
                                  {
                                    condOP: 'EQ',
                                    defdname: 'state',
                                    value: 'draft',
                                    logicType: 'SINGLE',
                                    id: 'state等于(=) draft',
                                  },
                                ],
                                logicType: 'GROUP',
                              },
                            ],
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            showCaption: true,
                            id: 'button2',
                          },
                          {
                            actionType: 'UIACTION',
                            buttonStyle: 'DEFAULT',
                            uiactionId: 'fetch_mail@fetchmail_server',
                            tooltip: '现在收取',
                            uiactionTarget: 'SINGLEDATA',
                            caption: '现在收取',
                            codeName: 'button3',
                            detailStyle: 'DEFAULT',
                            detailType: 'BUTTON',
                            defdgroupLogics: [
                              {
                                logicCat: 'PANELVISIBLE',
                                relatedDetailNames: ['state'],
                                groupOP: 'AND',
                                defdlogics: [
                                  {
                                    condOP: 'EQ',
                                    defdname: 'state',
                                    value: 'done',
                                    logicType: 'SINGLE',
                                    id: 'state等于(=) done',
                                  },
                                ],
                                logicType: 'GROUP',
                              },
                            ],
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            showCaption: true,
                            id: 'button3',
                          },
                          {
                            actionType: 'UIACTION',
                            buttonStyle: 'DEFAULT',
                            uiactionId: 'set_draft@fetchmail_server',
                            tooltip: '重置确认',
                            uiactionTarget: 'SINGLEDATA',
                            caption: '重置确认',
                            codeName: 'button4',
                            detailStyle: 'DEFAULT',
                            detailType: 'BUTTON',
                            defdgroupLogics: [
                              {
                                logicCat: 'PANELVISIBLE',
                                relatedDetailNames: ['state'],
                                groupOP: 'AND',
                                defdlogics: [
                                  {
                                    condOP: 'EQ',
                                    defdname: 'state',
                                    value: 'done',
                                    logicType: 'SINGLE',
                                    id: 'state等于(=) done',
                                  },
                                ],
                                logicType: 'GROUP',
                              },
                            ],
                            layoutPos: {
                              shrink: 1,
                              layout: 'FLEX',
                            },
                            showCaption: true,
                            id: 'button4',
                          },
                        ],
                        codeName: 'grouppanel10',
                        detailStyle: 'DEFAULT',
                        detailType: 'GROUPPANEL',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                        },
                        id: 'grouppanel10',
                      },
                      {
                        createDV: 'draft',
                        dataType: 25,
                        labelPos: 'NONE',
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'state',
                        editor: {
                          singleSelect: true,
                          appCodeListId:
                            'ibizodooapp.mail__fetchmail_server_state',
                          editorParams: {
                            duration_tracking: 'duration_tracking',
                          },
                          editorStyle: 'STATUS_BAR',
                          editorType: 'DROPDOWNLIST',
                          sysPFPluginId: 'odoo_status_bar',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'state',
                        },
                        allowEmpty: true,
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag: 'DEF.LNAME.FETCHMAIL_SERVER.STATE',
                        },
                        caption: '状态',
                        codeName: 'state',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          shrink: 1,
                          layout: 'FLEX',
                        },
                        id: 'state',
                      },
                    ],
                    codeName: 'grouppanel9',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel9',
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
                        appDEFieldId: 'name',
                        editor: {
                          maxLength: 200,
                          editorType: 'TEXTBOX',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'name',
                        },
                        capLanguageRes: {
                          lanResTag: 'DEF.LNAME.FETCHMAIL_SERVER.NAME',
                        },
                        caption: '名称',
                        codeName: 'name',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        showCaption: true,
                        id: 'name',
                      },
                      {
                        dataType: 25,
                        enableCond: 3,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'server_type',
                        deformItemUpdateId: 'change_port',
                        editor: {
                          appCodeListId:
                            'ibizodooapp.mail__fetchmail_server_server_type',
                          editorType: 'RADIOBUTTONLIST',
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'server_type',
                        },
                        needCodeListConfig: true,
                        capLanguageRes: {
                          lanResTag: 'DEF.LNAME.FETCHMAIL_SERVER.SERVER_TYPE',
                        },
                        caption: '服务器类型',
                        codeName: 'server_type',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        defdgroupLogics: [
                          {
                            logicCat: 'ITEMENABLE',
                            relatedDetailNames: ['state'],
                            groupOP: 'AND',
                            defdlogics: [
                              {
                                condOP: 'EQ',
                                defdname: 'state',
                                value: 'draft',
                                logicType: 'SINGLE',
                                id: 'state等于(=) draft',
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
                        id: 'server_type',
                      },
                    ],
                    codeName: 'grouppanel8',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 12,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel8',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        dataType: 5,
                        enableCond: 3,
                        itemWidth: 290,
                        labelPos: 'LEFT',
                        labelWidth: 130,
                        noPrivDisplayMode: 1,
                        appDEFieldId: 'date',
                        editor: {
                          dateTimeFormat: 'YYYY-MM-DD HH:mm:ss',
                          editorParams: {
                            TIMEFMT: 'YYYY-MM-DD HH:mm:ss',
                          },
                          editorType: 'DATEPICKER',
                          editorWidth: 160,
                          valueType: 'SIMPLE',
                          editable: true,
                          id: 'date',
                        },
                        valueFormat: 'YYYY-MM-DD HH:mm:ss',
                        allowEmpty: true,
                        capLanguageRes: {
                          lanResTag: 'DEF.LNAME.FETCHMAIL_SERVER.DATE',
                        },
                        caption: '最后收取日期',
                        codeName: 'date',
                        detailStyle: 'DEFAULT',
                        detailType: 'FORMITEM',
                        defdgroupLogics: [
                          {
                            logicCat: 'PANELVISIBLE',
                            relatedDetailNames: ['date'],
                            groupOP: 'AND',
                            defdlogics: [
                              {
                                condOP: 'ISNOTNULL',
                                defdname: 'date',
                                logicType: 'SINGLE',
                                name: 'date值不为空(NotNil)',
                                id: 'date值不为空(notnil)',
                              },
                            ],
                            logicType: 'GROUP',
                          },
                          {
                            logicCat: 'ITEMENABLE',
                            relatedDetailNames: ['state'],
                            groupOP: 'AND',
                            defdlogics: [
                              {
                                condOP: 'EQ',
                                defdname: 'state',
                                value: 'draft',
                                logicType: 'SINGLE',
                                id: 'state等于(=) draft',
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
                        id: 'date',
                      },
                      {
                        rawItem: {
                          content:
                            '<p>使用一个本地脚本来获取您的电子邮件并创建新的记录。</p>',
                          contentType: 'HTML',
                          id: 'rawitem3',
                        },
                        codeName: 'rawitem3',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        defdgroupLogics: [
                          {
                            logicCat: 'PANELVISIBLE',
                            relatedDetailNames: ['server_type'],
                            groupOP: 'AND',
                            defdlogics: [
                              {
                                condOP: 'EQ',
                                defdname: 'server_type',
                                value: 'local',
                                logicType: 'SINGLE',
                                id: 'server_type等于(=) local',
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
                        id: 'rawitem3',
                      },
                      {
                        rawItem: {
                          content:
                            '<p>用OAuth 身份验证过程连接您的Gmail账户。</p><p>您将被重定向到Gmail登录页面，在那里您需要接受该权限。</p>',
                          contentType: 'HTML',
                          id: 'rawitem2',
                        },
                        codeName: 'rawitem2',
                        detailStyle: 'DEFAULT',
                        detailType: 'RAWITEM',
                        defdgroupLogics: [
                          {
                            logicCat: 'PANELVISIBLE',
                            relatedDetailNames: ['server_type'],
                            groupOP: 'AND',
                            defdlogics: [
                              {
                                condOP: 'EQ',
                                defdname: 'server_type',
                                value: 'gmail',
                                logicType: 'SINGLE',
                                id: 'server_type等于(=) gmail',
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
                        id: 'rawitem2',
                      },
                    ],
                    codeName: 'grouppanel6',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colLG: 12,
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel6',
                  },
                  {
                    layout: {
                      columnCount: 24,
                      layout: 'TABLE_24COL',
                    },
                    deformDetails: [
                      {
                        deformTabPages: [
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
                                    appDEFieldId: 'server',
                                    editor: {
                                      maxLength: 250,
                                      editorType: 'TEXTBOX',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'server',
                                    },
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.SERVER',
                                    },
                                    caption: '服务器名称',
                                    codeName: 'server',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    defdgroupLogics: [
                                      {
                                        logicCat: 'ITEMENABLE',
                                        relatedDetailNames: ['state'],
                                        groupOP: 'AND',
                                        defdlogics: [
                                          {
                                            condOP: 'EQ',
                                            defdname: 'state',
                                            value: 'draft',
                                            logicType: 'SINGLE',
                                            id: 'state等于(=) draft',
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
                                    id: 'server',
                                  },
                                  {
                                    dataType: 9,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'port',
                                    editor: {
                                      editorType: 'TEXTBOX',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'port',
                                    },
                                    allowEmpty: true,
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.PORT',
                                    },
                                    caption: '端口',
                                    codeName: 'port',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    defdgroupLogics: [
                                      {
                                        logicCat: 'ITEMENABLE',
                                        relatedDetailNames: ['state'],
                                        groupOP: 'AND',
                                        defdlogics: [
                                          {
                                            condOP: 'EQ',
                                            defdname: 'state',
                                            value: 'draft',
                                            logicType: 'SINGLE',
                                            id: 'state等于(=) draft',
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
                                    id: 'port',
                                  },
                                  {
                                    dataType: 9,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'is_ssl',
                                    deformItemUpdateId: 'change_port',
                                    editor: {
                                      editorType: 'CHECKBOX',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'is_ssl',
                                    },
                                    allowEmpty: true,
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.IS_SSL',
                                    },
                                    caption: 'SSL/TLS',
                                    codeName: 'is_ssl',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    layoutPos: {
                                      colMD: 24,
                                      layout: 'TABLE_24COL',
                                    },
                                    showCaption: true,
                                    id: 'is_ssl',
                                  },
                                ],
                                caption: '服务器信息',
                                codeName: 'grouppanel2',
                                detailStyle: 'DEFAULT',
                                detailType: 'GROUPPANEL',
                                defdgroupLogics: [
                                  {
                                    logicCat: 'PANELVISIBLE',
                                    relatedDetailNames: ['server_type'],
                                    groupOP: 'AND',
                                    defdlogics: [
                                      {
                                        condOP: 'NOTEQ',
                                        defdname: 'server_type',
                                        value: 'local',
                                        logicType: 'SINGLE',
                                        id: 'server_type不等于(<>) local',
                                      },
                                    ],
                                    logicType: 'GROUP',
                                  },
                                ],
                                layoutPos: {
                                  colLG: 12,
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
                                    dataType: 25,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'user',
                                    editor: {
                                      maxLength: 250,
                                      editorType: 'TEXTBOX',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'user',
                                    },
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.USER',
                                    },
                                    caption: '用户名',
                                    codeName: 'user',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    defdgroupLogics: [
                                      {
                                        logicCat: 'ITEMENABLE',
                                        relatedDetailNames: ['state'],
                                        groupOP: 'AND',
                                        defdlogics: [
                                          {
                                            condOP: 'EQ',
                                            defdname: 'state',
                                            value: 'draft',
                                            logicType: 'SINGLE',
                                            id: 'state等于(=) draft',
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
                                    id: 'user',
                                  },
                                  {
                                    dataType: 25,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'password',
                                    editor: {
                                      maxLength: 250,
                                      editorType: 'PASSWORD',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'password',
                                    },
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.PASSWORD',
                                    },
                                    caption: '密码',
                                    codeName: 'password',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    defdgroupLogics: [
                                      {
                                        logicCat: 'PANELVISIBLE',
                                        relatedDetailNames: ['server_type'],
                                        groupOP: 'AND',
                                        defdlogics: [
                                          {
                                            groupOP: 'OR',
                                            defdlogics: [
                                              {
                                                condOP: 'EQ',
                                                defdname: 'server_type',
                                                value: 'pop',
                                                logicType: 'SINGLE',
                                                id: 'server_type等于(=) pop',
                                              },
                                              {
                                                condOP: 'EQ',
                                                defdname: 'server_type',
                                                value: 'imap',
                                                logicType: 'SINGLE',
                                                id: 'server_type等于(=) imap',
                                              },
                                            ],
                                            logicType: 'GROUP',
                                            name: 'OR',
                                            id: 'or',
                                          },
                                        ],
                                        logicType: 'GROUP',
                                      },
                                      {
                                        logicCat: 'ITEMENABLE',
                                        relatedDetailNames: ['state'],
                                        groupOP: 'AND',
                                        defdlogics: [
                                          {
                                            condOP: 'EQ',
                                            defdname: 'state',
                                            value: 'draft',
                                            logicType: 'SINGLE',
                                            id: 'state等于(=) draft',
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
                                    id: 'password',
                                  },
                                  {
                                    actionType: 'UIACTION',
                                    buttonStyle: 'DEFAULT',
                                    uiactionId:
                                      'open_settings_view@res_config_settings',
                                    tooltip:
                                      '在一般设置中设置您的Gmail API凭证，以链接Gmail账户',
                                    uiactionTarget: 'NONE',
                                    caption:
                                      '在一般设置中设置您的Gmail API凭证，以链接Gmail账户',
                                    codeName: 'button1',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'BUTTON',
                                    defdgroupLogics: [
                                      {
                                        logicCat: 'PANELVISIBLE',
                                        relatedDetailNames: ['server_type'],
                                        groupOP: 'AND',
                                        defdlogics: [
                                          {
                                            condOP: 'EQ',
                                            defdname: 'server_type',
                                            value: 'gmail',
                                            logicType: 'SINGLE',
                                            id: 'server_type等于(=) gmail',
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
                                    id: 'button1',
                                  },
                                ],
                                caption: '登录信息',
                                codeName: 'grouppanel4',
                                detailStyle: 'DEFAULT',
                                detailType: 'GROUPPANEL',
                                defdgroupLogics: [
                                  {
                                    logicCat: 'PANELVISIBLE',
                                    relatedDetailNames: ['server_type'],
                                    groupOP: 'AND',
                                    defdlogics: [
                                      {
                                        condOP: 'NOTEQ',
                                        defdname: 'server_type',
                                        value: 'local',
                                        logicType: 'SINGLE',
                                        id: 'server_type不等于(<>) local',
                                      },
                                    ],
                                    logicType: 'GROUP',
                                  },
                                ],
                                layoutPos: {
                                  colLG: 12,
                                  colMD: 24,
                                  layout: 'TABLE_24COL',
                                },
                                showCaption: true,
                                id: 'grouppanel4',
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
                                    appDEFieldId: 'object_id',
                                    editor: {
                                      singleSelect: true,
                                      appCodeListId:
                                        'ibizodooapp.base__ir_model',
                                      editorType: 'DROPDOWNLIST',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'object_id',
                                    },
                                    allowEmpty: true,
                                    needCodeListConfig: true,
                                    caption: '创建新记录',
                                    codeName: 'object_id',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    layoutPos: {
                                      colMD: 24,
                                      layout: 'TABLE_24COL',
                                    },
                                    showCaption: true,
                                    id: 'object_id',
                                  },
                                ],
                                caption: '在传入邮件上执行的操作',
                                codeName: 'grouppanel3',
                                detailStyle: 'DEFAULT',
                                detailType: 'GROUPPANEL',
                                layoutPos: {
                                  colLG: 12,
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
                                    dataType: 21,
                                    enableCond: 3,
                                    itemHeight: 80,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'configuration',
                                    editor: {
                                      maxLength: 1048576,
                                      showMaxLength: true,
                                      editorHeight: 80,
                                      editorParams: {
                                        HEIGHT: '200',
                                      },
                                      editorType: 'TEXTAREA_10',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'configuration',
                                    },
                                    allowEmpty: true,
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.CONFIGURATION',
                                    },
                                    caption: '配置',
                                    codeName: 'configuration',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    layoutPos: {
                                      colMD: 24,
                                      layout: 'TABLE_24COL',
                                    },
                                    showCaption: true,
                                    id: 'configuration',
                                  },
                                  {
                                    dataType: 25,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'script',
                                    editor: {
                                      maxLength: 250,
                                      editorType: 'TEXTBOX',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'script',
                                    },
                                    allowEmpty: true,
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.SCRIPT',
                                    },
                                    caption: '脚本',
                                    codeName: 'script',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    layoutPos: {
                                      colMD: 24,
                                      layout: 'TABLE_24COL',
                                    },
                                    showCaption: true,
                                    id: 'script',
                                  },
                                ],
                                caption: '配置',
                                codeName: 'grouppanel7',
                                detailStyle: 'DEFAULT',
                                detailType: 'GROUPPANEL',
                                defdgroupLogics: [
                                  {
                                    logicCat: 'PANELVISIBLE',
                                    relatedDetailNames: ['server_type'],
                                    groupOP: 'AND',
                                    defdlogics: [
                                      {
                                        condOP: 'EQ',
                                        defdname: 'server_type',
                                        value: 'local',
                                        logicType: 'SINGLE',
                                        id: 'server_type等于(=) local',
                                      },
                                    ],
                                    logicType: 'GROUP',
                                  },
                                ],
                                layoutPos: {
                                  colLG: 12,
                                  colMD: 24,
                                  layout: 'TABLE_24COL',
                                },
                                showCaption: true,
                                id: 'grouppanel7',
                              },
                            ],
                            caption: '服务器和登录',
                            codeName: 'tabpage2',
                            detailStyle: 'DEFAULT',
                            detailType: 'TABPAGE',
                            showCaption: true,
                            id: 'tabpage2',
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
                                    appDEFieldId: 'priority',
                                    editor: {
                                      editorType: 'NUMBER',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'priority',
                                    },
                                    allowEmpty: true,
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.PRIORITY',
                                    },
                                    caption: '服务器优先级',
                                    codeName: 'priority',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    defdgroupLogics: [
                                      {
                                        logicCat: 'ITEMENABLE',
                                        relatedDetailNames: ['state'],
                                        groupOP: 'AND',
                                        defdlogics: [
                                          {
                                            condOP: 'EQ',
                                            defdname: 'state',
                                            value: 'draft',
                                            logicType: 'SINGLE',
                                            id: 'state等于(=) draft',
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
                                    id: 'priority',
                                  },
                                  {
                                    dataType: 9,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'attach',
                                    editor: {
                                      editorType: 'CHECKBOX',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'attach',
                                    },
                                    allowEmpty: true,
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.ATTACH',
                                    },
                                    caption: '保存附件',
                                    codeName: 'attach',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    layoutPos: {
                                      colMD: 24,
                                      layout: 'TABLE_24COL',
                                    },
                                    showCaption: true,
                                    id: 'attach',
                                  },
                                  {
                                    dataType: 9,
                                    enableCond: 3,
                                    labelPos: 'LEFT',
                                    labelWidth: 130,
                                    noPrivDisplayMode: 1,
                                    appDEFieldId: 'original',
                                    editor: {
                                      editorType: 'CHECKBOX',
                                      valueType: 'SIMPLE',
                                      editable: true,
                                      id: 'original',
                                    },
                                    allowEmpty: true,
                                    capLanguageRes: {
                                      lanResTag:
                                        'DEF.LNAME.FETCHMAIL_SERVER.ORIGINAL',
                                    },
                                    caption: '保留原件',
                                    codeName: 'original',
                                    detailStyle: 'DEFAULT',
                                    detailType: 'FORMITEM',
                                    layoutPos: {
                                      colMD: 24,
                                      layout: 'TABLE_24COL',
                                    },
                                    showCaption: true,
                                    id: 'original',
                                  },
                                ],
                                caption: '高级选项',
                                codeName: 'grouppanel5',
                                detailStyle: 'DEFAULT',
                                detailType: 'GROUPPANEL',
                                layoutPos: {
                                  colLG: 12,
                                  colMD: 24,
                                  layout: 'TABLE_24COL',
                                },
                                showCaption: true,
                                id: 'grouppanel5',
                              },
                            ],
                            caption: '高级',
                            codeName: 'tabpage1',
                            detailStyle: 'DEFAULT',
                            detailType: 'TABPAGE',
                            showCaption: true,
                            id: 'tabpage1',
                          },
                        ],
                        codeName: 'tabpanel1',
                        detailStyle: 'DEFAULT',
                        detailType: 'TABPANEL',
                        layoutPos: {
                          colMD: 24,
                          layout: 'TABLE_24COL',
                        },
                        id: 'tabpanel1',
                      },
                    ],
                    codeName: 'grouppanel1',
                    detailStyle: 'DEFAULT',
                    detailType: 'GROUPPANEL',
                    layoutPos: {
                      colMD: 24,
                      layout: 'TABLE_24COL',
                    },
                    id: 'grouppanel1',
                  },
                ],
                capLanguageRes: {
                  lanResTag:
                    'CONTROL.DEFORM.FETCHMAIL_SERVER.MAIN.GROUPPANEL.GROUP1',
                },
                caption: '收件服务器基本信息',
                codeName: 'group1',
                detailStyle: 'DEFAULT',
                detailType: 'GROUPPANEL',
                layoutPos: {
                  colMD: 24,
                  layout: 'TABLE_24COL',
                },
                id: 'group1',
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
                  lanResTag: 'DEF.LNAME.FETCHMAIL_SERVER.ID',
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
                'CONTROL.DEFORM.FETCHMAIL_SERVER.MAIN.FORMPAGE.FORMPAGE1',
            },
            caption: '基本信息',
            codeName: 'formpage1',
            detailStyle: 'DEFAULT',
            detailType: 'FORMPAGE',
            id: 'formpage1',
          },
        ],
        layout: {
          columnCount: 24,
          layout: 'TABLE_24COL',
        },
        tabHeaderPos: 'TOP',
        noTabHeader: true,
        autoLoad: true,
        showBusyIndicator: true,
        codeName: 'main',
        controlType: 'FORM',
        logicName: '主编辑表单',
        appDataEntityId: 'ibizodooapp.fetchmail_server',
        controlLogics: [
          {
            eventNames: 'onLoadDraftSuccess',
            logicTag: 'form',
            logicType: 'SCRIPT',
            scriptCode:
              'if(data[0].server_type === "imap"){\r\n   data[0].port = "143";\r\n   if(data[0].is_ssl === 1){\r\n      data[0].port = "993";\r\n   }\r\n}\r\n\r\nif(data[0].server_type === "pop"){\r\n   data[0].port = "110";\r\n   if(data[0].is_ssl === 1){\r\n      data[0].port = "995";\r\n   }\r\n}',
            triggerType: 'CTRLEVENT',
            id: 'fill_port',
          },
        ],
        controlParam: {
          ctrlParams: {
            EDITMODE: 'hover',
          },
          id: 'form',
        },
        modelId: '9dda2ac58ff88b43e0ab3f23a0836811',
        modelType: 'PSDEFORM_EDITFORM',
        name: 'form',
        id: 'ibizodooapp.fetchmail_server.main',
      },
      {
        detoolbarItems: [
          {
            actionLevel: 100,
            noPrivDisplayMode: 2,
            uiactionId: 'editview_saveandnewaction',
            valid: true,
            capLanguageRes: {
              lanResTag: 'TBB.TEXT.EDITVIEW.SAVEANDNEW',
            },
            caption: '新建',
            itemType: 'DEUIACTION',
            sysImage: {
              cssClass: 'fa fa-save',
              glyph: 'xf0c7@FontAwesome',
            },
            tooltip: '新建',
            tooltipLanguageRes: {
              lanResTag: 'TBB.TOOLTIP.EDITVIEW.SAVEANDNEW',
            },
            showCaption: true,
            id: 'deuiaction2',
          },
        ],
        xdataControlName: 'form',
        codeName: 'main_view_toolbar1',
        controlType: 'TOOLBAR',
        logicName: '工具栏模板（嵌入编辑表单，只有一个新建按钮）',
        appDataEntityId: 'ibizodooapp.fetchmail_server',
        controlParam: {
          id: 'toolbar1',
        },
        modelId: '6a271f6ceebaa5b850a3e67f7ec201b2',
        modelType: 'PSDETOOLBAR',
        name: 'toolbar1',
        id: 'main_view_toolbar1',
      },
      {
        codeName: 'main_view_datainfobar',
        controlType: 'DATAINFOBAR',
        appDataEntityId: 'ibizodooapp.fetchmail_server',
        controlParam: {
          id: 'datainfobar',
        },
        name: 'datainfobar',
        id: 'main_view_datainfobar',
      },
      {
        capLanguageRes: {
          lanResTag: 'DE.LNAME.FETCHMAIL_SERVER',
        },
        caption: '收件服务器',
        codeName: 'main_view_captionbar',
        controlType: 'CAPTIONBAR',
        appDataEntityId: 'ibizodooapp.fetchmail_server',
        controlParam: {},
        name: 'captionbar',
        id: 'main_view_captionbar',
      },
    ],
    codeName: 'main_view_layout1',
    controlType: 'VIEWLAYOUTPANEL',
    logicName: '主视图布局面板_new_没有评论区',
    appDataEntityId: 'ibizodooapp.fetchmail_server',
    controlLogics: [
      {
        eventNames: 'onFormDataChange',
        itemName: 'FORM',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          'view.getController("toolbar")?.calcButtonState(data,view.model.appDataEntityId); ',
        triggerType: 'CTRLEVENT',
        id: 'logic',
      },
      {
        eventNames: 'onMounted',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          'ibiz.uiDomainManager.get(view.context.srfsessionid).evt.on("stateChange", async  (state, isTrusted )=> {\n    console.log("");\n    const data = view.getController("form").getData()[0];\n    view.getController("toolbar")?.calcButtonState(data,view.model.appDataEntityId);\n});\n\nconst topContext = view.context;\nconst appEntityId = view.model.appDataEntityId;\nconst entityName = appEntityId.split(\'.\').pop();\nconst bExist = topContext[entityName];\nconst drbar = view.getCtrl("DRBAR", "drbar");\nif(!bExist){\n    drbar.disabled({ mode: \'BLANK\' })\n    //  drbar.disabled({ mode: \'MASK\' })\n\n}\n\n',
        triggerType: 'CTRLEVENT',
        id: 'logic1',
      },
      {
        eventNames: 'onCreated',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "view.ctx.evt.on('onRegister', (name, ctrl) => {\n   if (name === 'drbar') {\n      const topContext = view.context;\n      const appEntityId = view.model.appDataEntityId;\n      const entityName = appEntityId.split('.').pop();\n      const bExist = topContext[entityName];\n      if(!bExist){\n         ctrl?.disableCounter()\n      }\n   }\n})",
        triggerType: 'CTRLEVENT',
        id: 'logic2',
      },
    ],
    controlParam: {},
    modelId: '3ea3e353274bcb7a2bf0fee66c7d91cf',
    modelType: 'PSSYSVIEWLAYOUTPANEL',
    name: 'layoutpanel',
    id: 'main_view_layout1',
  },
  title: '收件服务器',
  viewStyle: 'DEFAULT',
  viewType: 'DEEDITVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: 'b348f5b4023ab24b49ea084549a86d11',
  modelType: 'PSAPPDEVIEW',
  name: 'fetchmail_servermain_view',
  id: 'ibizodooapp.fetchmail_server_main_view',
};
