package com.example.bank.repository;

import com.example.bank.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepostitory extends JpaRepository<Accounts,Long> {
}
