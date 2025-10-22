package cn.ibizlab.ibizodoo.hr.hrapplicant

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrapplicant.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_APPLICANT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrApplicant extends GroovyDataEntityRuntime<HrApplicant,HrApplicantDTO,HrApplicantFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrApplicant _instance
    void setInstance(HrApplicant instance) {
        _instance = instance
    }
    static HrApplicant getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrApplicantDTO create(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrApplicantDTO update(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrApplicantDTO.class)
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
    HrApplicantDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrApplicantDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrApplicantDTO getDraft(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrApplicantDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrApplicantDTO save(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrApplicantDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrApplicantDTO> fetchDefault(HrApplicantFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrApplicantDTO.class)
    }

}