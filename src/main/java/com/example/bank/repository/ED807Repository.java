package com.example.bank.repository;

import com.example.bank.entity.ED807;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с ed807")
public interface ED807Repository extends JpaRepository<ED807,Long> {
    Page<ED807> findAll(Pageable pageable);
}
