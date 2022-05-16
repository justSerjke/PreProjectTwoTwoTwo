package ru.justserjke.dao;

import ru.justserjke.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCars();
    List<Car> getCountOfCars(int count);
}
