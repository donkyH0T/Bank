package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "ACCOUNTS")
@XmlAccessorType(XmlAccessType.FIELD)
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

}
