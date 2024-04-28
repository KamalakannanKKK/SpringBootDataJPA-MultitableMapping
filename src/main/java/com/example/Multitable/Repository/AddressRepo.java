package com.example.Multitable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Multitable.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

}
