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
    
      //EJERCICO 4 TALLER 6
     public static void main(String[] args) {
          
         Ordenador a = new Ordenador("11212",120000);
         Portatil b = new Portatil("1253",2000000,40);
         SobreMesa c = new SobreMesa("1452",3000000,"ThinkCentre M720 SFF");
         System.out.println(a);
         System.out.println("----------------------");
         System.out.println(b);
         System.out.println("----------------------");
         System.out.println(c);
         
     }
    
}
