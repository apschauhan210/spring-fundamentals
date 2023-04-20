package com.learningspring.hellospring2.controllers;

import com.learningspring.hellospring2.dto.Product;
import com.learningspring.hellospring2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/addproduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        service.addProduct(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}
