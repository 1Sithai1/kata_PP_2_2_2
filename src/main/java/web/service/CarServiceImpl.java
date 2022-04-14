package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Ford", "black", 101));
        cars.add(new Car("Porsche", "green", 102));
        cars.add(new Car("Skoda", "blue", 103));
        cars.add(new Car("Reno", "grey", 104));
        cars.add(new Car("Citroen", "silver", 105));
    }

    @Override
    public List<Car> showCarsList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
