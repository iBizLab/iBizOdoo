# 消息通知(mail_notification_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [消息通知(MAIL_NOTIFICATION)](module/mail/mail_notification) : [编辑界面_保存操作](module/mail/mail_notification#界面行为)
  * [消息通知(MAIL_NOTIFICATION)](module/mail/mail_notification) : [取消变更](module/mail/mail_notification#界面行为)
  * [消息通知(MAIL_NOTIFICATION)](module/mail/mail_notification) : [编辑界面_保存并新建操作](module/mail/mail_notification#界面行为)

### 关联视图
  * [消息(mail_message_pickup_view)](app/view/mail_message_pickup_view)
  * [联系人(res_partner_pickup_view)](app/view/res_partner_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>