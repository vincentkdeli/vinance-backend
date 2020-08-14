package com.vincentkdeli.vinance.backend.web.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {

  private boolean success;

}
