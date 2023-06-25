package com.example.bank.service.impl;

import com.example.bank.entity.*;
import com.example.bank.xmlEntity.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Component;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Component
@Schema(description = "Маппер для перевода данных из dto в entity")
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
        ed807.getBicDirectoryEntry().get(0).getSwbics().forEach(System.out::println);
        return ed807;
    }

    private List<BICDirectoryEntry> toBICDirectoryEntryList(List<BICDirectoryEntryType> bicDirectoryEntryTypes) {
        if (bicDirectoryEntryTypes == null) {
            return null;
        }

        return bicDirectoryEntryTypes.stream()
                .map(this::toBICDirectoryEntry)
                .collect(Collectors.toList());
    }

    private BICDirectoryEntry toBICDirectoryEntry(BICDirectoryEntryType bicDirectoryEntryType) {
        if (bicDirectoryEntryType == null) {
            return null;
        }
        BICDirectoryEntry bicDirectoryEntry = new BICDirectoryEntry();
        bicDirectoryEntry.setBic(bicDirectoryEntryType.getBIC());
        bicDirectoryEntry.setParticipantInfo(toParticipantInfo(bicDirectoryEntryType.getParticipantInfo()));
        bicDirectoryEntry.setAccounts(toAccounts(bicDirectoryEntryType.getAccounts()));
        bicDirectoryEntry.setSwbics(toSWBICS(bicDirectoryEntryType.getSWBICS()));
        return bicDirectoryEntry;
    }

    private List<SWBICS> toSWBICS(List<SWBICSType> swbics) {
        if(swbics==null){
            return null;
        }
        return swbics.stream()
                .map(this::toSWBIC)
                .collect(Collectors.toList());
    }

    private SWBICS toSWBIC(SWBICSType swbicsType) {
        SWBICS swbics=new SWBICS();
        swbics.setSwbic(swbicsType.getSWBIC());
        swbics.setDefaultSWBIC(swbicsType.getDefaultSWBIC());
        return swbics;
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
       accounts.setAccRstrLists(toAccRstrList(accountsType.getContent()));
        return accounts;
    }

    private List<AccRstrList> toAccRstrList(List<AccRstrListType> content) {
        if(content==null){
            return null;
        }
        return content.stream()
                .map(this::toAccRstr)
                .collect(Collectors.toList());
    }

    private AccRstrList toAccRstr(AccRstrListType accRstrListType) {

        AccRstrList accRstrList=new AccRstrList();
        accRstrList.setAccRstr(accRstrListType.getAccRstr());
        accRstrList.setAccRstrDate(toLocalDate(accRstrListType.getAccRstrDate()));
        return accRstrList;
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
        participantInfo1.setRstrList(toRstrList(participantInfoType.getContent()));
        return participantInfo1;
    }

    private List<RstrList> toRstrList(List<RstrListType> content) {

        if(content==null){
            return null;
        }
        return content.stream()
                .map(this::toRstr)
                .collect(Collectors.toList());
    }

    private RstrList toRstr(RstrListType rstrListType) {
        RstrList rstrList=new RstrList();
        rstrList.setRstr(rstrListType.getRstr());
        rstrList.setRstrDate(toLocalDate(rstrListType.getRstrDate()));
        return rstrList;
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
