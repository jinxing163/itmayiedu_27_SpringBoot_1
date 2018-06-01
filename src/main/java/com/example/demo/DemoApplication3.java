package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的启动方式3
 * @see @SpringBootApplication注解
 *
 * SpringBoot:
 * SpringBoot是一个快速开发的框架,能快速整合第三方框架。
 * 简化了xml配置，全部采用注解的形式，内置web容器(tomcat、jetty)提高了开发效率。
 * SpringBoot Web组件默认集成了SpringMVC框架
 *
 * SpringMvc:
 * Spring MVC 是基于 Servlet 的一个 MVC 框架
 *
 * SpringCloud:
 * SpringCloud依赖于SpringBoot组件。
 * 采用http协议+Json实现。
 * 同时SpringCloud是一套完整的微服务解决框架。
 *
 * @author JinXing
 * @date 2018/6/1 16:08
 */

//@SpringBootApplication 等同于 @EnableAutoConfiguration+@ComponentScan
//@SpringBootApplication 扫描当前包以及当前包下的所有子包 (需呀将该类放到最外层)
@SpringBootApplication
public class DemoApplication3 {


    /**
     * 静态资源访问
     * 举例：我们可以在src/main/resources/目录下创建static，在该位置放置一个图片文件。
     * 启动程序后，尝试访问http://localhost:8080/ku.png 如能显示图片，配置成功。
     * @author JinXing
     * @date 2018/6/1 17:04
     */
	public static void main(String[] args) {

	    SpringApplication.run(DemoApplication3.class, args);
	    System.out.println("DemoApplication3..................");
	}
}
