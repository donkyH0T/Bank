package com.example.bank.repository;

import com.example.bank.entity.ParticipantInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantInfoRepository extends JpaRepository<ParticipantInfo, Long> {
}
