package cn.lvshengyi.onelvshengyi.dao;

import cn.lvshengyi.onelvshengyi.entity.po.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDAO {

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM message WHERE id = #{id}")
    Message findById(Integer id);

    /**
     * 插入数据
     *
     * @param message
     * @return
     */
    @Insert("INSERT INTO message(sender_id, receiver_id, content, status) VALUES(#{senderId}, #{receiverId}, #{content}, #{status})")
    Integer add(Message message);

    /**
     * 更新状态
     *
     * @param id
     * @param status
     */
    @Update("UPDATE message SET status = #{status} WHERE id = #{id}")
    void updateStatus(Integer id, Integer status);
}
