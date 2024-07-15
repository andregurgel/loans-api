package br.dev.andregurgel.loansapi.api.config.handler;

import br.dev.andregurgel.loansapi.api.config.exception.NoLoansAvaliableException;
import br.dev.andregurgel.loansapi.api.config.handler.dto.RestErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoLoansAvaliableException.class)
    public ResponseEntity<RestErrorMessage> invalidOrNotFounfShortenerCodeExceptionHandler(NoLoansAvaliableException invalidOrNotFoundShortenerCodeException) {
        RestErrorMessage error = new RestErrorMessage(HttpStatus.NO_CONTENT, invalidOrNotFoundShortenerCodeException.getMessage());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(error);
    }
}
