package com.epam.spring.homework2.appConfig;

import com.epam.spring.homework2.config.FirstConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import(FirstConfig.class)
public class HomeworkApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FirstConfig.class);
        System.out.println(" \n-ApplicationContext is ready to use-\n");
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(context.getBeanDefinition(beanDefinitionName));
        }
        context.close();
    }
}
