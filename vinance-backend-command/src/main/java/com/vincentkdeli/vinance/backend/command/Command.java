package com.vincentkdeli.vinance.backend.command;

import com.vincentkdeli.vinance.backend.command.model.CommandRequest;
import reactor.core.publisher.Mono;

/**
 * @author - Vincent K. Deli
 * @created - 31/07/20
 */

public interface Command<REQUEST extends CommandRequest, RESULT> {

  Mono<RESULT> doExecute(REQUEST request);

}
