package com.example.creditms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditServiceImpl implements CreditService {


    private CreditRepository debitRepository;
    @Autowired
    public CreditServiceImpl(CreditRepository debitRepository) {
        this.debitRepository = debitRepository;
    }

    @Override
    public List<CreditInfo> findAll() {
        return debitRepository.findAll();
    }

    @Override
    public CreditInfo findbyId(Long id) {
        return debitRepository.findById(id).orElse(null);
    }

    @Override
    public CreditInfo saveCredit(CreditInfo creditinfo) {
        return debitRepository.save(creditinfo);
    }
}
