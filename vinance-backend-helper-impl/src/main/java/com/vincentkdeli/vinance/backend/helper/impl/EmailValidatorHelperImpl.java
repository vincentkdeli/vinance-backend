package com.vincentkdeli.vinance.backend.helper.impl;

import com.vincentkdeli.vinance.backend.helper.EmailValidatorHelper;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

@Component
public class EmailValidatorHelperImpl implements EmailValidatorHelper {

  @Override
  public boolean isValid(String email) {
    EmailValidator validator = EmailValidator.getInstance();
    return validator.isValid(email);
  }

}
