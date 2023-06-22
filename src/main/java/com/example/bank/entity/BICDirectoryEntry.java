package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Entity
@Data
@Table(name = "BIC_DIRECTORY_ENTRY")
public class BICDirectoryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BIC")
    private String bic;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private ParticipantInfo participantInfo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Accounts> accounts;

    @OneToMany(fetch = FetchType.LAZY)
    private List<SWBICS> swbics;

}
