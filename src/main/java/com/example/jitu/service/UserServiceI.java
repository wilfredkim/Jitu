package com.example.jitu.service;

import com.example.jitu.models.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceI {


    User createUser(User user);


    void deleteById(Long id);

    void deleteAll();

    User findUserByUsername(String email);

    User findUserByUsernameAndPassword(String username, String password);

    Optional<User> findById(Long id);

    boolean checkIfValidOldPassword(User user, String password);


    List<User> findAll();

}
