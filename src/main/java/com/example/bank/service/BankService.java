package com.example.bank.service;


import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "Интерфейс сервисов банка")
public interface BankService<T> {
   List<T> getAll(int page, int size);
   T getById(Long id);
   boolean remove(Long id);
   T create(T entity);
   T update(T entity, Long id);
}
