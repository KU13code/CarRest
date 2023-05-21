package ru.car.rest.dao;

import ru.car.rest.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getAll();

    Car getById(int id);

    Car create(Car car);

    void delete(int id);
}
