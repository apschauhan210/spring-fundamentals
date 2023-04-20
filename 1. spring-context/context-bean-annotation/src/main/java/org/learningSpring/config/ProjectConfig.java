package org.learningSpring.config;

import org.learningSpring.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
//    @Primary    // This annotation denotes that the bean produced by this function should be selected in case of multiple functions providing the bean of same type.
    public MyBean getMyBean1() {
        MyBean b = new MyBean();
        b.setText("Hello");
        return b;
    }

    @Bean
    public MyBean getMyBean2() {
        MyBean b = new MyBean();
        b.setText("World");
        return b;
    }
}
