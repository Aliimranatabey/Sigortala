package com.nurullahmese.sigortala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nurullahmese.sigortala.entitiy.DaskInsurance;

@Repository
public interface DaskInsuranceRepository extends JpaRepository<DaskInsurance, Long> {

}
