package com.javastart.springmy.repository;

import com.javastart.springmy.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
