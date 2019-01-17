package com.stackroute.controller;

import com.stackroute.configuration.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    User user = new User();
    @RequestMapping("/")
    public String greeting()
    {
        return "index";
    }

    @RequestMapping("/login")
    public String login(ModelMap map, @RequestParam("userName") String username ,@RequestParam("userPassword") String password){
        user.setUsername(username);
        map.addAttribute("user",""+user.getUsername());
        return "login";
    }
}
