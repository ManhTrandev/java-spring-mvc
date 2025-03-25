package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;


@Controller
public class UserController {

    // DI
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")

    public String getHomePage(Model model){
        String test =this.userService.handleHello();
        model.addAttribute("Manh", test);
        return "hello";
    }
    @RequestMapping("/admin/user")
    public String getUserPage(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model mode,@ModelAttribute("newUser") User newInfor){
        System.out.println(">>> Run"+newInfor);
        return "hello";
    }
}

