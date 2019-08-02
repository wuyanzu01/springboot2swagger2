package com.demo.controller;


import com.demo.entity.User;
import com.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(description = "关于用户接口",value = "用户接口",tags = {"用户接口"})  //使用@Api来修饰类
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUser/{userId}")    //使用RestFul风格
    @ApiOperation(value = "通过用户Id来获取用户信息",notes = "RestFul风格，需要传用户Id")  //使用@ApiOperation注解来修饰接口
    @ApiImplicitParam(name = "userId",value = "用户Id",required = true)   //使用ApiImplcitParam修饰接口参数
    public User getUserById(@PathVariable("userId") Integer userId){
        return userService.selectById(userId);
    }
}
