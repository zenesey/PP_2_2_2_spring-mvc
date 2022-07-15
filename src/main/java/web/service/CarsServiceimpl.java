package web.service;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsServiceimpl implements CarsService{
    private int countId;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++countId,"series1","model1"));
        cars.add(new Car(++countId,"series2","model2"));
        cars.add(new Car(++countId,"series3","model3"));
        cars.add(new Car(++countId,"series4","model4"));
        cars.add(new Car(++countId,"series5","model5"));
    }

    @Override
    public List<Car> getCars(int index) {
        return cars.stream().limit(index).toList();
    }
}
