# 默认值(ir_default_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [默认值(IR_DEFAULT)](module/base/ir_default) : [表格界面_新建操作](module/base/ir_default#界面行为)

### 关联视图
  * [默认值(ir_default_main_view)](app/view/ir_default_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>