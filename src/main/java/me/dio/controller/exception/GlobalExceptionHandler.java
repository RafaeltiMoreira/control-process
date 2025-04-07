package me.dio.controller.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {
  private final Logger logger  = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler(IllegalArgumentException.class)
  public ResponseEntity<String> handleProcessException(IllegalArgumentException ProcessException) {
    return new ResponseEntity<>(ProcessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
  }

  @ExceptionHandler(NoSuchElementException.class)
  public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFoundException) {
    return new ResponseEntity<>("Resource ID not found.", HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(Throwable.class)
  public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException) {
    var message = "Unexpected server error, see the logs.";
    logger.error(message, unexpectedException);
    return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex) {
    StringBuilder errors = new StringBuilder("Erro(s) de validação: ");
    for (FieldError error : ex.getBindingResult().getFieldErrors()) {
      errors.append(String.format("[%s: %s] ", error.getField(), error.getDefaultMessage()));
    }
    return new ResponseEntity<>(errors.toString(), HttpStatus.BAD_REQUEST);
  }
}
