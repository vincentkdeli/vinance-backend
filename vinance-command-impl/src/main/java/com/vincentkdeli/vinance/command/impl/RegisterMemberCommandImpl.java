package com.vincentkdeli.vinance.command.impl;

import com.vincentkdeli.vinance.command.AbstractCommand;
import com.vincentkdeli.vinance.command.RegisterMemberCommand;
import com.vincentkdeli.vinance.command.model.request.RegisterMemberRequest;
import com.vincentkdeli.vinance.entity.Member;
import com.vincentkdeli.vinance.helper.EmailHelper;
import com.vincentkdeli.vinance.repository.MemberRepository;
import com.vincentkdeli.vinance.web.model.response.RegisterMemberResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @author - Vincent K. Deli
 **/

@Component
@AllArgsConstructor
public class RegisterMemberCommandImpl extends AbstractCommand<RegisterMemberRequest, RegisterMemberResponse>
    implements RegisterMemberCommand {

  private final MemberRepository memberRepository;

  private final EmailHelper emailHelper;

  @Override
  public Mono<RegisterMemberResponse> execute(RegisterMemberRequest request) {
    return memberRepository.save(validateRequest(request))
        .map(this::constructRegisterResponse);
  }

  private Member validateRequest(RegisterMemberRequest request) {

    return Optional.ofNullable(request)
        .filter(req -> emailHelper.isEmailValid(req.getEmail()))
        .map(this::toMemberEntity)
        .orElse(null);
  }

  private Member toMemberEntity(RegisterMemberRequest request) {
    return Member.builder()
        .email(request.getEmail())
        .password(request.getPassword())
        .build();
  }

  private RegisterMemberResponse constructRegisterResponse(Member member) {
    return Optional.ofNullable(member)
        .map(this::toRegisterMemberResponse)
        .orElse(null);
  }

  private RegisterMemberResponse toRegisterMemberResponse(Member member) {
    return RegisterMemberResponse.builder()
        .username(member.getUsername())
        .email(member.getEmail())
        .firstName(member.getFirstName())
        .lastName(member.getLastName())
        .phoneNumber(member.getPhoneNumber())
        .gender(member.getGender())
        .address(member.getAddress())
        .success(Boolean.TRUE)
        .build();
  }
}
