package com.example.bank.service.impl;

import com.example.bank.entity.ParticipantInfo;
import com.example.bank.service.BankService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Service;

import java.util.List;

@Schema(description = "Сервис для работы с ParticipantInfo")
@Service
public class ParticipantInfoService implements BankService<ParticipantInfo> {
    @Override
    public List<ParticipantInfo> getAll() {
        return null;
    }

    @Override
    public ParticipantInfo getById(Long id) {
        return null;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }

    @Override
    public ParticipantInfo create(ParticipantInfo entity) {
        return null;
    }

    @Override
    public ParticipantInfo update(ParticipantInfo entity, Long id) {
        return null;
    }
}
