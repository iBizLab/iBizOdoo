package cn.ibizlab.ibizodoo.mail.mailactivityplan

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailactivityplan.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY_PLAN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivityPlan extends GroovyDataEntityRuntime<MailActivityPlan,MailActivityPlanDTO,MailActivityPlanFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailActivityPlan _instance
    void setInstance(MailActivityPlan instance) {
        _instance = instance
    }
    static MailActivityPlan getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityPlanDTO create(MailActivityPlanDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityPlanDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityPlanDTO update(MailActivityPlanDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityPlanDTO.class)
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
    MailActivityPlanDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityPlanDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityPlanDTO getDraft(MailActivityPlanDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityPlanDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityPlanDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityPlanDTO save(MailActivityPlanDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityPlanDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailActivityPlanDTO> fetchDefault(MailActivityPlanFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailActivityPlanDTO.class)
    }

}