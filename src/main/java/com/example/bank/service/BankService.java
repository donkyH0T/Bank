package com.example.bank.service;

import com.example.bank.entity.BankData;
import org.springframework.web.multipart.MultipartFile;

public interface BankService {
    public BankData saveToBd(MultipartFile file);
    public BankData parseFromXml(MultipartFile file,BankData bankData);
   ;
}
