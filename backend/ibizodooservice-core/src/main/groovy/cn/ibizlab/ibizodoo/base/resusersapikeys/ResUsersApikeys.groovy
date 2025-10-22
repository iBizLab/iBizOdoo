package cn.ibizlab.ibizodoo.base.resusersapikeys

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resusersapikeys.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS_APIKEYS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsersApikeys extends GroovyDataEntityRuntime<ResUsersApikeys,ResUsersApikeysDTO,ResUsersApikeysFilterDTO> {

    private static ResUsersApikeys _instance
    void setInstance(ResUsersApikeys instance) {
        _instance = instance
    }
    static ResUsersApikeys getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersApikeysDTO create(ResUsersApikeysDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersApikeysDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersApikeysDTO update(ResUsersApikeysDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersApikeysDTO.class)
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
    ResUsersApikeysDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersApikeysDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersApikeysDTO getDraft(ResUsersApikeysDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersApikeysDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersApikeysDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersApikeysDTO save(ResUsersApikeysDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersApikeysDTO.class)
    }

}