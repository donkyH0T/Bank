package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "PARTICIPANT_INFO")
@Data
public class ParticipantInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NameP")
    private String nameP;

    @Column(name = "CntrCd")
    private String cntrCd;

    @Column(name = "Rgn")
    private String rgn;

    @Column(name = "Ind")
    private String ind;

    @Column(name = "Tnp")
    private String tnp;

    @Column(name = "Nnp")
    private String nnp;

    @Column(name = "Adr")
    private String adr;

    @Column(name = "DateIn")
    private LocalDate dateIn;

    @Column(name = "PtType")
    private String ptType;

    @Column(name = "Srvcs")
    private String srvcs;

    @Column(name = "XchType")
    private String xchType;

    @Column(name = "UID")
    private String uid;

    @Column(name = "ParticipantStatus")
    private String participantStatus;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "rstrList_id")
    private List<RstrList> rstrList;
}
