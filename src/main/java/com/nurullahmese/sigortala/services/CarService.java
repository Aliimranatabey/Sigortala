package com.nurullahmese.sigortala.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nurullahmese.sigortala.entitiy.Car;
import com.nurullahmese.sigortala.repository.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car add(Car car) {
        return carRepository.save(car);
    }

}
