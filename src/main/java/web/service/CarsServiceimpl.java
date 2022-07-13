package web.service;

import web.dao.DAO;
import web.dao.userDAOimpl;
import web.model.Car;

import java.util.List;

public class CarsServiceimpl implements CarsService{

    private final DAO cars = new userDAOimpl();

    @Override
    public List<Car> getCars(int index) {
        return cars.getCars(index);
    }
}
