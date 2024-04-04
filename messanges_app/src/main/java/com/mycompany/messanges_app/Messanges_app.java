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
            System.out.println("Aplication Message App");
            System.out.println("1. Create a mensaje");
            System.out.println("2. Read mensajes");
            System.out.println("3. Delete message");
            System.out.println("4. Edit message");
            System.out.println("5. Quit");
            System.out.println("------------------------------");
            opcion = sc.nextInt();
            
            switch (opcion ){
                case 1: 
                    mensajesService.crearMenssaje();
                    break;
                case 2: 
                    mensajesService.listarMensaje();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    break;
                    
            }
            
        }while(opcion != 5);
        
    }
}
