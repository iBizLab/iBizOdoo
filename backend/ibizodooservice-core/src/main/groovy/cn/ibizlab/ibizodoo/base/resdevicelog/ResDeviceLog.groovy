package cn.ibizlab.ibizodoo.base.resdevicelog

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.resdevicelog.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_DEVICE_LOG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResDeviceLog extends GroovyDataEntityRuntime<ResDeviceLog,ResDeviceLogDTO,ResDeviceLogFilterDTO> {

    private static ResDeviceLog _instance
    void setInstance(ResDeviceLog instance) {
        _instance = instance
    }
    static ResDeviceLog getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResDeviceLogDTO create(ResDeviceLogDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResDeviceLogDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResDeviceLogDTO update(ResDeviceLogDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResDeviceLogDTO.class)
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
    ResDeviceLogDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResDeviceLogDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResDeviceLogDTO getDraft(ResDeviceLogDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResDeviceLogDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResDeviceLogDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResDeviceLogDTO save(ResDeviceLogDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResDeviceLogDTO.class)
    }

}