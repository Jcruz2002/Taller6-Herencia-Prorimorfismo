/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Creacion.*;

/**
 *
 * @author jdavi
 */
public class Test {
    public static void main(String[] args) {
        
         //EJERCICO 7 TALLER 6
        
        Vehiculo a = new Vehiculo();
        Compacto b = new Compacto();
        DeLujo c = new DeLujo();
        Camioneta d= new Camioneta();
        Vagoneta e = new Vagoneta();
        System.out.println("Vehiculo");
        System.out.println(a);
        System.out.println("-----------------------------");
        System.out.println("Vehiculo Compacto");
        System.out.println(b);
        System.out.println("-----------------------------");
        System.out.println("Vehiculo de lujo");
        System.out.println(c);
        System.out.println("-----------------------------");
        System.out.println("Camioneta");
        System.out.println(d);
        System.out.println("-----------------------------");
        System.out.println("Vagoneta");
        System.out.println(e);
    }
    
}
