package com.ying.service;

import com.ying.pojo.User;

import java.util.List;


public interface UserService {
    public int add(User user);
    public List<User> findAll();
    public User findById(Integer id);
    public void deleteById(Integer id);
    public void updateUser(User user);
}
