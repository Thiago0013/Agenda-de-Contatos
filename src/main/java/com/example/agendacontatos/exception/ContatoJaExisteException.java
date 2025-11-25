package com.example.agendacontatos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ContatoJaExisteException extends RuntimeException {
    public ContatoJaExisteException(String msg) {
        super(msg);
    }
}
