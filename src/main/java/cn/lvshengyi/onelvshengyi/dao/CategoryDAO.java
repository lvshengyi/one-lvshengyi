package cn.lvshengyi.onelvshengyi.dao;

import cn.lvshengyi.onelvshengyi.entity.po.CategoryPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDAO {

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM category WHERE id = #{id}")
    CategoryPO findById(Integer id);

    /**
     * 添加数据
     *
     * @param categoryPO
     * @return
     */
    @Insert("INSERT INTO category(color_code, name, intro) VALUES(#{colorCode}, #{name}, #{intro}")
    Integer add(CategoryPO categoryPO);

    /**
     * 根据id删除数据
     *
     * @param id
     */
    @Delete("DELETE category WHERE id = #{id}")
    void deleteById(Integer id);
}
