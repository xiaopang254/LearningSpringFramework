package com.jxlearning.learnspringframework;

import com.jxlearning.learnspringframework.game.GameRunner;
import com.jxlearning.learnspringframework.game.PacmanGame;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch spring context
        var context =
            new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2. configure the things we want to manage -- @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}
