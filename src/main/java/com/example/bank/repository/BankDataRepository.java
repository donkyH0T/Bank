package com.example.bank.repository;

import com.example.bank.entity.BankData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankDataRepository extends JpaRepository<BankData,Long> {
}
