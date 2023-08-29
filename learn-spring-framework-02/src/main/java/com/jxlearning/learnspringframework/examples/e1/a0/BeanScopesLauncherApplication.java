package com.jxlearning.learnspringframework.examples.e1.a0;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}
@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {



    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {

           // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            // gets the same hashcode
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            // gets a different hashcode each time
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));


        }
    }
}
