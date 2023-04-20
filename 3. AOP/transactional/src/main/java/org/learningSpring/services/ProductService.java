package org.learningSpring.services;

import org.learningSpring.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional   // by default rollbacks for Runtime Exception but not for checked exceptions
//    @Transactional(rollbackFor = Exception.class)
    public void addProduct(String name) {
        productRepository.addProduct(name);
        throw new RuntimeException("Ooops!!!");
    }
}
