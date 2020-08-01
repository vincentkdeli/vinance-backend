package com.vincentkdeli.vinance.backend.command.impl;

import com.vincentkdeli.vinance.backend.command.AbstractCommand;
import com.vincentkdeli.vinance.backend.command.ExampleCommand;
import com.vincentkdeli.vinance.backend.command.model.request.ExampleCommandRequest;
import com.vincentkdeli.vinance.backend.web.model.response.ExampleResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @author - Vincent K. Deli
 * @created - 01/08/20
 */

@Component
public class ExampleCommandImpl extends AbstractCommand<ExampleCommandRequest, ExampleResponse>
    implements ExampleCommand {

  @Override
  public Mono<ExampleResponse> execute(ExampleCommandRequest request) {
    if (request.getUsername() != null) {
        return Mono.fromCallable(() -> ExampleResponse.builder().success(true).build());
    }
    return Mono.empty();
  }
}
