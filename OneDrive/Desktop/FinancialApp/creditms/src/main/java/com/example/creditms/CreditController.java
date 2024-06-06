package com.example.creditms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credits")
public class CreditController {

private CreditService debitservice;
    @Autowired
    public CreditController(CreditService debitservice) {
        this.debitservice = debitservice;
    }

    @GetMapping
    public ResponseEntity<List<CreditInfo>> getDebitInfo() {
        List<CreditInfo> creditinfo = debitservice.findAll();
        if(creditinfo.isEmpty())
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return  ResponseEntity.ok(creditinfo);

    }
    @GetMapping("/{id}")
    public ResponseEntity<CreditInfo> getCreditInfo(@PathVariable Long id) {
        CreditInfo creditinfo = debitservice.findbyId(id);
        if(creditinfo==null)
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return  ResponseEntity.ok(creditinfo);
    }

    @PostMapping
    public ResponseEntity<CreditInfo> createCredit(@RequestBody CreditInfo creditinfo) {

        CreditInfo creditInfo = debitservice.saveCredit(creditinfo);
        if(creditInfo==null)
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return  ResponseEntity.ok(creditInfo);

    }
}
