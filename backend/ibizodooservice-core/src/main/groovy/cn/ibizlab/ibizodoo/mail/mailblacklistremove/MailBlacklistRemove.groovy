package cn.ibizlab.ibizodoo.mail.mailblacklistremove

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailblacklistremove.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_BLACKLIST_REMOVE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailBlacklistRemove extends GroovyDataEntityRuntime<MailBlacklistRemove,MailBlacklistRemoveDTO,MailBlacklistRemoveFilterDTO> {

    private static MailBlacklistRemove _instance
    void setInstance(MailBlacklistRemove instance) {
        _instance = instance
    }
    static MailBlacklistRemove getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailBlacklistRemoveDTO create(MailBlacklistRemoveDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailBlacklistRemoveDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailBlacklistRemoveDTO update(MailBlacklistRemoveDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailBlacklistRemoveDTO.class)
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
    MailBlacklistRemoveDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailBlacklistRemoveDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailBlacklistRemoveDTO getDraft(MailBlacklistRemoveDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailBlacklistRemoveDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailBlacklistRemoveDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailBlacklistRemoveDTO save(MailBlacklistRemoveDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailBlacklistRemoveDTO.class)
    }

}