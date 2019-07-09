package com.maybe.springboot;

import com.maybe.springboot.bean.Emp;
import com.maybe.springboot.service.Empservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootBoot01Init02ApplicationTests {

    @Autowired
    Emp emp;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testXml(){
//        Empservice empservice= (Empservice) applicationContext.getBean("empService");
//        System.out.println(empservice);
//        empservice.add();
        Empservice empservice2= (Empservice) applicationContext.getBean("empService2");
        System.out.println(empservice2);
        empservice2.add();
    }

    @Test
    public void contextLoads() {

        //System.out.println(emp);
    }



}
