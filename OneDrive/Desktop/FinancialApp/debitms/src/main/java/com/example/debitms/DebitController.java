package com.example.debitms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/dedits")
public class DebitController {


    DebitService debitService;
    @Autowired
    public DebitController(DebitService debitService) {
        this.debitService = debitService;
    }

    @GetMapping
    public ResponseEntity<List<DebitInfo>> getDebitInfo() {
        List<DebitInfo> debitinfo = debitService.findAll();
        if(debitinfo.isEmpty())
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return  ResponseEntity.ok(debitinfo);

    }

    @GetMapping("/{id}")
    public ResponseEntity<DebitInfo> getCreditInfo(@PathVariable Long id) {
        DebitInfo debitinfo = debitService.findbyId(id);
        if(debitinfo==null)
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return  ResponseEntity.ok(debitinfo);
    }

    @PostMapping
    public ResponseEntity<DebitInfo> createCredit(@RequestBody DebitInfo debitinfo) {

        DebitInfo debitInfo = debitService.saveCredit(debitinfo);
        if(debitInfo==null)
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return  ResponseEntity.ok(debitInfo);

    }

}
