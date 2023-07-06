package com.example.bank.repository;

import com.example.bank.entity.BankData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Schema(description = "Интерфейс для работы с BankData")
@Repository
public interface BankDataRepository extends JpaRepository<BankData,Long> {
    Page<BankData> findAll(Pageable pageable);
}
