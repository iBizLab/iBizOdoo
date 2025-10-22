package cn.ibizlab.ibizodoo.mail.mailtemplatereset

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailtemplatereset.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_TEMPLATE_RESET]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailTemplateReset extends GroovyDataEntityRuntime<MailTemplateReset,MailTemplateResetDTO,MailTemplateResetFilterDTO> {

    private static MailTemplateReset _instance
    void setInstance(MailTemplateReset instance) {
        _instance = instance
    }
    static MailTemplateReset getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailTemplateResetDTO create(MailTemplateResetDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailTemplateResetDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailTemplateResetDTO update(MailTemplateResetDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailTemplateResetDTO.class)
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
    MailTemplateResetDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailTemplateResetDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailTemplateResetDTO getDraft(MailTemplateResetDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailTemplateResetDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailTemplateResetDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailTemplateResetDTO save(MailTemplateResetDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailTemplateResetDTO.class)
    }

}