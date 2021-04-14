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
        
        Vehiculo a = new Compacto();
        System.out.println(a);
        System.out.println("-------------------------------------");
        Vehiculo b = new DeLujo();
        System.out.println(b);
        System.out.println("-------------------------------------");
        Vehiculo c = new Camioneta();
        System.out.println(c);
        System.out.println("-------------------------------------");
        Vehiculo d = new Vagoneta();
        System.out.println(d);
    }
    
}
