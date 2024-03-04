/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messanges_app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author jenerthrodriguez
 */
public class MensajesDAO {
    
   public static void crearMensajeDB(Mensajes mensaje){
       connector db_connect = new connector();
       
       try(Connection connector = db_connect.get_connection()){
           
           PreparedStatement  ps = null;
           try{
               
               String query= "INSERT INTO `mensajes` (`mensaje`, `auto_mensaje`) VALUES (?,?)";
               ps = connector.prepareStatement(query);
               ps.setString(1, mensaje.getMensaje());
               ps.setString(2, mensaje.getAutor_mensaje());
               ps.executeUpdate();
               System.out.println("mensaje enviado");
           }
           catch(SQLException ex ){
               System.out.println(ex);
               
           }
       }
       catch(SQLException e){
           System.out.println(e);
       }
   }
   
   public static void leerMensajeDB(){
       
   }
   
   public static void borrarMensajeDB(int id_mensaje){
       
   }
   
   public static void actualizarMensajeDB(Mensajes mensaje){
       
   }
    
}
