package my.project.task3.service;

import my.project.task3.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserById(long id);

    void saveUser(User user);

    void updateUser(User user,long id);

    void deleteUserById(Long id);

}
