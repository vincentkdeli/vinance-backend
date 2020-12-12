package com.vincentkdeli.vinance.command.model.request;

import com.vincentkdeli.vinance.command.model.CommandRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author - Vincent K. Deli
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMemberRequest implements CommandRequest {

  @NotBlank
  private String email;

  @NotBlank
  private String password;

}
