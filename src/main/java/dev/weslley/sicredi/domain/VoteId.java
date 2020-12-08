package dev.weslley.sicredi.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class VoteId implements Serializable {

    private String scheduleId;
    private String cpf;

}
