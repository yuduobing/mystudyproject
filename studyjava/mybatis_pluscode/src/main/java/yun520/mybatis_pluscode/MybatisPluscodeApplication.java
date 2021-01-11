package yun520.mybatis_pluscode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yun520.mybatis_pluscode.us.mapper.UserDAO")
public class MybatisPluscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPluscodeApplication.class, args);
	}

}
