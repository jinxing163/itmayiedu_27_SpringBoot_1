package com.example.demo.controller.jsonController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 统一返回Json字符
 * @author JinXing
 * @date 2018/6/1 17:14
 */

@RestController
@RequestMapping("json/hello")
public class HelloController {

    /**
     * http://localhost:8080/json/hello/index
     * @author JinXing
     * @date 2018/6/1 16:33
     */
    @RequestMapping("/index")
    public String index(){
        return "hello world -index";
    }

}
