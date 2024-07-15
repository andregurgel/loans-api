package br.dev.andregurgel.loansapi.api.config.exception;

public class NoLoansAvaliableException extends RuntimeException {
    public NoLoansAvaliableException(String message) {
        super(message);
    }

    public NoLoansAvaliableException() {
        super("No loan available to customer.");
    }
}
