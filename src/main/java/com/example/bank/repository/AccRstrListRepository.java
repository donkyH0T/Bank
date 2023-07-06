package com.example.bank.repository;

import com.example.bank.entity.AccRstrList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с AccRstrList")
public interface AccRstrListRepository extends JpaRepository<AccRstrList, Long> {
    Page<AccRstrList> findAll(Pageable pageable);
}
