package cn.lvshengyi.onelvshengyi.service;

import cn.lvshengyi.onelvshengyi.entity.dto.UserSignUpDTO;
import cn.lvshengyi.onelvshengyi.entity.dto.UserSignInDTO;
import cn.lvshengyi.onelvshengyi.entity.po.User;

/**
 * @author LvShengyI
 */
public interface UserService {

    /**
     * 根据id获取
     *
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 注册
     *
     * @param userSignUpDTO
     * @return
     */
    Boolean signUp(UserSignUpDTO userSignUpDTO);

    /**
     * 登录
     *
     * @param userSignInDTO
     * @return
     */
    Boolean signIn(UserSignInDTO userSignInDTO);
}
