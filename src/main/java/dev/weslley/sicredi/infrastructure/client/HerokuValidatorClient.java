package dev.weslley.sicredi.infrastructure.client;

import dev.weslley.sicredi.infrastructure.client.dto.CpfStatusDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        value = "HerokuValidatorClient",
        url = "https://user-info.herokuapp.com"
)
public interface HerokuValidatorClient {

    @GetMapping("users/{cpf}")
    CpfStatusDto getStatusVote(@PathVariable("cpf") String cpf);
}
