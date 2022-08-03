package com.epam.spring.homework1.config;

import com.epam.spring.homework1.other.OtherBeanA;
import com.epam.spring.homework1.other.OtherBeanB;
import com.epam.spring.homework1.other.OtherBeanC;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = {OtherBeanA.class, OtherBeanB.class, OtherBeanC.class})
@Import(PetConfig.class)
public class OtherConfig {
}
