package cn.lvshengyi.onelvshengyi.dao;

import cn.lvshengyi.onelvshengyi.entity.po.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ArticleDAO {

    /**
     * 根据id获取数据
     *
     * @param articleId
     * @return
     */
    @Select("SELECT article WHERE id = #{id}")
    Article findById(Integer articleId);

    /**
     * 插入数据
     *
     * @param article
     * @return
     */
    @Insert("INSERT INTO article(category_id, title, keyword, status, content) VALUES(#{categoryId}, #{title}, #{keyword}, #{status}, #{content})")
    Integer add(Article article);

    /**
     * 根据id更新文章状态
     *
     * @param articleId
     * @param status
     */
    @Update("UPDATE article SET status = #{status} WHERE id = #{id}")
    void updateStatus(@Param("id") Integer articleId, @Param("status") Integer status);
}
