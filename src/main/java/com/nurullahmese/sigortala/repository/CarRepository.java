package com.nurullahmese.sigortala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nurullahmese.sigortala.entitiy.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
