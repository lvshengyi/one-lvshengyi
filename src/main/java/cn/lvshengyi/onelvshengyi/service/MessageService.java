package cn.lvshengyi.onelvshengyi.service;

import cn.lvshengyi.onelvshengyi.entity.dto.MessageDTO;
import cn.lvshengyi.onelvshengyi.entity.po.MessagePO;

public interface MessageService {

    /**
     * 根据id获取私信
     *
     * @param id
     * @return
     */
    MessagePO findById(Integer id);

    /**
     * 添加数据
     *
     * @param messageDTO
     * @return
     */
    Integer add(MessageDTO messageDTO);

    /**
     * 阅读私信
     *
     * @param id
     */
    void read(Integer id);
}
