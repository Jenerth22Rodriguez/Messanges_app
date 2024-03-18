/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messanges_app;

import java.util.Scanner; 
/**
 *
 * @author jenerthrodriguez
 */
public class mensajesService {
    
    public static void crearMenssaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
        
        
    }
    
    public static void listarMensaje(){
        MensajesDAO.leerMensajeDB();
        
    }
    public static void borrarMensaje(){
        
    }
    
    public static void editarMensaje(){
        
    }
}
