package cn.ibizlab.ibizodoo.base.irmodelrelation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodelrelation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL_RELATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModelRelation extends GroovyDataEntityRuntime<IrModelRelation,IrModelRelationDTO,IrModelRelationFilterDTO> {

    private static IrModelRelation _instance
    void setInstance(IrModelRelation instance) {
        _instance = instance
    }
    static IrModelRelation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelRelationDTO create(IrModelRelationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelRelationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelRelationDTO update(IrModelRelationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelRelationDTO.class)
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
    IrModelRelationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelRelationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelRelationDTO getDraft(IrModelRelationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelRelationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelRelationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelRelationDTO save(IrModelRelationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelRelationDTO.class)
    }

}