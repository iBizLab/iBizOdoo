package cn.ibizlab.ibizodoo.mail.mailresendmessage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailresendmessage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_RESEND_MESSAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailResendMessage extends GroovyDataEntityRuntime<MailResendMessage,MailResendMessageDTO,MailResendMessageFilterDTO> {

    private static MailResendMessage _instance
    void setInstance(MailResendMessage instance) {
        _instance = instance
    }
    static MailResendMessage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailResendMessageDTO create(MailResendMessageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailResendMessageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailResendMessageDTO update(MailResendMessageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailResendMessageDTO.class)
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
    MailResendMessageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailResendMessageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailResendMessageDTO getDraft(MailResendMessageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailResendMessageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailResendMessageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailResendMessageDTO save(MailResendMessageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailResendMessageDTO.class)
    }

}