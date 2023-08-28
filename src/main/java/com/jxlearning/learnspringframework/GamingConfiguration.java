package com.jxlearning.learnspringframework;

import com.jxlearning.learnspringframework.game.GameRunner;
import com.jxlearning.learnspringframework.game.GamingConsole;
import com.jxlearning.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game  = new PacmanGame();
        return game;

    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
//    //var game = new SuperContraGame();
//    var game = new PacmanGame();
//    var gameRunner = new GameRunner(game);
//    gameRunner.run();

}
