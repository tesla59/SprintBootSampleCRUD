package com.tesla59.dismanisinnoconditiontofuckasheep.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "You are now logged in";
    }
}
