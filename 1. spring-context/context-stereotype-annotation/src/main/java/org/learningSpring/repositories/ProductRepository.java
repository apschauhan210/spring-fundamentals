package org.learningSpring.repositories;

import org.springframework.stereotype.Repository;

@Repository   // We can use @Component stereotype annotation but @Repository defines the purpose more specifically
public class ProductRepository {

    public void addProduct() {
        System.out.println("Product is added");
    }

}
