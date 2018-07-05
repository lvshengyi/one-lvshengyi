package cn.lvshengyi.onelvshengyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.lvshengyi.onelvshengyi.dao")
public class OnelvshengyiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnelvshengyiApplication.class, args);
	}
}
