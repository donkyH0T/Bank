package com.example.bank.repository;

import com.example.bank.entity.Accounts;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.jpa.repository.JpaRepository;

@Schema(description = "Интерфейс для работы с аккаунтами")
public interface AccountsRepostitory extends JpaRepository<Accounts,Long> {
}
