# 讨论频道(discuss_channel_quick_cfg_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [编辑界面_保存操作](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [取消变更](module/discuss/discuss_channel#界面行为)
  * [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel) : [编辑界面_保存并新建操作](module/discuss/discuss_channel#界面行为)

### 关联视图
  * [频道成员(discuss_channel_member_grid_view)](app/view/discuss_channel_member_grid_view)
  * [讨论频道(discuss_channel_pickup_view)](app/view/discuss_channel_pickup_view)
  * [子频道(discuss_channel_sub_channel_grid_view)](app/view/discuss_channel_sub_channel_grid_view)
  * [权限组(res_groups_pickup_view)](app/view/res_groups_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>