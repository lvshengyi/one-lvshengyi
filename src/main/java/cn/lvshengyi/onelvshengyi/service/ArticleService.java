package cn.lvshengyi.onelvshengyi.service;

import cn.lvshengyi.onelvshengyi.entity.dto.ArticleDTO;

public interface ArticleService {

    /**
     * 添加文章
     *
     * @param articleDTO
     * @return
     */
    Integer add(ArticleDTO articleDTO);

    /**
     * 根据文章id隐藏文章
     *
     * @param articleId
     */
    void hideById(Integer articleId);

    /**
     * 根据文章id显示文章
     *
     * @param articleId
     */
    void showById(Integer articleId);
}
