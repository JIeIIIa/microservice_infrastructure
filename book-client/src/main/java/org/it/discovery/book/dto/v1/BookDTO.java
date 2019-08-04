package org.it.discovery.book.dto.v1;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.it.discovery.book.dto.v2.PersonDTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private int id;

    private String name;

    private int year;

    private int pages;

    private double price;

    private PersonDTO author;

    private List<HitDTO> hits = new ArrayList<>();
}
