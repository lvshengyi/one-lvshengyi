package cn.lvshengyi.onelvshengyi.dao;

import cn.lvshengyi.onelvshengyi.entity.dto.UserSignInDTO;
import cn.lvshengyi.onelvshengyi.entity.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author LvShengyI
 */
@Repository
public interface UserDAO {

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(Integer id);

    /**
     * 根据用户名获取数据
     *
     * @param username
     * @return
     */
    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByUsername(String username);

    /**
     * 根据用户名与密码获取数据
     *
     * @param userSignInDTO
     * @return
     */
    @Select("SELECT * FROM user WHERE username = #{username} AND password = #{password}")
    User findByUserSignInDTO(UserSignInDTO userSignInDTO);

    /**
     * 插入用户数据
     *
     * @param user
     * @return
     */
    @Insert("INSERT INTO user(username, password, nickname, e_mail, status, type) VALUES(#{username}, #{password}, #{nickname}, #{eMail}, #{status}, #{type})")
    Integer add(User user);
}
