package com.vincentkdeli.vinance.command;

import com.vincentkdeli.vinance.command.model.CommandRequest;
import reactor.core.publisher.Mono;

/**
 * @author - Vincent K. Deli
 **/

public interface Command<REQUEST extends CommandRequest, RESULT> {

  Mono<RESULT> doExecute(REQUEST request);

}
