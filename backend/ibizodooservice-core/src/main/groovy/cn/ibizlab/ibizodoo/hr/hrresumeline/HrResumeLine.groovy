package cn.ibizlab.ibizodoo.hr.hrresumeline

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrresumeline.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_RESUME_LINE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrResumeLine extends GroovyDataEntityRuntime<HrResumeLine,HrResumeLineDTO,HrResumeLineFilterDTO> {

    private static HrResumeLine _instance
    void setInstance(HrResumeLine instance) {
        _instance = instance
    }
    static HrResumeLine getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrResumeLineDTO create(HrResumeLineDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrResumeLineDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrResumeLineDTO update(HrResumeLineDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrResumeLineDTO.class)
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
    HrResumeLineDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrResumeLineDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrResumeLineDTO getDraft(HrResumeLineDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrResumeLineDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrResumeLineDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrResumeLineDTO save(HrResumeLineDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrResumeLineDTO.class)
    }

}