package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import(SecondConfig.class)
public class FirstConfig {
    @Bean
     BeanA beanA() {
        return new BeanA("beanA", 1);
    }

    @Bean
     BeanE beanE() {
        return new BeanE("beanE", 2);
    }

    @Bean
    @Lazy
     BeanF beanF(){
        return new BeanF("beanF", 3);
    }

    @Bean
    MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }
    @Bean
    MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

}
