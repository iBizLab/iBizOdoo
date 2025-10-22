# 频道成员(discuss_channel_member_list_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member) : [邀请人员](module/discuss/discuss_channel_member#界面行为)

### 关联视图
  * [邀请成员(discuss_channel_invite_member_view)](app/view/discuss_channel_invite_member_view)
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