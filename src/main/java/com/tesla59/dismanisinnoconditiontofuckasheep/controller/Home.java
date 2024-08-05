package com.tesla59.dismanisinnoconditiontofuckasheep.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/")
    public String home() {
        return "<h1>Hi, this is my first spring boot project</h1>";
    }

    @RequestMapping("/about-us")
    public String about_us(){
        return "<img src=\"https://pbs.twimg.com/media/GREhWF9XcAEqsME?format=jpg\" alt=\"DisManIsInNoConditionToFuckASheep\">";
    }
}
