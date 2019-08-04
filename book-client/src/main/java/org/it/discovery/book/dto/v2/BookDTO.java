package org.it.discovery.book.dto.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDTO {
    private int id;

    private String name;

    private int year;

    private int pages;

    private double price;

    private PersonDTO author;
}
