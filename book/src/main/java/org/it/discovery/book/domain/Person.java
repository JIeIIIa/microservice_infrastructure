package org.it.discovery.book.domain;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;

    private String name;

    private String biography;

    private List<Book> books;

    private LocalDate birthDate;

    private List<Hit> hits;

}
