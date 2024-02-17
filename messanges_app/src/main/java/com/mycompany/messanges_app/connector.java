/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messanges_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jenerthrodriguez
 */
public class connector {
    public Connection get_connection(){
        Connection conection = null;
        
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3308/mensajes_app", "root", "");
            if(conection != null){
                System.out.println("Connection is success");
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
    
}
