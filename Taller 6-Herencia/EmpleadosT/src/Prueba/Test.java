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
         
         //EJERCICO 6 TALLER 6
        
         EmpleadoAsalariado a = new EmpleadoAsalariado(30,5000,500000);
         EmpleadoHora b = new EmpleadoHora(43,5000,100000);
         EmpleadoComision c = new EmpleadoComision(35,5000,200000);
         EmpleadoAsalariadoComision d = new EmpleadoAsalariadoComision(29,5000,400000,100000);
                 
         System.out.println("Salario de Empleado Asalariado   : "+a.CalcularSalario());
         System.out.println("Salario de Empleado por Horas    : "+b.CalcularSalario());
         System.out.println("Salario de Empleado por Comision : "+c.CalcularSalario());
         System.out.println("Salario de Empleado Asalariado con Comision :"+d.CalcularSalario());
    }
    
}
