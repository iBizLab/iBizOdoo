package cn.ibizlab.ibizodoo.audit.auditrecord

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.audit.auditrecord.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AUDIT_RECORD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AuditRecord extends GroovyDataEntityRuntime<AuditRecord,AuditRecordDTO,AuditRecordFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AuditRecord _instance
    void setInstance(AuditRecord instance) {
        _instance = instance
    }
    static AuditRecord getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AuditRecordDTO create(AuditRecordDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AuditRecordDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AuditRecordDTO update(AuditRecordDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AuditRecordDTO.class)
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
    AuditRecordDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AuditRecordDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AuditRecordDTO getDraft(AuditRecordDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AuditRecordDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AuditRecordDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AuditRecordDTO save(AuditRecordDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AuditRecordDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AuditRecordDTO> fetchDefault(AuditRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AuditRecordDTO.class)
    }

}