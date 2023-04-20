package com.MyApplication.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    //render index.html
    @GetMapping("/")
    public String index() {
        return "index";
    }
    

    
}
