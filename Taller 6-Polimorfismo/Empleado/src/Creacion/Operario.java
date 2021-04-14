/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion;

/**
 *
 * @author jdavi
 */
public class Operario extends Empleado{
    
    public Operario(String nom){
        super(nom);
    }
    
    @Override
     public String toString(){
        return "Empleado: "+ super.getNombre() + " -> Operario";
    }
    
}
