package cn.lvshengyi.onelvshengyi.util;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LvShengyI
 */
public class BrowserUtil {

    private static final Map<String, String> OS_MAP = new HashMap<>(8);

    static {
        OS_MAP.put("windows", "Windows");
        OS_MAP.put("mac", "Mac");
        OS_MAP.put("x11", "Unix");
        OS_MAP.put("android", "Android");
        OS_MAP.put("iphone", "IPhone");
    }

    /**
     * 获取操作系统与浏览器信息
     *
     * @param request
     * @return
     */
    public static String getOsAndBrowserInfo(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent").toLowerCase();

        return getOS(userAgent) + "-" + getBrowser(userAgent);
    }

    /**
     * 获取操作系统
     *
     * @param userAgent
     * @return
     */
    private static String getOS(String userAgent) {
        String[] os = {null};

        OS_MAP.forEach((key, value) -> {
            if (userAgent.contains(key)) {
                os[0] = value;
            }
        });

        return os[0] == null ? "UnKnown, More-Info: " + userAgent : os[0];
    }

    /**
     * 获取浏览器
     *
     * @param userAgent
     * @return
     */
    private static String getBrowser(String userAgent) {
        if (userAgent.contains("edge")) {
            return (userAgent.substring(userAgent.indexOf("Edge")).split(" ")[0]).replace("/", "-");
        }
        if (userAgent.contains("msie")) {
            String substring = userAgent.substring(userAgent.indexOf("MSIE")).split(";")[0];
            return substring.split(" ")[0].replace("MSIE", "IE") + "-" + substring.split(" ")[1];
        }
        if (userAgent.contains("safari") && userAgent.contains("version")) {
            return (userAgent.substring(userAgent.indexOf("Safari")).split(" ")[0]).split("/")[0]
                    + "-" + (userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
        }
        if (userAgent.contains("opr") || userAgent.contains("opera")) {
            if (userAgent.contains("opera")) {
                return (userAgent.substring(userAgent.indexOf("Opera")).split(" ")[0]).split("/")[0]
                        + "-" + (userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
            }

            return ((userAgent.substring(userAgent.indexOf("OPR")).split(" ")[0]).replace("/", "-"))
                    .replace("OPR", "Opera");
        }
        if (userAgent.contains("chrome")) {
            return (userAgent.substring(userAgent.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
        }
        if ((userAgent.contains("mozilla/7.0")) || (userAgent.contains("netscape6")) ||
                (userAgent.contains("mozilla/4.7")) || (userAgent.contains("mozilla/4.78")) ||
                (userAgent.contains("mozilla/4.08")) || (userAgent.contains("mozilla/3"))) {
            return "Netscape-?";
        }
        if (userAgent.contains("firefox")) {
            return (userAgent.substring(userAgent.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
        }
        if (userAgent.contains("rv")) {
            String ieVersion = (userAgent.substring(userAgent.indexOf("rv")).split(" ")[0]).replace("rv:", "-");
            return "IE" + ieVersion.substring(0, ieVersion.length() - 1);
        }

        return "UnKnown, More-Info: " + userAgent;
    }
}
