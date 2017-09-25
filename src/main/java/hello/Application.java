package hello;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@Slf4j
@ComponentScans({@ComponentScan("hello"), @ComponentScan("com")})
@MapperScan({"com"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


