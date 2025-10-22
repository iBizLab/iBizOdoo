package cn.ibizlab.ibizodoo.mail.mailresendpartner

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailresendpartner.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_RESEND_PARTNER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailResendPartner extends GroovyDataEntityRuntime<MailResendPartner,MailResendPartnerDTO,MailResendPartnerFilterDTO> {

    private static MailResendPartner _instance
    void setInstance(MailResendPartner instance) {
        _instance = instance
    }
    static MailResendPartner getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailResendPartnerDTO create(MailResendPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailResendPartnerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailResendPartnerDTO update(MailResendPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailResendPartnerDTO.class)
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
    MailResendPartnerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailResendPartnerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailResendPartnerDTO getDraft(MailResendPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailResendPartnerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailResendPartnerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailResendPartnerDTO save(MailResendPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailResendPartnerDTO.class)
    }

}