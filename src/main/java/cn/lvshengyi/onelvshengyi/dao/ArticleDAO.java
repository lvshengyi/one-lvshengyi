package cn.lvshengyi.onelvshengyi.dao;

import cn.lvshengyi.onelvshengyi.entity.po.ArticlePO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ArticleDAO {

    @Select("SELECT article WHERE id = #{id}")
    ArticlePO findById(Integer articleId);

    @Insert("INSERT INTO article(category_id, title, keyword, status, content) VALUES(#{categoryId}, #{title}, #{keyword}, #{status}, #{content})")
    Integer add(ArticlePO articlePO);

    @Update("UPDATE article SET status = #{status} WHERE id = #{id}")
    void updateStatus(@Param("id") Integer articleId, @Param("status") Integer status);
}
