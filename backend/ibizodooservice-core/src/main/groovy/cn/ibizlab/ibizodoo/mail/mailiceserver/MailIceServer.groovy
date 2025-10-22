package cn.ibizlab.ibizodoo.mail.mailiceserver

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailiceserver.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ICE_SERVER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailIceServer extends GroovyDataEntityRuntime<MailIceServer,MailIceServerDTO,MailIceServerFilterDTO> {

    private static MailIceServer _instance
    void setInstance(MailIceServer instance) {
        _instance = instance
    }
    static MailIceServer getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailIceServerDTO create(MailIceServerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailIceServerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailIceServerDTO update(MailIceServerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailIceServerDTO.class)
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
    MailIceServerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailIceServerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailIceServerDTO getDraft(MailIceServerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailIceServerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailIceServerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailIceServerDTO save(MailIceServerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailIceServerDTO.class)
    }

}