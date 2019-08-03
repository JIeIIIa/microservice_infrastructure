package org.it.discovery.delivery.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
  private int id;

  private int orderId;

  private LocalDateTime deliveryDate;

  private double deliveryPrice;

}
