package cn.ibizlab.ibizodoo.mail.mailpush

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailpush.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_PUSH]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailPush extends GroovyDataEntityRuntime<MailPush,MailPushDTO,MailPushFilterDTO> {

    private static MailPush _instance
    void setInstance(MailPush instance) {
        _instance = instance
    }
    static MailPush getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailPushDTO create(MailPushDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailPushDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailPushDTO update(MailPushDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailPushDTO.class)
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
    MailPushDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailPushDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailPushDTO getDraft(MailPushDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailPushDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailPushDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailPushDTO save(MailPushDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailPushDTO.class)
    }

}