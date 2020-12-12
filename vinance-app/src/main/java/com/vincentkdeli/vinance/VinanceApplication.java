package com.vincentkdeli.vinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author - Vincent K. Deli
 **/

@ConfigurationPropertiesScan({"com.vincentkdeli.vinance.properties"})
@SpringBootApplication
public class VinanceApplication {

  public static void main(String[] args) {
    SpringApplication.run(VinanceApplication.class, args);
  }

}
