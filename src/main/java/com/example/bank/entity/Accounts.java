package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "ACCOUNTS")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bic_directory_entry_id")
    private BICDirectoryEntry bicDirectoryEntry;

    @Column(name = "Account")
    private String account;

    @Column(name = "RegulationAccountType")
    private String regulationAccountType;

    @Column(name = "CK")
    private String ck;

    @Column(name = "AccountCBRBIC")
    private String accountCBRBIC;

    @Column(name = "DateIn")
    private LocalDate dateIn;

    @Column(name = "AccountStatus")
    private String accountStatus;

    @ManyToMany
    private List<AccRstrList> accRstrLists;
}
