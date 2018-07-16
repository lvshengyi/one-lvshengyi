package cn.lvshengyi.onelvshengyi.service;

import cn.lvshengyi.onelvshengyi.BaseTest;
import cn.lvshengyi.onelvshengyi.entity.dto.UserSignUpDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author LvShengyI
 */
public class UserPOServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void findById(){
        final Integer id = 1;

        print(userService.findById(id));
    }

    @Test
    public void signUp(){
        UserSignUpDTO user = UserSignUpDTO
                .build("用户名1", "昵称", "123", "test@email");

        print(userService.signUp(user));
    }
}
