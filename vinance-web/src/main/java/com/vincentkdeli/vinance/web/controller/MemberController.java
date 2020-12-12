package com.vincentkdeli.vinance.web.controller;

import com.vincentkdeli.vinance.command.CommandExecutor;
import com.vincentkdeli.vinance.command.RegisterMemberCommand;
import com.vincentkdeli.vinance.command.model.request.RegisterMemberRequest;
import com.vincentkdeli.vinance.web.model.Response;
import com.vincentkdeli.vinance.web.model.response.RegisterMemberResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * @author - Vincent K. Deli
 **/

@AllArgsConstructor
@RequestMapping(value = "/api/member")
@RestController
public class MemberController {

  private final CommandExecutor commandExecutor;

  @PostMapping(
      value = "/register",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<Response<RegisterMemberResponse>> registerMember(@RequestBody RegisterMemberRequest request) {
    return commandExecutor.execute(RegisterMemberCommand.class, request)
        .map(Response::ok)
        .subscribeOn(Schedulers.elastic());
  }

}

