# 收件服务器(fetchmail_server_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 部件逻辑
* `onLoadDraftSuccess`
```
if(data[0].server_type === "imap"){
   data[0].port = "143";
   if(data[0].is_ssl === 1){
      data[0].port = "993";
   }
}

if(data[0].server_type === "pop"){
   data[0].port = "110";
   if(data[0].is_ssl === 1){
      data[0].port = "995";
   }
}
```
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [收件服务器(FETCHMAIL_SERVER)](module/mail/fetchmail_server) : [取消变更](module/mail/fetchmail_server#界面行为)
  * [收件服务器(FETCHMAIL_SERVER)](module/mail/fetchmail_server) : [编辑界面_保存并新建操作](module/mail/fetchmail_server#界面行为)
  * [收件服务器(FETCHMAIL_SERVER)](module/mail/fetchmail_server) : [编辑界面_保存操作](module/mail/fetchmail_server#界面行为)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>