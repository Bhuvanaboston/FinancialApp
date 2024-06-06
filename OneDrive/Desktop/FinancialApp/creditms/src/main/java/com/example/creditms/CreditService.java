package com.example.creditms;

import java.util.List;

public interface CreditService {


    List<CreditInfo> findAll();

    CreditInfo findbyId(Long id);

    CreditInfo saveCredit(CreditInfo creditinfo);
}
