package com.vincentkdeli.vinance.command;

import com.vincentkdeli.vinance.command.model.request.RegisterMemberRequest;
import com.vincentkdeli.vinance.web.model.response.RegisterMemberResponse;

/**
 * @author - Vincent K. Deli
 **/

public interface RegisterMemberCommand extends Command<RegisterMemberRequest, RegisterMemberResponse> {
}
