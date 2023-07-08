package cn.javastack.springboot.logging.config;

import cn.javastack.springboot.logging.LoggingApplication;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 * 日志配置类
 * <p>常用的日志框架: Slf4j,org.apache.commons.logging</p>
 *
 * @author qintaxian
 * @since 2023/6/11
 */
@Configuration
public class LogConfig {

    /**
     * org.apache.commons.logging的日志记录器
     */
    private static final Log LOGGER = LogFactory.getLog(LoggingApplication.class);

    /**
     * org.slf4j的日志记录器
     */
    private static final Logger LOGGER_Slf = LoggerFactory.getLogger(LoggingApplication.class);

    @Bean
    public CommandLineRunner commandLineRunner() {

        return (args -> {
            LOGGER.error("commons logging error... from logConfig display");
            LOGGER.warn("commons logging warn... from logConfig display");
            LOGGER.info("commons logging info... from logConfig display");
            LOGGER.debug("commons logging debug... from logConfig display");

            LOGGER_Slf.error("slf4j error... from logConfig display");
            LOGGER_Slf.warn("slf4j warn... from logConfig display");
            LOGGER_Slf.info("slf4j info... from logConfig display");
            LOGGER_Slf.debug("slf4j debug... from logConfig display");
        });
    }
}
