package com.example.bank.repository;


import com.example.bank.entity.RstrList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с RstrList")
public interface RstrListRepository extends JpaRepository<RstrList, Long> {
}
