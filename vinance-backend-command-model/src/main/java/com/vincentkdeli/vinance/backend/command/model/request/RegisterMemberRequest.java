package com.vincentkdeli.vinance.backend.command.model.request;

import com.vincentkdeli.vinance.backend.command.model.CommandRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

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
