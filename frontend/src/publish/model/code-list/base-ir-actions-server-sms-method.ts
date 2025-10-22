export default {
  codeListTag: 'base__ir_actions_server_sms_method',
  codeListType: 'STATIC',
  codeName: 'base__ir_actions_server_sms_method',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'sms',
      text: '短信（无备注）',
      value: 'sms',
      id: 'sms',
    },
    {
      codeName: 'comment',
      text: '短信（附注）',
      value: 'comment',
      id: 'comment',
    },
    {
      codeName: 'note',
      text: '仅供参考',
      value: 'note',
      id: 'note',
    },
  ],
  enableCache: true,
  name: '发送短信为',
  id: 'ibizodooapp.base__ir_actions_server_sms_method',
};
