package org.learningSpring.config;

import org.learningSpring.beans.Cat;
import org.learningSpring.beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Tom");
        return cat;
    }

    @Bean
    public Owner getOwner(Cat cat) {   /* here the object of cat is injected by the spring from the context. We don't
                                        need to use the @Autowired annotation */
        Owner owner = new Owner();
        owner.setCat(getCat());
        return owner;
    }


//    @Bean
//    public Owner getOwner() {
//        Owner owner = new Owner();
//        owner.setCat(getCat());  /* when a method with @Bean annotation is called from another method with @Bean
//                                    annotation spring fist checks whether the object of that bean is already there in
//                                    context or not. If it is already there then that is returned. In this case the object
//                                    with name Tom is already there in the context and that is returned. */
//        return owner;
//    }
}
