# 邀请成员(res_partner_pick_up_list_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)

## 视图界面逻辑
* `onSelectionChange`
```javascript
view.evt.emit('onSelectionChange', { data });
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [联系人(res_partner_main_view)](app/view/res_partner_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>