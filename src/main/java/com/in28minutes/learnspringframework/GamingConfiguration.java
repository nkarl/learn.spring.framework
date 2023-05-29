package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.awt.image.PackedColorModel;

@Configuration
public class GamingConfiguration {

    @Bean
    @Primary
    public GamingConsole game() {
        return new PacmanGame(); // up down left right
    }

    @Bean
    public GamingConsole game2() {
        return new MarioGame(); // jump down back accelerate
    }

    @Bean
    public GameRunner gameRunner(GamingConsole someGame) {
        return new GameRunner(someGame); // Spring auto-wires from any existing bean it can find.
    }
}
