package cn.lvshengyi.onelvshengyi.entity;

import lombok.Data;

/**
 * @author LvShengyI
 */
@Data
public class CategoryDO {

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