package com.dabor.contorller;

import com.dabor.Mapper.UserMapper;
import com.dabor.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dabort
 * @date 2021/9/15 - 15:09
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUser")
    public List<User> queryUser(){
        List<User> users = userMapper.queryUser();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    @GetMapping("/queryUserById")
    public User queryUserById(int id){
        User user = userMapper.queryUserById(2);
        return user;
    }

    @GetMapping("/updateUser")
    public String updateUser(User user){
        userMapper.updateUser(user);
        return "update success";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(int id){
        userMapper.deleteUser(id);
        return "delete success";
    }

}
