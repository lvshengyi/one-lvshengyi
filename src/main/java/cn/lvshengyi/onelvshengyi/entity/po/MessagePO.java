package cn.lvshengyi.onelvshengyi.entity.po;

import cn.lvshengyi.onelvshengyi.constant.MessageStatusEnum;
import cn.lvshengyi.onelvshengyi.entity.dto.MessageDTO;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

/**
 * @author LvShengyI
 */
@Data
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
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

    public static MessagePO buildByMessageDTO(MessageDTO messageDTO){
        MessagePO messagePO = new MessagePO();

        BeanUtils.copyProperties(messageDTO, messagePO);
        messagePO.setStatus(MessageStatusEnum.UNREAD.getCode());

        return messagePO;
    }
}