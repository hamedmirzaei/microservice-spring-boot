package hm.microservice.spring.boot.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TRANSACTION")
public class Transaction implements Serializable {

    @Id
    @Column(name = "TRANSACTION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TRANSACTION_AMOUNT")
    private Long transactionAmount;

    @Column(name = "ACCOUNT_ID", nullable = false)
    private Long accountId;

    public Transaction() {
    }

    public Transaction(Long transactionAmount, Long accountId) {
        this.transactionAmount = transactionAmount;
        this.accountId = accountId;
    }

    public Transaction(Long id, Long transactionAmount, Long accountId) {
        this.id = id;
        this.transactionAmount = transactionAmount;
        this.accountId = accountId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionAmount=" + transactionAmount +
                ", accountId=" + accountId +
                '}';
    }
}
