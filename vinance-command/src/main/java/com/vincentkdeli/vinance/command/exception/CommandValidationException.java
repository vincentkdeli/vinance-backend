package com.vincentkdeli.vinance.command.exception;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * @author - Vincent K. Deli
 **/

public class CommandValidationException extends RuntimeException {

  private Set<ConstraintViolation<?>> constraintViolations;

  @SuppressWarnings("unchecked")
  public CommandValidationException(Set constraintViolations) {
    this.constraintViolations = (Set<ConstraintViolation<?>>) constraintViolations;
  }

  public Set<ConstraintViolation<?>> getConstraintViolations() {
    return constraintViolations;
  }

}
