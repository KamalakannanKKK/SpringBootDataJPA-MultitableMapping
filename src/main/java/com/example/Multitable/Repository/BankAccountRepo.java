package com.example.Multitable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Multitable.Entity.BankAccount;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount,Long>{

}
