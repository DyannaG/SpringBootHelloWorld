package com.example.bookstoreBakersButBetter.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreBakersButBetter.models.User;
import com.example.bookstoreBakersButBetter.repository.UserRepository;
import com.example.bookstoreBakersButBetter.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    //review code so if this breaks its my fault - ella
    @Override
    public void addReview(String reviewId, String id) {

        User obj = userRepository.findItemById(id);
        System.out.println(obj);
        obj.getReviewIds().add(reviewId);
        userRepository.save(obj);
        System.out.println(obj);
    }
}
