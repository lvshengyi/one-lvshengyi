package cn.lvshengyi.onelvshengyi.constant;

import lombok.Getter;

/**
 * @author LvShengyI
 */
public enum UserStatusEnum {

    /**
     * 正常
     */
    NORMAL(1),

    /**
     * 禁言
     */
    SLIENT(2);

    @Getter
    private Integer code;

    UserStatusEnum(Integer code) {
        this.code = code;
    }
}
