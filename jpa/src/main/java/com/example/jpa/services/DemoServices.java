package com.example.jpa.services;

import com.example.jpa.dao.Fruit;
import org.springframework.stereotype.Service;
import com.example.jpa.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServices{

        @Resource
        private UserDao userdao;
    @Transactional
    public void addFruit(Fruit fruit){
        userdao.save(fruit);
    }
    public List<Fruit> findall(){
            return userdao.findAll();
    }
}
