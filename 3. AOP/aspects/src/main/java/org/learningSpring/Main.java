package org.learningSpring;

import org.learningSpring.config.ProjectConfig;
import org.learningSpring.services.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService service = context.getBean(HelloService.class);
            String res = service.hello("Tom");
            System.out.println("The result is: " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}