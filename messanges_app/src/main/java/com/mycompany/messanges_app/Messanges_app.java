/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.messanges_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author jenerthrodriguez
 */
public class Messanges_app {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("------------------------------");
            System.out.println("Aplicacion de Mensaje");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Eliminar mensajes");
            System.out.println("5. Salir");
            
            opcion = sc.nextInt();
            
            switch (opcion ){
                case 1: 
                    mensajesService.crearMenssaje();
                    break;
                case 2: 
                    mensajesService.listarMensaje();
                    break;
                case 3:
                    mensajesService.editarMensaje();
                    break;
                case 4:
                    mensajesService.borrarMensaje();
                    break;
                default:
                    break;
                    
            }
            
        }while(opcion != 5);
        
    }
}
