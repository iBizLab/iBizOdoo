package cn.ibizlab.ibizodoo.crm.crmactivityreport

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.crm.crmactivityreport.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_ACTIVITY_REPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmActivityReport extends GroovyDataEntityRuntime<CrmActivityReport,CrmActivityReportDTO,CrmActivityReportFilterDTO> {

    private static CrmActivityReport _instance
    void setInstance(CrmActivityReport instance) {
        _instance = instance
    }
    static CrmActivityReport getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmActivityReportDTO create(CrmActivityReportDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmActivityReportDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmActivityReportDTO update(CrmActivityReportDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmActivityReportDTO.class)
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
    CrmActivityReportDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmActivityReportDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmActivityReportDTO getDraft(CrmActivityReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmActivityReportDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmActivityReportDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmActivityReportDTO save(CrmActivityReportDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmActivityReportDTO.class)
    }

}