# 行为附加 <!-- {docsify-ignore-all} -->

## [头像混合(AVATAR_MIXIN)](module/base/avatar_mixin.md)  :id=avatar_mixin

#### [Create](module/base/avatar_mixin#行为) :id=avatar_mixin_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [存储头像(save_avater)](module/base/avatar_mixin/logic/save_avater.md)




#### [Update](module/base/avatar_mixin#行为) :id=avatar_mixin_Update



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [存储头像(save_avater)](module/base/avatar_mixin/logic/save_avater.md)





## [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel.md)  :id=discuss_channel

#### [Create](module/discuss/discuss_channel#行为) :id=discuss_channel_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建后加入频道(fill_default_member)](module/discuss/discuss_channel/logic/fill_default_member.md)



## [员工(HR_EMPLOYEE)](module/hr/hr_employee.md)  :id=hr_employee

#### [Create](module/hr/hr_employee#行为) :id=hr_employee_Create


<p class="panel-title"><b>数据准备</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [准备默认用户数据对象(prepare_default_user)](module/hr/hr_employee/logic/prepare_default_user.md)



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [建立之前(before_create)](module/hr/hr_employee/logic/before_create.md)





## [消息(MAIL_MESSAGE)](module/mail/mail_message.md)  :id=mail_message

#### [Create](module/mail/mail_message#行为) :id=mail_message_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建评论后通知(after_create_notify)](module/mail/mail_message/logic/after_create_notify.md)



## [EMail模板(MAIL_TEMPLATE)](module/mail/mail_template.md)  :id=mail_template

#### [Update](module/mail/mail_template#行为) :id=mail_template_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [刷新消息模板缓存(refresh_cache)](module/mail/mail_template/logic/refresh_cache.md)



## [用于计算记录在 many2one 字段的每个值上所花费时间的混合函数(MAIL_TRACKING_DURATION_MIXIN)](module/mail/mail_tracking_duration_mixin.md)  :id=mail_tracking_duration_mixin

#### [Get](module/mail/mail_tracking_duration_mixin#行为) :id=mail_tracking_duration_mixin_Get




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [计算跟踪属性耗时(compute_duration_tracking)](module/mail/mail_tracking_duration_mixin/logic/compute_duration_tracking.md)



## [资源装饰(RESOURCE_MIXIN)](module/resource/resource_mixin.md)  :id=resource_mixin

#### [Create](module/resource/resource_mixin#行为) :id=resource_mixin_Create


<p class="panel-title"><b>数据准备</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建逻辑(prepare_create)](module/resource/resource_mixin/logic/prepare_create.md)






## [资源(RESOURCE_RESOURCE)](module/resource/resource_resource.md)  :id=resource_resource

#### [Create](module/resource/resource_resource#行为) :id=resource_resource_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [建立之前(before_create)](module/resource/resource_resource/logic/before_create.md)





## [配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings.md)  :id=res_config_settings

#### [Create](module/base/res_config_settings#行为) :id=res_config_settings_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings.md) 的 [设置配置值(set_values)](module/base/res_config_settings#行为) 行为


#### [Get](module/base/res_config_settings#行为) :id=res_config_settings_Get




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings.md) 的 [默认提取固定标识属性值(default_get)](module/base/res_config_settings#行为) 行为

> [!NOTE|label:外部逻辑]
> 执行实体 [配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings.md) 的 [获取配置值(get_values)](module/base/res_config_settings#行为) 行为


#### [Update](module/base/res_config_settings#行为) :id=res_config_settings_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings.md) 的 [设置配置值(set_values)](module/base/res_config_settings#行为) 行为



## [用户(RES_USERS)](module/base/res_users.md)  :id=res_users

#### [Create](module/base/res_users#行为) :id=res_users_Create


<p class="panel-title"><b>数据准备</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [准备建立(prepare_create)](module/base/res_users/logic/prepare_create.md)




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [cloud用户同步(sync_cloud_user)](module/base/res_users/logic/sync_cloud_user.md)


#### [Remove](module/base/res_users#行为) :id=res_users_Remove




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [禁用cloud用户(invalid_cloud_user)](module/base/res_users/logic/invalid_cloud_user.md)


#### [Update](module/base/res_users#行为) :id=res_users_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [cloud用户同步(sync_cloud_user)](module/base/res_users/logic/sync_cloud_user.md)


#### [修改密码(change_password)](module/base/res_users#行为) :id=res_users_change_password




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [修改cloud用户密码(change_cloud_user_pwd)](module/base/res_users/logic/change_cloud_user_pwd.md)









