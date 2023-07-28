package com.nurullahmese.sigortala.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nurullahmese.sigortala.entitiy.Car;
import com.nurullahmese.sigortala.services.CarService;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/test")
    public String getTest() {
        return "TEST SUCCESSFUL";
    }

    @GetMapping("")
    public List<Car> getAll() {
        return carService.getAll();
    }

    @PostMapping("")
    public String add(@RequestBody Car car) {
        carService.add(car);
        return "SUCCESSFUL ADDED";
    }

}
