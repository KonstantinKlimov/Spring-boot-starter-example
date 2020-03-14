package by.konstantinklimov.simplestarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SimpleMessage.class)
public class ApplicationConfig {

  @Autowired
  private SimpleMessage simpleMessage;

  @Bean
  SimpleService simpleService() {
    return new SimpleService(simpleMessage);
  }
}
