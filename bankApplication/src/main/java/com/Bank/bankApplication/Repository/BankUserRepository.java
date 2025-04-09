package com.Bank.bankApplication.Repository;

import com.Bank.bankApplication.Model.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankUserRepository extends JpaRepository<BankUser,Long> {
}
