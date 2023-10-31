/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw4.part5;

import com.mycompany.hw4.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author akshaydatir
 */
public class BookHandler extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        String count = request.getParameter("count");
        String add = request.getParameter("addBooks");

        if (count != null) {
            
             ModelAndView model = new ModelAndView("addBooks");
            model.addObject("count", Integer.parseInt(count));
            return model;
        }

        if (add.equals("addBooks")) {

            Map<String, String[]> parameterMap = request.getParameterMap();
            int row = Integer.parseInt(request.getParameter("countfromAdd"));

            String[][] matrix = new String[4][row];
            int i = 0;

            for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {

                String key = entry.getKey();
                if (key.equals("ISBN") || key.equals("title") || key.equals("authers") || key.equals("price")) {

                    if (i < 4) {
                        matrix[i] = entry.getValue();
                        i++;
                    }
                    
                }

            }

            List<Book> list = new ArrayList<>();
            for (int k = 0; k < row; k++) {
                
                    Book b = new Book(Integer.parseInt(matrix[0][k]), matrix[1][k], matrix[2][k], Double.parseDouble(matrix[3][k]));
                    list.add(b);
      

            }
            
            ModelAndView model = new ModelAndView("added");
            model.addObject("list", list);
            return model;
           
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
