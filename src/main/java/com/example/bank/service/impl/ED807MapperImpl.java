package com.example.bank.service.impl;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.BICDirectory;
import com.example.bank.entity.ED807;
import com.example.bank.entity.ParticipantInfo;
import com.example.bank.xmlEntity.AccountsType;
import com.example.bank.xmlEntity.BICDirectoryEntryType;
import com.example.bank.xmlEntity.ED807Type;
import com.example.bank.xmlEntity.ParticipantInfoType;
import org.springframework.stereotype.Component;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ED807MapperImpl{
    public ED807 toED807(ED807Type ed807Type) {
        if (ed807Type == null) {
            return null;
        }
        ED807 ed807 = new ED807();
        ed807.setEdNo(ed807Type.getEdNo());
        ed807.setEdDate(toLocalDate(ed807Type.getEdDate()));
        ed807.setEdAuthor(ed807Type.getEdAuthor());
        ed807.setCreationReason(ed807Type.getCreationReason());
        ed807.setCreationDateTime(toLocalDateTime(ed807Type.getCreationDateTime()));
        ed807.setInfoTypeCode(ed807Type.getInfoTypeCode());
        ed807.setBusinessDay(toLocalDate(ed807Type.getBusinessDay()));
        ed807.setDirectoryVersion(ed807Type.getDirectoryVersion());
        ed807.setBicDirectoryEntry(toBICDirectoryEntryList(ed807Type.getBICDirectoryEntry()));
        return ed807;
    }

    private List<BICDirectory> toBICDirectoryEntryList(List<BICDirectoryEntryType> bicDirectoryEntryTypes) {
        if (bicDirectoryEntryTypes == null) {
            return null;
        }

        return bicDirectoryEntryTypes.stream()
                .map(this::toBICDirectoryEntry)
                .collect(Collectors.toList());
    }

    private BICDirectory toBICDirectoryEntry(BICDirectoryEntryType bicDirectoryEntryType) {
        if (bicDirectoryEntryType == null) {
            return null;
        }
        BICDirectory bicDirectoryEntry = new BICDirectory();
        bicDirectoryEntry.setBic(bicDirectoryEntryType.getBIC());
        bicDirectoryEntry.setParticipantInfo(toParticipantInfo(bicDirectoryEntryType.getParticipantInfo()));
        bicDirectoryEntry.setAccounts(toAccounts(bicDirectoryEntryType.getAccounts()));
        return bicDirectoryEntry;
    }

    private List<Accounts> toAccounts(List<AccountsType> accountsTypes) {
        if(accountsTypes==null){
            return null;
        }
        return accountsTypes.stream()
                .map(this::toAccounts)
                .collect(Collectors.toList());
    }
    private Accounts toAccounts(AccountsType accountsType){
        Accounts accounts=new Accounts();
       accounts.setAccount(accountsType.getAccount());
       accounts.setRegulationAccountType(accountsType.getRegulationAccountType());
       accounts.setCk(accountsType.getCK());
       accounts.setAccountCBRBIC(accountsType.getAccountCBRBIC());
       accounts.setDateIn(toLocalDate(accountsType.getDateIn()));
       accounts.setAccountStatus(accountsType.getAccountStatus());
        return accounts;
    }

    private ParticipantInfo toParticipantInfo(ParticipantInfoType participantInfoType) {
        ParticipantInfo participantInfo1=new ParticipantInfo();
        participantInfo1.setNameP(participantInfoType.getNameP());
        participantInfo1.setCntrCd(participantInfoType.getCntrCd());
        participantInfo1.setRgn(participantInfoType.getRgn());
        participantInfo1.setInd(participantInfoType.getInd());
        participantInfo1.setTnp(participantInfoType.getTnp());
        participantInfo1.setNnp(participantInfoType.getNnp());
        participantInfo1.setAdr(participantInfoType.getAdr());
        participantInfo1.setDateIn(toLocalDate(participantInfoType.getDateIn()));
        participantInfo1.setPtType(participantInfoType.getPtType());
        participantInfo1.setSrvcs(participantInfoType.getSrvcs());
        participantInfo1.setXchType(participantInfoType.getXchType());
        participantInfo1.setUid(participantInfoType.getUID());
        participantInfo1.setParticipantStatus(participantInfoType.getParticipantStatus());
        return participantInfo1;
    }

    private LocalDateTime toLocalDateTime(XMLGregorianCalendar creationDateTime) {
        if(creationDateTime==null){
            return null;
        }
        return creationDateTime.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
    }


    private LocalDate toLocalDate(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar == null) {
            return null;
        }
        return xmlGregorianCalendar.toGregorianCalendar().toZonedDateTime().toLocalDate();
    }
}
