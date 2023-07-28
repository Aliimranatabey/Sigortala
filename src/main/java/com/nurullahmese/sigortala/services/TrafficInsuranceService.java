package com.nurullahmese.sigortala.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nurullahmese.sigortala.entitiy.TrafficInsurance;
import com.nurullahmese.sigortala.repository.TrafficInsuranceRepository;

@Service
public class TrafficInsuranceService {

    @Autowired
    private TrafficInsuranceRepository trafficInsuranceRepository;

    public List<TrafficInsurance> getAll() {
        return trafficInsuranceRepository.findAll();
    }

    public TrafficInsurance add(TrafficInsurance trafficInsurance) {
        return trafficInsuranceRepository.save(trafficInsurance);
    }

}
