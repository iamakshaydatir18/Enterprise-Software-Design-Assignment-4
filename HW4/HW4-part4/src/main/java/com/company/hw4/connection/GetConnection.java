/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.hw4.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author akshaydatir
 */
public class GetConnection {
    
    
    public static Connection getConnectionstatic(){
        
        
         Connection connection = null;
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Akshay","root","rootroot");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException e){
            Logger.getLogger(GetConnection.class.getName()).log(Level.SEVERE, null, e);
        }
   
        return connection;
    }
    
}
