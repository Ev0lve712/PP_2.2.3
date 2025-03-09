package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.model.User;

import java.util.List;

@Service
public class ServiceImpl implements ServiceInt {

    private final Dao daoUser;

    @Autowired
    public ServiceImpl(Dao daoUser) {
        this.daoUser = daoUser;
    }

    @Override
    @Transactional
    public List<User> allUsers() {
        return daoUser.findAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        daoUser.save(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        daoUser.delete(user);
    }

    @Override
    @Transactional
    public void edit(User user) {
        daoUser.update(user);
    }

    @Override
    @Transactional
    public User getById(long id) {
        return daoUser.findById(id);
    }
}