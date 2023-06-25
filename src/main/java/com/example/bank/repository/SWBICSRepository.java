package com.example.bank.repository;

import com.example.bank.entity.SWBICS;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с SWBICS")
public interface SWBICSRepository extends JpaRepository<SWBICS, Long> {
}
