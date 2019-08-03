package org.it.discovery.book.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @Value("${library.name:NOT_DEFINED}")
  private String applicationName;

  @GetMapping("/api/v1/application-name")
  public String applicationName() {
    return applicationName;
  }
}
