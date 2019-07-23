package hm.microservice.spring.boot.controller;

import hm.microservice.spring.boot.model.Account;
import hm.microservice.spring.boot.model.external.Transaction;
import hm.microservice.spring.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private AccountService accountService;

    private RestTemplate restTemplate;

    @Autowired
    public AccountController(AccountService accountService, RestTemplate restTemplate) {
        this.accountService = accountService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable(value = "id") Long accountId) {
        return accountService.getAccount(accountId);
    }

    @GetMapping("/{id}/transactions")
    public List<Transaction> getAccountTransactions(@PathVariable(value = "id") Long accountId) {
        return restTemplate.getForObject("http://transaction-service/transactions/account/" + accountId, List.class);
    }

    @PostMapping("")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

}
