package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot的启动方式2
 * 1.@EnableAutoConfiguration注解
 * 2.SpringApplication.run 启动main方法
 * 3.@ComponentScan 扫包 (扫描当前包以及当前包下的所有子包 (需呀将该类放到最外层))
 *
 * @author JinXing
 * @date 2018/6/1 16:40
 */

@RestController
@EnableAutoConfiguration
@ComponentScan("com.example.demo")
public class DemoApplication2 {

    /**
     * http://localhost:8080/hello
     * @author JinXing
     * @date 2018/6/1 16:33
     */
    @RequestMapping("/hello2")
    public String hello2(){
        return"hello world -2";
    }

    //启动应用方法
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication2.class,args);
    }


}
