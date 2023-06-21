package com.example.bank.dto;

import com.example.bank.entity.BICDirectoryEntry;

import java.time.LocalDate;

public class AccountDTO {
    private BICDirectoryEntry bicDirectoryEntry;

    private String account;

    private String regulationAccountType;

    private String ck;

    private String accountCBRBIC;

    private LocalDate dateIn;

    private String accountStatus;

    public AccountDTO(BICDirectoryEntry bicDirectoryEntry, String account, String regulationAccountType, String ck, String accountCBRBIC, String dateIn, String accountStatus) {
        this.bicDirectoryEntry = bicDirectoryEntry;
        this.account = account;
        this.regulationAccountType = regulationAccountType;
        this.ck = ck;
        this.accountCBRBIC = accountCBRBIC;
        this.dateIn = LocalDate.parse(dateIn);
        this.accountStatus = accountStatus;
    }
}
