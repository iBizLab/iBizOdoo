package cn.ibizlab.ibizodoo.mail.mailwizardinvite

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailwizardinvite.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_WIZARD_INVITE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailWizardInvite extends GroovyDataEntityRuntime<MailWizardInvite,MailWizardInviteDTO,MailWizardInviteFilterDTO> {

    private static MailWizardInvite _instance
    void setInstance(MailWizardInvite instance) {
        _instance = instance
    }
    static MailWizardInvite getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailWizardInviteDTO create(MailWizardInviteDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailWizardInviteDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailWizardInviteDTO update(MailWizardInviteDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailWizardInviteDTO.class)
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
    MailWizardInviteDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailWizardInviteDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailWizardInviteDTO getDraft(MailWizardInviteDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailWizardInviteDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailWizardInviteDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailWizardInviteDTO save(MailWizardInviteDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailWizardInviteDTO.class)
    }

}