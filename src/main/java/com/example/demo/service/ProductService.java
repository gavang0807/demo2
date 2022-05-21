package com.example.demo.service;



import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
     List<Product> getAllProduct();
     void updateProduct(Product product);
     void removeProductById(long id);
     Optional<Product> getProductById(long id);


}
