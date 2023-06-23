package com.example.bank.service;

import com.example.bank.dto.BaseBankDto;

import java.util.List;

public interface BankService<T extends BaseBankDto> {
   public List<T> getAll();
   public T getById(Long id);
   public T deleteEntity(Long id);
   public T postEntity(T entity, Long id);
   public T putEntity(T entity, Long id);
}
