package service;

import model.Car;
import web.controller.CarController;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl {

    public static List<Car> getCountOfCars(Integer count) {
        List<Car> result = CarController.getCars();

        if (count == 0) {
            return null;
        } else if (count < 5) {
            result = CarController.getCars().stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
        return result;
    }
}
