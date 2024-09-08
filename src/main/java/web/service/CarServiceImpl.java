package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO dao) {
        this.carDAO = dao;
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return carDAO.getCountCars(count);
    }
}
