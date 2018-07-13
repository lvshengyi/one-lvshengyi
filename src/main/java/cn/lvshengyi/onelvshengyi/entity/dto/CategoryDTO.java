package cn.lvshengyi.onelvshengyi.entity.dto;

import lombok.Data;

@Data
public class CategoryDTO {

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
