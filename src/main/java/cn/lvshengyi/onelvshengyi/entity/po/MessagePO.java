package cn.lvshengyi.onelvshengyi.entity.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author LvShengyI
 */
@Data
@ToString
public class MessagePO {

    /**
     * 私信id
     */
    private Integer id;

    /**
     * 发送者id
     */
    private Integer senderId;

    /**
     * 接收者id
     */
    private Integer receiverId;

    /**
     * 内容
     */
    private String content;

    /**
     * 发送时间
     */
    private Long sendDatetime;

    /**
     * 阅读时间
     */
    private Long readDatetime;

    /**
     * 私信状态
     * @see cn.lvshengyi.onelvshengyi.constant.MessageStatusEnum
     */
    private Integer status;
}