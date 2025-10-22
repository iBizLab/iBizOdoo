package cn.ibizlab.ibizodoo.mail.mailmessagetranslation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailmessagetranslation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_MESSAGE_TRANSLATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailMessageTranslation extends GroovyDataEntityRuntime<MailMessageTranslation,MailMessageTranslationDTO,MailMessageTranslationFilterDTO> {

    private static MailMessageTranslation _instance
    void setInstance(MailMessageTranslation instance) {
        _instance = instance
    }
    static MailMessageTranslation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailMessageTranslationDTO create(MailMessageTranslationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailMessageTranslationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailMessageTranslationDTO update(MailMessageTranslationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailMessageTranslationDTO.class)
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
    MailMessageTranslationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailMessageTranslationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailMessageTranslationDTO getDraft(MailMessageTranslationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailMessageTranslationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailMessageTranslationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailMessageTranslationDTO save(MailMessageTranslationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailMessageTranslationDTO.class)
    }

}