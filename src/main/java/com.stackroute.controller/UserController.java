package com.stackroute.controller;

import com.stackroute.configuration.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private User user = new User("Nan",22);
    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        map.addAttribute("user",user.toString());
        return "index";
    }
}
