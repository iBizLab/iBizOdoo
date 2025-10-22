export default {
  codeListTag: 'base__res_config_settings_default_invoice_policy',
  codeListType: 'STATIC',
  codeName: 'base__res_config_settings_default_invoice_policy',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'order',
      text: '为已下单的产品开具发票',
      value: 'order',
      id: 'order',
    },
    {
      codeName: 'delivery',
      text: '为已交付的产品开具发票',
      value: 'delivery',
      id: 'delivery',
    },
  ],
  enableCache: true,
  name: '开票原则',
  id: 'ibizodooapp.base__res_config_settings_default_invoice_policy',
};
