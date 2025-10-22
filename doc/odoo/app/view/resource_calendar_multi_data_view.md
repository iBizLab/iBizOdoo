# 工作时间表(resource_calendar_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar) : [表格界面_新建操作](module/resource/resource_calendar#界面行为)

### 关联视图
  * [工作时间表(resource_calendar_main_view)](app/view/resource_calendar_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>