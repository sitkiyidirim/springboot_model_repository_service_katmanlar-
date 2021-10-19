package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;

import java.util.Optional;

public interface IUserService {
    User userSave(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
