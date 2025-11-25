package com.example.agendacontatos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ContatoJaExisteException.class)
    public ResponseEntity<?> handleContatoJaExiste(ContatoJaExisteException ex) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of(
                        "erro", ex.getMessage(),
                        "status", 409,
                        "timestamp", LocalDateTime.now()
                ));
    }

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ResponseEntity<?> handleContatoNaoEncontrado(UsuarioNaoEncontradoException ex) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of(
                        "erro", ex.getMessage(),
                        "status", 409,
                        "timestamp", LocalDateTime.now()
                ));
    }
}
