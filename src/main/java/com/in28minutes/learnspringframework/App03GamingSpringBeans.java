package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(
                             GamingConfiguration.class
                     )) {
//            context.getBean(GamingConsole.class).up();
            context.getBean("game");
            context.getBean("game2");
            context.getBean(GameRunner.class).run();
            context.getBean(GameRunner.class, "game2").run();
        }
    }
}
