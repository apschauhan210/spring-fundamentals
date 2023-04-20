package org.learnSpring;

import org.learnSpring.beans.Cat;
import org.learnSpring.beans.Owner;
import org.learnSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Owner owner = context.getBean(Owner.class);

            System.out.println(owner);
        }
    }
}