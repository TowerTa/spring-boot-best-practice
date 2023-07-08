package cn.javastack.springboot.kafka.controller;

import cn.javastack.springboot.kafka.config.KafkaConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * 消息控制器
 *
 * @author qintaxian
 * @since 2023/6/21
 */
@RequiredArgsConstructor
@RestController
@Slf4j
public class MsgController {
    /**
     * kafka模板
     */
    private final KafkaTemplate<String, String> kafkaTemplate;

    /**
     * 发送消息
     *
     * @param msg msg
     * @return String
     */
    @RequestMapping("/send")
    public String sendMsg(@RequestParam("msg") String msg) {
        log.info("send message to Kafka: {}", msg);
        kafkaTemplate.send(KafkaConfig.SPRING_BOOT_TEST_TOPIC, "test-key", msg);
        return "已发送";
    }

    /**
     * 接收消息
     *
     * @param msg 消息
     */
    @KafkaListener(topics = KafkaConfig.SPRING_BOOT_TEST_TOPIC)
    public void receiveMsg(String msg) {
        log.info("收到 Kafka 消息：{}", msg);
    }
}
