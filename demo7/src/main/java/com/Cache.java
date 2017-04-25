package com;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/cache")
public class Cache {

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("time",new Date());
        return "index";
    }

}
