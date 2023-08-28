package com.jxlearning.learnspringframework;

import com.jxlearning.learnspringframework.game.GameRunner;
import com.jxlearning.learnspringframework.game.GamingConsole;
import com.jxlearning.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
