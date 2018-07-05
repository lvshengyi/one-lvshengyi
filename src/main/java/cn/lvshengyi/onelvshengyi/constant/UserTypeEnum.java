package cn.lvshengyi.onelvshengyi.constant;

import lombok.Getter;

/**
 * @author LvShengyI
 */
public enum UserTypeEnum {

    /**
     * 管理员
     */
    ADMINISTRATOR(1),

    /**
     * 普通用户
     */
    USUAL(2);

    @Getter
    private Integer code;

    UserTypeEnum(Integer code){
        this.code = code;
    }
}
