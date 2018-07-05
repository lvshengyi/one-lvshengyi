package cn.lvshengyi.onelvshengyi.constant;

import lombok.Getter;

/**
 * @author LvShengyI
 */
public enum MessageStatusEnum {

    /**
     * 未读
     */
    UNREAD(1),

    /**
     * 已读
     */
    READ(2);

    @Getter
    private Integer code;

    MessageStatusEnum(Integer code) {
        this.code = code;
    }
}
