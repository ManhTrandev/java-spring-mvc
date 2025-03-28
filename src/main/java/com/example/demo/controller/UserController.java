package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;


@Controller
public class UserController {

    // DI
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")

    public String getHomePage(Model model){
     List<User> arrUsers =this.userService.getAllUserByEmail("hello231@gmail.com");
     System.out.println(arrUsers);
        model.addAttribute("Manh", "test");
        return "hello";
    }
    @RequestMapping("/admin/user")
    public String getListUserPage(Model model){
        model.addAttribute("newUser", new User());
        List<User> users = this.userService.getAllUser();
        model.addAttribute("user1", users);
        return "admin/user/table-user";
    }
    @RequestMapping("/admin/user/{id}")
    public String getUserDetailPage(Model model,@PathVariable long id){
User user = this.userService.getUserById(id);
    model.addAttribute("user", user);
        model.addAttribute("id", id);
        return "admin/user/show";
    }

    @RequestMapping("/admin/user/create")
    public String getUserPage(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user", method = RequestMethod.POST)
    public String createUserPage(Model mode,@ModelAttribute("newUser") User newInfor){
        // System.out.println(">>> Run"+newInfor);
        this.userService.handleSaveUser(newInfor);
        return "redirect:/admin/user";
    }
}

