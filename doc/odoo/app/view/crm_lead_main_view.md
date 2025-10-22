# 线索/商机(crm_lead_main_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 单视图面板(control)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [删除评论](module/mail/mail_message#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [回复](module/mail/mail_message#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [清空评论](module/mail/mail_thread#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [打开安排活动视图](module/mail/mail_thread#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [发送评论](module/mail/mail_thread#界面行为)
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [附件下载](module/base/ir_attachment#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑](module/mail/mail_message#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [添加附件](module/mail/mail_thread#界面行为)
  * [线索/商机(CRM_LEAD)](module/crm/crm_lead) : [编辑界面_保存操作](module/crm/crm_lead#界面行为)

### 关联界面逻辑
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [删除附件数据](module/base/ir_attachment/uilogic/delete_attachment)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮显示](module/mail/mail_message/uilogic/comment_icon_show)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮隐藏](module/mail/mail_message/uilogic/comment_icon_hidden)
  * [单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers) : [关注人员更新(嵌入)](module/mail/mail_followers/uilogic/attention_personnel_update_emb)

### 关联视图
  * [安排活动(mail_activity_schedule_quick_create_view)](app/view/mail_activity_schedule_quick_create_view)
  * [邮件会话(mail_thread_component_view)](app/view/mail_thread_component_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>