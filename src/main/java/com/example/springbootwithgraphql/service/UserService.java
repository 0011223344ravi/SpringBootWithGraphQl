package com.example.springbootwithgraphql.service;


import com.example.springbootwithgraphql.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User createUser(User user);

    List<User> findAllUser();

    User getUserById(int id );

}
