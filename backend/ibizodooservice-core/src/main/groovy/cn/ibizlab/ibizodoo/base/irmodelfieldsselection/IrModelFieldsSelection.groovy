package cn.ibizlab.ibizodoo.base.irmodelfieldsselection

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irmodelfieldsselection.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL_FIELDS_SELECTION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModelFieldsSelection extends GroovyDataEntityRuntime<IrModelFieldsSelection,IrModelFieldsSelectionDTO,IrModelFieldsSelectionFilterDTO> {

    private static IrModelFieldsSelection _instance
    void setInstance(IrModelFieldsSelection instance) {
        _instance = instance
    }
    static IrModelFieldsSelection getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelFieldsSelectionDTO create(IrModelFieldsSelectionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelFieldsSelectionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelFieldsSelectionDTO update(IrModelFieldsSelectionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelFieldsSelectionDTO.class)
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
    IrModelFieldsSelectionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelFieldsSelectionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelFieldsSelectionDTO getDraft(IrModelFieldsSelectionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelFieldsSelectionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelFieldsSelectionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelFieldsSelectionDTO save(IrModelFieldsSelectionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelFieldsSelectionDTO.class)
    }

}