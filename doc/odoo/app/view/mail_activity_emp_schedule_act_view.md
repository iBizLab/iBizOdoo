# 活动(mail_activity_emp_schedule_act_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [打开安排活动视图](module/mail/mail_activity#界面行为)

### 关联视图
  * [活动(mail_activity_edit_view)](app/view/mail_activity_edit_view)
  * [安排活动(mail_activity_schedule_quick_create_view)](app/view/mail_activity_schedule_quick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>