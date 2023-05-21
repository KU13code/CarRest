package ru.car.rest.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.car.rest.dao.CarDAO;
import ru.car.rest.models.Car;
import ru.car.rest.services.CarService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getAll() {
        return carDAO.getAll();
    }

    @Override
    @Transactional
    public Car getById(int id) {
        return carDAO.getById(id);
    }

    @Override
    @Transactional
    public Car create(Car car) {
       return carDAO.create(car);
    }

    @Override
    @Transactional
    public void delete(int id) {
        carDAO.delete(id);
    }
}
