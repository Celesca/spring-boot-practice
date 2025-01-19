package com.celesca.crudapi.services;

import com.celesca.crudapi.entity.User;
import com.celesca.crudapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id)  {
        Optional<User> result = userRepository.findById(id);
        User data = null;
        if (result.isPresent()) {
            data = result.get();
        }
        else {
            throw new RuntimeException("User not found");
        }
        return data;
    }
}
