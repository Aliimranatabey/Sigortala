package com.nurullahmese.sigortala.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nurullahmese.sigortala.entitiy.DaskInsurance;
import com.nurullahmese.sigortala.repository.DaskInsuranceRepository;

@Service
public class DaskInsuranceService {

    @Autowired
    private DaskInsuranceRepository daskInsuranceRepository;

    public List<DaskInsurance> getAll() {
        return daskInsuranceRepository.findAll();
    }

    public DaskInsurance add(DaskInsurance daskInsurance) {
        return daskInsuranceRepository.save(daskInsurance);
    }

}
