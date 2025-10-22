package cn.ibizlab.ibizodoo.mail.mailblacklist

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailblacklist.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_BLACKLIST]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailBlacklist extends GroovyDataEntityRuntime<MailBlacklist,MailBlacklistDTO,MailBlacklistFilterDTO> {

    private static MailBlacklist _instance
    void setInstance(MailBlacklist instance) {
        _instance = instance
    }
    static MailBlacklist getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailBlacklistDTO create(MailBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailBlacklistDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailBlacklistDTO update(MailBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailBlacklistDTO.class)
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
    MailBlacklistDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailBlacklistDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailBlacklistDTO getDraft(MailBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailBlacklistDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailBlacklistDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailBlacklistDTO save(MailBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailBlacklistDTO.class)
    }

}