package org.learningSpring;

import org.learningSpring.config.ProjectConfig;
import org.learningSpring.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService service = context.getBean(ProductService.class);

            service.addProduct();
            service.addProduct();
            service.addProduct();
        }
    }
}