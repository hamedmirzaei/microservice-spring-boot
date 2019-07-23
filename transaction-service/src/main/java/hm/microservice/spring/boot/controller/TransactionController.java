package hm.microservice.spring.boot.controller;

import hm.microservice.spring.boot.model.Transaction;
import hm.microservice.spring.boot.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Transaction getTransaction(@PathVariable(value = "id") Long transactionId) {
        return transactionService.getTransaction(transactionId);
    }

    @PostMapping("")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.addAccount(transaction);
    }

}