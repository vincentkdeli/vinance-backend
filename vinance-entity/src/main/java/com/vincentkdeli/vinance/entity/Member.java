package com.vincentkdeli.vinance.entity;

import com.vincentkdeli.vinance.enums.Gender;
import com.vincentkdeli.vinance.web.model.Address;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author - Vincent K. Deli
 **/

@Data
@Builder
@Document(collection = "member")
public class Member {

  @Id
  @NotBlank(message = "ID cannot be empty")
  private String id;

  private String username;

  @NotBlank(message = "Email cannot be empty")
  @Email
  @Indexed(unique = true)
  private String email;

  private String password;

  private String firstName;

  private String lastName;

  private String phoneNumber;

  private Gender gender;

  private Address address;

}
