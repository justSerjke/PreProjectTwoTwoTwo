package ru.justserjke.service;

import ru.justserjke.dao.CarDAO;
import ru.justserjke.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }

    @Override
    public List<Car> getCountOfCars(int count) {
        return carDAO.getCountOfCars(count);
    }
}
