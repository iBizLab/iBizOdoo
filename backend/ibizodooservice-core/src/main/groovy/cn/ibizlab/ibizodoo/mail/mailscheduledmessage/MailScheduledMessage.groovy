package cn.ibizlab.ibizodoo.mail.mailscheduledmessage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailscheduledmessage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_SCHEDULED_MESSAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailScheduledMessage extends GroovyDataEntityRuntime<MailScheduledMessage,MailScheduledMessageDTO,MailScheduledMessageFilterDTO> {

    private static MailScheduledMessage _instance
    void setInstance(MailScheduledMessage instance) {
        _instance = instance
    }
    static MailScheduledMessage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailScheduledMessageDTO create(MailScheduledMessageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailScheduledMessageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailScheduledMessageDTO update(MailScheduledMessageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailScheduledMessageDTO.class)
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
    MailScheduledMessageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailScheduledMessageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailScheduledMessageDTO getDraft(MailScheduledMessageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailScheduledMessageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailScheduledMessageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailScheduledMessageDTO save(MailScheduledMessageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailScheduledMessageDTO.class)
    }

}