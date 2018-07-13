package cn.lvshengyi.onelvshengyi.entity.dto;

public class ArticleReleaseDTO {

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
     * 文章状态
     * @see cn.lvshengyi.onelvshengyi.constant.ArticleStatusEnum
     */
    private Integer status;

    /**
     * 正文内容
     */
    private String content;
}
