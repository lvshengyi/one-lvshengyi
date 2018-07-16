package cn.lvshengyi.onelvshengyi.service.impl;

import cn.lvshengyi.onelvshengyi.constant.ArticleStatusEnum;
import cn.lvshengyi.onelvshengyi.dao.ArticleDAO;
import cn.lvshengyi.onelvshengyi.entity.dto.ArticleDTO;
import cn.lvshengyi.onelvshengyi.entity.po.Article;
import cn.lvshengyi.onelvshengyi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDAO articleDAO;

    @Override
    public ArticlePO findById(Integer id) {
        return articleDAO.findById(id);
    }

    @Override
    public Integer add(ArticleDTO articleDTO) {
        return articleDAO.add(Article.buildByArticleDTO(articleDTO));
    }

    @Override
    public Integer update(ArticleDTO articleDTO) {
        return articleDAO.update(ArticlePO.buildByArticleDTO(articleDTO));
    }

    @Override
    public void hideById(Integer articleId) {
        articleDAO.updateStatus(articleId, ArticleStatusEnum.INVISIBLE.getCode());
    }

    @Override
    public void showById(Integer articleId) {
        articleDAO.updateStatus(articleId, ArticleStatusEnum.VISIBLE.getCode());
    }
}
