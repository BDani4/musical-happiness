package hu.nye.progtech.torpedo.configuration;

/**
 * Test.
 */

import hu.nye.progtech.torpedo.Main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

        @Bean(initMethod = "game")
        public Main torpedo(){
            return new Main();
        }

}
