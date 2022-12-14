package com.example.springbootwithgraphql.service.impl;

import com.example.springbootwithgraphql.entity.User;
import com.example.springbootwithgraphql.repo.UserRepo;
import com.example.springbootwithgraphql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
  @Autowired
   private  UserRepo userRepo;

    @Override
    public User createUser(User user) {
       return userRepo.save(user);
    }

    @Override
    public List<User> findAllUser() {
       return  userRepo.findAll();
    }

    @Override
    public User getUserById(int id) {
      return userRepo.findById(id).orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
    }
}
