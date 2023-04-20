package org.learningSpring;

import org.learningSpring.beans.MyBean;
import org.learningSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

//            MyBean bean = context.getBean(MyBean.class); // Access by type

            // Access by name and type
            MyBean b1 = context.getBean("getMyBean1", MyBean.class);  // or you can give the name inside the @Bean(<name>) annotation and specify it here if you don't want the default name
            MyBean b2 = context.getBean("getMyBean2", MyBean.class);
            MyBean b3 = context.getBean("getMyBean1", MyBean.class);

            System.out.println(b1.getText());
            System.out.println(b2.getText());
            System.out.println(b3.getText());
        }
    }
}