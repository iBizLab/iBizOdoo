package cn.ibizlab.ibizodoo.hr.hrcandidate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrcandidate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidate extends GroovyDataEntityRuntime<HrCandidate,HrCandidateDTO,HrCandidateFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrCandidate _instance
    void setInstance(HrCandidate instance) {
        _instance = instance
    }
    static HrCandidate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateDTO create(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateDTO update(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateDTO.class)
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
    HrCandidateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateDTO getDraft(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateDTO save(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateDTO> fetchDefault(HrCandidateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateDTO.class)
    }

}