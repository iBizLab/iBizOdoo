package cn.ibizlab.ibizodoo.hr.hrdeparturereason

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.hr.hrdeparturereason.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_DEPARTURE_REASON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrDepartureReason extends GroovyDataEntityRuntime<HrDepartureReason,HrDepartureReasonDTO,HrDepartureReasonFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrDepartureReason _instance
    void setInstance(HrDepartureReason instance) {
        _instance = instance
    }
    static HrDepartureReason getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrDepartureReasonDTO create(HrDepartureReasonDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrDepartureReasonDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrDepartureReasonDTO update(HrDepartureReasonDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrDepartureReasonDTO.class)
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
    HrDepartureReasonDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrDepartureReasonDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrDepartureReasonDTO getDraft(HrDepartureReasonDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrDepartureReasonDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrDepartureReasonDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrDepartureReasonDTO save(HrDepartureReasonDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrDepartureReasonDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrDepartureReasonDTO> fetchDefault(HrDepartureReasonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrDepartureReasonDTO.class)
    }

}