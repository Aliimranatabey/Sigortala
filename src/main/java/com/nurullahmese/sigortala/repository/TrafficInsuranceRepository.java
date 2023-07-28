package com.nurullahmese.sigortala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nurullahmese.sigortala.entitiy.TrafficInsurance;

@Repository
public interface TrafficInsuranceRepository extends JpaRepository<TrafficInsurance, Long> {

}
