package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user, Car car);
    List<User> listUsers();
    public void findUserByCar(String model, int series);
}
