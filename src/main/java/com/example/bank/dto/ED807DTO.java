package com.example.bank.dto;

import com.example.bank.xmlEntity.ED807Type;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class ED807DTO {
    private String edNo;
    private LocalDate edDate;
    private String edAuthor;
    private String creationReason;
    private LocalDateTime creationDateTime;
    private String infoTypeCode;
    private LocalDate businessDay;
    private Integer directoryVersion;
    private List<BICDirectoryDTO> bicDirectoryEntries;

    public ED807DTO(ED807Type ed807Type) {
        this.edNo=ed807Type.getEdNo();
        this.edDate= LocalDate.of(
               ed807Type.getEdDate().getYear(),
               ed807Type.getEdDate().getMonth(),
               ed807Type.getEdDate().getDay());
        this.edAuthor=ed807Type.getEdAuthor();
        this.creationReason=ed807Type.getCreationReason();
        this.creationDateTime= LocalDateTime.of(
                ed807Type.getCreationDateTime().getYear(),
                ed807Type.getCreationDateTime().getMonth(),
                ed807Type.getCreationDateTime().getDay(),
                ed807Type.getCreationDateTime().getHour(),
                ed807Type.getCreationDateTime().getMinute(),
                ed807Type.getCreationDateTime().getSecond()
        );

        this.infoTypeCode=ed807Type.getInfoTypeCode();
        this.businessDay= LocalDate.of(
                ed807Type.getBusinessDay().getYear(),
                ed807Type.getBusinessDay().getMonth(),
                ed807Type.getBusinessDay().getDay());
        this.directoryVersion= ed807Type.getDirectoryVersion();
        bicDirectoryEntries=new ArrayList<>();
        BeanUtils.copyProperties(ed807Type.getBICDirectoryEntry(),this.bicDirectoryEntries);
    }
}
