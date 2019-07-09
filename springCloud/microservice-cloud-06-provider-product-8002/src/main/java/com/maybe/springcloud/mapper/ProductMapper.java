package com.maybe.springcloud.mapper;

import com.maybe.springcolud.entity.Product;

import java.util.List;

/**
 * @Title: mapper
 * @Description:
 * @Auther:maybe
 * @create 2019/7/2 15:48
 */
//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}