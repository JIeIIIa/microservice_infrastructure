package org.it.discovery.book.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EurekaController {

  private static final String CONFIG_SERVER = "config-server";

  private final EurekaClient eurekaClient;

  @GetMapping("/api/v1/eureka/config-server")
  public String configServer() {
    return eurekaClient.getApplication(CONFIG_SERVER).getInstances()
        .stream()
        .map(Objects::toString)
        .collect(Collectors.joining(";"));
  }

  @GetMapping("/api/v1/eureka/test")
  public String test() {
    List<InstanceInfo> instancesById = eurekaClient.getInstancesById(CONFIG_SERVER);
    return instancesById
        .stream()
        .map(InstanceInfo::toString)
        .collect(Collectors.joining(";"));
  }
}
