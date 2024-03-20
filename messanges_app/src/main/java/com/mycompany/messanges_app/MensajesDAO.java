/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messanges_app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
       
        connector db_connect = new connector();
        
        PreparedStatement  ps = null;
        
        ResultSet  rs = null;
        
        try(Connection connector = db_connect.get_connection()){
            
            String query = "SELECT * FROM mensajes";
            
            ps = connector.prepareStatement(query);
            rs = ps.executeQuery();
            
            
            while(rs.next()){
                System.out.println("ID: "+ rs.getInt("id_mesanje"));
                System.out.println("Message: "+rs.getString("mensaje"));
                System.out.println("Author "+ rs.getString("auto_mensaje"));
                System.out.println("Date: "+ rs.getString("date"));
                System.out.println("");
            }
            
        } catch (SQLException e){
            System.out.println("Error");
           System.out.println(e);
       
        }
   }
   public static void borrarMensajeDB(int id_mensaje){
       
       connector db_connect = new connector();
       
       try(Connection connector = db_connect.get_connection()){
           PreparedStatement  ps =null;
           
           try{
               String query = "DELETE FROM mensajes WHERE id_mesanje = ?";
               ps = connector.prepareStatement(query);
               ps.setInt(1, id_mensaje);
               ps.executeUpdate();
               System.out.println("Your message has been delete");
               
           }catch(SQLException e){
               System.out.println(e);
               System.out.println("unable to delete the message");
           }
       }
       
       catch (SQLException e){
           System.out.println(e);
       
        }

   }
   
   public static void actualizarMensajeDB(Mensajes mensaje){
       
   }
    
}
