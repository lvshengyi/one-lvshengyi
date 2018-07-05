package cn.lvshengyi.onelvshengyi.entity;

import lombok.Data;

/**
 * @author LvShengyI
 */
@Data
public class MessageDO {
    private Integer id;

    private Integer senderId;

    private Integer receiverId;

    private String content;

    private Long sendDatetime;

    private Long readDatetime;

    private Byte status;
}