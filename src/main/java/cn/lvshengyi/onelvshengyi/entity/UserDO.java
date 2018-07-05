package cn.lvshengyi.onelvshengyi.entity;

import lombok.Data;

/**
 * @author LvShengyI
 */
@Data
public class UserDO {
    private Integer id;

    private String username;

    private String nickname;

    private String password;

    private String eMail;

    private Byte status;

    private Byte type;
}