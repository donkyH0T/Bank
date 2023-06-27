package com.example.bank.repository;

import com.example.bank.entity.BICDirectoryEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BICDirectoryEntryRepository extends JpaRepository<BICDirectoryEntry, Long> {
}
