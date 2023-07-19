package java_mentor.Project1_springBoot.dao;


import java_mentor.Project1_springBoot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void removeUser(User user);

    List<User> getAllUsers();

    User show(int id);

    void update(User user);


}
