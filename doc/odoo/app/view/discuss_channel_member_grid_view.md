# 频道成员(discuss_channel_member_grid_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member) : [表格界面_删除操作](module/discuss/discuss_channel_member#界面行为)

### 关联视图
  * [频道成员(discuss_channel_member_edit_view)](app/view/discuss_channel_member_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>