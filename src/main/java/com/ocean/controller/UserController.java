package com.ocean.controller;

import com.ocean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 13:52
 * @Description:
 */
@RestController
public class UserController {

@Autowired
private UserService userService;

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List getAll(){

        return userService.findAllUser();
    }
}
