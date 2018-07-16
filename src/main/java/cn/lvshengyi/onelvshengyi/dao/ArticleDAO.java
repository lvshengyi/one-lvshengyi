package cn.lvshengyi.onelvshengyi.dao;

import cn.lvshengyi.onelvshengyi.entity.po.ArticlePO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDAO {

    /**
     * 根据id获取数据
     *
     * @param articleId
     * @return
     */
    @Select("SELECT article WHERE id = #{id}")
    ArticlePO findById(Integer articleId);

    /**
     * 插入数据
     *
     * @param articlePO
     * @return
     */
    @Insert("INSERT INTO articlePO(category_id, title, keyword, status, content) VALUES(#{categoryId}, #{title}, #{keyword}, #{status}, #{content})")
    Integer add(ArticlePO articlePO);

    /**
     * 更新数据
     *
     * @param articlePO
     * @return
     */
    @Update("UPDATE articlePO SET category_id = #{categoryId}, title = #{title}, keyword = #{keyword}, status = #{status}, content = #{content} WHERE id = #{id}")
    Integer update(ArticlePO articlePO);

    /**
     * 根据id更新文章状态
     *
     * @param articleId
     * @param status
     */
    @Update("UPDATE article SET status = #{status} WHERE id = #{id}")
    void updateStatus(@Param("id") Integer articleId, @Param("status") Integer status);
}
