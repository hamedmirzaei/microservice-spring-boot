package hm.microservice.spring.boot.repository;

import hm.microservice.spring.boot.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    public List<Transaction> findByAccountId(Long accountId);
}
