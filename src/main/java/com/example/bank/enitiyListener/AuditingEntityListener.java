package com.example.bank.enitiyListener;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AuditingEntityListener {

    @Autowired
    private AuditorAware<String> auditorAware;

    @PrePersist
    public void setCreatedOn(AuditableEntity entity) {
        entity.setCreatedDate(LocalDateTime.now());
        entity.setCreatedBy(auditorAware.getCurrentAuditor().orElse("unknown"));
    }

    @PreUpdate
    public void setUpdatedOn(AuditableEntity entity) {
        entity.setLastModifiedDate(LocalDateTime.now());
        entity.setLastModifiedBy(auditorAware.getCurrentAuditor().orElse("unknown"));
    }
}

