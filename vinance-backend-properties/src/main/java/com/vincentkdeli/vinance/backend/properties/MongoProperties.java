package com.vincentkdeli.vinance.backend.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

@Data
@ConfigurationProperties("vinance.mongo")
public class MongoProperties {

  private String username;

  private String password;

}
