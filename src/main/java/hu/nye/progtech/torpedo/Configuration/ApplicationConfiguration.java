package hu.nye.progtech.torpedo.Configuration;

/**
 * Test.
 */

import hu.nye.progtech.torpedo.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(initMethod = "game")
    public Game torpedo(){return new Game();
    }

}
