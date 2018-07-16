package cn.lvshengyi.onelvshengyi.service.impl;

import cn.lvshengyi.onelvshengyi.dao.CategoryDAO;
import cn.lvshengyi.onelvshengyi.entity.dto.CategoryDTO;
import cn.lvshengyi.onelvshengyi.entity.po.Category;
import cn.lvshengyi.onelvshengyi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public Category findById(Integer categoryId) {
        return categoryDAO.findById(categoryId);
    }

    @Override
    public Integer add(CategoryDTO categoryDTO) {
        return categoryDAO.add(Category.buildByCategoryDTO(categoryDTO));
    }

    @Override
    public void deleteById(Integer categoryId) {
        categoryDAO.deleteById(categoryId);
    }
}
