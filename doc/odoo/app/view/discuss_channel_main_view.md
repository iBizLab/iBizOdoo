# 讨论频道(discuss_channel_main_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### 数据视图(attachments)
#### CAPTIONBAR(captionbar)
#### 列表(control)
#### 编辑表单(form)
#### 列表(members)
#### 单视图面板(pinned_message_view)
#### 单视图面板(search_message_view)
#### 工具栏(toolbar)


### 关联界面行为
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [显示置顶消息](module/discuss/discuss_channel#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑](module/mail/mail_message#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [发送评论](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [通知设置](module/discuss/discuss_channel#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [回复](module/mail/mail_message#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [删除评论](module/mail/mail_message#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [打开消息检索](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [清空评论](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [邀请人员](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [打开成员列表栏](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [打开附件栏](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [讨论串](module/discuss/discuss_channel#界面行为)
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [附件下载](module/base/ir_attachment#界面行为)

### 关联界面逻辑
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [删除附件数据](module/base/ir_attachment/uilogic/delete_attachment)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮显示](module/mail/mail_message/uilogic/comment_icon_show)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮隐藏](module/mail/mail_message/uilogic/comment_icon_hidden)

### 关联视图
  * [邀请成员(discuss_channel_invite_member_view)](app/view/discuss_channel_invite_member_view)
  * [频道成员(discuss_channel_member_grid_view)](app/view/discuss_channel_member_grid_view)
  * [讨论频道(discuss_channel_pickup_view)](app/view/discuss_channel_pickup_view)
  * [子频道(discuss_channel_sub_channel_grid_view)](app/view/discuss_channel_sub_channel_grid_view)
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