package com.example.demo.repository;


import com.example.demo.model.Product;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
