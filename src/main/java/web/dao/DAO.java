package web.dao;

import web.model.Car;

import java.util.List;

public interface DAO {

    List<Car> getCars(int index);
}
