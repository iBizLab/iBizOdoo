# 历史消息(mail_message_discuss_history_list_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [删除评论](module/mail/mail_message#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [回复](module/mail/mail_message#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑](module/mail/mail_message#界面行为)

### 关联视图
  * [消息(mail_message_edit_view)](app/view/mail_message_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>