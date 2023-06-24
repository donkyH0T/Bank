package com.example.bank.service;

import com.example.bank.dto.BaseBankDto;

import java.util.List;

public interface BankService<T extends BaseBankDto> {
   public List<T> getAll();
   public T getById(Long id);
   public T remove(Long id);
   public T create(T entity, Long id);
   public T update(T entity, Long id);
}
