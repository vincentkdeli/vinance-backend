package com.vincentkdeli.vinance.backend.command.exception;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * @author - Vincent K. Deli
 * @created - 01/08/20
 */

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
