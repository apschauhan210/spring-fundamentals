package org.learningSpring;

import org.learningSpring.beans.Cat;
import org.learningSpring.beans.Owner;
import org.learningSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat cat = context.getBean(Cat.class);
            Owner owner = context.getBean(Owner.class);

            System.out.println(cat);
            System.out.println(owner);
        }
    }
}