package com.jxlearning.learnspringframework.examples.f0.a0;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {
    @Component
    class SomeClass {
        private SomeDependency someDependency;

        public SomeClass(SomeDependency someDependency) {
            super();
            this.someDependency = someDependency;
            System.out.println("All dependencies are ready.");
        }

        @PostConstruct
        public void initialize() {
            someDependency.getReady();
        }

        @PreDestroy
        public void cleanUp() {
            System.out.println("Clean up completed.");
        }
    }

    @Component
    class SomeDependency {
        public void getReady() {
            System.out.println("Some logic using SomeDependency");
        }
    }

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            context.getBean(SomeClass.class);

        }
    }
}
