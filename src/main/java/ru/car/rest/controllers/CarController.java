package ru.car.rest.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.car.rest.models.Car;
import ru.car.rest.services.CarService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin
public class CarController {
    private final CarService carService;

    @GetMapping("/cars")
    public List<Car> getAllCar(){
        return carService.getAll();
    }


    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable("id") int id){
        Car car = carService.getById(id);
        return car;
    }

    @PostMapping("/")
    public Car save(@RequestBody Car car){
        return carService.create(car);
    }


}







