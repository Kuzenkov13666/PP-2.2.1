package hiber.dao;


import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User getUsersByCar(String model, int series);
}
