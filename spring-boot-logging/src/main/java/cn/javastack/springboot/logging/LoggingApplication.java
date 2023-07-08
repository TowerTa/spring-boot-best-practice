package cn.javastack.springboot.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 微信公众号：Java技术栈
 */
@SpringBootApplication
public class LoggingApplication {
    /**
     * org.apache.commons.logging的日志记录器
     */
    private static final Log LOGGER = LogFactory.getLog(LoggingApplication.class);

    /**
     * org.slf4j的日志记录器
     */
    private static final Logger LOGGER_Slf = LoggerFactory.getLogger(LoggingApplication.class);

    public static void main(String[] args) {
        System.setProperty("LOG_PATH", "./logs");
        System.setProperty("LOGBACK_ROLLINGPOLICY_MAX_FILE_SIZE", "1KB");
        SpringApplication.run(LoggingApplication.class);
        LOGGER.info("run LoggingApplication is success");
    }

    // @Bean
    // public CommandLineRunner commandLineRunner() {
    //     return (args) -> {
    //         LOGGER.error("commons logging error...");
    //         LOGGER.warn("commons logging warn...");
    //         LOGGER.info("commons logging info...");
    //         LOGGER.debug("commons logging debug...");
    //
    //         LOGGER_Slf.error("slf4j error...");
    //         LOGGER_Slf.warn("slf4j warn...");
    //         LOGGER_Slf.info("slf4j info...");
    //         LOGGER_Slf.debug("slf4j debug...");
    //     };
    // }
}
