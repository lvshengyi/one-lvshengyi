package cn.lvshengyi.onelvshengyi.entity.po;

import cn.lvshengyi.onelvshengyi.constant.UserStatusEnum;
import cn.lvshengyi.onelvshengyi.constant.UserTypeEnum;
import cn.lvshengyi.onelvshengyi.entity.dto.UserSignUpDTO;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

/**
 * @author LvShengyI
 */
@Data
@ToString
public class UserPO {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String eMail;

    /**
     * 用户状态
     * @see cn.lvshengyi.onelvshengyi.constant.UserStatusEnum
     */
    private Integer status;

    /**
     * 用户类型
     * @see cn.lvshengyi.onelvshengyi.constant.UserTypeEnum
     */
    private Integer type;

    private UserPO(){}

    /**
     * 建造标准普通用户
     *
     * @param userSignUp
     * @return
     */
    public static UserPO buildNormal(UserSignUpDTO userSignUp){
        UserPO signUpUserPO = new UserPO();
        BeanUtils.copyProperties(userSignUp, signUpUserPO);

        signUpUserPO.setStatus(UserStatusEnum.NORMAL.getCode());
        signUpUserPO.setType(UserTypeEnum.USUAL.getCode());

        return signUpUserPO;
    }
}