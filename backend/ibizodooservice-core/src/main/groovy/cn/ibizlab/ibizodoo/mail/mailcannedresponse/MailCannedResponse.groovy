package cn.ibizlab.ibizodoo.mail.mailcannedresponse

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailcannedresponse.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_CANNED_RESPONSE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailCannedResponse extends GroovyDataEntityRuntime<MailCannedResponse,MailCannedResponseDTO,MailCannedResponseFilterDTO> {

    private static MailCannedResponse _instance
    void setInstance(MailCannedResponse instance) {
        _instance = instance
    }
    static MailCannedResponse getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailCannedResponseDTO create(MailCannedResponseDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailCannedResponseDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailCannedResponseDTO update(MailCannedResponseDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailCannedResponseDTO.class)
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
    MailCannedResponseDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailCannedResponseDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailCannedResponseDTO getDraft(MailCannedResponseDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailCannedResponseDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailCannedResponseDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailCannedResponseDTO save(MailCannedResponseDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailCannedResponseDTO.class)
    }

}