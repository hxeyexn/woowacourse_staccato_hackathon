package com.staccato.config;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ExceptionTemplate> handleInvalidReservationException(NoSuchElementException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ExceptionTemplate(HttpStatus.NOT_FOUND.toString(), exception.getMessage()));
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionTemplate> handleInvalidReservationException(RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ExceptionTemplate(HttpStatus.INTERNAL_SERVER_ERROR.toString(), "친구들아, 미안해 >3<"));
    }
}
