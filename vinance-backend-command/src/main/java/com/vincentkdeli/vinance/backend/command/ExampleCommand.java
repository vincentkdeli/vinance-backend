package com.vincentkdeli.vinance.backend.command;

import com.vincentkdeli.vinance.backend.command.model.request.ExampleCommandRequest;
import com.vincentkdeli.vinance.backend.web.model.response.ExampleResponse;

/**
 * @author - Vincent K. Deli
 * @created - 01/08/20
 */

public interface ExampleCommand extends Command<ExampleCommandRequest, ExampleResponse> {
}
