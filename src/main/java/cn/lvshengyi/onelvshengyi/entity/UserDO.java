package cn.lvshengyi.onelvshengyi.entity;

import lombok.Data;

/**
 * @author LvShengyI
 */
@Data
public class UserDO {

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
}