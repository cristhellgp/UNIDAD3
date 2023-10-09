/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec=new Scanner (System.in);
        System.out.println("introdusca un num");
        int num=lec.nextInt();
        int t1=0;
        int t2=1;
        for (int i=0;  i <num; i ++ ){
            
        int suma=t1+t2;
        t1=t2;
        t2=suma;
        System.out.println("la suma es " + suma);
      
        
        // TODO code application logic here
    }
    }  
}
