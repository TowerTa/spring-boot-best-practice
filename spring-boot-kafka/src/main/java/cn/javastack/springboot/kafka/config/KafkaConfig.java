package cn.javastack.springboot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 * Kafka配置
 *
 * @author qintaxian
 * @since 2023/6/21
 */
@Configuration
public class KafkaConfig {

    /**
     * topic name
     */
    public static final String SPRING_BOOT_TEST_TOPIC = "spring-boot-test-topic";

    @Bean
    public NewTopic testTopic() {
        return new NewTopic(SPRING_BOOT_TEST_TOPIC, 4, (short) 1);
    }
}
