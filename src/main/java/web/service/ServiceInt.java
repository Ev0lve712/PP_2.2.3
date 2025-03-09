package web.service;

import web.model.User;

import java.util.List;

public interface ServiceInt {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(long id);
}
