package com.vincentkdeli.vinance.backend.command;

import com.vincentkdeli.vinance.backend.command.model.CommandRequest;
import reactor.core.publisher.Mono;

/**
 * @author - Vincent K. Deli
 * @created - 01/08/20
 */

public interface CommandExecutor {

  <R extends CommandRequest, T> Mono<T> execute(Class<? extends Command<R, T>> commandClass, R request);

}
