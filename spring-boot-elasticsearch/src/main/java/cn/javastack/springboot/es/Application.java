package cn.javastack.springboot.es;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 微信公众号：Java技术栈
 */
@Slf4j
@SpringBootApplication
public class Application {
    /**
     * 主程序入口
     *
     * @param args args
     */
    public static void main(String[] args) {
        if(args == null) {
            log.error("input parameter is null, pls check the reason");
            return;
        }
        SpringApplication.run(Application.class);
        log.info("run Application is success!");
    }
}
