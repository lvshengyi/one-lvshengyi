package cn.lvshengyi.onelvshengyi.entity.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author LvShengyI
 */
@Data
@ToString
public class CategoryPO {

    /**
     * 分类id
     */
    private Integer id;

    /**
     * 分类颜色码，使用16进制颜色
     */
    private String colorCode;

    /**
     * 分类名
     */
    private String name;

    /**
     * 分类简介
     */
    private String intro;
}