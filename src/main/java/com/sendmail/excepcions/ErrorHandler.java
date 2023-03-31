package com.sendmail.excepcions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.webjars.NotFoundException;

@ControllerAdvice
public class ErrorHandler {

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<String> handleNotFoundException(NotFoundException e) {
    System.out.println("Se produjo una excepcion aca");
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }

}
