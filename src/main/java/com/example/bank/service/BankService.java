package com.example.bank.service;

import java.util.List;

public interface BankService<T> {
   List<T> getAll();
   T getById(Long id);
   boolean remove(Long id);
   T create(T entity);
   T update(T entity, Long id);
}
