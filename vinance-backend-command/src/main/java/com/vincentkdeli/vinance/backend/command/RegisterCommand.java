package com.vincentkdeli.vinance.backend.command;

import com.vincentkdeli.vinance.backend.command.model.request.RegisterRequest;
import com.vincentkdeli.vinance.backend.web.model.response.RegisterResponse;

/**
 * @author - Vincent K. Deli
 * @created - 15/08/20
 */

public interface RegisterCommand extends Command<RegisterRequest, RegisterResponse> {
}
