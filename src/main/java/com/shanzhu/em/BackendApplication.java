package com.shanzhu.em;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 启动类
 * 项目启动入口（点击右键 选择 "run BackendApplication" 启动项目）
 *
 * @author: Wyx18373256
 * @date: 2022-02-10
 */
@Slf4j
@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {

        //SpringBoot 执行启动
        SpringApplication.run(BackendApplication.class, args);

        log.info("=====================项目后端启动成功============================");
    }

}
