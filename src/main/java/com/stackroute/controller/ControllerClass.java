package com.stackroute.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class ControllerClass {


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView ModelAndView()
    {
        User user=new User("Jayashree");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("result",user.getMessage());
        return mv;
    }
}
