package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public List<Car> getCars() {
        int countId = 0;
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(++countId,"series1","model1"));
        cars.add(new Car(++countId,"series2","model2"));
        cars.add(new Car(++countId,"series3","model3"));
        cars.add(new Car(++countId,"series4","model4"));
        cars.add(new Car(++countId,"series5","model5"));
        return cars;
    }
}
