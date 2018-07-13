package cn.lvshengyi.onelvshengyi.entity.dto;

public class MessageDTO {

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
     * 私信状态
     * @see cn.lvshengyi.onelvshengyi.constant.MessageStatusEnum
     */
    private Integer status;
}
