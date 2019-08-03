package org.it.discovery.book.domain;

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
public class Book {
    private int id;

    private String name;

    private int year;

    private int pages;

    private double price;

    private Person author;

    private List<Hit> hits = new ArrayList<>();
}
