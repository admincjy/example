package com.maybe.springcloud.ServiceFeign;

import com.maybe.springcolud.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Title: FeignService
 * @Description:
 * @Auther:maybe
 * @create 2019/7/3 16:48
 */
@FeignClient(value = "microservice-product")
public interface FeignService {

    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    boolean add(Product product);

    @RequestMapping(value = "/product/get/",method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    List<Product> list();




}
