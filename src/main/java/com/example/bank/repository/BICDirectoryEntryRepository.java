package com.example.bank.repository;

import com.example.bank.entity.BICDirectoryEntry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BICDirectoryEntryRepository extends JpaRepository<BICDirectoryEntry, Long> {
    Page<BICDirectoryEntry> findAll(Pageable pageable);
}
