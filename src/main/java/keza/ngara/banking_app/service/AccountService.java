package keza.ngara.banking_app.service;

import jakarta.persistence.metamodel.SingularAttribute;
import keza.ngara.banking_app.dto.AccountDto;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;
import java.util.List;


public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}

