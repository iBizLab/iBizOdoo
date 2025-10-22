# 讨论(discuss_index_view)  <!-- {docsify-ignore-all} -->



## 控件
#### 应用菜单(appmenu)
#### CAPTIONBAR(captionbar)


### 关联界面行为
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [显示置顶消息](module/discuss/discuss_channel#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑](module/mail/mail_message#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [发送评论](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [通知设置](module/discuss/discuss_channel#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [回复](module/mail/mail_message#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [频道管理](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [离开频道](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [新建频道](module/discuss/discuss_channel#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [删除评论](module/mail/mail_message#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [打开消息检索](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [清空评论](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [频道管理](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [邀请人员](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [打开成员列表栏](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [打开聊天](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [打开附件栏](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [新建频道](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [讨论串](module/discuss/discuss_channel#界面行为)
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [附件下载](module/base/ir_attachment#界面行为)

### 关联界面逻辑
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [删除附件数据](module/base/ir_attachment/uilogic/delete_attachment)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮显示](module/mail/mail_message/uilogic/comment_icon_show)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮隐藏](module/mail/mail_message/uilogic/comment_icon_hidden)

### 关联视图
  * [邀请成员(discuss_channel_invite_member_view)](app/view/discuss_channel_invite_member_view)
  * [讨论频道(discuss_channel_main_pop_view)](app/view/discuss_channel_main_pop_view)
  * [讨论频道(discuss_channel_main_view)](app/view/discuss_channel_main_view)
  * [频道成员(discuss_channel_member_grid_view)](app/view/discuss_channel_member_grid_view)
  * [讨论频道(discuss_channel_pickup_view)](app/view/discuss_channel_pickup_view)
  * [公共频道(discuss_channel_public_multi_data_view)](app/view/discuss_channel_public_multi_data_view)
  * [讨论频道(discuss_channel_quick_cfg_view)](app/view/discuss_channel_quick_cfg_view)
  * [子频道(discuss_channel_sub_channel_grid_view)](app/view/discuss_channel_sub_channel_grid_view)
  * [历史消息(mail_message_discuss_history_list_view)](app/view/mail_message_discuss_history_list_view)
  * [收件箱(mail_message_discuss_inbox_list_view)](app/view/mail_message_discuss_inbox_list_view)
  * [讨论(mail_message_discuss_main_view)](app/view/mail_message_discuss_main_view)
  * [星标消息(mail_message_discuss_starred_list_view)](app/view/mail_message_discuss_starred_list_view)
  * [置顶消息(mail_message_pinned_list_view)](app/view/mail_message_pinned_list_view)
  * [消息检索(mail_message_search_list_view)](app/view/mail_message_search_list_view)
  * [权限组(res_groups_pickup_view)](app/view/res_groups_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>