package cn.lvshengyi.onelvshengyi.interceptor;

import cn.lvshengyi.onelvshengyi.entity.po.UserPO;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author LvShengyI
 */
public class BackInterceptor implements HandlerInterceptor {

    private static String username = "wmyskxz";
    private static String password = "123456";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserPO userPO = (UserPO) request.getSession().getAttribute("userPO");

        return Objects.nonNull(userPO)
                && userPO.getUsername().equals(username) && userPO.getPassword().equals(password);
    }
}
