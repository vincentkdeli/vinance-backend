package com.vincentkdeli.vinance.backend.command.impl;

import com.vincentkdeli.vinance.backend.command.AbstractCommand;
import com.vincentkdeli.vinance.backend.command.RegisterCommand;
import com.vincentkdeli.vinance.backend.command.model.request.RegisterRequest;
import com.vincentkdeli.vinance.backend.entity.Member;
import com.vincentkdeli.vinance.backend.repository.MemberRepository;
import com.vincentkdeli.vinance.backend.web.model.response.RegisterResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

@Component
@AllArgsConstructor
public class RegisterCommandImpl extends AbstractCommand<RegisterRequest, RegisterResponse> implements RegisterCommand {

  private final MemberRepository memberRepository;

  @Override
  public Mono<RegisterResponse> execute(RegisterRequest request) {
    return memberRepository.save(toMemberEntity(request))
        .map(this::toRegisterResponse);
  }

  private Member toMemberEntity(RegisterRequest request) {
    return Member.builder()
        .email(request.getEmail())
        .password(request.getPassword())
        .build();
  }

  private RegisterResponse toRegisterResponse(Member member) {
    if (Objects.nonNull(member)) {
      return RegisterResponse.builder()
          .success(Boolean.TRUE)
          .build();
    }
    return RegisterResponse.builder()
        .success(Boolean.FALSE)
        .build();
  }
}
