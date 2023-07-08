package cn.javastack.springboot.logging.controller;

import cn.javastack.springboot.logging.annotation.BusLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * 控制器
 *
 * @author qintaxian
 * @since 2023/6/11
 */
@BusLog(name = "人员管理", description = "进行人员的管理")
@RequestMapping("/person")
@Slf4j
@RestController
public class PersonController {

}
