package com.maybe.springcloud.service;




import com.maybe.springcolud.entity.Product;

import java.util.List;

/**
 * @Auther: maybe
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
