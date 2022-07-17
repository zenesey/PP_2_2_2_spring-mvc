package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.Car;

import java.util.List;


@Service
public class CarsServiceimpl implements CarsService{

    UserDao userDao;
    @Autowired
    public CarsServiceimpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Car> getCars(int index) {
        return userDao.getCars(index);
    }
}
