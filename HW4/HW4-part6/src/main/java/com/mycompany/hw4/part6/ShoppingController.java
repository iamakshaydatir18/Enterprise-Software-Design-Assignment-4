/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw4.part6;


import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author akshaydatir
 */
@Controller
public class ShoppingController {

   @RequestMapping(path ="/shop.htm")
    public String getShopping(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession();
        String param = request.getParameter("param");

        if (param == null || param == "") {

            return "shop";
            
        } else if (param.equals("view")) {

            Map<String, String[]> parameter = request.getParameterMap();
            for (Map.Entry<String, String[]> entry : parameter.entrySet()) {
                if (entry.getKey().equals("param")) {
                    continue;
                }
                session.setAttribute(entry.getKey(), entry.getValue());
            }

            return "view";

        }
        return null;
    }
}
