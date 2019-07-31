package com.stackroute.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class ControllerClass {
    User user=new User("Welcome to Stackroute!");
    @RequestMapping(method = RequestMethod.GET)
    public String ModelAndView()
    {
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("result",user.toString());
        return "index";
    }
}
