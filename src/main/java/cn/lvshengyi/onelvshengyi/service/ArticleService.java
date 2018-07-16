package cn.lvshengyi.onelvshengyi.service;

import cn.lvshengyi.onelvshengyi.entity.dto.ArticleDTO;
import cn.lvshengyi.onelvshengyi.entity.po.ArticlePO;

public interface ArticleService {

    /**
     * 根据id获取文章
     *
     * @param id
     * @return
     */
    ArticlePO findById(Integer id);

    /**
     * 添加文章
     *
     * @param articleDTO
     * @return
     */
    Integer add(ArticleDTO articleDTO);

    /**
     * 更新文章
     *
     * @param articleDTO
     * @return
     */
    Integer update(ArticleDTO articleDTO);

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
