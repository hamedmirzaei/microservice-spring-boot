package hm.microservice.spring.boot.model.external;

import java.io.Serializable;

public class Transaction implements Serializable {

    private Long id;
    private Long transactionAmount;
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
