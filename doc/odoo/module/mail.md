# 邮件(mail) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[收件服务器(FETCHMAIL_SERVER)](module/mail/fetchmail_server)|fetchmail_server|主实体|SQL|fetchmail_server|否|否|自控制|否||
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|mail_activity|主实体|SQL|mail_activity|否|否|自控制|否||
|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|mail_activity_mixin|抽象实体|无存储||否|否|自控制|否||
|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan)|mail_activity_plan|主实体|SQL|mail_activity_plan|否|否|自控制|否||
|[活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template)|mail_activity_plan_template|主实体|SQL|mail_activity_plan_template|否|否|自控制|否||
|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)|mail_activity_schedule|主实体|SQL|mail_activity_schedule|否|否|自控制|否||
|[同时创建活动和待办事项(MAIL_ACTIVITY_TODO_CREATE)](module/mail/mail_activity_todo_create)|mail_activity_todo_create|主实体|SQL|mail_activity_todo_create|否|否|自控制|否||
|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|mail_activity_type|主实体|SQL|mail_activity_type|否|否|自控制|否||
|[活动类型模板(MAIL_ACTIVITY_TYPE_MAIL_TEMPLATE_REL)](module/mail/mail_activity_type_mail_template_rel)|mail_activity_type_mail_template_rel|关系实体|SQL|mail_activity_type_mail_template_rel|否|否|附属主实体控制|否||
|[EMail别名(MAIL_ALIAS)](module/mail/mail_alias)|mail_alias|主实体|SQL|mail_alias|否|否|自控制|否||
|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain)|mail_alias_domain|主实体|SQL|mail_alias_domain|否|否|自控制|否||
|[EMail别名 Mixin(MAIL_ALIAS_MIXIN)](module/mail/mail_alias_mixin)|mail_alias_mixin|主实体|SQL|mail_alias_mixin|否|否|自控制|否||
|[电子邮件别名混合素（轻型）(MAIL_ALIAS_MIXIN_OPTIONAL)](module/mail/mail_alias_mixin_optional)|mail_alias_mixin_optional|主实体|SQL|mail_alias_mixin_optional|否|否|自控制|否||
|[邮件黑名单(MAIL_BLACKLIST)](module/mail/mail_blacklist)|mail_blacklist|主实体|SQL|mail_blacklist|否|否|自控制|否||
|[从黑名单向导中删除电子邮件(MAIL_BLACKLIST_REMOVE)](module/mail/mail_blacklist_remove)|mail_blacklist_remove|主实体|SQL|mail_blacklist_remove|否|否|自控制|否||
|[邮件机器人(MAIL_BOT)](module/mail/mail_bot)|mail_bot|主实体|SQL|mail_bot|否|否|自控制|否||
|[预设回复(MAIL_CANNED_RESPONSE)](module/mail/mail_canned_response)|mail_canned_response|主实体|SQL|mail_canned_response|否|否|自控制|否||
|[EMail撰写向导(MAIL_COMPOSE_MESSAGE)](module/mail/mail_compose_message)|mail_compose_message|主实体|SQL|mail_compose_message|否|否|自控制|否||
|[邮件编辑器混合(MAIL_COMPOSER_MIXIN)](module/mail/mail_composer_mixin)|mail_composer_mixin|主实体|SQL|mail_composer_mixin|否|否|自控制|否||
|[单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers)|mail_followers|主实体|SQL|mail_followers|否|否|自控制|否||
|[允许的邮件网关(MAIL_GATEWAY_ALLOWED)](module/mail/mail_gateway_allowed)|mail_gateway_allowed|主实体|SQL|mail_gateway_allowed|否|否|自控制|否||
|[访客(MAIL_GUEST)](module/mail/mail_guest)|mail_guest|主实体|SQL|mail_guest|否|否|自控制|否||
|[ICE 服务器(MAIL_ICE_SERVER)](module/mail/mail_ice_server)|mail_ice_server|主实体|SQL|mail_ice_server|否|否|自控制|否||
|[存储链接预览数据(MAIL_LINK_PREVIEW)](module/mail/mail_link_preview)|mail_link_preview|主实体|SQL|mail_link_preview|否|否|自控制|否||
|[发出邮件(MAIL_MAIL)](module/mail/mail_mail)|mail_mail|主实体|SQL|mail_mail|否|否|自控制|否||
|[消息(MAIL_MESSAGE)](module/mail/mail_message)|mail_message|主实体|SQL|mail_message|否|否|自控制|否||
|[消息反应(MAIL_MESSAGE_REACTION)](module/mail/mail_message_reaction)|mail_message_reaction|主实体|SQL|mail_message_reaction|否|否|自控制|否||
|[消息收件人(MAIL_MESSAGE_RECIPIENT)](module/mail/mail_message_recipient)|mail_message_recipient|关系实体|SQL|MAIL_MESSAGE_RECIPIENT|否|否|附属主实体控制|否|NN中间表|
|[安排的消息(MAIL_MESSAGE_SCHEDULE)](module/mail/mail_message_schedule)|mail_message_schedule|主实体|SQL|mail_message_schedule|否|否|自控制|否||
|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|mail_message_subtype|主实体|SQL|mail_message_subtype|否|否|自控制|否||
|[在线翻译(MAIL_MESSAGE_TRANSLATION)](module/mail/mail_message_translation)|mail_message_translation|主实体|SQL|mail_message_translation|否|否|自控制|否||
|[消息通知(MAIL_NOTIFICATION)](module/mail/mail_notification)|mail_notification|主实体|SQL|mail_notification|否|否|自控制|否||
|[推送通知(MAIL_PUSH)](module/mail/mail_push)|mail_push|主实体|SQL|mail_push|否|否|自控制|否||
|[推送通知设备(MAIL_PUSH_DEVICE)](module/mail/mail_push_device)|mail_push_device|主实体|SQL|mail_push_device|否|否|自控制|否||
|[邮件渲染混合(MAIL_RENDER_MIXIN)](module/mail/mail_render_mixin)|mail_render_mixin|主实体|SQL|mail_render_mixin|否|否|自控制|否||
|[EMail重发向导(MAIL_RESEND_MESSAGE)](module/mail/mail_resend_message)|mail_resend_message|主实体|SQL|mail_resend_message|否|否|自控制|否||
|[为邮件重新发送提供附加信息的合作伙伴(MAIL_RESEND_PARTNER)](module/mail/mail_resend_partner)|mail_resend_partner|主实体|SQL|mail_resend_partner|否|否|自控制|否||
|[安排的消息(MAIL_SCHEDULED_MESSAGE)](module/mail/mail_scheduled_message)|mail_scheduled_message|主实体|SQL|mail_scheduled_message|否|否|自控制|否||
|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|mail_template|主实体|SQL|mail_template|否|否|自控制|否||
|[EMail模板预览(MAIL_TEMPLATE_PREVIEW)](module/mail/mail_template_preview)|mail_template_preview|主实体|SQL|mail_template_preview|否|否|自控制|否||
|[邮件模板重置(MAIL_TEMPLATE_RESET)](module/mail/mail_template_reset)|mail_template_reset|主实体|SQL|mail_template_reset|否|否|自控制|否||
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|mail_thread|抽象实体|无存储||否|否|自控制|否||
|[mixin邮件黑名单(MAIL_THREAD_BLACKLIST)](module/mail/mail_thread_blacklist)|mail_thread_blacklist|主实体|SQL|mail_thread_blacklist|否|否|自控制|否||
|[电子邮件副本管理(MAIL_THREAD_CC)](module/mail/mail_thread_cc)|mail_thread_cc|主实体|SQL|mail_thread_cc|否|否|自控制|否||
|[主邮件附件管理(MAIL_THREAD_MAIN_ATTACHMENT)](module/mail/mail_thread_main_attachment)|mail_thread_main_attachment|主实体|SQL|mail_thread_main_attachment|否|否|自控制|否||
|[电话黑名单混混合(MAIL_THREAD_PHONE)](module/mail/mail_thread_phone)|mail_thread_phone|主实体|SQL|mail_thread_phone|否|否|自控制|否||
|[用于计算记录在 many2one 字段的每个值上所花费时间的混合函数(MAIL_TRACKING_DURATION_MIXIN)](module/mail/mail_tracking_duration_mixin)|mail_tracking_duration_mixin|主实体|SQL|mail_tracking_duration_mixin|否|否|自控制|否|继承该实体后需要开启实体审计，并且把需要跟踪的属性也开启审计模式，并在属性标记上打上tag:   DURATION_TRACK|
|[邮件跟踪值(MAIL_TRACKING_VALUE)](module/mail/mail_tracking_value)|mail_tracking_value|主实体|SQL|mail_tracking_value|否|否|自控制|否||
|[邀请向导(MAIL_WIZARD_INVITE)](module/mail/mail_wizard_invite)|mail_wizard_invite|主实体|SQL|mail_wizard_invite|否|否|自控制|否||

