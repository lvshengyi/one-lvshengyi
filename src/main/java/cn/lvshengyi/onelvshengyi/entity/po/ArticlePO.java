package cn.lvshengyi.onelvshengyi.entity.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author LvShengyI
 */
@Data
@ToString
public class ArticlePO {
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
}