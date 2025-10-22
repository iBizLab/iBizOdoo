package cn.ibizlab.ibizodoo.mail.mailcomposemessage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailcomposemessage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_COMPOSE_MESSAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailComposeMessage extends GroovyDataEntityRuntime<MailComposeMessage,MailComposeMessageDTO,MailComposeMessageFilterDTO> {

    private static MailComposeMessage _instance
    void setInstance(MailComposeMessage instance) {
        _instance = instance
    }
    static MailComposeMessage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailComposeMessageDTO create(MailComposeMessageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailComposeMessageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailComposeMessageDTO update(MailComposeMessageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailComposeMessageDTO.class)
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
    MailComposeMessageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailComposeMessageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailComposeMessageDTO getDraft(MailComposeMessageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailComposeMessageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailComposeMessageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailComposeMessageDTO save(MailComposeMessageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailComposeMessageDTO.class)
    }

}