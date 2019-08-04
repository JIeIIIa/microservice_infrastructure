package org.it.discovery.book.dto.v2;

import java.time.LocalDate;
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
public class PersonDTO {
    private int id;

    private String name;

    private String biography;

    private LocalDate birthDate;
}
