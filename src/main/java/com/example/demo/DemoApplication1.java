package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot的启动方式1
 * 1.@EnableAutoConfiguration注解
 * 2.SpringApplication.run 启动main方法
 * 缺陷：只扫描到当前类
 *
 * @author JinXing
 * @date 2018/6/1 16:07
 */

//表示修饰该Controller所有的方法返回JSON格式,直接可以编写Restful接口
//@RestController 等同于 @Controller + @ResponseBody
@RestController
//注解:作用在于让 Spring Boot 根据应用所声明的依赖来对 Spring 框架进行自动配置
//这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。由于spring-boot-starter-web添加了Tomcat和Spring MVC，
//所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
@EnableAutoConfiguration
public class DemoApplication1 {

    /**
     * http://localhost:8080/hello1
     * @author JinXing
     * @date 2018/6/1 16:33
     */
    @RequestMapping("/hello1")
    public String hello(){
        return"hello world -1";
    }

    //启动应用方法
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication1.class,args);
    }


}
