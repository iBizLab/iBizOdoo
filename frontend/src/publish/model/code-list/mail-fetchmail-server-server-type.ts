export default {
  codeListTag: 'mail__fetchmail_server_server_type',
  codeListType: 'STATIC',
  codeName: 'mail__fetchmail_server_server_type',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'imap',
      text: 'IMAP 服务器',
      value: 'imap',
      id: 'imap',
    },
    {
      codeName: 'pop',
      text: 'POP 服务器',
      value: 'pop',
      id: 'pop',
    },
    {
      codeName: 'local',
      text: '本地服务器',
      value: 'local',
      id: 'local',
    },
    {
      codeName: 'gmail',
      text: 'Gmail OAuth身份验证',
      value: 'gmail',
      id: 'gmail',
    },
  ],
  enableCache: true,
  name: '服务器类型',
  id: 'ibizodooapp.mail__fetchmail_server_server_type',
};
