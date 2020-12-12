package com.vincentkdeli.vinance.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author - Vincent K. Deli
 **/

@Data
@ConfigurationProperties("vinance.mongo")
public class MongoProperties {

  private String username;

  private String password;

}
