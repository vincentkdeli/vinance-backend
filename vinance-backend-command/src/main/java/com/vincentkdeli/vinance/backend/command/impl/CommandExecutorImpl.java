package com.vincentkdeli.vinance.backend.command.impl;

import com.vincentkdeli.vinance.backend.command.Command;
import com.vincentkdeli.vinance.backend.command.CommandExecutor;
import com.vincentkdeli.vinance.backend.command.model.CommandRequest;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @author - Vincent K. Deli
 * @created - 01/08/20
 */

@Component
public class CommandExecutorImpl implements CommandExecutor, ApplicationContextAware {

  private ApplicationContext applicationContext;

  @Override
  public <R extends CommandRequest, T> Mono<T> execute(Class<? extends Command<R, T>> commandClass, R request) {
    Command<R, T> command = applicationContext.getBean(commandClass);
    return command.doExecute(request);
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
