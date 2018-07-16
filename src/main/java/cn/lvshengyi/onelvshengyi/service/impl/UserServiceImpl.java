package cn.lvshengyi.onelvshengyi.service.impl;

import cn.lvshengyi.onelvshengyi.dao.UserDAO;
import cn.lvshengyi.onelvshengyi.entity.dto.UserSignUpDTO;
import cn.lvshengyi.onelvshengyi.entity.dto.UserSignInDTO;
import cn.lvshengyi.onelvshengyi.entity.po.UserPO;
import cn.lvshengyi.onelvshengyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Objects;

/**
 * @author LvShengyI
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserPO findById(Integer id) {
        return userDAO.findById(id);
    }

    @Override
    public Boolean signUp(UserSignUpDTO userSignUpDTO) {
        Assert.notNull(userSignUpDTO, "用户注册信息不能为空");

        UserPO existUserPO = userDAO.findByUsername(userSignUpDTO.getUsername());
        if(Objects.nonNull(existUserPO)){
            return false;
        }

        userDAO.add(UserPO.buildNormal(userSignUpDTO));

        return true;
    }

    @Override
    public Boolean signIn(UserSignInDTO userSignInDTO) {
        Assert.notNull(userSignInDTO, "用户登录信息不能为空");

        UserPO userPO = userDAO.findByUserSignInDTO(userSignInDTO);

        if(Objects.nonNull(userPO)){
            //todo 完成用户登录的操作
            return true;
        }

        return false;
    }
}
