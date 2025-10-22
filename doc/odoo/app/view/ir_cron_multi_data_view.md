# 计划的操作(ir_cron_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [计划的操作(IR_CRON)](module/base/ir_cron) : [表格界面_新建操作](module/base/ir_cron#界面行为)

### 关联视图
  * [计划的操作(ir_cron_main_view)](app/view/ir_cron_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>