package cn.lvshengyi.onelvshengyi.service;

import cn.lvshengyi.onelvshengyi.entity.dto.CategoryDTO;
import cn.lvshengyi.onelvshengyi.entity.po.Category;

public interface CategoryService {

    /**
     * 根据id获取分类
     *
     * @param categoryId
     * @return
     */
    Category findById(Integer categoryId);

    /**
     * 添加分类
     *
     * @param categoryDTO
     * @return
     */
    Integer add(CategoryDTO categoryDTO);

    /**
     * 根据id删除分类
     *
     * @param categoryId
     */
    void deleteById(Integer categoryId);
}
