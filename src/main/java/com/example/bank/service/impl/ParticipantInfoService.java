package com.example.bank.service.impl;

import com.example.bank.entity.ParticipantInfo;
import com.example.bank.repository.ParticipantInfoRepository;
import com.example.bank.service.BankService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Schema(description = "Сервис для работы с ParticipantInfo")
@Service
public class ParticipantInfoService implements BankService<ParticipantInfo> {

    private final ParticipantInfoRepository repository;

    public ParticipantInfoService(ParticipantInfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ParticipantInfo> getAll(int page,int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable).toList();
    }

    @Override
    public ParticipantInfo getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public boolean remove(Long id) {
        repository.deleteById(id);
        return repository.existsById(id);
    }

    @Override
    public ParticipantInfo create(ParticipantInfo entity) {
        return repository.save(entity);
    }

    @Override
    public ParticipantInfo update(ParticipantInfo entity, Long id) {
        return repository.findById(id)
                .map(participantInfo -> {
                    participantInfo.setNameP(entity.getNameP());
                    participantInfo.setCntrCd(entity.getCntrCd());
                    participantInfo.setRgn(entity.getRgn());
                    participantInfo.setInd(entity.getTnp());
                    participantInfo.setTnp(entity.getTnp());
                    participantInfo.setNnp(entity.getNnp());
                    participantInfo.setAdr(entity.getAdr());
                    participantInfo.setDateIn(entity.getDateIn());
                    participantInfo.setPtType(entity.getPtType());
                    participantInfo.setSrvcs(entity.getSrvcs());
                    participantInfo.setXchType(entity.getXchType());
                    participantInfo.setUid(entity.getUid());
                    participantInfo.setParticipantStatus(entity.getParticipantStatus());
                    participantInfo.setRstrList(entity.getRstrList());
                    return repository.save(participantInfo);
                })
                .orElseGet(() -> {
                    entity.setId(id);
                    return repository.save(entity);
                });
    }
}
