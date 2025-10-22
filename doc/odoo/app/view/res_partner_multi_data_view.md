# 联系人(res_partner_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据视图(dataview)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [联系人(RES_PARTNER)](module/base/res_partner) : [打开安排联系人活动视图](module/base/res_partner#界面行为)
  * [联系人(RES_PARTNER)](module/base/res_partner) : [表格界面_新建操作](module/base/res_partner#界面行为)

### 关联视图
  * [活动(mail_activity_emp_schedule_act_view)](app/view/mail_activity_emp_schedule_act_view)
  * [联系人(res_partner_main_view)](app/view/res_partner_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>