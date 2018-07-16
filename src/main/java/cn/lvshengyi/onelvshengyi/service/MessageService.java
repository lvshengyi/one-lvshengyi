package cn.lvshengyi.onelvshengyi.service;

import cn.lvshengyi.onelvshengyi.entity.dto.MessageDTO;
import cn.lvshengyi.onelvshengyi.entity.po.Message;

public interface MessageService {

    /**
     * 根据id获取私信
     *
     * @param id
     * @return
     */
    Message findById(Integer id);

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
