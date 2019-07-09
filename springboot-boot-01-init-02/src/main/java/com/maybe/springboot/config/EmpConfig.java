package com.maybe.springboot.config;

import com.maybe.springboot.bean.Emp;
import com.maybe.springboot.service.Empservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: EmpConfig
 * @Description:
 * @Auther:maybe
 * @create 2019/6/27 13:45
 */
@Configuration
public class EmpConfig {


    /**
     * 1 返回值就是注入容器中的组件对象
     * 2 方法名就是这个组件的id值
      * @return
     */
    @Bean
    public Empservice empService2(){
        System.out.println("注入成功");
        return new Empservice();
    }

}
