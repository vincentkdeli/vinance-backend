package com.vincentkdeli.vinance.helper.impl;

import com.vincentkdeli.vinance.helper.EmailHelper;
import com.vincentkdeli.vinance.helper.EmailValidatorHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author - Vincent K. Deli
 **/

@AllArgsConstructor
@Component
public class EmailHelperImpl implements EmailHelper {

  private EmailValidatorHelper emailValidatorHelper;

  private static final Integer MAX_LENGTH = 30;

  @Override
  public boolean isEmailValid(String email) {
    return emailValidatorHelper.isValid(email) && email.length() <= MAX_LENGTH;
  }

}
