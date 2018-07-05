package cn.lvshengyi.onelvshengyi;

import com.alibaba.fastjson.JSON;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
import static com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue;
import static com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty;

/**
 * @author LvShengyI
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {

    public static void print(Object obj){
        System.out.println(JSON.toJSONString(obj, WriteNullStringAsEmpty, WriteMapNullValue, PrettyFormat));
    }
}
