package cn.lvshengyi.onelvshengyi.entity.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author LvShengyI
 */
@ToString
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserSignUpDTO {

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

    public static UserSignUpDTO build(String username, String nickname, String password, String eMail){
        return new UserSignUpDTO(username, nickname, password, eMail);
    }
}
