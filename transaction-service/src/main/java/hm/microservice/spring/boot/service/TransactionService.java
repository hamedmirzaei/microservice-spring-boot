package hm.microservice.spring.boot.service;

import hm.microservice.spring.boot.model.Transaction;
import hm.microservice.spring.boot.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction getTransaction(Long id) {
        return transactionRepository.findById(id).orElse(new Transaction(0L, 0L, 0L));
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public List<Transaction> getAllTransactionsOfAccount(Long accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    public Transaction addAccount(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
