package cn.ibizlab.ibizodoo.mail.mailthreadcc

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailthreadcc.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_THREAD_CC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailThreadCc extends GroovyDataEntityRuntime<MailThreadCc,MailThreadCcDTO,MailThreadCcFilterDTO> {

    private static MailThreadCc _instance
    void setInstance(MailThreadCc instance) {
        _instance = instance
    }
    static MailThreadCc getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailThreadCcDTO create(MailThreadCcDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailThreadCcDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailThreadCcDTO update(MailThreadCcDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailThreadCcDTO.class)
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
    MailThreadCcDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailThreadCcDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailThreadCcDTO getDraft(MailThreadCcDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailThreadCcDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailThreadCcDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailThreadCcDTO save(MailThreadCcDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailThreadCcDTO.class)
    }

}