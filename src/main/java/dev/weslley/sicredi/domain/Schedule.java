package dev.weslley.sicredi.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
public class Schedule implements Serializable {

    @Id
    private String id;
    private String description;
    private LocalDateTime dateStartTime;
    private LocalDateTime dateEndTime;

    @CreatedDate
    private LocalDateTime dateCreate;

}
