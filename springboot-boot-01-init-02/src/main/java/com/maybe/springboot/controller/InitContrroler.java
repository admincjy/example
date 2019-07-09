package com.maybe.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: InitContrroler
 * @Description:
 * @Auther:maybe
 * @create 2019/6/27 10:48
 */
@Controller
public class InitContrroler {

    @ResponseBody
    @RequestMapping("/info")
    public  String init(){
        return  "hello init";
    }

}
