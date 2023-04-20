package org.learningSpring.services;

import org.learningSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // We can use @Component stereotype annotation but @Service defines the purpose more specifically
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired  // we should use @Autowired over a constructor and not over property directly coz by doing this we can specify the property as final(can't be changed), which can't be done in the latter case.
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct() {
        this.productRepository.addProduct();
    }
}
