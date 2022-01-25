package com.example.H2DataBase.service;

import com.example.H2DataBase.repository.UserRespository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private static UserRespository userRespository;

    @Value("${user.userList.details}")
    private String stringList;

    public User map() {
        String[] tokens = stringList.split(",");
        User result = new User(Integer.parseInt(tokens[0]),
                tokens[1]);


        return result;
    }

    public static List<User> getAllusers() {
        List<User> users = new ArrayList<>();
        userRespository.findAll().forEach(user -> users.add(user));
        return users;
    }


    public static User createOrUpdateuser() {
        User user = map();

        return userRespository.save(user);

    }
}
