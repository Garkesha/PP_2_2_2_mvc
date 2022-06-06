package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "E500", 240));
        cars.add(new Car("BMW", "535", 230));
        cars.add(new Car("Audi", "Q7", 200));
        cars.add(new Car("Porsche", "911", 300));
        cars.add(new Car("Ford", "Mondeo", 180));
    }

    @Override
    public List<Car> countCar(int count) {
        if (count > 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
