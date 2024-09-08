package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "V6", 321));
        cars.add(new Car("Audi", "V6", 289));
        cars.add(new Car("Mercedes-Benz", "V10", 720));
        cars.add(new Car("Cadillac", "V8", 649));
        cars.add(new Car("Porsche", "V6", 525));
    }

    @Override
    public List<Car> getCars(Integer count) {
        return count == null || count >= cars.size()
                ? cars : cars.subList(0, count);
    }
}
