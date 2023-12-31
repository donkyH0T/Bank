package com.example.bank.entity;

import com.example.bank.enitiyListener.AuditableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Schema(description = "Сущность для ParticipantInfo")
@Entity
@Table(name = "PARTICIPANT_INFO")
@Data
public class ParticipantInfo extends AuditableEntity {
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "rstrList_id")
    private List<RstrList> rstrList;


}
