package com.vincentkdeli.vinance.backend.command;

import com.vincentkdeli.vinance.backend.command.exception.CommandValidationException;
import com.vincentkdeli.vinance.backend.command.model.CommandRequest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import reactor.core.publisher.Mono;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author - Vincent K. Deli
 * @created - 31/07/20
 */

public abstract class AbstractCommand<REQUEST extends CommandRequest, RESULT>
    implements Command<REQUEST, RESULT>, ApplicationContextAware, InitializingBean {

  protected Validator validator;

  protected ApplicationContext applicationContext;

  @Override
  public final void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }

  @Override
  public final void afterPropertiesSet() throws Exception {
    this.validator = applicationContext.getBean(Validator.class);
  }

  @Override
  public final Mono<RESULT> doExecute(REQUEST request) {
    Set<ConstraintViolation<REQUEST>> constraintViolations = validator.validate(request);
    if (constraintViolations.isEmpty()) {
      return execute(request);
    } else {
      return Mono.error(new CommandValidationException(constraintViolations));
    }
  }

  public abstract Mono<RESULT> execute(REQUEST request);

}
