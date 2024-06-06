package com.example.debitms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebitServiceImpl implements DebitService{


    private DebitRepository debitRepository;
    @Autowired
    public DebitServiceImpl(DebitRepository debitRepository) {
        this.debitRepository = debitRepository;
    }

    @Override
    public List<DebitInfo> findAll() {
        return debitRepository.findAll();
    }

    @Override
    public DebitInfo findbyId(Long id) {
        return debitRepository.findById(id).orElse(null);
    }

    @Override
    public DebitInfo saveCredit(DebitInfo debitinfo) {
        return null;
    }
}
