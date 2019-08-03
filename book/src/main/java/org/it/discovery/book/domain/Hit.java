package org.it.discovery.book.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hit {
    private String userName;

    private String ip;

    private String browser;

    private LocalDateTime viewed;

    private String applicationName;
}
