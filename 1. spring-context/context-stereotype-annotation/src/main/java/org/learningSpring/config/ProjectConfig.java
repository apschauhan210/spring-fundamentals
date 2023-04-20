package org.learningSpring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.learningSpring.repositories", "org.learningSpring.services"})
public class ProjectConfig {

}
