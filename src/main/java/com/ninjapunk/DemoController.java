package com.ninjapunk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rockpig on 2017/10/17.
 */
@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo(){
        return "Hello Ninja Punk";
    }
}
