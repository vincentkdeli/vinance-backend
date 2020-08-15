package com.vincentkdeli.vinance.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author - Vincent K. Deli
 * @created - 31/07/20
 */

@ConfigurationPropertiesScan({"com.vincentkdeli.vinance.backend.properties"})
@SpringBootApplication
public class VinanceBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(VinanceBackendApplication.class, args);
  }

}
