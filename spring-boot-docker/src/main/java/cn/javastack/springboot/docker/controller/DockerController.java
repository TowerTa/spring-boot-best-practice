package cn.javastack.springboot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * 控制层
 *
 * @author qintaxian
 * @since 2023/6/1
 */
@RequestMapping("/docker")
@RestController
public class DockerController {

    @GetMapping("/hello")
    public String helloDocker() {
        return "hello docker";
    }
}
