export default {
  codeListTag: 'mail__mail_mail_state',
  codeListType: 'STATIC',
  codeName: 'mail__mail_mail_state',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'outgoing',
      text: '发信',
      value: 'outgoing',
      id: 'outgoing',
    },
    {
      codeName: 'sent',
      text: '已发送',
      value: 'sent',
      id: 'sent',
    },
    {
      codeName: 'received',
      text: '已收',
      value: 'received',
      id: 'received',
    },
    {
      codeName: 'exception',
      text: '投递失败',
      value: 'exception',
      id: 'exception',
    },
    {
      codeName: 'cancel',
      text: '已取消',
      value: 'cancel',
      id: 'cancel',
    },
  ],
  enableCache: true,
  name: '状态',
  id: 'ibizodooapp.mail__mail_mail_state',
};
