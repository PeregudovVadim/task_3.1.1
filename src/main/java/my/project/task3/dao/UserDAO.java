package my.project.task3.dao;

import my.project.task3.model.User;

import java.util.List;

public interface UserDAO {
    List<User> findAllUser();

    void createUser(User user);

    void updateUser(User user,long id);

    User findById(long id);

    User deleteUser(long id) throws NullPointerException;
}
