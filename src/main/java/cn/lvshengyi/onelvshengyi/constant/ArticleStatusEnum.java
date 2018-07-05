package cn.lvshengyi.onelvshengyi.constant;

import lombok.Getter;

/**
 * @author LvShengyI
 */
public enum ArticleStatusEnum {

    /**
     * 可见
     */
    VISIBLE(1),

    /**
     * 不可见
     */
    INVISIBLE(2);

    @Getter
    private Integer code;

    ArticleStatusEnum(Integer code){
        this.code = code;
    }
}
