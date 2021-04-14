/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Creacion.*;
import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Test {
    
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de productos : ");
        int tam = a.nextInt();
        int Cont=1;
        Producto Arraypro[] = new Producto[tam];
        for(int x=0; x<tam; x++){
            System.out.println("Producto " + Cont);
            System.out.print("Nombre de producto : ");
            String nom = a.next();
            System.out.print("Precio de producto : ");
            int pre=a.nextInt();
            System.out.print("Cantidad           : ");
            int cant=a.nextInt();
            Cont++;
            Arraypro[x] = new Producto(nom,pre,cant);
        }
        int fin=0;
        Cont=1;
        for(int x=0; x<tam; x++)
        {
          System.out.println("----------------");
          System.out.println("Producto " + Cont);
          System.out.println(Arraypro[x].toString());  
          fin = fin + Arraypro[x].CalcularPrecio();
          Cont++;
        }
        System.out.println("----------------");
        System.out.println("Total a pagar : " + fin);
       
        
        System.out.println("-----------------------");
        System.out.println("Productos Perecederos");
        System.out.print("Ingresa el numero de productos : ");
        tam = a.nextInt();
        Cont=1;
        Perecedero Arraypro2[] = new Perecedero[tam];
        for(int x=0; x<tam; x++){
            System.out.println("Producto " + Cont);
            System.out.print("Nombre de producto : ");
            String nom = a.next();
            System.out.print("Precio de producto : ");
            int pre=a.nextInt();
            System.out.print("Cantidad           : ");
            int cant=a.nextInt();
            System.out.print("Dias               : ");
            int dia=a.nextInt();
            Cont++;
            Arraypro2[x] = new Perecedero(nom,pre,cant,dia);
        }
        fin =0;
        Cont=1;
        for(int x=0; x<tam; x++)
        {
          System.out.println("----------------");
          System.out.println("Producto " + Cont);
          System.out.println(Arraypro2[x].toString());  
          fin = fin + Arraypro2[x].CalcularPrecio();
          Cont++;
        }
        System.out.println("----------------");
        System.out.println("Total a pagar : " + fin);
        
        
        System.out.println("-----------------------");
        System.out.println("Productos Noperecederos");
        System.out.print("Ingresa el numero de productos : ");
        tam = a.nextInt();
        Cont=1;
        NoPerecedero Arraypro3[] = new NoPerecedero[tam];
        for(int x=0; x<tam; x++){
            System.out.println("Producto " + Cont);
            System.out.print("Nombre de producto : ");
            String nom = a.next();
            System.out.print("Precio de producto : ");
            int pre=a.nextInt();
            System.out.print("Cantidad           : ");
            int cant=a.nextInt();
            System.out.print("Tipo               : ");
            String tipo=a.next();
            Cont++;
            Arraypro3[x] = new NoPerecedero(nom,pre,cant,tipo);
        }
        fin =0;
        Cont=1;
        for(int x=0; x<tam; x++)
        {
          System.out.println("----------------");
          System.out.println("Producto " + Cont);
          System.out.println(Arraypro3[x].toString());  
          fin = fin + Arraypro3[x].CalcularPrecio();
          Cont++;
        }
        System.out.println("----------------");
        System.out.println("Total a pagar : " + fin);
        
        
        
    }
        
        
    
    
    
    
    
}
