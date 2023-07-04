package com.example.bank.service;


import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Schema(description = "Интерфейс сервисов банка")
public interface BankService<T> {
   List<T> getAll();
   T getById(Long id);
   boolean remove(Long id);
   T create(T entity);
   T update(T entity, Long id);
}
