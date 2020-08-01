package com.vincentkdeli.vinance.backend.web.controller;

import com.vincentkdeli.vinance.backend.command.CommandExecutor;
import com.vincentkdeli.vinance.backend.command.ExampleCommand;
import com.vincentkdeli.vinance.backend.command.model.request.ExampleCommandRequest;
import com.vincentkdeli.vinance.backend.web.model.Response;
import com.vincentkdeli.vinance.backend.web.model.response.ExampleResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * @author - Vincent K. Deli
 * @created - 01/08/20
 */

@AllArgsConstructor
@RestController
public class ExampleController {

  private final CommandExecutor executor;

  @PostMapping(value = "/api/example/test",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<Response<ExampleResponse>> register(@RequestBody ExampleCommandRequest request) {
    return executor.execute(ExampleCommand.class, request)
        .map(Response::ok)
        .subscribeOn(Schedulers.elastic());
  }

}
