package com.celesca.crudapi.services;

import com.celesca.crudapi.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(Integer id);
}
