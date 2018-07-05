package cn.lvshengyi.onelvshengyi.controller;

import cn.lvshengyi.onelvshengyi.entity.ArticleDO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LvShengyI
 */
@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @ApiOperation("获取所有文章")
    @GetMapping
    public List<ArticleDO> list(){
        return null;
    }
}
