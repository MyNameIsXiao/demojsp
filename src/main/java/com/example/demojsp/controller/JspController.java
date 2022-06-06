package com.example.demojsp.controller;

import com.example.demojsp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jsp")
public class JspController {

    @Autowired    //赋值注入
    private User user;


    @RequestMapping("/hello")
    public ModelAndView tojsp() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("num", user.getName());
        modelAndView.setViewName("index");
        return modelAndView;
    }


    public void show() {

    }


}
