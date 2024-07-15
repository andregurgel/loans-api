package br.dev.andregurgel.loansapi.api.config.handler.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class RestErrorMessage {
    private HttpStatus status;
    private String message;
}
