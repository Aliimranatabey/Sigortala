package com.nurullahmese.sigortala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nurullahmese.sigortala.entitiy.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
