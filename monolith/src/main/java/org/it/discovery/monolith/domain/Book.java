package org.it.discovery.monolith.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Book {
    private int id;

    private String name;

    private int year;

    private int pages;

    private double price;

    private Person author;

    private List<Hit> hits = new ArrayList<>();
}
