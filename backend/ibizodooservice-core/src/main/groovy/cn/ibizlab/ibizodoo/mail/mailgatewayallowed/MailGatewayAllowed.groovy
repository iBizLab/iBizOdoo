package cn.ibizlab.ibizodoo.mail.mailgatewayallowed

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ibizodoo.mail.mailgatewayallowed.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_GATEWAY_ALLOWED]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailGatewayAllowed extends GroovyDataEntityRuntime<MailGatewayAllowed,MailGatewayAllowedDTO,MailGatewayAllowedFilterDTO> {

    private static MailGatewayAllowed _instance
    void setInstance(MailGatewayAllowed instance) {
        _instance = instance
    }
    static MailGatewayAllowed getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailGatewayAllowedDTO create(MailGatewayAllowedDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailGatewayAllowedDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailGatewayAllowedDTO update(MailGatewayAllowedDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailGatewayAllowedDTO.class)
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
    MailGatewayAllowedDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailGatewayAllowedDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailGatewayAllowedDTO getDraft(MailGatewayAllowedDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailGatewayAllowedDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailGatewayAllowedDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailGatewayAllowedDTO save(MailGatewayAllowedDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailGatewayAllowedDTO.class)
    }

}