package org.it.discovery.delivery.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int id;

    private String name;

    private String address;

    private String phone;

    private String email;

    private String cardNumber;

    private List<Order> orders;

}
