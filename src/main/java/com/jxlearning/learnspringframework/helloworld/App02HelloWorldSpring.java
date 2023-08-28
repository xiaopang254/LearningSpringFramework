package com.jxlearning.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch spring context

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            // 2. configure the things we want to manage -- @Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Paramters"));
            System.out.println(context.getBean("person5Qualifier"));

//             Show all beans managed by Spring Framework
//        System.out.println();
//        Arrays.stream(
//                context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
