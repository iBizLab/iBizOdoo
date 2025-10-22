package cn.ibizlab.ibizodoo.base.irmodulemoduleexclusion

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodulemoduleexclusion.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODULE_MODULE_EXCLUSION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModuleModuleExclusion extends GroovyDataEntityRuntime<IrModuleModuleExclusion,IrModuleModuleExclusionDTO,IrModuleModuleExclusionFilterDTO> {

    private static IrModuleModuleExclusion _instance
    void setInstance(IrModuleModuleExclusion instance) {
        _instance = instance
    }
    static IrModuleModuleExclusion getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModuleModuleExclusionDTO create(IrModuleModuleExclusionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModuleModuleExclusionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModuleModuleExclusionDTO update(IrModuleModuleExclusionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModuleModuleExclusionDTO.class)
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
    IrModuleModuleExclusionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModuleModuleExclusionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModuleModuleExclusionDTO getDraft(IrModuleModuleExclusionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModuleModuleExclusionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModuleModuleExclusionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModuleModuleExclusionDTO save(IrModuleModuleExclusionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModuleModuleExclusionDTO.class)
    }

}