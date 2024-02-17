/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.messanges_app;

import java.sql.Connection;

/**
 *
 * @author jenerthrodriguez
 */
public class Messanges_app {

    public static void main(String[] args) {
     connector connector = new connector();
        
        try(Connection cnx = connector.get_connection()){
            
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
