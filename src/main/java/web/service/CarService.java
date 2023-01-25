package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Skoda", 1, 2000));
        carList.add(new Car("Skoda", 2, 2001));
        carList.add(new Car("Skoda", 3, 2002));
        carList.add(new Car("Skoda", 4, 2003));
        carList.add(new Car("Skoda", 5, 2004));
    }

    public List<Car> getCarAmount(int count) {
        return  carList.stream().limit(count).toList();
    }

    public List<Car> getCarList() {
        return carList;
    }
}
