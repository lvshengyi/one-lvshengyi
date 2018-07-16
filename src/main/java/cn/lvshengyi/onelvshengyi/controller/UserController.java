package cn.lvshengyi.onelvshengyi.controller;

import cn.lvshengyi.onelvshengyi.entity.po.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LvShengyI
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @ApiOperation("获取所有分类信息")
    @GetMapping
    public List<User> list() {
        return null;
    }
}
