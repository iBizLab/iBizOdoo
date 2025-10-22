package cn.ibizlab.ibizodoo.mail.mailbot

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailbot.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_BOT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailBot extends GroovyDataEntityRuntime<MailBot,MailBotDTO,MailBotFilterDTO> {

    private static MailBot _instance
    void setInstance(MailBot instance) {
        _instance = instance
    }
    static MailBot getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailBotDTO create(MailBotDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailBotDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailBotDTO update(MailBotDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailBotDTO.class)
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
    MailBotDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailBotDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailBotDTO getDraft(MailBotDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailBotDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailBotDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailBotDTO save(MailBotDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailBotDTO.class)
    }

}