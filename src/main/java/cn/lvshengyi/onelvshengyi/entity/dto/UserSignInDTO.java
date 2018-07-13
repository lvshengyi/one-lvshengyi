package cn.lvshengyi.onelvshengyi.entity.dto;

import lombok.Data;

/**
 * @author LvShengyI
 */
@Data
public class UserSignInDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
