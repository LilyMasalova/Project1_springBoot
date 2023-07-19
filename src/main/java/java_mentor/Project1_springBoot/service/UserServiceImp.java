package java_mentor.Project1_springBoot.service;

import java_mentor.Project1_springBoot.dao.UserDao;
import java_mentor.Project1_springBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

@Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);

    }

@Transactional
    @Override
    public void removeUser(User user) {
        userDao.removeUser(user);

    }

@Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
