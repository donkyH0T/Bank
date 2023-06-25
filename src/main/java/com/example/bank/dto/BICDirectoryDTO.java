package com.example.bank.dto;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.ED807;
import com.example.bank.entity.ParticipantInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "Класс для работы с dto")
@Data
public class BICDirectoryDTO {
    private ED807 ed807;

    private String bic;

    private ParticipantInfo participantInfo;

    private List<Accounts> accounts;

}
