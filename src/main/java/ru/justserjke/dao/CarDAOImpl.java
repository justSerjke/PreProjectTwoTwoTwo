package ru.justserjke.dao;

import org.springframework.stereotype.Repository;
import ru.justserjke.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", 2020, "Vesta"));
        cars.add(new Car("BMW", 2004, "M3"));
        cars.add(new Car("Suzuki", 2013, "Grand Vitara"));
        cars.add(new Car("Porsche", 2017, "Panamera"));
        cars.add(new Car("Audi", 1995, "A8"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCountOfCars(int count) {
        List<Car> result = getCars();
        if (count == 0) {
            return null;
        } else if (count < 5) {
            result = cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
        return result;
    }
}
