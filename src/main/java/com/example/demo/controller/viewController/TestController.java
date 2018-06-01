package com.example.demo.controller.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    /**
     * http://localhost:8080/view/test/index2
     * @author JinXing
     * @date 2018/6/1 16:33
     */
    @RequestMapping("/index2")
    public ModelAndView index2(){
        ModelAndView modelAndView=new ModelAndView("index2");
        return modelAndView;
    }

    /**
     * http://localhost:8080/view/test/map
     * @author JinXing
     * @date 2018/6/1 16:33
     */
    @RequestMapping("/map")
    public ModelAndView map(){
        ModelAndView modelAndView=new ModelAndView("map");
        modelAndView.addObject("name","金星");
        modelAndView.addObject("job","开发");

        return modelAndView;
    }



}
