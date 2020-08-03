package com.vincentkdeli.vinance.backend.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author - Vincent K. Deli
 * @created - 03/08/20
 */

@Configuration
public class OpenApiConfiguration {

  @Bean
  public OpenAPI api() {
    OpenAPI openAPI = new OpenAPI();
    openAPI.setInfo(new Info().title("Vinance API"));
    return openAPI;
  }

}
