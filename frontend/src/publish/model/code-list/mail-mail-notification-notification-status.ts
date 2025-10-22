export default {
  codeListTag: 'mail__mail_notification_notification_status',
  codeListType: 'STATIC',
  codeName: 'mail__mail_notification_notification_status',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'ready',
      text: '准备好发送',
      value: 'ready',
      id: 'ready',
    },
    {
      codeName: 'process',
      text: '处理中',
      value: 'process',
      id: 'process',
    },
    {
      codeName: 'pending',
      text: '已发送',
      value: 'pending',
      id: 'pending',
    },
    {
      codeName: 'sent',
      text: '已发货',
      value: 'sent',
      id: 'sent',
    },
    {
      codeName: 'bounce',
      text: '被退回',
      value: 'bounce',
      id: 'bounce',
    },
    {
      codeName: 'exception',
      text: '异常',
      value: 'exception',
      id: 'exception',
    },
    {
      codeName: 'canceled',
      text: '已取消',
      value: 'canceled',
      id: 'canceled',
    },
  ],
  enableCache: true,
  name: '状态',
  id: 'ibizodooapp.mail__mail_notification_notification_status',
};
