package cn.ibizlab.ibizodoo.hr.hrrecruitmentstage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrrecruitmentstage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_RECRUITMENT_STAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrRecruitmentStage extends GroovyDataEntityRuntime<HrRecruitmentStage,HrRecruitmentStageDTO,HrRecruitmentStageFilterDTO> {

    private static HrRecruitmentStage _instance
    void setInstance(HrRecruitmentStage instance) {
        _instance = instance
    }
    static HrRecruitmentStage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrRecruitmentStageDTO create(HrRecruitmentStageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrRecruitmentStageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrRecruitmentStageDTO update(HrRecruitmentStageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrRecruitmentStageDTO.class)
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
    HrRecruitmentStageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrRecruitmentStageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrRecruitmentStageDTO getDraft(HrRecruitmentStageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrRecruitmentStageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrRecruitmentStageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrRecruitmentStageDTO save(HrRecruitmentStageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrRecruitmentStageDTO.class)
    }

}