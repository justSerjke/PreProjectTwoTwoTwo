package ru.justserjke.service;

import ru.justserjke.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    List<Car> getCountOfCars(int count);
}
