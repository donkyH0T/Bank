package com.example.bank.dto;

import com.example.bank.entity.BICDirectory;
import jakarta.persistence.Column;

import java.time.LocalDate;

public class ParticipantInfoDTO {
    private BICDirectory bicDirectoryEntry;
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

    public ParticipantInfoDTO(BICDirectory bicDirectoryEntry, String nameP, String cntrCd, String rgn, String ind, String tnp, String nnp, String adr, String dateIn, String ptType, String srvcs, String xchType, String uid, String participantStatus) {
        this.bicDirectoryEntry = bicDirectoryEntry;
        this.nameP = nameP;
        this.cntrCd = cntrCd;
        this.rgn = rgn;
        this.ind = ind;
        this.tnp = tnp;
        this.nnp = nnp;
        this.adr = adr;
        this.dateIn = LocalDate.parse(dateIn);
        this.ptType = ptType;
        this.srvcs = srvcs;
        this.xchType = xchType;
        this.uid = uid;
        this.participantStatus = participantStatus;
    }
}
