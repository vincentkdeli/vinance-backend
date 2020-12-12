package com.vincentkdeli.vinance.helper.impl;

import com.vincentkdeli.vinance.helper.EmailValidatorHelper;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;

/**
 * @author - Vincent K. Deli
 **/

@Component
public class EmailValidatorHelperImpl implements EmailValidatorHelper {

  @Override
  public boolean isValid(String email) {
    EmailValidator validator = EmailValidator.getInstance();
    return validator.isValid(email);
  }

}
