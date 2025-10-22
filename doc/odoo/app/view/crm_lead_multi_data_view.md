# 渠道(crm_lead_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据视图(dataview)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [线索/商机(CRM_LEAD)](module/crm/crm_lead) : [表格界面_新建操作](module/crm/crm_lead#界面行为)

### 关联视图
  * [线索/商机(crm_lead_main_view)](app/view/crm_lead_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>