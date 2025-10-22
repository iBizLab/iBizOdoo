package cn.ibizlab.ibizodoo.mail.mailthreadblacklist

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailthreadblacklist.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_THREAD_BLACKLIST]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailThreadBlacklist extends GroovyDataEntityRuntime<MailThreadBlacklist,MailThreadBlacklistDTO,MailThreadBlacklistFilterDTO> {

    private static MailThreadBlacklist _instance
    void setInstance(MailThreadBlacklist instance) {
        _instance = instance
    }
    static MailThreadBlacklist getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailThreadBlacklistDTO create(MailThreadBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailThreadBlacklistDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailThreadBlacklistDTO update(MailThreadBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailThreadBlacklistDTO.class)
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
    MailThreadBlacklistDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailThreadBlacklistDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailThreadBlacklistDTO getDraft(MailThreadBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailThreadBlacklistDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailThreadBlacklistDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailThreadBlacklistDTO save(MailThreadBlacklistDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailThreadBlacklistDTO.class)
    }

}