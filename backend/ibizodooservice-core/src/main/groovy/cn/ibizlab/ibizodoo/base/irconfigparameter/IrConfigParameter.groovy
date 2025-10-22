package cn.ibizlab.ibizodoo.base.irconfigparameter

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.base.irconfigparameter.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_CONFIG_PARAMETER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrConfigParameter extends GroovyDataEntityRuntime<IrConfigParameter,IrConfigParameterDTO,IrConfigParameterFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrConfigParameter _instance
    void setInstance(IrConfigParameter instance) {
        _instance = instance
    }
    static IrConfigParameter getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrConfigParameterDTO create(IrConfigParameterDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrConfigParameterDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrConfigParameterDTO update(IrConfigParameterDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrConfigParameterDTO.class)
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
    IrConfigParameterDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrConfigParameterDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrConfigParameterDTO getDraft(IrConfigParameterDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrConfigParameterDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrConfigParameterDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrConfigParameterDTO save(IrConfigParameterDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrConfigParameterDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrConfigParameterDTO> fetchDefault(IrConfigParameterFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrConfigParameterDTO.class)
    }

}