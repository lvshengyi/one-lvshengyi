package cn.lvshengyi.onelvshengyi.dao;

import cn.lvshengyi.onelvshengyi.entity.po.Category;
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
    Category findById(Integer id);

    /**
     * 添加数据
     *
     * @param category
     * @return
     */
    @Insert("INSERT INTO category(color_code, name, intro) VALUES(#{colorCode}, #{name}, #{intro}")
    Integer add(Category category);

    /**
     * 根据id删除数据
     *
     * @param id
     */
    @Delete("DELETE category WHERE id = #{id}")
    void deleteById(Integer id);
}
