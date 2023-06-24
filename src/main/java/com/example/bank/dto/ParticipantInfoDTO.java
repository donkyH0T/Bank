package com.example.bank.dto;

import com.example.bank.entity.BICDirectoryEntry;
import com.example.bank.entity.RstrList;

import java.time.LocalDate;
import java.util.List;

public class ParticipantInfoDTO {
    private BICDirectoryEntry bicDirectoryEntry;
    private String nameP;
    private String cntrCd;

    private String rgn;
    private String ind;
    private String tnp;
    private String nnp;
    private String adr;
    private LocalDate dateIn;
    private String ptType;
    private String srvcs;
    private String xchType;
    private String uid;
    private String participantStatus;
    private List<RstrList> rstrList;

    public ParticipantInfoDTO(BICDirectoryEntry bicDirectoryEntry, String nameP, String cntrCd, String rgn, String ind, String tnp, String nnp, String adr, LocalDate dateIn, String ptType, String srvcs, String xchType, String uid, String participantStatus, List<RstrList> rstrList) {
        this.bicDirectoryEntry = bicDirectoryEntry;
        this.nameP = nameP;
        this.cntrCd = cntrCd;
        this.rgn = rgn;
        this.ind = ind;
        this.tnp = tnp;
        this.nnp = nnp;
        this.adr = adr;
        this.dateIn = dateIn;
        this.ptType = ptType;
        this.srvcs = srvcs;
        this.xchType = xchType;
        this.uid = uid;
        this.participantStatus = participantStatus;
        this.rstrList = rstrList;
    }
}
