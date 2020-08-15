package com.vincentkdeli.vinance.backend.web.model.response;

import com.vincentkdeli.vinance.backend.enums.Gender;
import com.vincentkdeli.vinance.backend.web.model.Address;
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
public class RegisterMemberResponse {

  private String username;

  private String email;

  private String firstName;

  private String lastName;

  private String phoneNumber;

  private Gender gender;

  private Address address;

  private boolean success;

}
