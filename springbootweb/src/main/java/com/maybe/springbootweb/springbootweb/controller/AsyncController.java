package com.maybe.springbootweb.springbootweb.controller;

import com.maybe.springbootweb.springbootweb.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: AsyncController
 * @Description:
 * @Auther:maybe
 * @create 2019/6/27 15:35
 */
@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;
    @GetMapping("/hello")
    public String hello() {
        asyncService.batchAdd();
        return "success";
    }
}
