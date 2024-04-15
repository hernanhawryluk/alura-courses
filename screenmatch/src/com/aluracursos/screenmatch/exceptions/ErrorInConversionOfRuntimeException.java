package com.aluracursos.screenmatch.exceptions;

public class ErrorInConversionOfRuntimeException extends RuntimeException {
    private String message;

    public ErrorInConversionOfRuntimeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
