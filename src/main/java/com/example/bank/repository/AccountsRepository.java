package com.example.bank.repository;

import com.example.bank.entity.Accounts;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с аккаунтами")
public interface AccountsRepository extends JpaRepository<Accounts,Long> {
    Page<Accounts> findAll(Pageable pageable);
}
