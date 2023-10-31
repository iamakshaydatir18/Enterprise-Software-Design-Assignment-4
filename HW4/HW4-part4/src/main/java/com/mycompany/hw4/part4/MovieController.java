/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw4.part4;

import com.mycompany.hw4.model.Movie;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author akshaydatir
 */
public class MovieController extends AbstractController{
  
   @Override
   protected ModelAndView handleRequestInternal(HttpServletRequest request,
      HttpServletResponse response) throws Exception {
       
       String param = request.getParameter("browse");
       String addMovie = request.getParameter("param");
        
        if (param.equals("browse")) {
            
            ModelAndView model = new ModelAndView("browse");
            return model;
        
         
        } else if (param.equals("add")) {
            
            ModelAndView model = new ModelAndView("add");
            return model;
           
        } else if(param.equals("addMovie")){
           
            Movie movie = new Movie();
            movie.setTitle(request.getParameter("title"));
            movie.setActor(request.getParameter("actor"));
            movie.setActress(request.getParameter("actress"));
            movie.setGenre(request.getParameter("genre"));
            movie.setYear(Integer.parseInt(request.getParameter("Year")));
            
            request.setAttribute("movie", movie);
            ModelAndView model = new ModelAndView("addMovie");
            model.addObject("movie",movie);
            return model;
           
        }else if(param.equals("search")){
            
            String keyword = request.getParameter("keyword");
            String searchType = request.getParameter("searchType");
            
            ModelAndView model = new ModelAndView("search");
            model.addObject("searchType", searchType);
            model.addObject("keyword", keyword);
            return model;
  
        }
        
       return null;
     
   }
}