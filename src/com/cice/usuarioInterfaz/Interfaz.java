/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.usuarioInterfaz;

import com.cice.logica.Logica;
import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class Interfaz {
    
    Scanner sc = new Scanner(System.in);
    int numA = 0;
    int numB = 0;
    int opcion = 0;
    int resultado = 0;
    
    public void iniciar(){
        mostrarMenu();
        
        
}
    private void mostrarMenu(){
        
        System.out.println("CALCULATOR 2000");
        System.out.println("===============");
        System.out.println("Elige una opción:");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicación");
        System.out.println("4- División");
        System.out.println("0- Salir");
        System.out.println("===============");
        
        getOpcion();
        
    }
    
    private void getNumeros (){
        
        System.out.print("Elige el primer numerando: ");
        numA = sc.nextInt();        
        System.out.print("Elige el segundo numerando: ");
        numB = sc.nextInt();
    }
    
    private void getOpcion (){
        
        do{
             System.out.print("Seleccione una opción: ");
             opcion = sc.nextInt();
             switch (opcion){
                 case 0:
                     System.out.println("Gracias por usar CALCULATOR 2000");
                     System.out.println("HASTA PRONTO !!!");
                     break;
                 case 1:
                     getNumeros();
                     resultado = Logica.suma(numA, numB);
                     System.out.println("La suma es: " + resultado);
                     break;
                 case 2:
                     getNumeros();
                     resultado = Logica.resta(numA, numB);
                     System.out.println("La resta es: " + resultado);
                     break;
                 case 3:
                     getNumeros();
                     resultado = Logica.multiplicacion(numA, numB);
                     System.out.println("La multiplicación es: " + resultado);
                     break;
                 case 4:
                     getNumeros();
                     resultado = Logica.division(numA, numB);
                     System.out.println("La división es: " + resultado);
                     break;
                 default:
                     System.out.println("Opción incorrecta");
                     System.out.println("Elija otra, por favor");
                     
                 
             }
            
        }while (opcion != 0);
        
        
    }
    
    
}
