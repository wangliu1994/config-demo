package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : winnie
 * @date : 2019/3/20
 * @desc
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${sang}")
    String sang;

    @Autowired
    Environment env;

    @RequestMapping("/sang")
    public String sang() {
        return this.sang;
    }
    @RequestMapping("/sang2")
    public String sang2() {
        return env.getProperty("sang", "未定义");
    }
}
