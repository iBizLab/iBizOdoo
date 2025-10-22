# 活动(mail_activity_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)

##### 部件逻辑
* `onLoadSuccess`
```
const currentGrid=view.getCtrl('GRID','grid');
if(currentGrid){
    currentGrid.state.rows.forEach(row=> {
   row.uaColStates.uagridcolumn1.visible = row.data.active === 1;
  });
}
```
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [已完成](module/mail/mail_activity#界面行为)
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [取消活动](module/mail/mail_activity#界面行为)
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [延后7天](module/mail/mail_activity#界面行为)

### 关联视图
  * [活动(mail_activity_edit_view)](app/view/mail_activity_edit_view)
  * [活动(mail_activity_main_view)](app/view/mail_activity_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>