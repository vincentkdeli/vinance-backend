package com.vincentkdeli.vinance.backend.command.model.request;

import com.vincentkdeli.vinance.backend.command.model.CommandRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author - Vincent K. Deli
 * @created - 01/08/20
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExampleCommandRequest implements CommandRequest {

  private String username;

}
