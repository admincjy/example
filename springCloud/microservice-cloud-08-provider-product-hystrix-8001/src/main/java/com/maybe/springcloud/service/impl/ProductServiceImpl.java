package com.maybe.springcloud.service.impl;


import com.maybe.springcloud.mapper.ProductMapper;
import com.maybe.springcloud.service.ProductService;
import com.maybe.springcolud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: maybe
 */
@Service //一定不要少了
public class ProductServiceImpl implements ProductService {

    @Autowired
    private  ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }

}
