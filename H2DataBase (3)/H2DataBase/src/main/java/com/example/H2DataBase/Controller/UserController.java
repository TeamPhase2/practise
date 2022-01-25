package com.example.H2DataBase.Controller;


import com.example.H2DataBase.model.User;
import com.example.H2DataBase.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class UserController {


    @RequestMapping(path = "/createUser", method = RequestMethod.POST)
    public User createOrUpdateUser() {


        return (User) UserService.createOrUpdateuser();


    }

    @RequestMapping(path = "/getUser", method = RequestMethod.GET)
    public List<org.apache.catalina.User> getAll() {
        return UserService.getAllusers();
    }

}



}
