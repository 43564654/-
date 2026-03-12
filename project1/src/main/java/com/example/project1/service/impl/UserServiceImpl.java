package com.example.project1.service.impl;

import com.example.project1.mapper.UserMapper;
import com.example.project1.pojo.User;
import com.example.project1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User findById(Integer id){
        return userMapper.findById(id);
    }
}
