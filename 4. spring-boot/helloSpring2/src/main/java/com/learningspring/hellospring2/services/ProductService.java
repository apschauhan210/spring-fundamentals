package com.learningspring.hellospring2.services;

import com.learningspring.hellospring2.dto.Product;
import com.learningspring.hellospring2.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product.getName());
    }
}
