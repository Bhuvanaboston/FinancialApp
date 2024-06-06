package com.example.debitms;

import java.util.List;

public interface DebitService {
    List<DebitInfo> findAll();

    DebitInfo findbyId(Long id);

    DebitInfo saveCredit(DebitInfo debitinfo);
}
