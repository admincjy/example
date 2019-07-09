package com.maybe.springcloud.controller;


import com.maybe.springcloud.ServiceFeign.FeignService;
import com.maybe.springcolud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Auther: maybe
 */
@RestController
public class ProductController_Consumer {



    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return feignService.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return feignService.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
            return feignService.list();
    }



}
