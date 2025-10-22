package cn.ibizlab.ibizodoo.mail.mailnotification

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailnotification.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_NOTIFICATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailNotification extends GroovyDataEntityRuntime<MailNotification,MailNotificationDTO,MailNotificationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailNotification _instance
    void setInstance(MailNotification instance) {
        _instance = instance
    }
    static MailNotification getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailNotificationDTO create(MailNotificationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailNotificationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailNotificationDTO update(MailNotificationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailNotificationDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    MailNotificationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailNotificationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailNotificationDTO getDraft(MailNotificationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailNotificationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailNotificationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailNotificationDTO save(MailNotificationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailNotificationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailNotificationDTO> fetchDefault(MailNotificationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailNotificationDTO.class)
    }

}