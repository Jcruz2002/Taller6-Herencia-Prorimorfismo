/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Creacion.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Test {
    
    public static void main(String[] args) {
        
        //EJERCICO 8 TALLER 6
        
        
        Cliente a = new Cliente(1443,1003293920,3000000);
        ClientePreferente b = new ClientePreferente(1256,100023482,4000000,2);
        System.out.println("Lectura de Fondos de Clientes Preferente");
        int Cont =1;
        for(int x=0;x<b.getNFondos();x++)
        {
            Scanner p = new Scanner(System.in);
            System.out.println("Fondo " + Cont);
            System.out.print("Numero de fondo : ");
            int fond = p.nextInt();
            System.out.print("Saldo de fondo : ");
            double sal = p.nextDouble(); 
            b.inscribirFondo(fond, sal); 
            Cont++;
        }
        
        System.out.println("--------------------------");
        System.out.println("Cliente Común");
        System.out.println(a);
        System.out.println("--------------------------");
        System.out.println("Cliente Preferente");
        System.out.println(b);
        imprimirFondos(b);
    }
    
     public static void imprimirFondos(ClientePreferente b){
          int Cont=1;
         for(int i=0; i< b.getNFondos();i++){
            Fondos j = b.getFond()[i];
            System.out.println("--------------------------");
            System.out.println("Fondo " + Cont);
            System.out.println(j.toString());
            Cont++;
           
        }
    }
    
    
}
