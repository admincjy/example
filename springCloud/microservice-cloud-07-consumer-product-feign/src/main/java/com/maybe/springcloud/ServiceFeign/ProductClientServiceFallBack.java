package com.maybe.springcloud.ServiceFeign;


import com.maybe.springcolud.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @Auther: maybe
 */
//Caused by: java.lang.IllegalStateException: No fallback instance of type class com.mengxuegu.springcloud.service.ProductClientServiceFallBack found for feign client microservice-product
@Component //一定要加上它,将它纳入到容器中
public class ProductClientServiceFallBack implements FeignService{


    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id=" + id + "无数据--@feignclient&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
