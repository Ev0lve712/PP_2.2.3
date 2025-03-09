package web.dao;

import web.model.User;

import java.util.List;

public interface Dao {
    List<User> findAll();

    User findById(long id);

    void save(User user);

    void update(User user);

    void delete(User user);
}
