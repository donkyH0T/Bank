package com.example.bank.repository;

import com.example.bank.entity.BankData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с bankDate")
public interface BankDataRepository extends JpaRepository<BankData,Long> {
}
