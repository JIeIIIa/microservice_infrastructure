package org.it.discovery.book.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("library-client")
@Component
public interface BookClient {

  @GetMapping("/api/v2/book/{id}/price")
  double getBookPrice(@PathVariable("id") int id);

}
