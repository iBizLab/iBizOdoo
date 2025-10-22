package cn.ibizlab.ibizodoo.mail.mailthreadphone

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailthreadphone.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_THREAD_PHONE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailThreadPhone extends GroovyDataEntityRuntime<MailThreadPhone,MailThreadPhoneDTO,MailThreadPhoneFilterDTO> {

    private static MailThreadPhone _instance
    void setInstance(MailThreadPhone instance) {
        _instance = instance
    }
    static MailThreadPhone getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailThreadPhoneDTO create(MailThreadPhoneDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailThreadPhoneDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailThreadPhoneDTO update(MailThreadPhoneDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailThreadPhoneDTO.class)
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
    MailThreadPhoneDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailThreadPhoneDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailThreadPhoneDTO getDraft(MailThreadPhoneDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailThreadPhoneDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailThreadPhoneDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailThreadPhoneDTO save(MailThreadPhoneDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailThreadPhoneDTO.class)
    }

}