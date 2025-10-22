package cn.ibizlab.ibizodoo.mail.mailmessagereaction

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailmessagereaction.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_MESSAGE_REACTION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailMessageReaction extends GroovyDataEntityRuntime<MailMessageReaction,MailMessageReactionDTO,MailMessageReactionFilterDTO> {

    private static MailMessageReaction _instance
    void setInstance(MailMessageReaction instance) {
        _instance = instance
    }
    static MailMessageReaction getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailMessageReactionDTO create(MailMessageReactionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailMessageReactionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailMessageReactionDTO update(MailMessageReactionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailMessageReactionDTO.class)
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
    MailMessageReactionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailMessageReactionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailMessageReactionDTO getDraft(MailMessageReactionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailMessageReactionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailMessageReactionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailMessageReactionDTO save(MailMessageReactionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailMessageReactionDTO.class)
    }

}