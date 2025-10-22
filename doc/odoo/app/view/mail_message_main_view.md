# 消息(mail_message_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [取消变更](module/mail/mail_message#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑界面_保存操作](module/mail/mail_message#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑界面_保存并新建操作](module/mail/mail_message#界面行为)

### 关联视图
  * [线索/商机(crm_lead_main_view)](app/view/crm_lead_main_view)
  * [部门(hr_department_main_view)](app/view/hr_department_main_view)
  * [员工(hr_employee_main_view)](app/view/hr_employee_main_view)
  * [消息(mail_message_pickup_view)](app/view/mail_message_pickup_view)
  * [消息(mail_message_redirect_view)](app/view/mail_message_redirect_view)
  * [公司(res_company_main_view)](app/view/res_company_main_view)
  * [联系人(res_partner_main_view)](app/view/res_partner_main_view)
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