package com.example.demo.service.impl;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }//findAll

    public void updateProduct(Product product){
        productRepository.save(product);
    }//add or update (tuy vao pri-key)

    public void removeProductById(long id){
        productRepository.deleteById(id);
    }//delete dua vao pri-key

    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }//search theo id
//    public Product findProductById(long id){
//        return productRepository.getById(id);
//    }



    //findList theo ProductDTO.categoryId
}
