/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lec=new Scanner(System.in);
        double saldo=8000.55;
         
       System.out.println("Bienvenido al Cajero Automático");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");

           int opcion = lec.nextInt();
      
        
        
        switch(opcion){
            case 1:
                
               System.out.println("Consultar Saldo");
               System.out.println("su saldo es de "+saldo);
              
              
              break;
          case 2:
              System.out.println("depositar dinero");
               System.out.println("ingrese la cantidad a depositar");
              double deposito=lec.nextDouble();
              saldo+=deposito;
              System.out.println("su saldo es de "+saldo);
              break;
          case 3:
              System.out.println(" retirar dinero ");
              System.out.println("ingrese la cantidad a retirar");
              double retiro=lec.nextDouble();
           

              if (saldo>=retiro){
                  saldo-=retiro;
                  System.out.println("el retiro fue exitoso");
                  System.out.println("su saldo es de "+saldo);
                    
      }else if (saldo<=retiro){
                  System.out.println("fondos insufisientes");
      }
              break;
      
        
          default:
                System.out.println("Opcion no valida por favor seleccione una opcion valida");
                break;
    }
    }
    
}
