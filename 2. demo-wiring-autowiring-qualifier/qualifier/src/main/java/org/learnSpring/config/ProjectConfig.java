package org.learnSpring.config;

import org.learnSpring.beans.Cat;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.learnSpring.beans")
public class ProjectConfig {

    @Bean
    @Qualifier("catTom")  // Qualifier specifies the identity of the bean in case of multiple bean of same type
    public Cat cat1() {
        Cat cat = new Cat();
        cat.setName("Tom");
        return cat;
    }

    @Bean
    @Qualifier("catLewis")  // Qualifier specifies the identity of the bean in case of multiple bean of same type
    public Cat cat2() {
        Cat cat = new Cat();
        cat.setName("Lewis");
        return cat;
    }
}
