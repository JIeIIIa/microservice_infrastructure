package org.it.discovery.order.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;

    private List<OrderItem> items;

    private LocalDateTime orderDate;

    private Customer customer;

    private boolean payed;

    private boolean delivered;

    private boolean cancelled;

    public void addItem(OrderItem item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }

}
