package com.vincentkdeli.vinance.backend.command;

import com.vincentkdeli.vinance.backend.command.model.request.RegisterMemberRequest;
import com.vincentkdeli.vinance.backend.web.model.response.RegisterMemberResponse;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

public interface RegisterMemberCommand extends Command<RegisterMemberRequest, RegisterMemberResponse> {
}
