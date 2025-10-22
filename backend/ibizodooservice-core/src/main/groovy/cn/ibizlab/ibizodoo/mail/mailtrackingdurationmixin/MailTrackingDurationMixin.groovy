package cn.ibizlab.ibizodoo.mail.mailtrackingdurationmixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailtrackingdurationmixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_TRACKING_DURATION_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailTrackingDurationMixin extends GroovyDataEntityRuntime<MailTrackingDurationMixin,MailTrackingDurationMixinDTO,MailTrackingDurationMixinFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailTrackingDurationMixin _instance
    void setInstance(MailTrackingDurationMixin instance) {
        _instance = instance
    }
    static MailTrackingDurationMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailTrackingDurationMixinDTO create(MailTrackingDurationMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailTrackingDurationMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailTrackingDurationMixinDTO update(MailTrackingDurationMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailTrackingDurationMixinDTO.class)
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
    MailTrackingDurationMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailTrackingDurationMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailTrackingDurationMixinDTO getDraft(MailTrackingDurationMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailTrackingDurationMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailTrackingDurationMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailTrackingDurationMixinDTO save(MailTrackingDurationMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailTrackingDurationMixinDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailTrackingDurationMixinDTO> fetchDefault(MailTrackingDurationMixinFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailTrackingDurationMixinDTO.class)
    }

}