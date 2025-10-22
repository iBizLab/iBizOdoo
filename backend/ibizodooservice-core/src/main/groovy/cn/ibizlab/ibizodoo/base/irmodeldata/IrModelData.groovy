package cn.ibizlab.ibizodoo.base.irmodeldata

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodeldata.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL_DATA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModelData extends GroovyDataEntityRuntime<IrModelData,IrModelDataDTO,IrModelDataFilterDTO> {

    private static IrModelData _instance
    void setInstance(IrModelData instance) {
        _instance = instance
    }
    static IrModelData getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelDataDTO create(IrModelDataDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelDataDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelDataDTO update(IrModelDataDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelDataDTO.class)
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
    IrModelDataDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelDataDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelDataDTO getDraft(IrModelDataDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelDataDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelDataDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelDataDTO save(IrModelDataDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelDataDTO.class)
    }

}