package com.example.persongaldiary.controller;

import com.example.persongaldiary.entity.User;
import com.example.persongaldiary.mapper.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class UserRegister {
    @Autowired
    private IUser userMapper;

    @RequestMapping("/register")
    public Boolean userRegister( @PathParam("username") String username,
                                @PathParam("password") String password, @PathParam("address") String address,
                                @PathParam("telephone") String telephone, @PathParam("email") String email) {
        User user = new User(username, password, address, telephone, email);
        return userMapper.userRegister(user);

    }
}
