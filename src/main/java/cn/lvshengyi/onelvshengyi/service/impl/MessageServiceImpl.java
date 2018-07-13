package cn.lvshengyi.onelvshengyi.service.impl;

import cn.lvshengyi.onelvshengyi.constant.MessageStatusEnum;
import cn.lvshengyi.onelvshengyi.dao.MessageDAO;
import cn.lvshengyi.onelvshengyi.entity.dto.MessageDTO;
import cn.lvshengyi.onelvshengyi.entity.po.MessagePO;
import cn.lvshengyi.onelvshengyi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAO messageDAO;

    @Override
    public MessagePO findById(Integer id) {
        return messageDAO.findById(id);
    }

    @Override
    public Integer add(MessageDTO messageDTO) {
        return messageDAO.add(MessagePO.buildByMessageDTO(messageDTO));
    }

    @Override
    public void read(Integer id) {
        messageDAO.updateStatus(id, MessageStatusEnum.READ.getCode());
    }
}
