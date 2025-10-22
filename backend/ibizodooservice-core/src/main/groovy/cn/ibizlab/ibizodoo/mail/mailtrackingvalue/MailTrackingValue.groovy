package cn.ibizlab.ibizodoo.mail.mailtrackingvalue

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailtrackingvalue.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_TRACKING_VALUE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailTrackingValue extends GroovyDataEntityRuntime<MailTrackingValue,MailTrackingValueDTO,MailTrackingValueFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailTrackingValue _instance
    void setInstance(MailTrackingValue instance) {
        _instance = instance
    }
    static MailTrackingValue getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailTrackingValueDTO create(MailTrackingValueDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailTrackingValueDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailTrackingValueDTO update(MailTrackingValueDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailTrackingValueDTO.class)
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
    MailTrackingValueDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailTrackingValueDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailTrackingValueDTO getDraft(MailTrackingValueDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailTrackingValueDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailTrackingValueDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailTrackingValueDTO save(MailTrackingValueDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailTrackingValueDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailTrackingValueDTO> fetchDefault(MailTrackingValueFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailTrackingValueDTO.class)
    }

}