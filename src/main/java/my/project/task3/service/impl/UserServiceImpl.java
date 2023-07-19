package my.project.task3.service.impl;

import my.project.task3.dao.UserDAO;
import my.project.task3.model.User;
import my.project.task3.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userDAO.findAllUser();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user, long id) {
        userDAO.updateUser(user, id);
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        userDAO.deleteUser(id);
    }
}
