/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.allinonespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alyx
 */
@Controller
public class MyController {
    @RequestMapping("/")
    public String sayHello(ModelAndView modelAndView){
//        modelAndView.setViewName("index.jsp");
//        return modelAndView;
        return "index.jsp";
    }
}
