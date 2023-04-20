package org.learningSpring.services;

import org.learningSpring.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    /**
     * propagation attribute for @Transactional defines how the transactional aspect(Object) is propagated for
     * function calls inside the method
     *
     * Propagation.REQUIRED (default): It defines that transaction is required. If one is already provided by the calling
     *      method then it is not created otherwise it is created.
     *
     * Propagation.REQUIRES_NEW: Creates a new transaction aspect no matter if it is already provided or not
     *
     * Propagation.MANDATORY: transaction aspect is necessary to be provided by the calling function otherwise throws an
     *      exception
     *
     * Propagation.NEVER: do not require transaction aspect. If provided exception is thrown
     *
     * Propagation.SUPPORTS: method supports transaction. If provided it is executed with that aspect otherwise not
     *      executed with aspect
     *
     * Propagation.NOT_SUPPORTED: method doesn't support transaction. Executes without transaction whether provided or not
     */

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional  // rollbacks all the commits that have been made upto the time of throwing exception
    public void addTenProduct(String name) {  // transaction aspect created
        for(int i = 0; i < 10; i++) {
            productRepository.addProduct(name);
            if(i == 4)
                throw new RuntimeException("Ooops!!!");
        }
    } // commits
}
