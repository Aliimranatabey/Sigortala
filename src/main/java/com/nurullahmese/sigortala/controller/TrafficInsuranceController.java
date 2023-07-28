package com.nurullahmese.sigortala.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nurullahmese.sigortala.services.TrafficInsuranceService;
import com.nurullahmese.sigortala.entitiy.TrafficInsurance;

@RestController
@RequestMapping("trafficInsurance")
public class TrafficInsuranceController {

    @Autowired
    TrafficInsuranceService trafficInsuranceService;

    @GetMapping("/test")
    public String getTest() {
        return "TEST SUCCESSFUL";
    }

    @GetMapping("")
    public List<TrafficInsurance> getAll() {
        return trafficInsuranceService.getAll();
    }

    @PostMapping("")
    public String add(@RequestBody TrafficInsurance trafficInsurance) {
        trafficInsuranceService.add(trafficInsurance);
        return "SUCCESSFUL ADDED";
    }

}
