package com.nurullahmese.sigortala.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nurullahmese.sigortala.entitiy.DaskInsurance;
import com.nurullahmese.sigortala.services.DaskInsuranceService;

@RestController
@RequestMapping("daskInsurance")
public class DaskInsuranceController {

    @Autowired
    DaskInsuranceService daskInsuranceService;

    @GetMapping("/test")
    public String getTest() {
        return "TEST SUCCESSFUL";
    }

    @GetMapping("")
    public List<DaskInsurance> getAll() {
        return daskInsuranceService.getAll();
    }

    @PostMapping("")
    public String add(@RequestBody DaskInsurance daskInsurance) {
        daskInsuranceService.add(daskInsurance);
        return "SUCCESSFUL ADDED";
    }

}
