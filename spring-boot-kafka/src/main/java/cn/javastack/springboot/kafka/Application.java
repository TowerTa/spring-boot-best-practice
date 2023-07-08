package cn.javastack.springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 微信公众号：Java技术栈
 */
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        if(args == null) {
            log.error("the parameter is null");
            return;
        }
        SpringApplication.run(Application.class, args);
        log.info("run Application for kafka is success");
    }
}
