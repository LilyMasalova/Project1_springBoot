package java_mentor.Project1_springBoot.service;

import java_mentor.Project1_springBoot.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void removeUser(User user);

    List<User> getAllUsers();

    User show(int id);

    void update(int id, User updatedUser);
}
