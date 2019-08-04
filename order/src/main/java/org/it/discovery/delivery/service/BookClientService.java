package org.it.discovery.delivery.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.it.discovery.book.controller.BookClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class BookClientService {

  private final RestTemplate restTemplate;

  private final BookClient bookClient;

  @HystrixCommand(fallbackMethod = "fetchPriceFallback"/*,
      commandProperties = {
          @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "1")}*/)
  public Double fetchPrice(int bookId) {
    System.out.println("fetching price with Feign...");
    return bookClient.getBookPrice(bookId);
  }

  public Double fetchPriceFallback(int bookId, Throwable e) {
    System.out.println("fetching price failure [" + bookId + "]...");
    System.out.println(e.getMessage());

    throw new IllegalArgumentException(e.getMessage());
  }

  private Double fetchPriceOld(int bookId) {
    System.out.println("fetching price with restTemplate...");
    return restTemplate
        .getForObject("http://library-client/api/v2/book/{id}/price", Double.class, bookId);
  }
}
