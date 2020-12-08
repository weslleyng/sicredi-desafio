package dev.weslley.sicredi.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Vote {

    @Id
    private VoteId id;

    private String chose;

    @CreatedDate
    private LocalDateTime dateCreate;

}
