package ru.car.rest.services;

import ru.car.rest.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();

    Car getById(int id);

    Car create(Car car);

    void delete(int id);
}
