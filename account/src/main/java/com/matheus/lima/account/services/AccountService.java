package com.matheus.lima.account.services;

import com.matheus.lima.account.entity.Account;
import com.matheus.lima.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository repository;

    public void create(Account account) {
        repository.save(account);
    }

    public void update(Account account) {
        if (Objects.nonNull(account.getId())) {
            repository.save(account);
        }
    }

    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        repository.findAll().forEach(accounts::add);
        return accounts;
    }

    public Optional<Account> getById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
