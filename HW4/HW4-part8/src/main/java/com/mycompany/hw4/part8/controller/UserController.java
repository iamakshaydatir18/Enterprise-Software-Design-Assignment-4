/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw4.part8.controller;

import com.mycompany.hw4.part8.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author akshaydatir
 */
@Controller
public class UserController {
     @Autowired
    ApplicationContext app;
    
    @RequestMapping("/message")
    public ModelAndView getUser(){
        
        User usermessage1 = app.getBean(User.class);
        User usermessage2 = app.getBean(User.class);
        
        ModelAndView mv = new ModelAndView("user");
        mv.addObject("user1", usermessage1);
        mv.addObject("user2", usermessage2);
        return mv;
        
    } 
}
