package org.it.discovery.delivery.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {

  @ExceptionHandler(value = IllegalAccessException.class)
  public String error(IllegalArgumentException e) {
    return e.getMessage();
  }

}
