export default {
  mdctrlActiveMode: 1,
  loadDefault: true,
  deviewCodeName: 'multi_data_view',
  deviewId: '0b5c13d2e1a5ca58bd283b47b8f12115',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'DE.LNAME.IR_UNIRES',
  },
  caption: '统一资源',
  codeName: 'ir_unires_multi_data_view',
  appDataEntityId: 'ibizodooapp.ir_unires',
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
            caption: '搜索栏',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'searchbar',
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
                        rawItem: {
                          sysImage: {
                            cssClass: 'fa fa-columns',
                            glyph: 'xf0db@FontAwesome',
                          },
                          contentType: 'IMAGE',
                          dynaClass:
                            '{"ctrl-switch-active": data.active_ctrl ==="dataview" }',
                          sysCss: {
                            cssName: 'ctrl-switch',
                          },
                          predefinedType: 'STATIC_IMAGE',
                          id: 'dataview_toggle',
                        },
                        caption: '卡片',
                        itemStyle: 'DEFAULT',
                        itemType: 'RAWITEM',
                        controlLogics: [
                          {
                            itemName: 'dataview_toggle',
                            logicTag: 'layoutpanel',
                            logicType: 'SCRIPT',
                            scriptCode:
                              'view.layoutPanel.model.controls.find(ctrl=>ctrl.name === "dataview")?true:false',
                            triggerType: 'ITEMVISIBLE',
                            id: 'visable_card',
                          },
                        ],
                        layoutPos: {
                          shrink: 0,
                          layout: 'FLEX',
                        },
                        sysCss: {
                          cssName: 'ctrl-switch',
                        },
                        sysImage: {
                          cssClass: 'fa fa-columns',
                          glyph: 'xf0db@FontAwesome',
                        },
                        showCaption: true,
                        id: 'dataview_toggle',
                      },
                      {
                        rawItem: {
                          sysImage: {
                            cssClass: 'fa fa-reorder',
                            glyph: 'xf0c9@FontAwesome',
                          },
                          contentType: 'IMAGE',
                          dynaClass:
                            '{"ctrl-switch-active": data.active_ctrl ==="grid" }',
                          sysCss: {
                            cssName: 'ctrl-switch',
                          },
                          predefinedType: 'STATIC_IMAGE',
                          id: 'grid_toggle',
                        },
                        caption: '表格',
                        itemStyle: 'DEFAULT',
                        itemType: 'RAWITEM',
                        controlLogics: [
                          {
                            itemName: 'grid_toggle',
                            logicTag: 'layoutpanel',
                            logicType: 'SCRIPT',
                            scriptCode:
                              'view.layoutPanel.model.controls.find(ctrl=>ctrl.name === "grid")?true:false',
                            triggerType: 'ITEMVISIBLE',
                            id: 'visable_grid',
                          },
                        ],
                        layoutPos: {
                          shrink: 0,
                          layout: 'FLEX',
                        },
                        sysCss: {
                          cssName: 'ctrl-switch',
                        },
                        sysImage: {
                          cssClass: 'fa fa-reorder',
                          glyph: 'xf0c9@FontAwesome',
                        },
                        showCaption: true,
                        id: 'grid_toggle',
                      },
                      {
                        rawItem: {
                          sysImage: {
                            cssClass: 'fa fa-clock-o',
                            glyph: 'xf017@FontAwesome',
                          },
                          contentType: 'IMAGE',
                          dynaClass:
                            '{"ctrl-switch-active": data.active_ctrl ==="activity" }',
                          sysCss: {
                            cssName: 'ctrl-switch',
                          },
                          predefinedType: 'STATIC_IMAGE',
                          id: 'activity_toggle',
                        },
                        caption: '活动',
                        itemStyle: 'DEFAULT',
                        itemType: 'RAWITEM',
                        controlLogics: [
                          {
                            itemName: 'activity_toggle',
                            logicTag: 'layoutpanel',
                            logicType: 'SCRIPT',
                            scriptCode:
                              '\nview.layoutPanel.model.controls.find(ctrl=>ctrl.name === "activity")?true:false',
                            triggerType: 'ITEMVISIBLE',
                            id: 'visable_activity',
                          },
                        ],
                        layoutPos: {
                          shrink: 0,
                          layout: 'FLEX',
                        },
                        sysCss: {
                          cssName: 'ctrl-switch',
                        },
                        sysImage: {
                          cssClass: 'fa fa-clock-o',
                          glyph: 'xf017@FontAwesome',
                        },
                        showCaption: true,
                        id: 'activity_toggle',
                      },
                      {
                        rawItem: {
                          sysImage: {
                            cssClass: 'fa fa-table',
                            glyph: 'xf0ce@FontAwesome',
                          },
                          contentType: 'IMAGE',
                          dynaClass:
                            '{"ctrl-switch-active": data.active_ctrl ==="pivottable" }',
                          sysCss: {
                            cssName: 'ctrl-switch',
                          },
                          predefinedType: 'STATIC_IMAGE',
                          id: 'pivottable_toggle',
                        },
                        caption: '透视表',
                        itemStyle: 'DEFAULT',
                        itemType: 'RAWITEM',
                        controlLogics: [
                          {
                            itemName: 'pivottable_toggle',
                            logicTag: 'layoutpanel',
                            logicType: 'SCRIPT',
                            scriptCode:
                              'view.getCtrl("GRID", "pivottable")?true:false',
                            triggerType: 'ITEMVISIBLE',
                            id: 'pivottable_visable',
                          },
                        ],
                        layoutPos: {
                          shrink: 0,
                          layout: 'FLEX',
                        },
                        sysCss: {
                          cssName: 'ctrl-switch',
                        },
                        sysImage: {
                          cssClass: 'fa fa-table',
                          glyph: 'xf0ce@FontAwesome',
                        },
                        showCaption: true,
                        id: 'pivottable_toggle',
                      },
                      {
                        rawItem: {
                          sysImage: {
                            cssClass: 'fa fa-calendar',
                            glyph: 'xf073@FontAwesome',
                          },
                          contentType: 'IMAGE',
                          dynaClass:
                            '{"ctrl-switch-active": data.active_ctrl ==="calendar" }',
                          sysCss: {
                            cssName: 'ctrl-switch',
                          },
                          predefinedType: 'STATIC_IMAGE',
                          id: 'calendar_toggle',
                        },
                        caption: '日历',
                        itemStyle: 'DEFAULT',
                        itemType: 'RAWITEM',
                        controlLogics: [
                          {
                            itemName: 'calendar_toggle',
                            logicTag: 'layoutpanel',
                            logicType: 'SCRIPT',
                            scriptCode:
                              'view.layoutPanel.model.controls.find(ctrl=>ctrl.name === "calendar")?true:false',
                            triggerType: 'ITEMVISIBLE',
                            id: 'calendar_visable',
                          },
                        ],
                        layoutPos: {
                          shrink: 0,
                          layout: 'FLEX',
                        },
                        sysCss: {
                          cssName: 'ctrl-switch',
                        },
                        sysImage: {
                          cssClass: 'fa fa-calendar',
                          glyph: 'xf073@FontAwesome',
                        },
                        showCaption: true,
                        id: 'calendar_toggle',
                      },
                      {
                        rawItem: {
                          sysImage: {
                            cssClass: 'fa fa-area-chart',
                            glyph: 'xf1fe@FontAwesome',
                          },
                          contentType: 'IMAGE',
                          dynaClass:
                            '{"ctrl-switch-active": data.active_ctrl ==="chart" }',
                          sysCss: {
                            cssName: 'ctrl-switch',
                          },
                          predefinedType: 'STATIC_IMAGE',
                          id: 'chart_toggle',
                        },
                        caption: '图表',
                        itemStyle: 'DEFAULT',
                        itemType: 'RAWITEM',
                        controlLogics: [
                          {
                            itemName: 'chart_toggle',
                            logicTag: 'layoutpanel',
                            logicType: 'SCRIPT',
                            scriptCode:
                              'view.layoutPanel.model.controls.find(ctrl=>ctrl.name === "chart")?true:false',
                            triggerType: 'ITEMVISIBLE',
                            id: 'chart_visable',
                          },
                        ],
                        layoutPos: {
                          shrink: 0,
                          layout: 'FLEX',
                        },
                        sysCss: {
                          cssName: 'ctrl-switch',
                        },
                        sysImage: {
                          cssClass: 'fa fa-area-chart',
                          glyph: 'xf1fe@FontAwesome',
                        },
                        showCaption: true,
                        id: 'chart_toggle',
                      },
                      {
                        rawItem: {
                          sysImage: {
                            cssClass: 'fa fa-sitemap',
                            glyph: 'xf0e8@FontAwesome',
                          },
                          contentType: 'IMAGE',
                          dynaClass:
                            '{"ctrl-switch-active": data.active_ctrl ==="hierarchy" }',
                          sysCss: {
                            cssName: 'ctrl-switch',
                          },
                          predefinedType: 'STATIC_IMAGE',
                          tooltip: '层级',
                          id: 'hierarchy_toggle',
                        },
                        caption: '图表',
                        itemStyle: 'DEFAULT',
                        itemType: 'RAWITEM',
                        controlLogics: [
                          {
                            itemName: 'hierarchy_toggle',
                            logicTag: 'layoutpanel',
                            logicType: 'SCRIPT',
                            scriptCode:
                              'view.layoutPanel.model.controls.find(ctrl=>ctrl.name === "hierarchy")?true:false',
                            triggerType: 'ITEMVISIBLE',
                            id: 'hierarchy_visable',
                          },
                        ],
                        layoutPos: {
                          shrink: 0,
                          layout: 'FLEX',
                        },
                        sysCss: {
                          cssName: 'ctrl-switch',
                        },
                        sysImage: {
                          cssClass: 'fa fa-sitemap',
                          glyph: 'xf0e8@FontAwesome',
                        },
                        showCaption: true,
                        id: 'hierarchy_toggle',
                      },
                    ],
                    layout: {
                      align: 'flex-start',
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
                    id: 'switch_panel_container',
                  },
                  {
                    editor: {
                      editorType: 'HIDDEN',
                      predefinedType: 'FIELD_TEXT_DYNAMIC',
                      valueType: 'SIMPLE',
                      editable: true,
                      id: 'active_ctrl',
                    },
                    viewFieldName: 'active_ctrl',
                    allowEmpty: true,
                    hidden: true,
                    caption: '文本(动态)',
                    itemType: 'FIELD',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                    },
                    sysCss: {
                      cssName: 'ctrl-switch-active',
                    },
                    id: 'active_ctrl',
                  },
                  {
                    editor: {
                      editorType: 'HIDDEN',
                      predefinedType: 'FIELD_TEXT_DYNAMIC',
                      valueType: 'SIMPLE',
                      editable: true,
                      id: 'default_ctrl',
                    },
                    viewFieldName: 'default_ctrl',
                    allowEmpty: true,
                    hidden: true,
                    caption: '文本(动态)',
                    itemType: 'FIELD',
                    layoutPos: {
                      shrink: 1,
                      layout: 'FLEX',
                    },
                    id: 'default_ctrl',
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
                  layout: 'FLEX',
                  spacingLeft: 'INNERMEDIUM',
                  spacingRight: 'INNERMEDIUM',
                },
                id: 'switch_panel',
              },
            ],
            predefinedType: 'PANELPART',
            layout: {
              layout: 'FLEX',
            },
            dataRegionType: 'INHERIT',
            caption: '引用布局面板',
            itemStyle: 'DEFAULT',
            itemType: 'CONTAINER',
            layoutPos: {
              shrink: 0,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'panelpart',
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
            caption: '数据视图',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              grow: 1,
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'dataview',
          },
          {
            caption: '表格',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              grow: 1,
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'grid',
          },
          {
            caption: '活动',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              grow: 1,
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'activity',
          },
          {
            caption: '日历',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              grow: 1,
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'calendar',
          },
          {
            caption: '图表',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              grow: 1,
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'chart',
          },
          {
            caption: '层级',
            itemStyle: 'DEFAULT',
            itemType: 'CTRLPOS',
            layoutPos: {
              shrink: 1,
              layout: 'FLEX',
            },
            showCaption: true,
            id: 'hierarchy',
          },
        ],
        layout: {
          dir: 'column',
          layout: 'FLEX',
        },
        dataRegionType: 'INHERIT',
        caption: '容器',
        itemStyle: 'DEFAULT',
        itemType: 'CONTAINER',
        layoutPos: {
          grow: 1,
          shrink: 1,
          heightMode: 'FULL',
          layout: 'FLEX',
        },
        id: 'container',
      },
    ],
    layoutPanel: true,
    appViewLogics: [
      {
        logicTrigger: 'CUSTOM',
        logicType: 'APPUILOGIC',
        builtinAppUILogic: {
          actionAfterWizard: 'DEFAULT',
          newDataAppView: {
            refAppViewId: 'ibizodooapp.ir_unires_main_view',
          },
          appUILogicRefViews: [
            {
              refAppViewId: 'ibizodooapp.ir_unires_main_view',
            },
          ],
          builtinLogic: true,
          logicType: 'PREDEFINED',
          viewLogicType: 'APP_NEWDATA',
          id: '新建数据',
        },
        builtinLogic: true,
        id: 'newdata',
      },
      {
        logicTrigger: 'CUSTOM',
        logicType: 'APPUILOGIC',
        builtinAppUILogic: {
          openDataAppView: {
            refAppViewId: 'ibizodooapp.ir_unires_main_view',
          },
          editMode: true,
          appUILogicRefViews: [
            {
              refAppViewId: 'ibizodooapp.ir_unires_main_view',
            },
          ],
          builtinLogic: true,
          logicType: 'PREDEFINED',
          viewLogicType: 'APP_OPENDATA',
          id: '打开数据',
        },
        builtinLogic: true,
        id: 'opendata',
      },
    ],
    appViewRefs: [
      {
        realTitle: '统一资源',
        refAppViewId: 'ibizodooapp.ir_unires_main_view',
        name: 'NEWDATA',
        id: 'newdata',
      },
      {
        realTitle: '统一资源',
        refAppViewId: 'ibizodooapp.ir_unires_main_view',
        name: 'OPENDATA',
        id: 'opendata',
      },
      {
        realTitle: '统一资源',
        refAppViewId: 'ibizodooapp.ir_unires_main_view',
        name: 'EDITDATA',
        id: 'editdata',
      },
    ],
    controls: [
      {
        detoolbarItems: [
          {
            actionLevel: 100,
            noPrivDisplayMode: 2,
            uiactionId: 'gridview_newaction',
            valid: true,
            capLanguageRes: {
              lanResTag: 'TBB.TEXT.*.NEW',
            },
            caption: '新建',
            itemType: 'DEUIACTION',
            sysImage: {
              cssClass: 'fa fa-file-text-o',
              glyph: 'xf0f6@FontAwesome',
            },
            tooltip: '新建',
            tooltipLanguageRes: {
              lanResTag: 'TBB.TOOLTIP.*.NEW',
            },
            showCaption: true,
            showIcon: true,
            id: 'deuiaction1',
          },
        ],
        codeName: 'multi_data_view_toolbar',
        controlType: 'TOOLBAR',
        logicName: '工具栏模板（表格界面，只有一个新建按钮）',
        appDataEntityId: 'ibizodooapp.ir_unires',
        controlParam: {
          id: 'toolbar',
        },
        modelId: 'cd9eb7eb8c0facf6084ba1508d888eea',
        modelType: 'PSDETOOLBAR',
        name: 'toolbar',
        id: 'multi_data_view_toolbar',
      },
      {
        groupMode: 'AND',
        quickSearchMode: 1,
        enableQuickSearch: true,
        codeName: 'search_bar',
        controlStyle: 'ODOO_SEARCH_BAR',
        controlType: 'SEARCHBAR',
        logicName: '统一资源搜索栏',
        appDataEntityId: 'ibizodooapp.ir_unires',
        controlParam: {
          id: 'searchbar',
        },
        sysPFPluginId: 'odoo_search_bar',
        modelId: 'f8146b6b11549da9823aa69f948107cf',
        modelType: 'PSSYSSEARCHBAR',
        name: 'searchbar',
        id: 'ibizodooapp.ir_unires.search_bar',
      },
      {
        aggMode: 'NONE',
        columnEnableFilter: 2,
        columnEnableLink: 2,
        groupMode: 'NONE',
        groupStyle: 'DEFAULT',
        degridColumns: [
          {
            clconvertMode: 'NONE',
            dataItemName: 'name',
            excelCaption: '名称',
            appDEFieldId: 'name',
            valueType: 'SIMPLE',
            aggMode: 'NONE',
            align: 'LEFT',
            caption: '名称',
            codeName: 'name',
            columnType: 'DEFGRIDCOLUMN',
            noPrivDisplayMode: 1,
            width: 1,
            widthUnit: 'STAR',
            enableSort: true,
            id: 'name',
          },
          {
            clconvertMode: 'NONE',
            dataItemName: 'res_code',
            excelCaption: '资源代码',
            appDEFieldId: 'res_code',
            valueType: 'SIMPLE',
            aggMode: 'NONE',
            align: 'LEFT',
            caption: '资源代码',
            codeName: 'res_code',
            columnType: 'DEFGRIDCOLUMN',
            noPrivDisplayMode: 1,
            width: 500,
            widthUnit: 'PX',
            enableSort: true,
            id: 'res_code',
          },
          {
            clconvertMode: 'NONE',
            dataItemName: 'write_date',
            excelCaption: '更新时间',
            appDEFieldId: 'write_date',
            valueFormat: 'YYYY-MM-DD HH:mm:ss',
            valueType: 'SIMPLE',
            aggMode: 'NONE',
            align: 'LEFT',
            caption: '更新时间',
            codeName: 'write_date',
            columnType: 'DEFGRIDCOLUMN',
            noPrivDisplayMode: 1,
            width: 300,
            widthUnit: 'PX',
            enableSort: true,
            id: 'write_date',
          },
        ],
        degridDataItems: [
          {
            appDEFieldId: 'name',
            valueType: 'SIMPLE',
            dataType: 25,
            id: 'name',
          },
          {
            appDEFieldId: 'res_code',
            valueType: 'SIMPLE',
            dataType: 25,
            id: 'res_code',
          },
          {
            format: 'YYYY-MM-DD HH:mm:ss',
            appDEFieldId: 'write_date',
            valueType: 'SIMPLE',
            dataType: 5,
            id: 'write_date',
          },
          {
            appDEFieldId: 'id',
            valueType: 'SIMPLE',
            dataType: 25,
            id: 'srfkey',
          },
          {
            appDEFieldId: 'id',
            valueType: 'SIMPLE',
            dataType: 25,
            id: 'srfdataaccaction',
          },
          {
            appDEFieldId: 'name',
            valueType: 'SIMPLE',
            dataType: 25,
            id: 'srfmajortext',
          },
        ],
        degridEditItems: [
          {
            caption: '标识',
            codeName: 'srfkey',
            enableCond: 3,
            appDEFieldId: 'id',
            editor: {
              editorType: 'HIDDEN',
              valueType: 'SIMPLE',
              editable: true,
              id: 'srfkey',
            },
            allowEmpty: true,
            id: 'srfkey',
          },
        ],
        pagingMode: 1,
        pagingSize: 20,
        sortMode: 'REMOTE',
        enableCustomized: true,
        enablePagingBar: true,
        navViewPos: 'NONE',
        fetchControlAction: {
          appDEMethodId: 'fetchdefault',
          appDataEntityId: 'ibizodooapp.ir_unires',
          id: 'fetch',
        },
        removeControlAction: {
          appDEMethodId: 'remove',
          appDataEntityId: 'ibizodooapp.ir_unires',
          id: 'remove',
        },
        autoLoad: true,
        showBusyIndicator: true,
        codeName: 'main',
        controlType: 'GRID',
        logicName: '主表格',
        appDataEntityId: 'ibizodooapp.ir_unires',
        controlParam: {
          id: 'grid',
        },
        modelId: '059382a7d0f44b4a5f4d1bc992cd311f',
        modelType: 'PSDEGRID',
        name: 'grid',
        id: 'ibizodooapp.ir_unires.main',
      },
      {
        capLanguageRes: {
          lanResTag: 'DE.LNAME.IR_UNIRES',
        },
        caption: '统一资源',
        codeName: 'multi_data_view_captionbar',
        controlType: 'CAPTIONBAR',
        appDataEntityId: 'ibizodooapp.ir_unires',
        controlParam: {},
        name: 'captionbar',
        id: 'multi_data_view_captionbar',
      },
    ],
    codeName: 'mdcustomview',
    controlType: 'VIEWLAYOUTPANEL',
    logicName: '多数据视图布局面板',
    appDataEntityId: 'ibizodooapp.ir_unires',
    controlLogics: [
      {
        eventNames: 'onMounted',
        itemName: 'ACTIVITY',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取视图上下文\nconst appEntityId = view.model.appDataEntityId;\nconst srfmodelname = appEntityId.split('.').pop(); // 取点号后最后一段\n\nview.params.srfmodelname = srfmodelname;",
        triggerType: 'CTRLEVENT',
        id: 'init_activity_params',
      },
      {
        eventNames: 'onControlEvent',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "if (triggerEventName && triggerEventName === 'onActive' && triggerEvent.ctrl.name == view.state.xdatacontrolname) {\n    if(triggerEvent.ctrl.name!=\"activity\"){\n        view.call('Edit', { \n            context: view.context,\n            params: view.params,\n            data: triggerEvent.data,\n            view,\n            ctrl: triggerEvent.ctrl,\n        });\n    }\n   \n}",
        triggerType: 'CTRLEVENT',
        id: 'logic',
      },
      {
        eventNames: 'onClick',
        itemName: 'activity_toggle',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取部件并显示\nconst curctrl = \"activity\";\nconst activectrl = view.layoutPanel.findPanelItemByName(curctrl);\nif (activectrl) {\n  activectrl.state.visible = true;\n}\n//隐藏左侧过滤区\nconst view_exp_split = view.layoutPanel.findPanelItemByName('view_exp_split');\nif (view_exp_split) {\n  view_exp_split.hiddenPanel(\"left\");\n}\n// 定义需要隐藏的部件标识\nconst keepVisibleItems = ['dataview', 'grid','activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst index = keepVisibleItems.indexOf(curctrl);\nif (index !== -1) {\n  keepVisibleItems.splice(index, 1);\n}\n// 隐藏部件\nconst allItems = view.layoutPanel.panelItems;\nObject.keys(allItems).forEach(key => {\n  if (keepVisibleItems.includes(key)) {\n    allItems[key].state.visible = false;\n  }\n});\n\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nactivectrlname.setDataValue(curctrl);\n\nview.state.xdatacontrolname =curctrl;\n\n// 获取当前的路由对象\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\n\n// 创建一个新的 query 对象，保留现有查询参数，并添加新的参数\nconst newQuery = {\n  ...currentRoute.query, \n  srfnav: curctrl         \n};\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\nif(defaultctrlname.value == curctrl){\n  delete newQuery.srfnav;\n}\n// 使用 $router.push 更新 URL 并导航到相同的路径\nif(newQuery.srfnav != currentRoute.query.srfnav){\n  ibiz.appUtil.router.push({\n    path: currentRoute.path, \n    query: newQuery \n  });\n}\n\n// activity不显示分组筛选\nconst searchBar = view.getController('searchbar');\nif(searchBar){\n  if(searchBar.state.selectedGroup&&searchBar.state.selectedGroup.length>0){\n      viewSession.selectedGroup = [...searchBar.state.selectedGroup];\n      searchBar.state.selectedGroup=[];\n  }\n  searchBar.state.selectedGroup=[];\n  searchBar.state.showGroup=false; \n  searchBar.state.showCollect=true; \n}\n",
        triggerType: 'CTRLEVENT',
        id: 'activity_click',
      },
      {
        eventNames: 'onClick',
        itemName: 'calendar_toggle',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取部件并显示\nconst curctrl = \"calendar\";\nconst activectrl = view.layoutPanel.findPanelItemByName(curctrl);\nif (activectrl) {\n  activectrl.state.visible = true;\n}\n//隐藏左侧过滤区\nconst view_exp_split = view.layoutPanel.findPanelItemByName('view_exp_split');\nif (view_exp_split) {\n  view_exp_split.hiddenPanel(\"left\");\n}\n// 定义需要隐藏的部件标识\nconst keepVisibleItems = ['dataview', 'grid','activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst index = keepVisibleItems.indexOf(curctrl);\nif (index !== -1) {\n  keepVisibleItems.splice(index, 1);\n}\n// 隐藏部件\nconst allItems = view.layoutPanel.panelItems;\nObject.keys(allItems).forEach(key => {\n  if (keepVisibleItems.includes(key)) {\n    allItems[key].state.visible = false;\n  }\n});\n\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nactivectrlname.setDataValue(curctrl);\n\nview.state.xdatacontrolname =curctrl;\n\n// 获取当前的路由对象\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\n\n// 创建一个新的 query 对象，保留现有查询参数，并添加新的参数\nconst newQuery = {\n  ...currentRoute.query, \n  srfnav: curctrl         \n};\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\nif(defaultctrlname.value == curctrl){\n  delete newQuery.srfnav;\n}\n// 使用 $router.push 更新 URL 并导航到相同的路径\nif(newQuery.srfnav != currentRoute.query.srfnav){\n  ibiz.appUtil.router.push({\n    path: currentRoute.path, \n    query: newQuery \n  });\n}\n\n// calendar不显示分组筛选\nconst searchBar = view.getController('searchbar');\nif(searchBar){\n  if(searchBar.state.selectedGroup&&searchBar.state.selectedGroup.length>0){\n      viewSession.selectedGroup = [...searchBar.state.selectedGroup];\n      searchBar.state.selectedGroup=[];\n  }\n  searchBar.state.showGroup=false; \n  searchBar.state.showCollect=true; \n}\n",
        triggerType: 'CTRLEVENT',
        id: 'calendar_click',
      },
      {
        eventNames: 'onClick',
        itemName: 'chart_toggle',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取部件并显示\nconst curctrl = \"chart\";\nconst activectrl = view.layoutPanel.findPanelItemByName(curctrl);\nif (activectrl) {\n  activectrl.state.visible = true;\n}\n//隐藏左侧过滤区\nconst view_exp_split = view.layoutPanel.findPanelItemByName('view_exp_split');\nif (view_exp_split) {\n  view_exp_split.hiddenPanel(\"left\");\n}\n// 定义需要隐藏的部件标识\nconst keepVisibleItems = ['dataview', 'grid','activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst index = keepVisibleItems.indexOf(curctrl);\nif (index !== -1) {\n  keepVisibleItems.splice(index, 1);\n}\n// 隐藏部件\nconst allItems = view.layoutPanel.panelItems;\nObject.keys(allItems).forEach(key => {\n  if (keepVisibleItems.includes(key)) {\n    allItems[key].state.visible = false;\n  }\n});\n\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nactivectrlname.setDataValue(curctrl);\n\nview.state.xdatacontrolname =curctrl;\n\n// 获取当前的路由对象\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\n\n// 创建一个新的 query 对象，保留现有查询参数，并添加新的参数\nconst newQuery = {\n  ...currentRoute.query, \n  srfnav: curctrl         \n};\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\nif(defaultctrlname.value == curctrl){\n  delete newQuery.srfnav;\n}\n// 使用 $router.push 更新 URL 并导航到相同的路径\nif(newQuery.srfnav != currentRoute.query.srfnav){\n  ibiz.appUtil.router.push({\n    path: currentRoute.path, \n    query: newQuery \n  });\n}\n\n// 显示分组筛选，并还原选项\nconst searchBar = view.getController('searchbar');\nif(searchBar){\n  if(viewSession.selectedGroup&&viewSession.selectedGroup.length>0){\n      searchBar.state.selectedGroup=[...viewSession.selectedGroup];\n      viewSession.selectedGroup=[];\n  }\n  searchBar.state.showGroup=true; \n  searchBar.state.showCollect=true; \n}",
        triggerType: 'CTRLEVENT',
        id: 'chart_click',
      },
      {
        eventNames: 'onMounted',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "console.log(\"\");\nconst targets = ['dataview', 'grid', 'activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\n\nlet firstVisible = null;\nlet default_ctrl = null;\n// 从路由获取\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\nif(currentRoute.query.srfnav){\n  firstVisible = currentRoute.query.srfnav;\n  const toggleitem = view.layoutPanel.findPanelItemByName(firstVisible+'_toggle');\n  toggleitem.onClick();\n  //activectrlname.setDataValue(firstVisible);\n  //view.state.xdatacontrolname = firstVisible;\n}\n// 挂载清空缓存\nif(appSession.guard){\n    appSession.guard();\n    appSession.guard = undefined;\n}\nif(!appSession.guard){\n  //注册路由监听\n  const afterEachHook = ibiz.appUtil.router.afterEach((to, from) => {\n    let toUrlArray = to.path.split('/');\n    if(toUrlArray.length<=2){\n      return;\n    }\n    const viewName = toUrlArray[toUrlArray.length - 2];\n    // const pathNodes = ibiz.appUtil.route2routeObject().pathNodes;\n    // const viewName = toUrlArray[pathNodes.length - 1].viewName;\n    const cacheView = ibiz.appUtil.viewCacheCenter.get(viewName);\n    const toView = cacheView;\n    // const curView = cacheView ? cacheView : view;\n    console.log('目标视图----',toView);\n    // let toUrlArray = to.path.split('/');\n    // let fromUrlArray = from.path.split('/');\n    // if(toUrlArray.length<=2 || fromUrlArray.length<=2){\n    //   return;\n    // }\n    //判断是否支持切换器\n    if(toView){\n      if(toView.layoutPanel.findPanelItemByName(\"switch_panel\")){\n        var active_ctrl = to.query.srfnav;\n        if(active_ctrl){\n          const toggleitem = toView.layoutPanel.findPanelItemByName(active_ctrl+'_toggle');\n          toggleitem.onClick();\n        }else{\n          // 恢复默认部件\n          const toggleitem = toView.layoutPanel.findPanelItemByName(defaultctrlname.value+'_toggle');\n          toggleitem.onClick();\n        }\n      }\n    }\n  });\n  appSession.guard = afterEachHook;\n}\n// 查找第一个存在的部件\nlet ctrlcount = 0;\nfor (const name of targets) {\n  const item = view.getCtrl(\"\", name);\n  if (item) {\n     if(firstVisible == null){\n        firstVisible = name;\n        activectrlname.setDataValue(firstVisible);\n        view.state.xdatacontrolname = firstVisible;\n      }\n      if(default_ctrl == null){\n        default_ctrl = name;\n        defaultctrlname.setDataValue(default_ctrl);\n      }\n    ctrlcount++;\n  }\n}\n\n// 设置可见性状态\ntargets.forEach(name => {\n  const item = view.layoutPanel.findPanelItemByName(name);\n  if (item) {\n    item.state.visible = name === firstVisible;\n  }\n});\n\n// 仅一个部件时隐藏切换器\nif(ctrlcount == 1){\n   const switch_panel_container = view.layoutPanel.findPanelItemByName('switch_panel_container');\n     if (switch_panel_container) {\n      switch_panel_container.state.visible = false;\n    }\n}\n\nconst searchBar = view.getController('searchbar');\n//解决多数据部件异步加载导致重复加载问题\nif(searchBar.model.searchBarGroups.find(group=> group.defaultGroup)){\n    const item = view.layoutPanel.findPanelItemByName(view.state.xdatacontrolname);\n    item.control.state.loadDefault = false;\n}",
        triggerType: 'CTRLEVENT',
        id: 'ctrl_toggle_init',
      },
      {
        eventNames: 'onClick',
        itemName: 'dataview_toggle',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取部件并显示\nconst curctrl = \"dataview\";\nconst activectrl = view.layoutPanel.findPanelItemByName(curctrl);\nif (activectrl) {\n  activectrl.state.visible = true;\n}\n//恢复显示左侧过滤区\nconst view_exp_split = view.layoutPanel.findPanelItemByName('view_exp_split');\nif (view_exp_split) {\n  view_exp_split.showPanel();\n}\n// 定义需要隐藏的部件标识\nconst keepVisibleItems = ['dataview', 'grid', 'activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst index = keepVisibleItems.indexOf(curctrl);\nif (index !== -1) {\n  keepVisibleItems.splice(index, 1);\n}\n// 隐藏部件\nconst allItems = view.layoutPanel.panelItems;\nObject.keys(allItems).forEach(key => {\n  if (keepVisibleItems.includes(key)) {\n    allItems[key].state.visible = false;\n  }\n});\n\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nactivectrlname.setDataValue(curctrl);\n\nview.state.xdatacontrolname =curctrl;\n\n// 获取当前的路由对象\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\n\n// 创建一个新的 query 对象，保留现有查询参数，并添加新的参数\nconst newQuery = {\n  ...currentRoute.query, \n  srfnav: curctrl         \n};\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\nif(defaultctrlname.value == curctrl){\n  delete newQuery.srfnav;\n}\n// 使用 $router.push 更新 URL 并导航到相同的路径\nif(newQuery.srfnav != currentRoute.query.srfnav){\n  ibiz.appUtil.router.push({\n    path: currentRoute.path, \n    query: newQuery \n  });\n}\n\n// 显示分组筛选，并还原选项\nconst searchBar = view.getController('searchbar');\nif(searchBar){\n  if(viewSession.selectedGroup&&viewSession.selectedGroup.length>0){\n      searchBar.state.selectedGroup=[...viewSession.selectedGroup];\n      viewSession.selectedGroup=[];\n  }\n  searchBar.state.showGroup=true; \n  searchBar.state.showCollect=true; \n}",
        triggerType: 'CTRLEVENT',
        id: 'dataview_click',
      },
      {
        eventNames: 'onClick',
        itemName: 'grid_toggle',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取部件并显示\nconsole.log(\"\");\nconst curctrl = \"grid\";\nconst activectrl = view.layoutPanel.findPanelItemByName(curctrl);\nif (activectrl) {\n  activectrl.state.visible = true;\n}\n//恢复显示左侧过滤区\nconst view_exp_split = view.layoutPanel.findPanelItemByName('view_exp_split');\nif (view_exp_split) {\n  view_exp_split.showPanel();\n}\n// 定义需要隐藏的部件标识\nconst keepVisibleItems = ['dataview', 'grid','activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst index = keepVisibleItems.indexOf(curctrl);\nif (index !== -1) {\n  keepVisibleItems.splice(index, 1);\n}\n// 隐藏部件\nconst allItems = view.layoutPanel.panelItems;\nObject.keys(allItems).forEach(key => {\n  if (keepVisibleItems.includes(key)) {\n    allItems[key].state.visible = false;\n  }\n});\n\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nactivectrlname.setDataValue(curctrl);\n\nview.state.xdatacontrolname =curctrl;\n\n// 获取当前的路由对象\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\n\n// 创建一个新的 query 对象，保留现有查询参数，并添加新的参数\nconst newQuery = {\n  ...currentRoute.query, \n  srfnav: curctrl         \n};\n\n//默认部件忽略参数\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\nif(defaultctrlname.value == curctrl){\n  delete newQuery.srfnav;\n}\n\n// 使用 $router.push 更新 URL 并导航到相同的路径\nif(newQuery.srfnav != currentRoute.query.srfnav){\n  ibiz.appUtil.router.push({\n    path: currentRoute.path, \n    query: newQuery \n  });\n}\n\n// 显示分组筛选，并还原选项\nconst searchBar = view.getController('searchbar');\nif(searchBar){\n  if(viewSession.selectedGroup&&viewSession.selectedGroup.length>0){\n      searchBar.state.selectedGroup=[...viewSession.selectedGroup];\n      viewSession.selectedGroup=[];\n  }\n  searchBar.state.showGroup=true; \n  searchBar.state.showCollect=true; \n}\n",
        triggerType: 'CTRLEVENT',
        id: 'grid_click',
      },
      {
        eventNames: 'onClick',
        itemName: 'hierarchy_toggle',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取部件并显示\nconst curctrl = \"hierarchy\";\nconst activectrl = view.layoutPanel.findPanelItemByName(curctrl);\nif (activectrl) {\n  activectrl.state.visible = true;\n}\n//隐藏左侧过滤区\nconst view_exp_split = view.layoutPanel.findPanelItemByName('view_exp_split');\nif (view_exp_split) {\n  view_exp_split.hiddenPanel(\"left\");\n}\n// 定义需要隐藏的部件标识\nconst keepVisibleItems = ['dataview', 'grid','activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst index = keepVisibleItems.indexOf(curctrl);\nif (index !== -1) {\n  keepVisibleItems.splice(index, 1);\n}\n// 隐藏部件\nconst allItems = view.layoutPanel.panelItems;\nObject.keys(allItems).forEach(key => {\n  if (keepVisibleItems.includes(key)) {\n    allItems[key].state.visible = false;\n  }\n});\n\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nactivectrlname.setDataValue(curctrl);\n\nview.state.xdatacontrolname =curctrl;\n\n// 获取当前的路由对象\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\n\n// 创建一个新的 query 对象，保留现有查询参数，并添加新的参数\nconst newQuery = {\n  ...currentRoute.query, \n  srfnav: curctrl         \n};\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\nif(defaultctrlname.value == curctrl){\n  delete newQuery.srfnav;\n}\n// 使用 $router.push 更新 URL 并导航到相同的路径\nif(newQuery.srfnav != currentRoute.query.srfnav){\n  ibiz.appUtil.router.push({\n    path: currentRoute.path, \n    query: newQuery \n  });\n}\n\n// hierarchy不显示分组筛选\nconst searchBar = view.getController('searchbar');\nif(searchBar){\n  if(searchBar.state.selectedGroup&&searchBar.state.selectedGroup.length>0){\n      viewSession.selectedGroup = [...searchBar.state.selectedGroup];\n      searchBar.state.selectedGroup=[];\n  }\n  searchBar.state.showGroup=false; \n  searchBar.state.showCollect=true; \n}\n",
        triggerType: 'CTRLEVENT',
        id: 'hierarchy_click',
      },
      {
        eventNames: 'onControlEvent',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 多数据部件\nconst targets = [\n  'dataview',\n  'grid',\n  'activity',\n  'pivottable',\n  'calendar',\n  'chart',\n  'hierarchy',\n];\n// 获取搜索栏\nconst searchBar = view.getController('searchbar');\n// 处理多数据部件事件\nif (searchBar && targets.includes(triggerControlName)) {\n  // 表格默认不加载在执行execGroup时加载\n  if (triggerControlName === 'grid' ) {\n    triggerEvent.ctrl.state.loadDefault = false;\n  }\n  // 多数据部件初始化时合并搜索参数\n  if (triggerEventName === 'onCreated') {\n    triggerEvent.ctrl.state.searchParams = searchBar.getFilterParams();\n  }\n  // 多数据部件绘制完成后执行搜索栏分组\n  if (triggerEventName === 'onMounted') {\n    searchBar.execGroup();\n  }\n}",
        triggerType: 'CTRLEVENT',
        name: 'onControlEvent',
        id: 'oncontrolevent',
      },
      {
        eventNames: 'onClick',
        itemName: 'pivottable_toggle',
        logicTag: 'layoutpanel',
        logicType: 'SCRIPT',
        scriptCode:
          "// 获取部件并显示\nconst curctrl = \"pivottable\";\nconst activectrl = view.layoutPanel.findPanelItemByName(curctrl);\nif (activectrl) {\n  activectrl.state.visible = true;\n}\n//隐藏左侧过滤区\nconst view_exp_split = view.layoutPanel.findPanelItemByName('view_exp_split');\nif (view_exp_split) {\n  view_exp_split.hiddenPanel(\"left\");\n}\n// 定义需要隐藏的部件标识\nconst keepVisibleItems = ['dataview', 'grid','activity', 'pivottable', 'calendar', 'chart','hierarchy'];\nconst index = keepVisibleItems.indexOf(curctrl);\nif (index !== -1) {\n  keepVisibleItems.splice(index, 1);\n}\n// 隐藏部件\nconst allItems = view.layoutPanel.panelItems;\nObject.keys(allItems).forEach(key => {\n  if (keepVisibleItems.includes(key)) {\n    allItems[key].state.visible = false;\n  }\n});\n\nconst activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');\nactivectrlname.setDataValue(curctrl);\n\nview.state.xdatacontrolname =curctrl;\n\n// 获取当前的路由对象\nconst currentRoute = ibiz.appUtil.router.currentRoute._value;\n\n// 创建一个新的 query 对象，保留现有查询参数，并添加新的参数\nconst newQuery = {\n  ...currentRoute.query, \n  srfnav: curctrl         \n};\nconst defaultctrlname = view.layoutPanel.findPanelItemByName('default_ctrl');\nif(defaultctrlname.value == curctrl){\n  delete newQuery.srfnav;\n}\n// 使用 $router.push 更新 URL 并导航到相同的路径\nif(newQuery.srfnav != currentRoute.query.srfnav){\n  ibiz.appUtil.router.push({\n    path: currentRoute.path, \n    query: newQuery \n  });\n}\n\n// 显示分组筛选，并还原选项\nconst searchBar = view.getController('searchbar');\nif(searchBar){\n  if(viewSession.selectedGroup&&viewSession.selectedGroup.length>0){\n      searchBar.state.selectedGroup=[...viewSession.selectedGroup];\n      viewSession.selectedGroup=[];\n  }\n  searchBar.state.showGroup=true; \n  searchBar.state.showCollect=true; \n}",
        triggerType: 'CTRLEVENT',
        id: 'pivottable_click',
      },
    ],
    controlParam: {},
    modelId: '4db373066a152684f6838426ca29b4a9',
    modelType: 'PSSYSVIEWLAYOUTPANEL',
    name: 'layoutpanel',
    id: 'mdcustomview',
  },
  title: '统一资源',
  viewStyle: 'DEFAULT',
  viewType: 'DEMDCUSTOMVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: '6e512a887c0481f184004460ec0c89d9',
  modelType: 'PSAPPDEVIEW',
  name: 'ir_uniresmulti_data_view',
  id: 'ibizodooapp.ir_unires_multi_data_view',
};
