package com.example.bank.repository;

import com.example.bank.entity.ParticipantInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с ParticipantInfo")
public interface ParticipantInfoRepository extends JpaRepository<ParticipantInfo, Long> {
    Page<ParticipantInfo> findAll(Pageable pageable);
}
