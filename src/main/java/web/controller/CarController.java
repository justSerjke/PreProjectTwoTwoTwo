package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    public static List<Car> getCars() {
        return new ArrayList<>() {
            {
                add(new Car("Lada", 2020, "Vesta"));
                add(new Car("BMW", 2004, "M3"));
                add(new Car("Suzuki", 2013, "Grand Vitara"));
                add(new Car("Porsche", 2017, "Panamera"));
                add(new Car("Audi", 1995, "A8"));
            }
        };
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        if (count == null) {
            model.addAttribute("cars", getCars());
        } else {
            model.addAttribute("cars", CarServiceImpl.getCountOfCars(Integer.valueOf(count)));
        }
        return "cars";
    }
}