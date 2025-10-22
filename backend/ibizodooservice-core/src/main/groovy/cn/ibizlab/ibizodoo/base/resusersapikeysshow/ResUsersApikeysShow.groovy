package cn.ibizlab.ibizodoo.base.resusersapikeysshow

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resusersapikeysshow.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS_APIKEYS_SHOW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsersApikeysShow extends GroovyDataEntityRuntime<ResUsersApikeysShow,ResUsersApikeysShowDTO,ResUsersApikeysShowFilterDTO> {

    private static ResUsersApikeysShow _instance
    void setInstance(ResUsersApikeysShow instance) {
        _instance = instance
    }
    static ResUsersApikeysShow getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersApikeysShowDTO create(ResUsersApikeysShowDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersApikeysShowDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersApikeysShowDTO update(ResUsersApikeysShowDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersApikeysShowDTO.class)
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
    ResUsersApikeysShowDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersApikeysShowDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersApikeysShowDTO getDraft(ResUsersApikeysShowDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersApikeysShowDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersApikeysShowDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersApikeysShowDTO save(ResUsersApikeysShowDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersApikeysShowDTO.class)
    }

}