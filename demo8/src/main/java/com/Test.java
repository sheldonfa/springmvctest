package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fangxin
 * @date 2017/4/25.
 */
@Controller
public class Test {

    @RequestMapping("/test")
    public String test(){
        System.out.println("target method");
        return "index";
    }
}
