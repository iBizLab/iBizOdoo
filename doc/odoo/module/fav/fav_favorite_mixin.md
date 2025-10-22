# 收藏混合(fav_favorite_mixin)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|收藏计数|FAVORITE_COUNT|整型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|收藏|IS_FAVORITE|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_FAV_FAVORITE_FAV_FAVORITEMIXIN](der/DERCUSTOM_FAV_FAVORITE_FAV_FAVORITEMIXIN)|[收藏(FAV_FAVORITE)](module/fav/fav_favorite)|自定义关系||
|[DERMULINH_MAIL_MESSAGE_FAV_FAVORITE_MIXIN](der/DERMULINH_MAIL_MESSAGE_FAV_FAVORITE_MIXIN)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|多继承关系（虚拟实体）||


</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|添加收藏|add_favorite|用户自定义|默认|不支持||||
|移除所有收藏|remove_all_favorites|用户自定义|默认|不支持||||
|移除收藏|remove_favorite|用户自定义|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/fav/fav_favorite_mixin/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/fav/fav_favorite_mixin/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/fav/fav_favorite_mixin/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/fav/fav_favorite_mixin?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite_mixin?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite_mixin?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite_mixin?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite_mixin?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite_mixin?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>