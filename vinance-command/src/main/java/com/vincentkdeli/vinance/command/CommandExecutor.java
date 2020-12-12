package com.vincentkdeli.vinance.command;

import com.vincentkdeli.vinance.command.model.CommandRequest;
import reactor.core.publisher.Mono;

/**
 * @author - Vincent K. Deli
 **/

public interface CommandExecutor {

  <R extends CommandRequest, T> Mono<T> execute(Class<? extends Command<R, T>> commandClass, R request);

}
