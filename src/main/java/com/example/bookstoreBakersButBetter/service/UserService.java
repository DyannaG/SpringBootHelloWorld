package com.example.bookstoreBakersButBetter.service;

import java.util.List;

import com.example.bookstoreBakersButBetter.models.User;

public interface UserService {

    List<User> findAll();

    User save(User user);

    void delete(String id);
}
