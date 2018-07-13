package cn.lvshengyi.onelvshengyi.service.impl;

import cn.lvshengyi.onelvshengyi.constant.ArticleStatusEnum;
import cn.lvshengyi.onelvshengyi.dao.ArticleDAO;
import cn.lvshengyi.onelvshengyi.entity.dto.ArticleReleaseDTO;
import cn.lvshengyi.onelvshengyi.entity.po.ArticlePO;
import cn.lvshengyi.onelvshengyi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDAO articleDAO;

    @Override
    public Integer add(ArticleReleaseDTO articleReleaseDTO) {
        return articleDAO.add(ArticlePO.buildByArticleReleaseDTO(articleReleaseDTO));
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
