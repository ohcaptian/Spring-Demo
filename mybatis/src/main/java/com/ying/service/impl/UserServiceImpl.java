package com.ying.service.impl;


import com.ying.mapper.UserMapper;
import com.ying.pojo.User;
import com.ying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
        @Autowired
        private UserMapper userMapper;
    @Override
    public int add(User user) {
        userMapper.insert(user);
        int id = user.getId();
        return id;
    }

    @Override
    public List<User> findAll() {
        return userMapper.getAll();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void updateUser(User user) {
            Integer id = user.getId();
            User use = userMapper.findById(id);
            if(use!=null){
                   use.setName(user.getName());
            }
            userMapper.update(use);
    }
}
