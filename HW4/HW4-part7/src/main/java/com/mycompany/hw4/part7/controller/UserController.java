package com.mycompany.hw4.part7.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.hw4.part7.utility.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author akshaydatir
 */

public class UserController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        User usermessage1 = app.getBean("usermessage",User.class);
        User usermessage2 = app.getBean("usermessage",User.class);
        ModelAndView mv = new ModelAndView("user");
        mv.addObject("user1", usermessage1);
        mv.addObject("user2", usermessage2);
        return mv;
    }
}
