package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCar(ModelMap model, HttpServletRequest request) {
        var tempCount = request.getParameter("count");
        var count = tempCount == null ? 5 : Integer.parseInt(tempCount);
        List<Car> carList = count < 5 ? carService.getCarAmount(count) : carService.getCarList();
        model.addAttribute("cars", carList);
        return "cars";
    }
}
