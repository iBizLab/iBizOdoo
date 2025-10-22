package cn.ibizlab.ibizodoo.base.resusersidentitycheck

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resusersidentitycheck.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS_IDENTITYCHECK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsersIdentitycheck extends GroovyDataEntityRuntime<ResUsersIdentitycheck,ResUsersIdentitycheckDTO,ResUsersIdentitycheckFilterDTO> {

    private static ResUsersIdentitycheck _instance
    void setInstance(ResUsersIdentitycheck instance) {
        _instance = instance
    }
    static ResUsersIdentitycheck getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersIdentitycheckDTO create(ResUsersIdentitycheckDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersIdentitycheckDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersIdentitycheckDTO update(ResUsersIdentitycheckDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersIdentitycheckDTO.class)
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
    ResUsersIdentitycheckDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersIdentitycheckDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersIdentitycheckDTO getDraft(ResUsersIdentitycheckDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersIdentitycheckDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersIdentitycheckDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersIdentitycheckDTO save(ResUsersIdentitycheckDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersIdentitycheckDTO.class)
    }

}