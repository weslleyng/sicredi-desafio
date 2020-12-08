package dev.weslley.sicredi.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.time.LocalDateTime;
import java.util.Optional;

@Configuration
public class JpaConfig {
    @Bean
    public AuditorAware<LocalDateTime> localDateTimeAuditorAware() {
        return () -> Optional.of(LocalDateTime.now());
    }
}
