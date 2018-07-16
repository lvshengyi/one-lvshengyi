package cn.lvshengyi.onelvshengyi.entity.po;

import cn.lvshengyi.onelvshengyi.entity.dto.ArticleDTO;
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
public class Article {

    /**
     * 文章id
     */
    private Integer id;

    /**
     * 分类id
     */
    private Integer categoryId;

    /**
     * 标题
     */
    private String title;

    /**
     * 关键词
     */
    private String keyword;

    /**
     * 发布时间
     */
    private Long releaseTime;

    /**
     * 文章状态
     * @see cn.lvshengyi.onelvshengyi.constant.ArticleStatusEnum
     */
    private Integer status;

    /**
     * 正文内容
     */
    private String content;

    public static Article buildByArticleDTO(ArticleDTO articleDTO){
        Article article = new Article();

        BeanUtils.copyProperties(articleDTO, article);

        return article;
    }

}