# 子频道(discuss_channel_sub_channel_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [表格界面_删除操作](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [表格界面_删除操作](module/discuss/discuss_channel#界面行为)

### 关联视图
  * [讨论频道(discuss_channel_quick_cfg_view)](app/view/discuss_channel_quick_cfg_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>