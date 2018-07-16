package cn.lvshengyi.onelvshengyi.entity.po;

import cn.lvshengyi.onelvshengyi.entity.dto.CategoryDTO;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

/**
 * @author LvShengyI
 */
@Data
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Category {

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

    public static Category buildByCategoryDTO(CategoryDTO categoryDTO){
        Category category = new Category();

        BeanUtils.copyProperties(categoryDTO, category);

        return category;
    }
}