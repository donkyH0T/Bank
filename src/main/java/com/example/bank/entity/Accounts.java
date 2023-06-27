package com.example.bank.entity;

import com.example.bank.enitiyListener.AuditableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Schema(description = "Сущность аккаунтов")
@Data
@Table(name = "ACCOUNTS")
public class Accounts extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "accRstrList_id")
    private List<AccRstrList> accRstrLists;
}
