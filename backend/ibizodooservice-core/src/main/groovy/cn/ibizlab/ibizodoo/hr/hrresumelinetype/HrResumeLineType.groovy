package cn.ibizlab.ibizodoo.hr.hrresumelinetype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrresumelinetype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_RESUME_LINE_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrResumeLineType extends GroovyDataEntityRuntime<HrResumeLineType,HrResumeLineTypeDTO,HrResumeLineTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrResumeLineType _instance
    void setInstance(HrResumeLineType instance) {
        _instance = instance
    }
    static HrResumeLineType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrResumeLineTypeDTO create(HrResumeLineTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrResumeLineTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrResumeLineTypeDTO update(HrResumeLineTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrResumeLineTypeDTO.class)
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
    HrResumeLineTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrResumeLineTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrResumeLineTypeDTO getDraft(HrResumeLineTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrResumeLineTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrResumeLineTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrResumeLineTypeDTO save(HrResumeLineTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrResumeLineTypeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrResumeLineTypeDTO> fetchDefault(HrResumeLineTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrResumeLineTypeDTO.class)
    }

}