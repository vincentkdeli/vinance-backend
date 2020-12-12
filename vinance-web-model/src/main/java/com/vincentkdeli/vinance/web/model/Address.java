package com.vincentkdeli.vinance.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author - Vincent K. Deli
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private String city;

  private String country;

  private String street;

  private String district;

  private String subDistrict;

  private String postalCode;

}
