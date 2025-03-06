package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")

    public String carsTable(@RequestParam(required = false, defaultValue = "5") int count, ModelMap model) {

        List<Cars> cars = Arrays.asList(
                new Cars("Model_1", 1990, "Red"),
                new Cars("Model_2", 2024, "Yellow"),
                new Cars("Model_3", 1921, "Black"),
                new Cars("Model_4", 1993, "Gray"),
                new Cars("Model_5", 1994, "White"));
        if(count < 5) {
            cars = cars.subList(0, count);
        }
        model.addAttribute("cars", cars);

        return "cars";
    }
}
