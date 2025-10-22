# 计划行动触发器(ir_cron_trigger_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [触发行动(IR_CRON_TRIGGER)](module/base/ir_cron_trigger) : [表格界面_新建操作](module/base/ir_cron_trigger#界面行为)

### 关联视图
  * [计划行动触发器(ir_cron_trigger_main_view)](app/view/ir_cron_trigger_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>