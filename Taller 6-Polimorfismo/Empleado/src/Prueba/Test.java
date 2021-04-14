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
        
        Empleado e = new Directivo("Jesus");
        System.out.println(e);
        Empleado a = new Operario("Andres");
        System.out.println(a);
        Empleado c = new Oficial("Luis");
        System.out.println(c);
        Empleado d = new Tecnico("Juan");
        System.out.println(d);
    }
    
}
