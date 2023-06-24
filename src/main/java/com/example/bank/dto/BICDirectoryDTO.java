package com.example.bank.dto;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.ED807;
import com.example.bank.entity.ParticipantInfo;
import com.example.bank.entity.SWBICS;
import lombok.Data;

import java.util.List;

@Data
public class BICDirectoryDTO {
    private ED807 ed807;

    private String bic;

    private ParticipantInfo participantInfo;

    private List<Accounts> accounts;

    private List<SWBICS> swbics;

}
