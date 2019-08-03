package org.it.discovery.book.dto.v2;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.it.discovery.book.domain.Book;
import org.it.discovery.book.domain.Hit;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDTO {
    private int id;

    private String name;

    private String biography;

    private LocalDate birthDate;
}
