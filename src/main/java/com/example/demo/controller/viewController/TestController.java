package com.example.demo.controller.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JinXing
 * @date 2018/6/1 17:18
 */

@Controller
@RequestMapping("view/test")
public class TestController {


    /**
     * http://localhost:8080/view/test/index
     * @author JinXing
     * @date 2018/6/1 16:33
     */
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
